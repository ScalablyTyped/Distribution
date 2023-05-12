package typings.inferno.distCoreTypesMod.Inferno

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfernoSVGElement
  extends StObject
     with DOMElement[SVGAttributes[SVGElement], SVGElement]
object InfernoSVGElement {
  
  inline def apply(props: SVGAttributes[SVGElement], ref: /* instance */ SVGElement | Null => Any, `type`: String): InfernoSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfernoSVGElement]
  }
}
