package typings.iitc

import org.scalablytyped.runtime.StringDictionary
import typings.iitc.coreIitctypesMod.IITC.Portal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePortalHighlighterMod {
  
  object global {
    
    inline def addPortalHighlighter(name: String, data: Hightligher): Unit = (js.Dynamic.global.applyDynamic("addPortalHighlighter")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def changePortalHighlights(name: String): Unit = js.Dynamic.global.applyDynamic("changePortalHighlights")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** the name of the current highlighter */
    @JSGlobal("_current_highlighter")
    @js.native
    def currentHighlighter: String = js.native
    
    inline def currentHighlighter_=(x: String): Unit = js.Dynamic.global.updateDynamic("_current_highlighter")(x.asInstanceOf[js.Any])
    
    inline def highlightPortal(p: Portal): Unit = js.Dynamic.global.applyDynamic("highlightPortal")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** an object mapping highlighter names to the object containing callback functions */
    @JSGlobal("_highlighters")
    @js.native
    def highlighters: StringDictionary[Hightligher] | Null = js.native
    
    inline def highlighters_=(x: StringDictionary[Hightligher] | Null): Unit = js.Dynamic.global.updateDynamic("_highlighters")(x.asInstanceOf[js.Any])
    
    /**
      * = "No Highlights"
      */
    @JSGlobal("_no_highlighter")
    @js.native
    def noHighlighter: String = js.native
    
    inline def noHighlighter_=(x: String): Unit = js.Dynamic.global.updateDynamic("_no_highlighter")(x.asInstanceOf[js.Any])
    
    inline def resetHighlightedPortals(): Unit = js.Dynamic.global.applyDynamic("resetHighlightedPortals")().asInstanceOf[Unit]
    
    // (re)creates the highlighter dropdown list
    inline def updatePortalHighlighterControl(): Unit = js.Dynamic.global.applyDynamic("updatePortalHighlighterControl")().asInstanceOf[Unit]
    
    trait Hightligher extends StObject {
      
      def hightlight(portal: Portal): Unit
    }
    object Hightligher {
      
      inline def apply(hightlight: Portal => Unit): Hightligher = {
        val __obj = js.Dynamic.literal(hightlight = js.Any.fromFunction1(hightlight))
        __obj.asInstanceOf[Hightligher]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Hightligher] (val x: Self) extends AnyVal {
        
        inline def setHightlight(value: Portal => Unit): Self = StObject.set(x, "hightlight", js.Any.fromFunction1(value))
      }
    }
  }
}
