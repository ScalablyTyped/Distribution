package typings.jupyterlabApputils.iframeMod.IFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exceptions to the iframe sandboxing policies.
  * These are specified here:
  * https://www.w3.org/TR/2011/WD-html5-20110525/the-iframe-element.html#attr-iframe-sandbox
  *
  * More user-friendly documentation can be found here:
  * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#sandbox
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation`
*/
trait SandboxExceptions extends js.Object

object SandboxExceptions {
  @scala.inline
  def `allow-forms`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms` = this.cast("allow-forms")
  @scala.inline
  def `allow-modals`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals` = this.cast("allow-modals")
  @scala.inline
  def `allow-orientation-lock`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock` = this.cast("allow-orientation-lock")
  @scala.inline
  def `allow-pointer-lock`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock` = this.cast("allow-pointer-lock")
  @scala.inline
  def `allow-popups`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups` = this.cast("allow-popups")
  @scala.inline
  def `allow-presentation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation` = this.cast("allow-presentation")
  @scala.inline
  def `allow-same-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin` = this.cast("allow-same-origin")
  @scala.inline
  def `allow-scripts`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts` = this.cast("allow-scripts")
  @scala.inline
  def `allow-storage-access-by-user-activation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation` = this.cast("allow-storage-access-by-user-activation")
  @scala.inline
  def `allow-top-navigation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation` = this.cast("allow-top-navigation")
  @scala.inline
  def `allow-top-navigation-by-user-activation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation` = this.cast("allow-top-navigation-by-user-activation")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `popups-to-escape-sandbox`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox` = this.cast("popups-to-escape-sandbox")
}

