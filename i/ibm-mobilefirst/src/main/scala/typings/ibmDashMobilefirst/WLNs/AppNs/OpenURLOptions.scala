package typings.ibmDashMobilefirst.WLNs.AppNs

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
    directories: Int | Double = null,
    location: Int | Double = null,
    menubar: Int | Double = null,
    resizable: Int | Double = null,
    scrollbars: Int | Double = null,
    status: Int | Double = null,
    toolbar: Int | Double = null
  ): OpenURLOptions = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menubar != null) __obj.updateDynamic("menubar")(menubar.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenURLOptions]
  }
}

