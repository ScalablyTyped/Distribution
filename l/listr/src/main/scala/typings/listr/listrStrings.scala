package typings.listr

import typings.listr.listrMod.ListrRendererValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object listrStrings {
  @js.native
  sealed trait default
    extends ListrRendererValue[js.Any]
  
  @js.native
  sealed trait silent
    extends ListrRendererValue[js.Any]
  
  @js.native
  sealed trait verbose
    extends ListrRendererValue[js.Any]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
}

