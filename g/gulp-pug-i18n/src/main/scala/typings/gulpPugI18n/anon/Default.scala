package typings.gulpPugI18n.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var locales: String | js.Array[String]
  var namespace: js.UndefOr[String | Null] = js.undefined
}

object Default {
  @scala.inline
  def apply(
    locales: String | js.Array[String],
    default: String = null,
    filename: String = null,
    namespace: js.UndefOr[Null | String] = js.undefined
  ): Default = {
    val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(namespace)) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

