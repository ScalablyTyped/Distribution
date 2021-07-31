package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutStrings.notifyAtFixedRate
import typings.knockout.knockoutStrings.notifyWhenChangesStop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateLimitOptions
  extends StObject
     with /* option */ StringDictionary[js.Any] {
  
  var method: js.UndefOr[notifyAtFixedRate | notifyWhenChangesStop | RateLimitMethod] = js.undefined
  
  var timeout: Double
}
object RateLimitOptions {
  
  @scala.inline
  def apply(timeout: Double): RateLimitOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitOptions]
  }
  
  @scala.inline
  implicit class RateLimitOptionsMutableBuilder[Self <: RateLimitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: notifyAtFixedRate | notifyWhenChangesStop | RateLimitMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodFunction3(
      value: (/* callback */ js.Function0[Unit], /* timeout */ Double, /* options */ js.Any) => js.Function0[Unit]
    ): Self = StObject.set(x, "method", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
