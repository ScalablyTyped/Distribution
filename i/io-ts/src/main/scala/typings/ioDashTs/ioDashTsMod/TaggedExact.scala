package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedExact[Tag /* <: String */, A, O]
  extends ExactType[Tagged[Tag, js.Any, js.Any], A, O, js.Any]
     with _Tagged[Tag, A, O]

