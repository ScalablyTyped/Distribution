package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions extends StObject {
  
  var creator: js.Any
  
  var factory: Factory
  
  var path: String
  
  var store: Store
}
object StoreOptions {
  
  @scala.inline
  def apply(creator: js.Any, factory: Factory, path: String, store: Store): StoreOptions = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
  
  @scala.inline
  implicit class StoreOptionsMutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreator(value: js.Any): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
