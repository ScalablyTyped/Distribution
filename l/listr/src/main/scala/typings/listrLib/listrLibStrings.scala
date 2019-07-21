package typings
package listrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object listrLibStrings {
  @js.native
  sealed trait default
    extends listrLib.listrMod.ListrRendererValue[js.Any]
  
  @js.native
  sealed trait silent
    extends listrLib.listrMod.ListrRendererValue[js.Any]
  
  @js.native
  sealed trait verbose
    extends listrLib.listrMod.ListrRendererValue[js.Any]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
}

