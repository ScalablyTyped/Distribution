package typings.jqueryAppear

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Options[T] extends StObject {
    
    /**
      * X accuracy
      */
    var accX: js.UndefOr[Double] = js.undefined
    
    /**
      * Y accuracy
      */
    var accY: js.UndefOr[Double] = js.undefined
    
    /**
      * Data to pass into callback
      */
    var data: js.UndefOr[T] = js.undefined
    
    /**
      * Callback is called only in first appear
      */
    var one: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setAccX(value: Double): Self = StObject.set(x, "accX", value.asInstanceOf[js.Any])
      
      inline def setAccXUndefined: Self = StObject.set(x, "accX", js.undefined)
      
      inline def setAccY(value: Double): Self = StObject.set(x, "accY", value.asInstanceOf[js.Any])
      
      inline def setAccYUndefined: Self = StObject.set(x, "accY", js.undefined)
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOne(value: Boolean): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Initialize appear plugin
        */
      def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit]): JQuery = js.native
      def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit], options: Options[T]): JQuery = js.native
    }
  }
}
