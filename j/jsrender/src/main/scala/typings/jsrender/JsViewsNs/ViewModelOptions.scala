package typings.jsrender.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ViewModels
trait ViewModelOptions extends js.Object {
  var extend: js.UndefOr[Hash[_]] = js.undefined
  /* ViewModel options hash */
  // getters?: string[] | ;
  var getters: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])] = js.undefined
}

object ViewModelOptions {
  @scala.inline
  def apply(
    extend: Hash[_] = null,
    getters: js.Array[_] = null,
    id: String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]) = null
  ): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getters != null) __obj.updateDynamic("getters")(getters)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelOptions]
  }
}

