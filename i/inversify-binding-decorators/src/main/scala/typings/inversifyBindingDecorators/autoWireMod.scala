package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoWireMod {
  
  @JSImport("inversify-binding-decorators/dts/utils/auto_wire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(container: Container, modules: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], modules.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
