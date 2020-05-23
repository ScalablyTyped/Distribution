package typings.ibmMobilefirst.WL.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenURLOptions extends js.Object {
  var directories: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var menubar: js.UndefOr[Double] = js.undefined
  var resizable: js.UndefOr[Double] = js.undefined
  var scrollbars: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var toolbar: js.UndefOr[Double] = js.undefined
}

object OpenURLOptions {
  @scala.inline
  def apply(
    directories: js.UndefOr[Double] = js.undefined,
    location: js.UndefOr[Double] = js.undefined,
    menubar: js.UndefOr[Double] = js.undefined,
    resizable: js.UndefOr[Double] = js.undefined,
    scrollbars: js.UndefOr[Double] = js.undefined,
    status: js.UndefOr[Double] = js.undefined,
    toolbar: js.UndefOr[Double] = js.undefined
  ): OpenURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directories)) __obj.updateDynamic("directories")(directories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menubar)) __obj.updateDynamic("menubar")(menubar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollbars)) __obj.updateDynamic("scrollbars")(scrollbars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenURLOptions]
  }
}

