package typings
package linqLib.linqMod.EnumerableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEnumerator[T] extends js.Object {
  def current(): T
  def dispose(): scala.Unit
  def moveNext(): scala.Boolean
}

