package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UITreeBase extends js.Object {
  def appendNode(args: js.Any*): UITreeNode
  def foldNode(index: java.lang.String): scala.Unit
  def foldNodeAll(index: java.lang.String): scala.Unit
  def getNode(index: java.lang.String): UITreeNode
  def getNodeAll(index: java.lang.String): js.Array[UITreeNode]
  def getNodeParent(index: java.lang.String): UITreeNode
  def getRoot(): UITreeNode
  def insertNode(index: java.lang.String, data: js.Any): UITreeNode
  def moveNode(index: java.lang.String, targetIndex: scala.Double): scala.Unit
  def openNode(index: java.lang.String): scala.Unit
  def openNodeAll(index: java.lang.String): scala.Unit
  def removeNode(index: java.lang.String): scala.Unit
  def removeNodes(): scala.Unit
  def updateNode(index: java.lang.String, data: js.Any): UITreeNode
}

