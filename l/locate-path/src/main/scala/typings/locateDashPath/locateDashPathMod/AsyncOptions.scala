package typings.locateDashPath.locateDashPathMod

import typings.locateDashPath.locateDashPathStrings.directory
import typings.locateDashPath.locateDashPathStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends Options {
  /**
  		Number of concurrently pending promises. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.undefined
  /**
  		Preserve `paths` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[Boolean] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(
    allowSymlinks: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    cwd: String = null,
    preserveOrder: js.UndefOr[Boolean] = js.undefined,
    `type`: file | directory = null
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSymlinks)) __obj.updateDynamic("allowSymlinks")(allowSymlinks)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(preserveOrder)) __obj.updateDynamic("preserveOrder")(preserveOrder)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOptions]
  }
}

