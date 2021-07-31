package typings.luxon.mod

import typings.luxon.luxonStrings.long
import typings.luxon.luxonStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneOffsetOptions extends StObject {
  
  var format: js.UndefOr[short | long] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
}
object ZoneOffsetOptions {
  
  @scala.inline
  def apply(): ZoneOffsetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneOffsetOptions]
  }
  
  @scala.inline
  implicit class ZoneOffsetOptionsMutableBuilder[Self <: ZoneOffsetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: short | long): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
