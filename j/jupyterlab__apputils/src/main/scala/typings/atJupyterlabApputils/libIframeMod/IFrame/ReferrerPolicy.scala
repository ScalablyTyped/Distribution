package typings.atJupyterlabApputils.libIframeMod.IFrame

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
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`no-referrer`
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`no-referrer-when-downgrade`
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.origin
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`origin-when-cross-origin`
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`same-origin`
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`strict-origin`
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`strict-origin-when-cross-origin`
  - typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`unsafe-url` = this.cast("unsafe-url")
}

