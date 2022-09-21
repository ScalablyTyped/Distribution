package typings.lonaSvgModel

import typings.lonaSvgModel.commandsMod.Command
import typings.lonaSvgModel.primitivesMod.Point_
import typings.lonaSvgModel.svgTypesMod.SVGNode
import typings.lonaSvgModel.svgTypesMod.SVGPathConvertibleNode
import typings.lonaSvgModel.svgTypesMod.SVGRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traverseMod {
  
  @JSImport("@lona/svg-model/lib/traverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCommandPoints[T /* <: Command */](command: T): js.Array[Point_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandPoints")(command.asInstanceOf[js.Any]).asInstanceOf[js.Array[Point_]]
  
  inline def getDefinition(root: SVGRoot, id: String): js.UndefOr[SVGNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefinition")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SVGNode]]
  
  inline def getHrefNode(root: SVGRoot, id: String): js.UndefOr[SVGPathConvertibleNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHrefNode")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SVGPathConvertibleNode]]
  
  inline def mapCommandPoints[T /* <: Command */](command: T, transform: js.Function1[/* point */ Point_, Point_]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mapCommandPoints")(command.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def traverse(root: SVGNode, f: js.Function1[/* node */ SVGNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(root.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
