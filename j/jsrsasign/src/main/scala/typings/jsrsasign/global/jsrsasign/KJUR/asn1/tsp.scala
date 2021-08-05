package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.anon.Certreq
import typings.jsrsasign.anon.Failinfo
import typings.jsrsasign.anon.HashValue
import typings.jsrsasign.anon.Mi
import typings.jsrsasign.anon.Micros
import typings.jsrsasign.anon.SigAlg
import typings.jsrsasign.anon.SignerCert
import typings.jsrsasign.anon.Status
import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object tsp {
  
  @JSGlobal("jsrsasign.KJUR.asn1.tsp")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * abstract class for TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.AbstractTSAAdapter")
  @js.native
  class AbstractTSAAdapter ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.AbstractTSAAdapter {
    
    /* CompleteClass */
    override def getTSTHex(msgHex: String, hashAlg: String): Unit = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.Accuracy")
  @js.native
  class Accuracy ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.Accuracy {
    def this(params: Micros) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.FixedTSAAdapter")
  @js.native
  class FixedTSAAdapter ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.FixedTSAAdapter {
    def this(initParams: SigAlg) = this()
    
    /* CompleteClass */
    override def getTSTHex(msgHex: String, hashAlg: String): String = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.MessageImprint")
  @js.native
  class MessageImprint ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint {
    def this(params: HashValue) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo")
  @js.native
  class PKIFailureInfo ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: IntegerParam) = this()
    def this(params: NameParam) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
  }
  object PKIFailureInfo {
    
    /* static member */
    object valueList {
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.addInfoNotAvailable")
      @js.native
      def addInfoNotAvailable: Double = js.native
      inline def addInfoNotAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addInfoNotAvailable")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.badAlg")
      @js.native
      def badAlg: Double = js.native
      inline def badAlg_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badAlg")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.badDataFormat")
      @js.native
      def badDataFormat: Double = js.native
      inline def badDataFormat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badDataFormat")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.badRequest")
      @js.native
      def badRequest: Double = js.native
      inline def badRequest_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badRequest")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.systemFailure")
      @js.native
      def systemFailure: Double = js.native
      inline def systemFailure_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemFailure")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.timeNotAvailable")
      @js.native
      def timeNotAvailable: Double = js.native
      inline def timeNotAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeNotAvailable")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.unacceptedExtension")
      @js.native
      def unacceptedExtension: Double = js.native
      inline def unacceptedExtension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unacceptedExtension")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo.valueList.unacceptedPolicy")
      @js.native
      def unacceptedPolicy: Double = js.native
      inline def unacceptedPolicy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unacceptedPolicy")(x.asInstanceOf[js.Any])
    }
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFreeText")
  @js.native
  class PKIFreeText ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: ArrayParam[String]) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus")
  @js.native
  class PKIStatus ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: NameParam) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
  }
  object PKIStatus {
    
    /* static member */
    object valueList {
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList.granted")
      @js.native
      def granted: Double = js.native
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList.grantedWithMods")
      @js.native
      def grantedWithMods: Double = js.native
      inline def grantedWithMods_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grantedWithMods")(x.asInstanceOf[js.Any])
      
      inline def granted_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("granted")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList.rejection")
      @js.native
      def rejection: Double = js.native
      inline def rejection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rejection")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList.revocationNotification")
      @js.native
      def revocationNotification: Double = js.native
      inline def revocationNotification_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revocationNotification")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList.revocationWarning")
      @js.native
      def revocationWarning: Double = js.native
      inline def revocationWarning_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revocationWarning")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus.valueList.waiting")
      @js.native
      def waiting: Double = js.native
      inline def waiting_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waiting")(x.asInstanceOf[js.Any])
    }
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatusInfo")
  @js.native
  class PKIStatusInfo ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: Failinfo) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
  }
  
  /**
    * class for simple TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.SimpleTSAAdapter")
  @js.native
  class SimpleTSAAdapter ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.SimpleTSAAdapter {
    def this(initParams: SigAlg) = this()
    
    /* CompleteClass */
    override def getTSTHex(msgHex: String, hashAlg: String): String = js.native
  }
  
  object TSPUtil {
    
    @JSGlobal("jsrsasign.KJUR.asn1.tsp.TSPUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * generate TimeStampToken ASN.1 object specified by JSON parameters
      * @param param JSON parameter to generate TimeStampToken
      * @return object just generated
      * @description
      * @example
      */
    inline def newTimeStampToken(): SignedData = ^.asInstanceOf[js.Dynamic].applyDynamic("newTimeStampToken")().asInstanceOf[SignedData]
    inline def newTimeStampToken(param: SignerCert): SignedData = ^.asInstanceOf[js.Dynamic].applyDynamic("newTimeStampToken")(param.asInstanceOf[js.Any]).asInstanceOf[SignedData]
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.TSTInfo")
  @js.native
  class TSTInfo protected ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo {
    def this(params: typings.jsrsasign.anon.Accuracy) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.TimeStampReq")
  @js.native
  class TimeStampReq ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.TimeStampReq {
    def this(params: Mi) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
    
    /* CompleteClass */
    override def setMessageImprint(params: typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint): Unit = js.native
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
  @JSGlobal("jsrsasign.KJUR.asn1.tsp.TimeStampResp")
  @js.native
  class TimeStampResp ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: Status) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
  inline def parseMessageImprint(miHex: String): typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMessageImprint")(miHex.asInstanceOf[js.Any]).asInstanceOf[typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint]
  
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
  inline def parseTimeStampReq(reqHex: String): Certreq = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTimeStampReq")(reqHex.asInstanceOf[js.Any]).asInstanceOf[Certreq]
}
