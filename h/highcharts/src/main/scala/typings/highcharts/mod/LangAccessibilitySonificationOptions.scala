package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilitySonificationOptions extends StObject {
  
  var playAsSoundButtonText: js.UndefOr[String] = js.undefined
  
  var playAsSoundClickAnnouncement: js.UndefOr[String] = js.undefined
}
object LangAccessibilitySonificationOptions {
  
  @scala.inline
  def apply(): LangAccessibilitySonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySonificationOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilitySonificationOptionsMutableBuilder[Self <: LangAccessibilitySonificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayAsSoundButtonText(value: String): Self = StObject.set(x, "playAsSoundButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayAsSoundButtonTextUndefined: Self = StObject.set(x, "playAsSoundButtonText", js.undefined)
    
    @scala.inline
    def setPlayAsSoundClickAnnouncement(value: String): Self = StObject.set(x, "playAsSoundClickAnnouncement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayAsSoundClickAnnouncementUndefined: Self = StObject.set(x, "playAsSoundClickAnnouncement", js.undefined)
  }
}
