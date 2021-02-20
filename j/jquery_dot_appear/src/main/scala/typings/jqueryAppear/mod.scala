package typings.jqueryAppear

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Options[T] extends StObject {
    
    /**
      * X accuracy
      */
    var accX: js.UndefOr[Double] = js.native
    
    /**
      * Y accuracy
      */
    var accY: js.UndefOr[Double] = js.native
    
    /**
      * Data to pass into callback
      */
    var data: js.UndefOr[T] = js.native
    
    /**
      * Callback is called only in first appear
      */
    var one: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setAccX(value: Double): Self = StObject.set(x, "accX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccXUndefined: Self = StObject.set(x, "accX", js.undefined)
      
      @scala.inline
      def setAccY(value: Double): Self = StObject.set(x, "accY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccYUndefined: Self = StObject.set(x, "accY", js.undefined)
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setOne(value: Boolean): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
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
