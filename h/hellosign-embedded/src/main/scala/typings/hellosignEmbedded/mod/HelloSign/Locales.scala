package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.cs_CZ
import typings.hellosignEmbedded.hellosignEmbeddedStrings.da_DK
import typings.hellosignEmbedded.hellosignEmbeddedStrings.de_DE
import typings.hellosignEmbedded.hellosignEmbeddedStrings.en_US
import typings.hellosignEmbedded.hellosignEmbeddedStrings.es_ES
import typings.hellosignEmbedded.hellosignEmbeddedStrings.es_MX
import typings.hellosignEmbedded.hellosignEmbeddedStrings.fr_FR
import typings.hellosignEmbedded.hellosignEmbeddedStrings.it_IT
import typings.hellosignEmbedded.hellosignEmbeddedStrings.ja_JP
import typings.hellosignEmbedded.hellosignEmbeddedStrings.nl_NL
import typings.hellosignEmbedded.hellosignEmbeddedStrings.pl_PL
import typings.hellosignEmbedded.hellosignEmbeddedStrings.pt_BR
import typings.hellosignEmbedded.hellosignEmbeddedStrings.sv_SE
import typings.hellosignEmbedded.hellosignEmbeddedStrings.zh_CN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locales extends js.Object {
  
  var CS_CZ: cs_CZ = js.native
  
  var DA_DK: da_DK = js.native
  
  var DE_DE: de_DE = js.native
  
  var EN_US: en_US = js.native
  
  var ES_ES: es_ES = js.native
  
  var ES_MX: es_MX = js.native
  
  var FR_FR: fr_FR = js.native
  
  var IT_IT: it_IT = js.native
  
  var JA_JP: ja_JP = js.native
  
  var NL_NL: nl_NL = js.native
  
  var PL_PL: pl_PL = js.native
  
  var PT_BR: pt_BR = js.native
  
  var SV_SE: sv_SE = js.native
  
  var ZH_CN: zh_CN = js.native
}
object Locales {
  
  @scala.inline
  def apply(
    CS_CZ: cs_CZ,
    DA_DK: da_DK,
    DE_DE: de_DE,
    EN_US: en_US,
    ES_ES: es_ES,
    ES_MX: es_MX,
    FR_FR: fr_FR,
    IT_IT: it_IT,
    JA_JP: ja_JP,
    NL_NL: nl_NL,
    PL_PL: pl_PL,
    PT_BR: pt_BR,
    SV_SE: sv_SE,
    ZH_CN: zh_CN
  ): Locales = {
    val __obj = js.Dynamic.literal(CS_CZ = CS_CZ.asInstanceOf[js.Any], DA_DK = DA_DK.asInstanceOf[js.Any], DE_DE = DE_DE.asInstanceOf[js.Any], EN_US = EN_US.asInstanceOf[js.Any], ES_ES = ES_ES.asInstanceOf[js.Any], ES_MX = ES_MX.asInstanceOf[js.Any], FR_FR = FR_FR.asInstanceOf[js.Any], IT_IT = IT_IT.asInstanceOf[js.Any], JA_JP = JA_JP.asInstanceOf[js.Any], NL_NL = NL_NL.asInstanceOf[js.Any], PL_PL = PL_PL.asInstanceOf[js.Any], PT_BR = PT_BR.asInstanceOf[js.Any], SV_SE = SV_SE.asInstanceOf[js.Any], ZH_CN = ZH_CN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locales]
  }
  
  @scala.inline
  implicit class LocalesOps[Self <: Locales] (val x: Self) extends AnyVal {
    
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
    def setCS_CZ(value: cs_CZ): Self = this.set("CS_CZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDA_DK(value: da_DK): Self = this.set("DA_DK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDE_DE(value: de_DE): Self = this.set("DE_DE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEN_US(value: en_US): Self = this.set("EN_US", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setES_ES(value: es_ES): Self = this.set("ES_ES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setES_MX(value: es_MX): Self = this.set("ES_MX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFR_FR(value: fr_FR): Self = this.set("FR_FR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIT_IT(value: it_IT): Self = this.set("IT_IT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJA_JP(value: ja_JP): Self = this.set("JA_JP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNL_NL(value: nl_NL): Self = this.set("NL_NL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPL_PL(value: pl_PL): Self = this.set("PL_PL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPT_BR(value: pt_BR): Self = this.set("PT_BR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSV_SE(value: sv_SE): Self = this.set("SV_SE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZH_CN(value: zh_CN): Self = this.set("ZH_CN", value.asInstanceOf[js.Any])
  }
}
