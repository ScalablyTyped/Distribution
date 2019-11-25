package typings.atJupyterlabExtensionmanager.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.install
  - typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.uninstall
  - typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.enable
  - typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.disable
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.disable = this.cast("disable")
  @scala.inline
  def enable: typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.enable = this.cast("enable")
  @scala.inline
  def install: typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.install = this.cast("install")
  @scala.inline
  def uninstall: typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.uninstall = this.cast("uninstall")
}

