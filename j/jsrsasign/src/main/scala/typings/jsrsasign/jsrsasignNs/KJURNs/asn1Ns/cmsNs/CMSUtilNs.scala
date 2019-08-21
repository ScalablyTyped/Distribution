package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_Certs
import typings.jsrsasign.Anon_Cms
import typings.jsrsasign.Anon_IsValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.asn1.cms.CMSUtil")
@js.native
object CMSUtilNs extends js.Object {
  /**
    * generate SignedData object specified by JSON parameters
    * @param param JSON parameter to generate CMS SignedData
    * @return object just generated
    * @description
    * This method provides more easy way to genereate
    * CMS SignedData ASN.1 structure by JSON data.
    * @example
    * var sd = KJUR.asn1.cms.CMSUtil.newSignedData({
    *   content: {str: "jsrsasign"},
    *   certs: [certPEM],
    *   signerInfos: [{
    *     hashAlg: 'sha256',
    *     sAttr: {
    *       SigningTime: {}
    *       SigningCertificateV2: {array: [certPEM]},
    *     },
    *     signerCert: certPEM,
    *     sigAlg: 'SHA256withRSA',
    *     signerPrvKey: prvPEM
    *   }]
    * });
    */
  def SignedData(): typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.SignedData = js.native
  def SignedData(param: Anon_Certs): typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.SignedData = js.native
  /**
    * verify SignedData specified by JSON parameters
    *
    * @param param JSON parameter to verify CMS SignedData
    * @return JSON data as the result of validation
    * @description
    * This method provides validation for CMS SignedData.
    * Following parameters can be applied:
    *
    * - cms - hexadecimal data of DER CMS SignedData (aka. PKCS#7 or p7s)
    *     to verify (OPTION)
    *
    * @example
    * KJUR.asn1.cms.CMSUtil.verifySignedData({ cms: "3082058a..." })
    * →
    * {
    *   isValid: true,
    *   parse: ... // parsed data
    *   signerInfos: [
    *     {
    *     }
    *   ]
    * }
    */
  def verifySignedData(): Anon_IsValid = js.native
  def verifySignedData(param: Anon_Cms): Anon_IsValid = js.native
}

