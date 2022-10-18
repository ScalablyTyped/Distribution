package typings.inversifyBindingDecorators

import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsUtilsAutoWireMod {
  
  @JSImport("inversify-binding-decorators/dts/utils/auto_wire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(container: Container, modules: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(container.asInstanceOf[js.Any]).`++`(modules.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
