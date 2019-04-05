package typings
package hoganDotJsLib.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var ctag: js.UndefOr[java.lang.String] = js.undefined
  var i: js.UndefOr[scala.Double] = js.undefined
  var n: js.UndefOr[java.lang.String] = js.undefined
  var otag: js.UndefOr[java.lang.String] = js.undefined
  var tag: java.lang.String
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    tag: java.lang.String,
    ctag: java.lang.String = null,
    i: scala.Int | scala.Double = null,
    n: java.lang.String = null,
    otag: java.lang.String = null,
    text: java.lang.String = null
  ): Token = {
    val __obj = js.Dynamic.literal(tag = tag)
    if (ctag != null) __obj.updateDynamic("ctag")(ctag)
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n)
    if (otag != null) __obj.updateDynamic("otag")(otag)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Token]
  }
}

