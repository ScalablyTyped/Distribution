package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.IComponent
import typings.inferno.distCoreTypesMod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElement[P, T /* <: IComponent[P, ComponentState] */]
  extends StObject
     with InfernoElement[P] {
  
  var ref: js.UndefOr[Ref[T]] = js.undefined
  
  @JSName("type")
  var type_ComponentElement: ComponentClass[P]
}
object ComponentElement {
  
  inline def apply[P, T /* <: IComponent[P, ComponentState] */](props: P, `type`: ComponentClass[P]): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentElement[?, ?], P, T /* <: IComponent[P, ComponentState] */] (val x: Self & (ComponentElement[P, T])) extends AnyVal {
    
    inline def setRef(value: /* instance */ T | Null => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setType(value: ComponentClass[P]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
