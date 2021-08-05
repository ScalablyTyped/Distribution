package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store
  extends StObject
     with Destroyable {
  
  def clear(): js.Any
  
  def findOrCreate(obj: Model[js.Any, ModelSetOptions, js.Object], options: StoreOptions): js.Any
  
  def register(
    obj: Model[js.Any, ModelSetOptions, js.Object],
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    options: StoreOptions
  ): js.Any
}
object Store {
  
  inline def apply(
    clear: () => js.Any,
    destroy: () => js.Any,
    findOrCreate: (Model[js.Any, ModelSetOptions, js.Object], StoreOptions) => js.Any,
    register: (Model[js.Any, ModelSetOptions, js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any, StoreOptions) => js.Any
  ): Store = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), findOrCreate = js.Any.fromFunction2(findOrCreate), register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Store]
  }
  
  extension [Self <: Store](x: Self) {
    
    inline def setClear(value: () => js.Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setFindOrCreate(value: (Model[js.Any, ModelSetOptions, js.Object], StoreOptions) => js.Any): Self = StObject.set(x, "findOrCreate", js.Any.fromFunction2(value))
    
    inline def setRegister(
      value: (Model[js.Any, ModelSetOptions, js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any, StoreOptions) => js.Any
    ): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
  }
}
