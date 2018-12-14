package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock[T]
  extends js.Function
     with MockInstance[T]
     with org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T] {
  def apply(args: js.Any*): js.Any = js.native
}

