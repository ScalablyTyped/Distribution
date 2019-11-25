package typings.homeworks.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.0
  */
trait UploadOptions extends js.Object {
  var beforeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var complete: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* xhr */ js.UndefOr[js.Any], 
      /* state */ js.UndefOr[js.Any], 
      /* error */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var isBtn: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* state */ js.UndefOr[js.Any], 
      /* xhr */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: String
}

object UploadOptions {
  @scala.inline
  def apply(
    url: String,
    beforeStart: () => Unit = null,
    complete: /* data */ js.UndefOr[js.Any] => Unit = null,
    data: js.Any = null,
    dest: String = null,
    error: (/* xhr */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], /* error */ js.UndefOr[js.Any]) => Unit = null,
    extensions: js.Any = null,
    isBtn: js.UndefOr[Boolean] = js.undefined,
    success: (/* data */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], /* xhr */ js.UndefOr[js.Any]) => Unit = null,
    `type`: String = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (beforeStart != null) __obj.updateDynamic("beforeStart")(js.Any.fromFunction0(beforeStart))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(isBtn)) __obj.updateDynamic("isBtn")(isBtn.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

