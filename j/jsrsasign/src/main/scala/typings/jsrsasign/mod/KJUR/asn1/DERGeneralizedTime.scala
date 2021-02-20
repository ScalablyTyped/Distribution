package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER GeneralizedTime
  * @param params associative array of parameters (ex. {'str': '20130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'20130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  * - millis - specify flag to show milliseconds (from 1.0.6)
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'withMillis' property is supported from asn1 1.0.6.
  */
@JSImport("jsrsasign", "KJUR.asn1.DERGeneralizedTime")
@js.native
class DERGeneralizedTime protected ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERGeneralizedTime {
  def this(params: String) = this()
  def this(params: DateParam) = this()
  def this(params: HexParam) = this()
  def this(params: StringParam) = this()
}
