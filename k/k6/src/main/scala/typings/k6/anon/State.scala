package typings.k6.anon

import typings.k6.k6Strings.attached
import typings.k6.k6Strings.detached
import typings.k6.k6Strings.hidden
import typings.k6.k6Strings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  /**
    * Defaults to `'visible'`. Can be either:
    * - `'attached'` - wait for element to be present in DOM.
    * - `'detached'` - wait for element to not be present in DOM.
    * - `'visible'` - wait for element to have non-empty bounding box and no
    * `visibility:hidden`.
    * - `'hidden'` - wait for element to be either detached from DOM, or have
    * an empty bounding box or `visibility:hidden`.
    */
  var state: js.UndefOr[attached | detached | visible | hidden] = js.undefined
  
  /**
    * When `true`, the call requires selector to resolve to a single element.
    * If given selector resolves to more than one element, the call throws
    * an exception. Defaults to `false`.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum time in milliseconds. Defaults to `30` seconds. Default is
    * overridden by the `setDefaultTimeout` option on `BrowserContext` or
    * `page` methods.
    *
    * Setting the value to `0` will disable the timeout.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object State {
  
  inline def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setState(value: attached | detached | visible | hidden): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
