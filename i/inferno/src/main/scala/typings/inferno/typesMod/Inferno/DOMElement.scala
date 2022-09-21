package typings.inferno.typesMod.Inferno

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */]
  extends StObject
     with InfernoElement[P] {
  
  var ref: Ref[T]
  
  @JSName("type")
  var type_DOMElement: String
}
object DOMElement {
  
  inline def apply[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](props: P, ref: Ref[T], `type`: String): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
  
  extension [Self <: DOMElement[?, ?], P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](x: Self & (DOMElement[P, T])) {
    
    inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ T | Null => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
