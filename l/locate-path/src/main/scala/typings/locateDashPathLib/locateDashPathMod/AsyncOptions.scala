package typings
package locateDashPathLib.locateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends Options {
  /**
  		Number of concurrently pending promises. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
  		Preserve `paths` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[scala.Boolean] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(
    concurrency: scala.Int | scala.Double = null,
    cwd: java.lang.String = null,
    preserveOrder: js.UndefOr[scala.Boolean] = js.undefined
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(preserveOrder)) __obj.updateDynamic("preserveOrder")(preserveOrder)
    __obj.asInstanceOf[AsyncOptions]
  }
}

