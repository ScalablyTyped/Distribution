package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.AnonAccuracy
import typings.jsrsasign.AnonAddInfoNotAvailable
import typings.jsrsasign.AnonCertreq
import typings.jsrsasign.AnonCertreqMi
import typings.jsrsasign.AnonCertsHashAlg
import typings.jsrsasign.AnonCertsHashAlgSigAlg
import typings.jsrsasign.AnonFailinfo
import typings.jsrsasign.AnonGranted
import typings.jsrsasign.AnonHashAlgHashValue
import typings.jsrsasign.AnonMicros
import typings.jsrsasign.AnonStatus
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * kjur's ASN.1 class for RFC 3161 Time Stamp Protocol
  *
  * This name space provides
  * [RFC 3161 Time-Stamp Protocol(TSP)](https://tools.ietf.org/html/rfc3161)
  * data generator.
  *
  * __FEATURES__
  *
  * - easily generate CMS SignedData
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp")
@js.native
object tsp extends js.Object {
  /**
    * abstract class for TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  @js.native
  class AbstractTSAAdapter () extends js.Object {
    def getTSTHex(msgHex: String, hashAlg: String): Unit = js.native
  }
  
  /**
    * class for TSP Accuracy ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * Accuracy ::= SEQUENCE {
    *       seconds        INTEGER              OPTIONAL,
    *       millis     [0] INTEGER  (1..999)    OPTIONAL,
    *       micros     [1] INTEGER  (1..999)    OPTIONAL  }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.Accuracy({seconds: 1,
    *                                 millis: 500,
    *                                 micros: 500});
    */
  @js.native
  class Accuracy () extends ASN1Object {
    def this(params: AnonMicros) = this()
  }
  
  /**
    * class for fixed TimeStampToken generator
    * @param params associative array of parameters
    * @description
    * This class generates fixed TimeStampToken except messageImprint
    * for testing purpose.
    * General TSA generates TimeStampToken which varies following
    * fields:
    *
    * - genTime
    * - serialNumber
    * - nonce
    *
    * Those values are provided by initial parameters.
    */
  @js.native
  class FixedTSAAdapter () extends js.Object {
    def this(initParams: AnonCertsHashAlg) = this()
    def getTSTHex(msgHex: String, hashAlg: String): String = js.native
  }
  
  /**
    * class for TSP MessageImprint ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * MessageImprint ::= SEQUENCE  {
    *      hashAlgorithm                AlgorithmIdentifier,
    *      hashedMessage                OCTET STRING  }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.MessageImprint({hashAlg: 'sha1',
    *                                       hashValue: '1f3dea...'});
    */
  @js.native
  class MessageImprint () extends ASN1Object {
    def this(params: AnonHashAlgHashValue) = this()
  }
  
  /**
    * class for TSP PKIFailureInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIFailureInfo ::= BIT STRING {
    *    badAlg                 (0),
    *    badRequest             (2),
    *    badDataFormat          (5),
    *    timeNotAvailable       (14),
    *    unacceptedPolicy       (15),
    *    unacceptedExtension    (16),
    *    addInfoNotAvailable    (17),
    *    systemFailure          (25) }
    * ```
    */
  @js.native
  class PKIFailureInfo () extends ASN1Object {
    def this(params: IntegerParam) = this()
    def this(params: NameParam) = this()
  }
  
  /**
    * class for TSP PKIFreeText ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIFreeText ::= SEQUENCE {
    *    SIZE (1..MAX) OF UTF8String }
    * ```
    */
  @js.native
  class PKIFreeText () extends ASN1Object {
    def this(params: ArrayParam[String]) = this()
  }
  
  /**
    * class for TSP PKIStatus ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIStatus ::= INTEGER {
    *    granted                (0),
    *    grantedWithMods        (1),
    *    rejection              (2),
    *    waiting                (3),
    *    revocationWarning      (4),
    *    revocationNotification (5) }
    * ```
    */
  @js.native
  class PKIStatus () extends ASN1Object {
    def this(params: NameParam) = this()
  }
  
  /**
    * class for TSP PKIStatusInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIStatusInfo ::= SEQUENCE {
    *    status                  PKIStatus,
    *    statusString            PKIFreeText     OPTIONAL,
    *    failInfo                PKIFailureInfo  OPTIONAL  }
    * ```
    */
  @js.native
  class PKIStatusInfo () extends ASN1Object {
    def this(params: AnonFailinfo) = this()
  }
  
  /**
    * class for simple TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  @js.native
  class SimpleTSAAdapter () extends js.Object {
    def this(initParams: AnonCertsHashAlg) = this()
    def getTSTHex(msgHex: String, hashAlg: String): String = js.native
  }
  
  /**
    * class for TSP TSTInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TSTInfo ::= SEQUENCE  {
    *    version         INTEGER  { v1(1) },
    *    policy          TSAPolicyId,
    *    messageImprint  MessageImprint,
    *    serialNumber    INTEGER, -- up to 160bit
    *    genTime         GeneralizedTime,
    *    accuracy        Accuracy                 OPTIONAL,
    *    ordering        BOOLEAN                  DEFAULT FALSE,
    *    nonce           INTEGER                  OPTIONAL,
    *    tsa             [0] GeneralName          OPTIONAL,
    *    extensions      [1] IMPLICIT Extensions  OPTIONAL   }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.TSTInfo({
    *     policy:    '1.2.3.4.5',
    *     messageImprint: {hashAlg: 'sha256', hashMsgHex: '1abc...'},
    *     genTime:   {withMillis: true},     // OPTION
    *     accuracy:  {micros: 500},          // OPTION
    *     ordering:  true,                   // OPTION
    *     nonce:     {hex: '52fab1...'},     // OPTION
    *     tsa:       {str: '/C=US/O=TSA1'}   // OPTION
    * });
    */
  @js.native
  class TSTInfo protected () extends ASN1Object {
    def this(params: AnonAccuracy) = this()
  }
  
  /**
    * class for TSP TimeStampReq ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TimeStampReq ::= SEQUENCE  {
    *    version          INTEGER  { v1(1) },
    *    messageImprint   MessageImprint,
    *    reqPolicy        TSAPolicyId               OPTIONAL,
    *    nonce            INTEGER                   OPTIONAL,
    *    certReq          BOOLEAN                   DEFAULT FALSE,
    *    extensions       [0] IMPLICIT Extensions   OPTIONAL  }
    * ```
    */
  @js.native
  class TimeStampReq () extends ASN1Object {
    def this(params: AnonCertreqMi) = this()
    def setMessageImprint(params: MessageImprint): Unit = js.native
  }
  
  /**
    * class for TSP TimeStampResp ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TimeStampResp ::= SEQUENCE  {
    *    status                  PKIStatusInfo,
    *    timeStampToken          TimeStampToken     OPTIONAL  }
    * ```
    */
  @js.native
  class TimeStampResp () extends ASN1Object {
    def this(params: AnonStatus) = this()
  }
  
  /**
    * parse hexadecimal string of MessageImprint
    * @param hexadecimal string of MessageImprint
    * @return JSON object of parsed parameters
    * @description
    * This method parses a hexadecimal string of MessageImprint
    * and returns parsed their fields:
    * @example
    * var json = KJUR.asn1.tsp.TSPUtil.parseMessageImprint("302602...");
    * // resulted DUMP of above 'json':
    * {hashAlg: 'sha256',          // MessageImprint hashAlg
    *  hashValue: 'a1a2a3a4...'}   // MessageImprint hashValue
    */
  def parseMessageImprint(miHex: String): MessageImprint = js.native
  /**
    * parse hexadecimal string of TimeStampReq
    * @param hexadecimal string of TimeStampReq
    * @return JSON object of parsed parameters
    * @description
    * This method parses a hexadecimal string of TimeStampReq
    * and returns parsed their fields:
    * @example
    * var json = KJUR.asn1.tsp.TSPUtil.parseTimeStampReq("302602...");
    * // resulted DUMP of above 'json':
    * {mi: {hashAlg: 'sha256',          // MessageImprint hashAlg
    *       hashValue: 'a1a2a3a4...'},  // MessageImprint hashValue
    *  policy: '1.2.3.4.5',             // tsaPolicy (OPTION)
    *  nonce: '9abcf318...',            // nonce (OPTION)
    *  certreq: true}                   // certReq (OPTION)
    */
  def parseTimeStampReq(reqHex: String): AnonCertreq = js.native
  /* static members */
  @js.native
  object PKIFailureInfo extends js.Object {
    val valueList: AnonAddInfoNotAvailable = js.native
  }
  
  /* static members */
  @js.native
  object PKIStatus extends js.Object {
    val valueList: AnonGranted = js.native
  }
  
  @js.native
  object TSPUtil extends js.Object {
    /**
      * generate TimeStampToken ASN.1 object specified by JSON parameters
      * @param param JSON parameter to generate TimeStampToken
      * @return object just generated
      * @description
      * @example
      */
    def newTimeStampToken(): SignedData = js.native
    def newTimeStampToken(param: AnonCertsHashAlgSigAlg): SignedData = js.native
  }
  
}

