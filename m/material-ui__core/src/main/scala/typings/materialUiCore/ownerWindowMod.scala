package typings.materialUiCore

import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ownerWindowMod {
  
  @JSImport("@material-ui/core/utils/ownerWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Window]
  inline def default(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
}
