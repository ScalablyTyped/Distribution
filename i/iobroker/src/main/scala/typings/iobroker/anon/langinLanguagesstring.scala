package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ lang in iobroker.iobroker/objects.<global>.ioBroker.Languages ]:? string} */
@js.native
trait langinLanguagesstring extends js.Object {
  
  var de: js.UndefOr[String] = js.native
  
  var en: js.UndefOr[String] = js.native
  
  var es: js.UndefOr[String] = js.native
  
  var fr: js.UndefOr[String] = js.native
  
  var it: js.UndefOr[String] = js.native
  
  var nl: js.UndefOr[String] = js.native
  
  var pl: js.UndefOr[String] = js.native
  
  var pt: js.UndefOr[String] = js.native
  
  var ru: js.UndefOr[String] = js.native
  
  var `zh-cn`: js.UndefOr[String] = js.native
}
object langinLanguagesstring {
  
  @scala.inline
  def apply(): langinLanguagesstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[langinLanguagesstring]
  }
  
  @scala.inline
  implicit class langinLanguagesstringOps[Self <: langinLanguagesstring] (val x: Self) extends AnyVal {
    
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
    def setDe(value: String): Self = this.set("de", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDe: Self = this.set("de", js.undefined)
    
    @scala.inline
    def setEn(value: String): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEn: Self = this.set("en", js.undefined)
    
    @scala.inline
    def setEs(value: String): Self = this.set("es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEs: Self = this.set("es", js.undefined)
    
    @scala.inline
    def setFr(value: String): Self = this.set("fr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFr: Self = this.set("fr", js.undefined)
    
    @scala.inline
    def setIt(value: String): Self = this.set("it", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIt: Self = this.set("it", js.undefined)
    
    @scala.inline
    def setNl(value: String): Self = this.set("nl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNl: Self = this.set("nl", js.undefined)
    
    @scala.inline
    def setPl(value: String): Self = this.set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
    
    @scala.inline
    def setPt(value: String): Self = this.set("pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
    
    @scala.inline
    def setRu(value: String): Self = this.set("ru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRu: Self = this.set("ru", js.undefined)
    
    @scala.inline
    def `setZh-cn`(value: String): Self = this.set("zh-cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZh-cn`: Self = this.set("zh-cn", js.undefined)
  }
}
