package typings.jsDashToDashJava.jsDashToDashJavaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency
  extends /* k */ StringDictionary[js.Any] {
  var currencyCode: String
}

object Currency {
  @scala.inline
  def apply(currencyCode: String, StringDictionary: /* k */ StringDictionary[js.Any] = null): Currency = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Currency]
  }
}

