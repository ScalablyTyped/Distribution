package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilitySonificationOptions extends StObject {
  
  var playAsSoundButtonText: js.UndefOr[String] = js.undefined
  
  var playAsSoundClickAnnouncement: js.UndefOr[String] = js.undefined
}
object LangAccessibilitySonificationOptions {
  
  inline def apply(): LangAccessibilitySonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySonificationOptions]
  }
  
  extension [Self <: LangAccessibilitySonificationOptions](x: Self) {
    
    inline def setPlayAsSoundButtonText(value: String): Self = StObject.set(x, "playAsSoundButtonText", value.asInstanceOf[js.Any])
    
    inline def setPlayAsSoundButtonTextUndefined: Self = StObject.set(x, "playAsSoundButtonText", js.undefined)
    
    inline def setPlayAsSoundClickAnnouncement(value: String): Self = StObject.set(x, "playAsSoundClickAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setPlayAsSoundClickAnnouncementUndefined: Self = StObject.set(x, "playAsSoundClickAnnouncement", js.undefined)
  }
}
