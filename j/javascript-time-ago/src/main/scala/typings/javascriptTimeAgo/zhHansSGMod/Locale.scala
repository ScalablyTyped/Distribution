package typings.javascriptTimeAgo.zhHansSGMod

import typings.javascriptTimeAgo.javascriptTimeAgoStrings.`zh-Hans-SG`
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: `zh-Hans-SG`
  var long: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(locale: `zh-Hans-SG`, long: Duration, quantify: Double => one | two | few | other): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
    __obj.asInstanceOf[Locale]
  }
}

