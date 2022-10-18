package typings.materialUiCore

import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsOwnerDocumentMod {
  
  @JSImport("@material-ui/core/utils/ownerDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Document]
  inline def default(node: Node): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
}
