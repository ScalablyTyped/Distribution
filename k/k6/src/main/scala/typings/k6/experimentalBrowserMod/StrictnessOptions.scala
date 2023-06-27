package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictnessOptions extends StObject {
  
  /**
    * When `true`, the call requires selector to resolve to a single element.
    * If given selector resolves to more than one element, the call throws
    * an exception. Defaults to `false`.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object StrictnessOptions {
  
  inline def apply(): StrictnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictnessOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrictnessOptions] (val x: Self) extends AnyVal {
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
