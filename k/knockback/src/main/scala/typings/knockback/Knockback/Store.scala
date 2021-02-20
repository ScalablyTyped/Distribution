package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends Destroyable {
  
  def clear(): js.Any = js.native
  
  def findOrCreate(obj: Model[_, ModelSetOptions, js.Object], options: StoreOptions): js.Any = js.native
  
  def register(
    obj: Model[_, ModelSetOptions, js.Object],
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    options: StoreOptions
  ): js.Any = js.native
}
object Store {
  
  @scala.inline
  def apply(
    clear: () => js.Any,
    destroy: () => js.Any,
    findOrCreate: (Model[_, ModelSetOptions, js.Object], StoreOptions) => js.Any,
    register: (Model[_, ModelSetOptions, js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any, StoreOptions) => js.Any
  ): Store = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), findOrCreate = js.Any.fromFunction2(findOrCreate), register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => js.Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindOrCreate(value: (Model[_, ModelSetOptions, js.Object], StoreOptions) => js.Any): Self = StObject.set(x, "findOrCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegister(
      value: (Model[_, ModelSetOptions, js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any, StoreOptions) => js.Any
    ): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
  }
}
