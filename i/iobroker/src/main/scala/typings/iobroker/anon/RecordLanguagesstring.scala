package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<iobroker.iobroker/objects.<global>.ioBroker.Languages, string> */
trait RecordLanguagesstring extends StObject {
  
  var de: String
  
  var en: String
  
  var es: String
  
  var fr: String
  
  var it: String
  
  var nl: String
  
  var pl: String
  
  var pt: String
  
  var ru: String
  
  var uk: String
  
  var `zh-cn`: String
}
object RecordLanguagesstring {
  
  inline def apply(
    de: String,
    en: String,
    es: String,
    fr: String,
    it: String,
    nl: String,
    pl: String,
    pt: String,
    ru: String,
    uk: String,
    `zh-cn`: String
  ): RecordLanguagesstring = {
    val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], fr = fr.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], nl = nl.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ru = ru.asInstanceOf[js.Any], uk = uk.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-cn")(`zh-cn`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordLanguagesstring]
  }
  
  extension [Self <: RecordLanguagesstring](x: Self) {
    
    inline def setDe(value: String): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
    
    inline def setEn(value: String): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    inline def setEs(value: String): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setFr(value: String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
    
    inline def setIt(value: String): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
    
    inline def setNl(value: String): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
    
    inline def setPl(value: String): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPt(value: String): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setRu(value: String): Self = StObject.set(x, "ru", value.asInstanceOf[js.Any])
    
    inline def setUk(value: String): Self = StObject.set(x, "uk", value.asInstanceOf[js.Any])
    
    inline def `setZh-cn`(value: String): Self = StObject.set(x, "zh-cn", value.asInstanceOf[js.Any])
  }
}
