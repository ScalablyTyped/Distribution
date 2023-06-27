package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementHandleOptions
  extends StObject
     with TimeoutOptions {
  
  /**
    * Setting this to `true` will bypass the actionability checks (visible,
    * stable, enabled). Defaults to `false`.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `true` and a navigation occurs from performing this action, it will not wait for it to complete.
    * Defaults to `false`.
    */
  var noWaitAfter: js.UndefOr[Boolean] = js.undefined
}
object ElementHandleOptions {
  
  inline def apply(): ElementHandleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementHandleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementHandleOptions] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setNoWaitAfter(value: Boolean): Self = StObject.set(x, "noWaitAfter", value.asInstanceOf[js.Any])
    
    inline def setNoWaitAfterUndefined: Self = StObject.set(x, "noWaitAfter", js.undefined)
  }
}
