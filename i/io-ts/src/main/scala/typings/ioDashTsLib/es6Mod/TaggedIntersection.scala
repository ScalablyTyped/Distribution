package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedIntersection[Tag /* <: java.lang.String */, A, O]
  extends IntersectionType[TaggedIntersectionArgument[Tag], A, O, js.Any]
     with _Tagged[Tag, A, O]

