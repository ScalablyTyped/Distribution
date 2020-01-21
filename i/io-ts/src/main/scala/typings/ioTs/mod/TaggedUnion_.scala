package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedUnion_[Tag /* <: String */, A, O]
  extends UnionType[js.Array[Tagged[Tag, js.Any, js.Any]], A, O, js.Any]
     with _Tagged[Tag, A, O]

