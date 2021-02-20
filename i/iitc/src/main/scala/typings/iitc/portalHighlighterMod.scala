package typings.iitc

import org.scalablytyped.runtime.StringDictionary
import typings.iitc.iitctypesMod.IITC.Portal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalHighlighterMod {
  
  object global {
    
    @JSGlobal("addPortalHighlighter")
    @js.native
    def addPortalHighlighter(name: String, data: Hightligher): Unit = js.native
    
    @JSGlobal("changePortalHighlights")
    @js.native
    def changePortalHighlights(name: String): Unit = js.native
    
    /** the name of the current highlighter */
    @JSGlobal("_current_highlighter")
    @js.native
    def currentHighlighter: String = js.native
    
    @scala.inline
    def currentHighlighter_=(x: String): Unit = js.Dynamic.global.updateDynamic("_current_highlighter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("highlightPortal")
    @js.native
    def highlightPortal(p: Portal): Unit = js.native
    
    /** an object mapping highlighter names to the object containing callback functions */
    @JSGlobal("_highlighters")
    @js.native
    def highlighters: StringDictionary[Hightligher] | Null = js.native
    
    @scala.inline
    def highlighters_=(x: StringDictionary[Hightligher] | Null): Unit = js.Dynamic.global.updateDynamic("_highlighters")(x.asInstanceOf[js.Any])
    
    /**
      * = "No Highlights"
      */
    @JSGlobal("_no_highlighter")
    @js.native
    def noHighlighter: String = js.native
    
    @scala.inline
    def noHighlighter_=(x: String): Unit = js.Dynamic.global.updateDynamic("_no_highlighter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("resetHighlightedPortals")
    @js.native
    def resetHighlightedPortals(): Unit = js.native
    
    // (re)creates the highlighter dropdown list
    @JSGlobal("updatePortalHighlighterControl")
    @js.native
    def updatePortalHighlighterControl(): Unit = js.native
    
    @js.native
    trait Hightligher extends StObject {
      
      def hightlight(portal: Portal): Unit = js.native
    }
    object Hightligher {
      
      @scala.inline
      def apply(hightlight: Portal => Unit): Hightligher = {
        val __obj = js.Dynamic.literal(hightlight = js.Any.fromFunction1(hightlight))
        __obj.asInstanceOf[Hightligher]
      }
      
      @scala.inline
      implicit class HightligherMutableBuilder[Self <: Hightligher] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHightlight(value: Portal => Unit): Self = StObject.set(x, "hightlight", js.Any.fromFunction1(value))
      }
    }
  }
}
