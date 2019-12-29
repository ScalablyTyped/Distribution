package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.buildColonbefore
  - typings.ionic.ionicStrings.buildColonafter
  - typings.ionic.ionicStrings.serveColonbefore
  - typings.ionic.ionicStrings.serveColonafter
*/
trait HookName extends js.Object

object HookName {
  @scala.inline
  def buildColonafter: typings.ionic.ionicStrings.buildColonafter = this.cast("build:after")
  @scala.inline
  def buildColonbefore: typings.ionic.ionicStrings.buildColonbefore = this.cast("build:before")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def serveColonafter: typings.ionic.ionicStrings.serveColonafter = this.cast("serve:after")
  @scala.inline
  def serveColonbefore: typings.ionic.ionicStrings.serveColonbefore = this.cast("serve:before")
}

