package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToISOTimeOptions extends js.Object {
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.undefined
  /**
    * @default true
    */
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var suppressMilliseconds: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var suppressSeconds: js.UndefOr[Boolean] = js.undefined
}

object ToISOTimeOptions {
  @scala.inline
  def apply(
    format: ToISOFormat = null,
    includeOffset: js.UndefOr[Boolean] = js.undefined,
    suppressMilliseconds: js.UndefOr[Boolean] = js.undefined,
    suppressSeconds: js.UndefOr[Boolean] = js.undefined
  ): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(includeOffset)) __obj.updateDynamic("includeOffset")(includeOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMilliseconds)) __obj.updateDynamic("suppressMilliseconds")(suppressMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressSeconds)) __obj.updateDynamic("suppressSeconds")(suppressSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToISOTimeOptions]
  }
}

