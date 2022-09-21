package typings.hastUtilToString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toString_(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Element = typings.hast.mod.Element
  
  type Node = Root | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.RootContent>[number] */ js.Any)
  
  type Root = typings.hast.mod.Root
}
