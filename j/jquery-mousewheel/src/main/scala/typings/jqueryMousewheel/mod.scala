package typings.jqueryMousewheel

import typings.jquery.JQueryEventObject
import typings.jquery.JQueryStatic
import typings.jqueryMousewheel.anon.AdjustOldDeltas
import typings.jqueryMousewheel.jqueryMousewheelStrings.mousewheel
import typings.jqueryMousewheel.mod.global.JQueryMousewheel.JQueryMousewheelEventData
import typings.jqueryMousewheel.mod.global.JQueryMousewheel.JQueryMousewheelEventHandler
import typings.jqueryMousewheel.mod.global.JQueryMousewheel.JQueryMousewheelEventHook
import typings.jqueryMousewheel.mod.global.JQueryMousewheel.JQueryMousewheelEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Factory function for Browserify in Node.js/CommonJS environments.
    * Modifies `$` to include the `jquery-mousewheel` library.
    * Designed for use with export-related JS features.
    *
    * @param $ JQuery static library object.
    */
  inline def apply($: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].apply($.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("jquery-mousewheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    trait JQuery extends StObject {
      
      def mousewheel(handler: JQueryMousewheelEventHandler): JQuery
      
      @JSName("on")
      def on_mousewheel(event: mousewheel, handler: JQueryMousewheelEventHandler): JQuery
      
      def unmousewheel(): JQuery
    }
    object JQuery {
      
      inline def apply(
        mousewheel: JQueryMousewheelEventHandler => JQuery,
        on: (mousewheel, JQueryMousewheelEventHandler) => JQuery,
        unmousewheel: () => JQuery
      ): JQuery = {
        val __obj = js.Dynamic.literal(mousewheel = js.Any.fromFunction1(mousewheel), on = js.Any.fromFunction2(on), unmousewheel = js.Any.fromFunction0(unmousewheel))
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        inline def setMousewheel(value: JQueryMousewheelEventHandler => JQuery): Self = StObject.set(x, "mousewheel", js.Any.fromFunction1(value))
        
        inline def setOn(value: (mousewheel, JQueryMousewheelEventHandler) => JQuery): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        inline def setUnmousewheel(value: () => JQuery): Self = StObject.set(x, "unmousewheel", js.Any.fromFunction0(value))
      }
      
      trait SpecialEventHooks extends StObject {
        
        var mousewheel: JQueryMousewheelEventHook[JQueryMousewheelEventObject, JQueryMousewheelEventData]
      }
      object SpecialEventHooks {
        
        inline def apply(mousewheel: JQueryMousewheelEventHook[JQueryMousewheelEventObject, JQueryMousewheelEventData]): SpecialEventHooks = {
          val __obj = js.Dynamic.literal(mousewheel = mousewheel.asInstanceOf[js.Any])
          __obj.asInstanceOf[SpecialEventHooks]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SpecialEventHooks] (val x: Self) extends AnyVal {
          
          inline def setMousewheel(value: JQueryMousewheelEventHook[JQueryMousewheelEventObject, JQueryMousewheelEventData]): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object JQueryMousewheel {
      
      trait JQueryMousewheelEventData extends StObject {
        
        var `mousewheel-line-height`: Double
        
        var `mousewheel-page-height`: Double
      }
      object JQueryMousewheelEventData {
        
        inline def apply(`mousewheel-line-height`: Double, `mousewheel-page-height`: Double): JQueryMousewheelEventData = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("mousewheel-line-height")(`mousewheel-line-height`.asInstanceOf[js.Any])
          __obj.updateDynamic("mousewheel-page-height")(`mousewheel-page-height`.asInstanceOf[js.Any])
          __obj.asInstanceOf[JQueryMousewheelEventData]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: JQueryMousewheelEventData] (val x: Self) extends AnyVal {
          
          inline def `setMousewheel-line-height`(value: Double): Self = StObject.set(x, "mousewheel-line-height", value.asInstanceOf[js.Any])
          
          inline def `setMousewheel-page-height`(value: Double): Self = StObject.set(x, "mousewheel-page-height", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait JQueryMousewheelEventHandler extends StObject {
        
        def apply(eventObject: JQueryMousewheelEventObject, args: Any*): Any = js.native
      }
      
      trait JQueryMousewheelEventHook[O, D] extends StObject {
        
        def getLineHeight(
          elem: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jquery-mousewheel.jquery-mousewheel.<global>.JQuery['appendTo']>[0] */ js.Any
        ): Double | scala.Nothing
        
        def getPageHeight(
          elem: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jquery-mousewheel.jquery-mousewheel.<global>.JQuery['appendTo']>[0] */ js.Any
        ): Double | scala.Nothing
        
        var settings: AdjustOldDeltas
        
        var setup: /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<jquery.JQuery.SpecialEventHook<O, D>, jquery-mousewheel.anon.Setup>['setup'] */ js.Any
        
        var teardown: /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<jquery.JQuery.SpecialEventHook<O, D>, jquery-mousewheel.anon.Teardown>['teardown'] */ js.Any
        
        var version: String
      }
      object JQueryMousewheelEventHook {
        
        inline def apply[O, D](
          getLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jquery-mousewheel.jquery-mousewheel.<global>.JQuery['appendTo']>[0] */ js.Any => Double | scala.Nothing,
          getPageHeight: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jquery-mousewheel.jquery-mousewheel.<global>.JQuery['appendTo']>[0] */ js.Any => Double | scala.Nothing,
          settings: AdjustOldDeltas,
          setup: /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<jquery.JQuery.SpecialEventHook<O, D>, jquery-mousewheel.anon.Setup>['setup'] */ js.Any,
          teardown: /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<jquery.JQuery.SpecialEventHook<O, D>, jquery-mousewheel.anon.Teardown>['teardown'] */ js.Any,
          version: String
        ): JQueryMousewheelEventHook[O, D] = {
          val __obj = js.Dynamic.literal(getLineHeight = js.Any.fromFunction1(getLineHeight), getPageHeight = js.Any.fromFunction1(getPageHeight), settings = settings.asInstanceOf[js.Any], setup = setup.asInstanceOf[js.Any], teardown = teardown.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
          __obj.asInstanceOf[JQueryMousewheelEventHook[O, D]]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: JQueryMousewheelEventHook[?, ?], O, D] (val x: Self & (JQueryMousewheelEventHook[O, D])) extends AnyVal {
          
          inline def setGetLineHeight(
            value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jquery-mousewheel.jquery-mousewheel.<global>.JQuery['appendTo']>[0] */ js.Any => Double | scala.Nothing
          ): Self = StObject.set(x, "getLineHeight", js.Any.fromFunction1(value))
          
          inline def setGetPageHeight(
            value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jquery-mousewheel.jquery-mousewheel.<global>.JQuery['appendTo']>[0] */ js.Any => Double | scala.Nothing
          ): Self = StObject.set(x, "getPageHeight", js.Any.fromFunction1(value))
          
          inline def setSettings(value: AdjustOldDeltas): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
          
          inline def setSetup(
            value: /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<jquery.JQuery.SpecialEventHook<O, D>, jquery-mousewheel.anon.Setup>['setup'] */ js.Any
          ): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
          
          inline def setTeardown(
            value: /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<jquery.JQuery.SpecialEventHook<O, D>, jquery-mousewheel.anon.Teardown>['teardown'] */ js.Any
          ): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
          
          inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait JQueryMousewheelEventObject
        extends StObject
           with JQueryEventObject {
        
        var absDelta: Double = js.native
        
        var deltaFactor: Double = js.native
        
        var deltaMode: Double = js.native
        
        var deltaX: Double = js.native
        
        var deltaY: Double = js.native
      }
    }
  }
}
