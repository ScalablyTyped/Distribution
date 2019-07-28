package typings.atHapiCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCodeMod {
  type Assertion[T] = Grammar[T] with Flags[T]
  type AssertionChain[T] = Assertion[T] with Expectation[T]
  type Expectation[T] = Types[T] with Values[T]
}
