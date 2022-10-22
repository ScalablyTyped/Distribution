package typings.inferno.distCoreTypesMod.Inferno

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedInfernoHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */]
  extends StObject
     with DOMElement[P, T]
object DetailedInfernoHTMLElement {
  
  inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](props: P, ref: /* instance */ T | Null => Any, `type`: String): DetailedInfernoHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedInfernoHTMLElement[P, T]]
  }
}
