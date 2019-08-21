package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessCategory extends js.Object {
  var C: String
  var CN: String
  var DC: String
  var DN: String
  var E: String
  var L: String
  var O: String
  var OU: String
  var SN: String
  var ST: String
  var STREET: String
  var UID: String
  var businessCategory: String
  var jurisdictionOfIncorporationC: String
  var jurisdictionOfIncorporationL: String
  var jurisdictionOfIncorporationSP: String
  var postalCode: String
  var serialNumber: String
}

object Anon_BusinessCategory {
  @scala.inline
  def apply(
    C: String,
    CN: String,
    DC: String,
    DN: String,
    E: String,
    L: String,
    O: String,
    OU: String,
    SN: String,
    ST: String,
    STREET: String,
    UID: String,
    businessCategory: String,
    jurisdictionOfIncorporationC: String,
    jurisdictionOfIncorporationL: String,
    jurisdictionOfIncorporationSP: String,
    postalCode: String,
    serialNumber: String
  ): Anon_BusinessCategory = {
    val __obj = js.Dynamic.literal(C = C, CN = CN, DC = DC, DN = DN, E = E, L = L, O = O, OU = OU, SN = SN, ST = ST, STREET = STREET, UID = UID, businessCategory = businessCategory, jurisdictionOfIncorporationC = jurisdictionOfIncorporationC, jurisdictionOfIncorporationL = jurisdictionOfIncorporationL, jurisdictionOfIncorporationSP = jurisdictionOfIncorporationSP, postalCode = postalCode, serialNumber = serialNumber)
  
    __obj.asInstanceOf[Anon_BusinessCategory]
  }
}

