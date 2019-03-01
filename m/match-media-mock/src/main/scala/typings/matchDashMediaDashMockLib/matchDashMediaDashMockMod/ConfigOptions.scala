package typings
package matchDashMediaDashMockLib.matchDashMediaDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock configuration options
  */
trait ConfigOptions extends js.Object {
  /**
    * Screen height
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Screen type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Screen width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

