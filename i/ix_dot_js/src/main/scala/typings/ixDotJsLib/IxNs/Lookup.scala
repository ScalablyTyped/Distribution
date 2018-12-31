package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[TKey, TValue] extends js.Object {
  def get(key: TKey): Enumerable[TValue]
  def has(key: TKey): scala.Boolean
  def length(): scala.Double
  def toEnumerable(): Enumerable[Grouping[TKey, TValue]]
}

