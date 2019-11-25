package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.testing
  - typings.ionic.ionicStrings.canary
  - typings.ionic.ionicStrings.latest
*/
trait DistTag extends js.Object

object DistTag {
  @scala.inline
  def canary: typings.ionic.ionicStrings.canary = this.cast("canary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def latest: typings.ionic.ionicStrings.latest = this.cast("latest")
  @scala.inline
  def testing: typings.ionic.ionicStrings.testing = this.cast("testing")
}

