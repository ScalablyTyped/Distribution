package typings.matchMediaMock.mod

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
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Screen type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Screen width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

