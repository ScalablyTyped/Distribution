package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsBase extends StObject {
  
  // a store used to cache and share view models.
  var factory: js.UndefOr[Factory] = js.native
  
  // a factory used to create view models.
  var options: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  // the path to the value (used to create related observables from the factory).
  var store: js.UndefOr[Store] = js.native
}
object OptionsBase {
  
  @scala.inline
  def apply(): OptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBase]
  }
  
  @scala.inline
  implicit class OptionsBaseMutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
