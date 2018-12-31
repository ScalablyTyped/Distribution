package typings
package hashsetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashSet[TValue] extends js.Object {
  def add(value: TValue): scala.Unit
  def addAll(arr: js.Array[TValue]): scala.Unit
  def clear(): scala.Unit
  def complement(set: IHashSet[TValue]): IHashSet[TValue]
  def contains(value: TValue): scala.Boolean
  def intersection(set: IHashSet[TValue]): IHashSet[TValue]
  def isEmpty(): scala.Boolean
  def isSubsetOf(set: IHashSet[TValue]): scala.Boolean
  def remove(value: TValue): scala.Unit
  def size(): scala.Double
  def union(set: IHashSet[TValue]): IHashSet[TValue]
  def values(): js.Array[TValue]
}

