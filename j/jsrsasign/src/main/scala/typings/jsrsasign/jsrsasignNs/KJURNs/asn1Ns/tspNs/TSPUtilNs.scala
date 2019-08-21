package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_CertsHashAlgSigAlg
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.SignedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.asn1.tsp.TSPUtil")
@js.native
object TSPUtilNs extends js.Object {
  /**
    * generate TimeStampToken ASN.1 object specified by JSON parameters
    * @param param JSON parameter to generate TimeStampToken
    * @return object just generated
    * @description
    * @example
    */
  def newTimeStampToken(): SignedData = js.native
  def newTimeStampToken(param: Anon_CertsHashAlgSigAlg): SignedData = js.native
}

