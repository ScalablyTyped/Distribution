package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.IComponent
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
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  
  extension [Self <: ComponentElement[?, ?], P, T /* <: IComponent[P, ComponentState] */](x: Self & (ComponentElement[P, T])) {
    
    inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ T | Null => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setType(value: ComponentClass[P]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
