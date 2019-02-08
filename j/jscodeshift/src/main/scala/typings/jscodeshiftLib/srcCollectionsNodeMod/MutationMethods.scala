package typings
package jscodeshiftLib.srcCollectionsNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationMethods[N] extends js.Object {
  /**
    * Inserts a new node after the current one.
    */
  def insertAfter(insert: js.Any): jscodeshiftLib.srcCollectionMod.Collection[N] = js.native
  /**
    * Inserts a new node before the current one.
    */
  def insertBefore(insert: js.Any): jscodeshiftLib.srcCollectionMod.Collection[N] = js.native
  def remove(): jscodeshiftLib.srcCollectionMod.Collection[N] = js.native
  /**
    * Simply replaces the selected nodes with the provided node. If a function
    * is provided it is executed for every node and the node is replaced with the
    * functions return value.
    */
  def replaceWith[T](nodes: T): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  def replaceWith[T](nodes: js.Array[T]): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  def replaceWith[T](nodes: js.Function2[/* path */ ASTPath[N], /* i */ scala.Double, T]): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
}

