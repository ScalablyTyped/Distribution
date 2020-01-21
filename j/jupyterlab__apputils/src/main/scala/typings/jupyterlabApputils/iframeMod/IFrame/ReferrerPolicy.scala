package typings.jupyterlabApputils.iframeMod.IFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Referrer policy for the iframe.
  *
  * User documentation for the policies can be found here:
  * https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.origin
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin`
  - typings.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.jupyterlabApputils.jupyterlabApputilsStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url` = this.cast("unsafe-url")
}

