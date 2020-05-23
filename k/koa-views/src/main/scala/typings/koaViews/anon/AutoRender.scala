package typings.koaViews.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoRender extends js.Object {
  /*
    * autoRender the result into ctx.body, defaults to true
    */
  var autoRender: js.UndefOr[Boolean] = js.undefined
  /*
    * replace consolidate as default engine source
    */
  var engineSource: js.UndefOr[js.Any] = js.undefined
  /*
    * default extension for your views
    */
  var extension: js.UndefOr[String] = js.undefined
  /*
    * map a file extension to an engine
    */
  var map: js.UndefOr[js.Any] = js.undefined
  /*
    * these options will get passed to the view engine
    */
  var options: js.UndefOr[js.Any] = js.undefined
}

object AutoRender {
  @scala.inline
  def apply(
    autoRender: js.UndefOr[Boolean] = js.undefined,
    engineSource: js.Any = null,
    extension: String = null,
    map: js.Any = null,
    options: js.Any = null
  ): AutoRender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRender)) __obj.updateDynamic("autoRender")(autoRender.get.asInstanceOf[js.Any])
    if (engineSource != null) __obj.updateDynamic("engineSource")(engineSource.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRender]
  }
}

