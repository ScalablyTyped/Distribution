package typings.hastUtilToParse5

import typings.hastUtilToParse5.libMod.Node
import typings.hastUtilToParse5.libMod.P5Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-to-parse5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toParse5(tree: Node): P5Node = ^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any]).asInstanceOf[P5Node]
  inline def toParse5(tree: Node, space: typings.hastUtilToParse5.libMod.Space): P5Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[P5Node]
  
  type Space = typings.hastUtilToParse5.libMod.Space
}
