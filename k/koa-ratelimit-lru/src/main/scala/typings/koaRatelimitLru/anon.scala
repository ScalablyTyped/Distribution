package typings.koaRatelimitLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Remaining extends StObject {
    
    val remaining: js.UndefOr[String] = js.native
    
    val reset: js.UndefOr[String] = js.native
    
    val total: js.UndefOr[String] = js.native
  }
  object Remaining {
    
    @scala.inline
    def apply(): Remaining = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Remaining]
    }
    
    @scala.inline
    implicit class RemainingMutableBuilder[Self <: Remaining] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
      
      @scala.inline
      def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
