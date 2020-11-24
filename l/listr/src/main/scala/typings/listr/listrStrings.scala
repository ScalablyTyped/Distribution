package typings.listr

import typings.listr.mod.ListrRendererValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listrStrings {
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait default
    extends ListrRendererValue[js.Any]
  
  @js.native
  sealed trait silent
    extends ListrRendererValue[js.Any]
  
  @js.native
  sealed trait verbose
    extends ListrRendererValue[js.Any]
}
