package typings.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCultures extends js.Object {
  /**
    * Danish (Denmark)
    *
    * @default da_DK
    */
  var DA_DK: String = js.native
  /**
    * German (Germany)
    *
    * @default de_DE
    */
  var DE_DE: String = js.native
  /**
    * English (United States)
    *
    * @default en_US
    */
  var EN_US: String = js.native
  /**
    * French (France)
    *
    * @default fr_FR
    */
  var FR_FR: String = js.native
  /**
    * Dutch (The Netherlands)
    * @default nl_NL
    */
  var NL_NL: String = js.native
  /**
    * Swedish (Sweden)
    *
    * @default sv_SE
    */
  var SV_SE: String = js.native
  /**
    * Chinese (China)
    *
    * @default zh_CN
    */
  var ZH_CN: String = js.native
  /**
    * The available client UI cultures
    */
  var supportedCultures: js.Array[String] = js.native
}

object ClientCultures {
  @scala.inline
  def apply(
    DA_DK: String,
    DE_DE: String,
    EN_US: String,
    FR_FR: String,
    NL_NL: String,
    SV_SE: String,
    ZH_CN: String,
    supportedCultures: js.Array[String]
  ): ClientCultures = {
    val __obj = js.Dynamic.literal(DA_DK = DA_DK.asInstanceOf[js.Any], DE_DE = DE_DE.asInstanceOf[js.Any], EN_US = EN_US.asInstanceOf[js.Any], FR_FR = FR_FR.asInstanceOf[js.Any], NL_NL = NL_NL.asInstanceOf[js.Any], SV_SE = SV_SE.asInstanceOf[js.Any], ZH_CN = ZH_CN.asInstanceOf[js.Any], supportedCultures = supportedCultures.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCultures]
  }
  @scala.inline
  implicit class ClientCulturesOps[Self <: ClientCultures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDA_DK(value: String): Self = this.set("DA_DK", value.asInstanceOf[js.Any])
    @scala.inline
    def setDE_DE(value: String): Self = this.set("DE_DE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEN_US(value: String): Self = this.set("EN_US", value.asInstanceOf[js.Any])
    @scala.inline
    def setFR_FR(value: String): Self = this.set("FR_FR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNL_NL(value: String): Self = this.set("NL_NL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSV_SE(value: String): Self = this.set("SV_SE", value.asInstanceOf[js.Any])
    @scala.inline
    def setZH_CN(value: String): Self = this.set("ZH_CN", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedCulturesVarargs(value: String*): Self = this.set("supportedCultures", js.Array(value :_*))
    @scala.inline
    def setSupportedCultures(value: js.Array[String]): Self = this.set("supportedCultures", value.asInstanceOf[js.Any])
  }
  
}

