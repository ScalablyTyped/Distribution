package typings.gravatar.gravatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var d: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var f: js.UndefOr[String] = js.undefined
  var forcedefault: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var r: js.UndefOr[String] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
  var s: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    d: String = null,
    default: String = null,
    f: String = null,
    forcedefault: String = null,
    format: String = null,
    protocol: String = null,
    r: String = null,
    rating: String = null,
    s: String = null,
    size: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (forcedefault != null) __obj.updateDynamic("forcedefault")(forcedefault.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

