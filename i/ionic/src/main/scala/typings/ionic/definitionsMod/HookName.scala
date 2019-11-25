package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.`build:before`
  - typings.ionic.ionicStrings.`build:after`
  - typings.ionic.ionicStrings.`serve:before`
  - typings.ionic.ionicStrings.`serve:after`
*/
trait HookName extends js.Object

object HookName {
  @scala.inline
  def `build:after`: typings.ionic.ionicStrings.`build:after` = this.cast("build:after")
  @scala.inline
  def `build:before`: typings.ionic.ionicStrings.`build:before` = this.cast("build:before")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `serve:after`: typings.ionic.ionicStrings.`serve:after` = this.cast("serve:after")
  @scala.inline
  def `serve:before`: typings.ionic.ionicStrings.`serve:before` = this.cast("serve:before")
}

