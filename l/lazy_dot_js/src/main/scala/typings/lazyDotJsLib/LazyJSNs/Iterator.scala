package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@js.native
trait Iterator[T]
  extends ScalablyTyped.runtime.Instantiable1[/* sequence */ Sequence[T], Iterator[T]] {
  def current(): T = js.native
  def moveNext(): scala.Boolean = js.native
}

