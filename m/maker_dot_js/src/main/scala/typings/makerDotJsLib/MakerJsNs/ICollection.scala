package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection for items that share a common key.
  */
trait ICollection[K, T] extends js.Object {
  var items: js.Array[T]
  var key: K
}

