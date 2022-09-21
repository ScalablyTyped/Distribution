package typings.inferno

import typings.inferno.anon.ReadonlychildrenInfernoNo
import typings.inferno.typesMod.Inferno.InfernoNode
import typings.inferno.typesMod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("inferno/dist/core/refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
  
  inline def forwardRef[T, P](
    render: js.Function2[/* props */ ReadonlychildrenInfernoNo & P, /* ref */ RefObject[T], InfernoNode]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mountRef(ref: Any, value: Any, lifecycle: js.Array[js.Function]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unmountRef(ref: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
