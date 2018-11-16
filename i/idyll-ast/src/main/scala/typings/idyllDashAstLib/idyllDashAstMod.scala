package typings
package idyllDashAstLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("idyll-ast", JSImport.Namespace)
@js.native
object idyllDashAstMod extends js.Object {
  def appendNode(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node
  ): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def appendNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    nodes: idyllDashCompilerLib.idyllDashCompilerMod.AST
  ): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def createNode(
    name: java.lang.String,
    props: stdLib.Record[java.lang.String, idyllDashCompilerLib.idyllDashCompilerMod.PropValue | _],
    children: js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Node]
  ): idyllDashCompilerLib.idyllDashCompilerMod.TreeNode = js.native
  def filterChildren(
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node,
    filter: js.Function1[/* child */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Boolean]
  ): idyllDashCompilerLib.idyllDashCompilerMod.Node = js.native
  def filterNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    filter: js.Function1[/* node */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Boolean]
  ): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def findNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    filter: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Boolean]
  ): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Node] = js.native
  def getChildren(node: idyllDashCompilerLib.idyllDashCompilerMod.Node): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Node] = js.native
  def getNodesByName(ast: idyllDashCompilerLib.idyllDashCompilerMod.AST, name: java.lang.String): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Node] = js.native
  def getProperties(node: idyllDashCompilerLib.idyllDashCompilerMod.Node): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Property] = js.native
  def getPropertiesByType(
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node,
    `type`: idyllDashCompilerLib.idyllDashCompilerMod.PropType
  ): js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Property] = js.native
  def getProperty(node: idyllDashCompilerLib.idyllDashCompilerMod.Node, key: java.lang.String): idyllDashCompilerLib.idyllDashCompilerMod.PropValue | scala.Null = js.native
  def modifyChildren(
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node,
    modifier: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Unit]
  ): idyllDashCompilerLib.idyllDashCompilerMod.Node = js.native
  def modifyNodesByName(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    name: java.lang.String,
    modifier: js.Function1[/* node */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Unit]
  ): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def prependNode(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node
  ): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def prependNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    nodes: js.Array[idyllDashCompilerLib.idyllDashCompilerMod.Node]
  ): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def removeNodesByName(ast: idyllDashCompilerLib.idyllDashCompilerMod.AST, name: java.lang.String): idyllDashCompilerLib.idyllDashCompilerMod.AST = js.native
  def removeProperty(node: idyllDashCompilerLib.idyllDashCompilerMod.Node, key: java.lang.String): idyllDashCompilerLib.idyllDashCompilerMod.Node = js.native
  def setProperties(
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node,
    properties: stdLib.Record[java.lang.String, idyllDashCompilerLib.idyllDashCompilerMod.PropValue | _]
  ): idyllDashCompilerLib.idyllDashCompilerMod.Node = js.native
  def setProperty(
    node: idyllDashCompilerLib.idyllDashCompilerMod.Node,
    key: java.lang.String,
    value: idyllDashCompilerLib.idyllDashCompilerMod.PropValue
  ): idyllDashCompilerLib.idyllDashCompilerMod.Node = js.native
  def setProperty(node: idyllDashCompilerLib.idyllDashCompilerMod.Node, key: java.lang.String, value: js.Any): idyllDashCompilerLib.idyllDashCompilerMod.Node = js.native
  def walkNodes(
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST,
    func: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Unit]
  ): scala.Unit = js.native
  def walkNodes(
    ast: scala.Null,
    func: js.Function1[/* n */ idyllDashCompilerLib.idyllDashCompilerMod.Node, scala.Unit]
  ): scala.Unit = js.native
}

