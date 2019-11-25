package typings.hoganDotJs.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var ctag: js.UndefOr[String] = js.undefined
  var i: js.UndefOr[Double] = js.undefined
  var n: js.UndefOr[String] = js.undefined
  var otag: js.UndefOr[String] = js.undefined
  var tag: String
  var text: js.UndefOr[String] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    tag: String,
    ctag: String = null,
    i: Int | Double = null,
    n: String = null,
    otag: String = null,
    text: String = null
  ): Token = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (ctag != null) __obj.updateDynamic("ctag")(ctag.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (otag != null) __obj.updateDynamic("otag")(otag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

