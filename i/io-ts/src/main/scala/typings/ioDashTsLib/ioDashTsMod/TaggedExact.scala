package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedExact[Tag /* <: java.lang.String */, A, O]
  extends ExactType[Tagged[Tag, js.Any, js.Any], A, O, js.Any]
     with _Tagged[Tag, A, O]

