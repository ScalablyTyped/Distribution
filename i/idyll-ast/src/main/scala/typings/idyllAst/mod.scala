package typings.idyllAst

import typings.idyllCompiler.mod.AST
import typings.idyllCompiler.mod.Node
import typings.idyllCompiler.mod.PropType
import typings.idyllCompiler.mod.PropValue
import typings.idyllCompiler.mod.Property
import typings.idyllCompiler.mod.TreeNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idyll-ast", "appendNode")
  @js.native
  def appendNode(ast: AST, node: Node): AST = js.native
  
  @JSImport("idyll-ast", "appendNodes")
  @js.native
  def appendNodes(ast: AST, nodes: AST): AST = js.native
  
  @JSImport("idyll-ast", "createNode")
  @js.native
  def createNode_1(
    name: String,
    props: Record[
      String, 
      PropValue | (/* import warning: importer.ImportType#apply Failed type conversion: idyll-compiler.idyll-compiler.PropValue[1] */ js.Any)
    ],
    children: js.Array[Node]
  ): TreeNode = js.native
  
  @JSImport("idyll-ast", "filterChildren")
  @js.native
  def filterChildren(node: Node, filter: js.Function1[/* child */ Node, Boolean]): Node = js.native
  
  @JSImport("idyll-ast", "filterNodes")
  @js.native
  def filterNodes(ast: AST, filter: js.Function1[/* node */ Node, Boolean]): AST = js.native
  
  @JSImport("idyll-ast", "findNodes")
  @js.native
  def findNodes(ast: AST, filter: js.Function1[/* n */ Node, Boolean]): js.Array[Node] = js.native
  
  @JSImport("idyll-ast", "getChildren")
  @js.native
  def getChildren(node: Node): js.Array[Node] = js.native
  
  @JSImport("idyll-ast", "getNodesByName")
  @js.native
  def getNodesByName(ast: AST, name: String): js.Array[Node] = js.native
  
  @JSImport("idyll-ast", "getProperties")
  @js.native
  def getProperties(node: Node): js.Array[Property] = js.native
  
  @JSImport("idyll-ast", "getPropertiesByType")
  @js.native
  def getPropertiesByType(node: Node, `type`: PropType): js.Array[Property] = js.native
  
  @JSImport("idyll-ast", "getProperty")
  @js.native
  def getProperty(node: Node, key: String): PropValue | Null = js.native
  
  @JSImport("idyll-ast", "modifyChildren")
  @js.native
  def modifyChildren(node: Node, modifier: js.Function1[/* n */ Node, Unit]): Node = js.native
  
  @JSImport("idyll-ast", "modifyNodesByName")
  @js.native
  def modifyNodesByName(ast: AST, name: String, modifier: js.Function1[/* node */ Node, Unit]): AST = js.native
  
  @JSImport("idyll-ast", "prependNode")
  @js.native
  def prependNode(ast: AST, node: Node): AST = js.native
  
  @JSImport("idyll-ast", "prependNodes")
  @js.native
  def prependNodes(ast: AST, nodes: js.Array[Node]): AST = js.native
  
  @JSImport("idyll-ast", "removeNodesByName")
  @js.native
  def removeNodesByName(ast: AST, name: String): AST = js.native
  
  @JSImport("idyll-ast", "removeProperty")
  @js.native
  def removeProperty(node: Node, key: String): Node = js.native
  
  @JSImport("idyll-ast", "setProperties")
  @js.native
  def setProperties_1(
    node: Node,
    properties: Record[
      String, 
      PropValue | (/* import warning: importer.ImportType#apply Failed type conversion: idyll-compiler.idyll-compiler.PropValue[1] */ js.Any)
    ]
  ): Node = js.native
  
  @JSImport("idyll-ast", "setProperty")
  @js.native
  def setProperty(node: Node, key: String, value: PropValue): Node = js.native
  @JSImport("idyll-ast", "setProperty")
  @js.native
  def setProperty_1(
    node: Node,
    key: String,
    value: /* import warning: importer.ImportType#apply Failed type conversion: idyll-compiler.idyll-compiler.PropValue[1] */ js.Any
  ): Node = js.native
  
  @JSImport("idyll-ast", "walkNodes")
  @js.native
  def walkNodes(ast: Null, func: js.Function1[/* n */ Node, Unit]): Unit = js.native
  @JSImport("idyll-ast", "walkNodes")
  @js.native
  def walkNodes(ast: AST, func: js.Function1[/* n */ Node, Unit]): Unit = js.native
}
