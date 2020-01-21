package typings.jupyterlabExtensionmanager.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install
  - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall
  - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable
  - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable = this.cast("disable")
  @scala.inline
  def enable: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable = this.cast("enable")
  @scala.inline
  def install: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install = this.cast("install")
  @scala.inline
  def uninstall: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall = this.cast("uninstall")
}

