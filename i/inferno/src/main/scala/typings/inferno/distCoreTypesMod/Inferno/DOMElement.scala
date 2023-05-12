package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.Ref
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */]
  extends StObject
     with InfernoElement[P] {
  
  def ref(): Any
  def ref(instance: T): Any
  @JSName("ref")
  var ref_Original: Ref[T]
  
  @JSName("type")
  var type_DOMElement: String
}
object DOMElement {
  
  inline def apply[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](props: P, ref: /* instance */ T | Null => Any, `type`: String): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMElement[?, ?], P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] (val x: Self & (DOMElement[P, T])) extends AnyVal {
    
    inline def setRef(value: /* instance */ T | Null => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
