package typings
package jsDashToDashJavaLib.jsDashToDashJavaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var currencyCode: java.lang.String
}

object Currency {
  @scala.inline
  def apply(
    currencyCode: java.lang.String,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Currency = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Currency]
  }
}

