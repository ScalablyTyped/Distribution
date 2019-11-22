package typings.koaDashViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoRender extends js.Object {
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

object Anon_AutoRender {
  @scala.inline
  def apply(
    autoRender: js.UndefOr[Boolean] = js.undefined,
    engineSource: js.Any = null,
    extension: String = null,
    map: js.Any = null,
    options: js.Any = null
  ): Anon_AutoRender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRender)) __obj.updateDynamic("autoRender")(autoRender)
    if (engineSource != null) __obj.updateDynamic("engineSource")(engineSource)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (map != null) __obj.updateDynamic("map")(map)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_AutoRender]
  }
}

