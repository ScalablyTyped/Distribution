package typings.hastUtilFromParse5

import typings.hastUtilFromParse5.libMod.Node
import typings.hastUtilFromParse5.libMod.P5Node
import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-from-parse5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromParse5(ast: P5Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def fromParse5(ast: P5Node, options: typings.hastUtilFromParse5.libMod.Options): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def fromParse5(ast: P5Node, options: VFile): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  type Options = typings.hastUtilFromParse5.libMod.Options
}
