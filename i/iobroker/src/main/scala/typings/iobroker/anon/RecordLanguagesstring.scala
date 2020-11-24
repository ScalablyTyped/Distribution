package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<iobroker.iobroker/objects.<global>.ioBroker.Languages, string> */
@js.native
trait RecordLanguagesstring extends js.Object {
  
  var de: String = js.native
  
  var en: String = js.native
  
  var es: String = js.native
  
  var fr: String = js.native
  
  var it: String = js.native
  
  var nl: String = js.native
  
  var pl: String = js.native
  
  var pt: String = js.native
  
  var ru: String = js.native
  
  var `zh-cn`: String = js.native
}
object RecordLanguagesstring {
  
  @scala.inline
  def apply(
    de: String,
    en: String,
    es: String,
    fr: String,
    it: String,
    nl: String,
    pl: String,
    pt: String,
    ru: String,
    `zh-cn`: String
  ): RecordLanguagesstring = {
    val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], fr = fr.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], nl = nl.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ru = ru.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-cn")(`zh-cn`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordLanguagesstring]
  }
  
  @scala.inline
  implicit class RecordLanguagesstringOps[Self <: RecordLanguagesstring] (val x: Self) extends AnyVal {
    
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
    def setEn(value: String): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEs(value: String): Self = this.set("es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFr(value: String): Self = this.set("fr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIt(value: String): Self = this.set("it", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNl(value: String): Self = this.set("nl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPl(value: String): Self = this.set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPt(value: String): Self = this.set("pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRu(value: String): Self = this.set("ru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZh-cn`(value: String): Self = this.set("zh-cn", value.asInstanceOf[js.Any])
  }
}
