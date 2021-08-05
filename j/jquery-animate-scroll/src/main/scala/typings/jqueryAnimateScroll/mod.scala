package typings.jqueryAnimateScroll

import typings.jqueryAnimateScroll.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  $container :jquery-animate-scroll.jquery-animate-scroll.<global>.JQuery,   speed :number,   offset :number}> */
  trait Options extends StObject {
    
    @JSName("$container")
    var $container: js.UndefOr[JQuery] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def set$container(value: JQuery): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
      
      inline def set$containerUndefined: Self = StObject.set(x, "$container", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def animateScroll(): JQuery = js.native
      def animateScroll(options: Options): JQuery = js.native
      
      def scrollHere(): JQuery = js.native
      def scrollHere(options: Options): JQuery = js.native
    }
    
    @js.native
    trait JQueryStatic extends StObject {
      
      def scrollTo(element: JQuery): Unit = js.native
      def scrollTo(element: JQuery, options: Options): Unit = js.native
    }
  }
}
