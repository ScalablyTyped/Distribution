package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCultures extends js.Object {
  /**
    * Danish (Denmark)
    *
    * @default da_DK
    */
  var DA_DK: java.lang.String
  /**
    * German (Germany)
    *
    * @default de_DE
    */
  var DE_DE: java.lang.String
  /**
    * English (United States)
    *
    * @default en_US
    */
  var EN_US: java.lang.String
  /**
    * French (France)
    *
    * @default fr_FR
    */
  var FR_FR: java.lang.String
  /**
    * Dutch (The Netherlands)
    * @default nl_NL
    */
  var NL_NL: java.lang.String
  /**
    * Swedish (Sweden)
    *
    * @default sv_SE
    */
  var SV_SE: java.lang.String
  /**
    * Chinese (China)
    *
    * @default zh_CN
    */
  var ZH_CN: java.lang.String
  /**
    * The available client UI cultures
    */
  var supportedCultures: js.Array[java.lang.String]
}

object ClientCultures {
  @scala.inline
  def apply(
    DA_DK: java.lang.String,
    DE_DE: java.lang.String,
    EN_US: java.lang.String,
    FR_FR: java.lang.String,
    NL_NL: java.lang.String,
    SV_SE: java.lang.String,
    ZH_CN: java.lang.String,
    supportedCultures: js.Array[java.lang.String]
  ): ClientCultures = {
    val __obj = js.Dynamic.literal(DA_DK = DA_DK, DE_DE = DE_DE, EN_US = EN_US, FR_FR = FR_FR, NL_NL = NL_NL, SV_SE = SV_SE, ZH_CN = ZH_CN, supportedCultures = supportedCultures)
  
    __obj.asInstanceOf[ClientCultures]
  }
}

