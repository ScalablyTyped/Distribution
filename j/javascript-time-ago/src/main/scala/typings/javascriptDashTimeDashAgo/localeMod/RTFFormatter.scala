package typings.javascriptDashTimeDashAgo.localeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTFFormatter extends js.Object {
  var locale: String
  var localeMatcher: String
  var numberFormat: StringDictionary[js.Any]
  var numeric: String
  var style: DefaultFormats
}

object RTFFormatter {
  @scala.inline
  def apply(
    locale: String,
    localeMatcher: String,
    numberFormat: StringDictionary[js.Any],
    numeric: String,
    style: DefaultFormats
  ): RTFFormatter = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTFFormatter]
  }
}

