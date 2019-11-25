package typings.matchDashMediaDashMock.matchDashMediaDashMockMod

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
  def apply(height: Int | Double = null, `type`: String = null, width: Int | Double = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

