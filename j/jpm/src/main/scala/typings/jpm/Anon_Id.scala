package typings.jpm

import typings.jpm.sdkUiSidebarMod.SidebarWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var onAttach: js.UndefOr[js.Function1[/* worker */ SidebarWorker, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function0[_]] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* worker */ SidebarWorker, _]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var title: String
  var url: String
}

object Anon_Id {
  @scala.inline
  def apply(
    title: String,
    url: String,
    id: String = null,
    onAttach: /* worker */ SidebarWorker => _ = null,
    onDetach: () => _ = null,
    onHide: () => _ = null,
    onReady: /* worker */ SidebarWorker => _ = null,
    onShow: () => _ = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(title = title, url = url)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1(onAttach))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction0(onDetach))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    __obj.asInstanceOf[Anon_Id]
  }
}

