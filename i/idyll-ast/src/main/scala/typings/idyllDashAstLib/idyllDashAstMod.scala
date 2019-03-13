package typings
package idyllDashAstLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("idyll-ast", JSImport.Namespace)
@js.native
object idyllDashAstMod extends js.Object {
  def appendNode(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def appendNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    nodes: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def createNode(
    name: java.lang.String,
    props: stdLib.Record[
      java.lang.String, 
      idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.PropValue | (/* import warning: ImportType.apply Failed type conversion: idyll-compiler.idyll-compiler.compiler.PropValue[1] */ js.Any)
    ],
    children: js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.TreeNode = js.native
  def filterChildren(
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node,
    filter: js.Function1[
      /* child */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, 
      scala.Boolean
    ]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node = js.native
  def filterNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    filter: js.Function1[
      /* node */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, 
      scala.Boolean
    ]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def findNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    filter: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, scala.Boolean]
  ): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node] = js.native
  def getChildren(node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node] = js.native
  def getNodesByName(ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST, name: java.lang.String): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node] = js.native
  def getProperties(node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Property] = js.native
  def getPropertiesByType(
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node,
    `type`: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.PropType
  ): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Property] = js.native
  def getProperty(node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, key: java.lang.String): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.PropValue | scala.Null = js.native
  def modifyChildren(
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node,
    modifier: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, scala.Unit]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node = js.native
  def modifyNodesByName(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    name: java.lang.String,
    modifier: js.Function1[/* node */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, scala.Unit]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def prependNode(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def prependNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    nodes: js.Array[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def removeNodesByName(ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST, name: java.lang.String): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def removeProperty(node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, key: java.lang.String): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node = js.native
  def setProperties(
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node,
    properties: stdLib.Record[
      java.lang.String, 
      idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.PropValue | (/* import warning: ImportType.apply Failed type conversion: idyll-compiler.idyll-compiler.compiler.PropValue[1] */ js.Any)
    ]
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node = js.native
  def setProperty(
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node,
    key: java.lang.String,
    value: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.PropValue
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node = js.native
  def setProperty(
    node: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node,
    key: java.lang.String,
    value: /* import warning: ImportType.apply Failed type conversion: idyll-compiler.idyll-compiler.compiler.PropValue[1] */ js.Any
  ): idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node = js.native
  def walkNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST,
    func: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, scala.Unit]
  ): scala.Unit = js.native
  def walkNodes(
    ast: scala.Null,
    func: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Node, scala.Unit]
  ): scala.Unit = js.native
}

