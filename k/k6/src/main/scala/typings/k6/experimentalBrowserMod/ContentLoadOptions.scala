package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLoadOptions
  extends StObject
     with TimeoutOptions {
  
  /**
    * When to consider operation succeeded, defaults to `load`. Events can be
    * either:
    * - `'domcontentloaded'` - consider operation to be finished when the
    * `DOMContentLoaded` event is fired.
    * - `'load'` - consider operation to be finished when the `load` event is
    * fired.
    * - `'networkidle'` - **DISCOURAGED** consider operation to be finished
    * when there are no network connections for at least `500` ms. Don't use
    * this method for testing especially with chatty websites where the event
    * may never fire, rely on web assertions to assess readiness instead.
    */
  var waitUntil: js.UndefOr[LifecycleEvent] = js.undefined
}
object ContentLoadOptions {
  
  inline def apply(): ContentLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentLoadOptions] (val x: Self) extends AnyVal {
    
    inline def setWaitUntil(value: LifecycleEvent): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
  }
}
