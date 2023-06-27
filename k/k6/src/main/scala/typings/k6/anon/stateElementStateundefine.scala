package typings.k6.anon

import typings.k6.experimentalBrowserMod.ElementState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  state :k6.k6/experimental/browser.ElementState | undefined} & k6.k6/experimental/browser.StrictnessOptions & k6.k6/experimental/browser.TimeoutOptions */
trait stateElementStateundefine extends StObject {
  
  var state: js.UndefOr[ElementState] = js.undefined
  
  /**
    * When `true`, the call requires selector to resolve to a single element.
    * If given selector resolves to more than one element, the call throws
    * an exception. Defaults to `false`.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum time in milliseconds. Pass 0 to disable the timeout. Default is overridden by the setDefaultTimeout option on `BrowserContext` or `Page`.
    * Defaults to 30000.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object stateElementStateundefine {
  
  inline def apply(): stateElementStateundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[stateElementStateundefine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: stateElementStateundefine] (val x: Self) extends AnyVal {
    
    inline def setState(value: ElementState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
