package typings
package atLinguiCoreLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps
  extends /* selectForm */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var other: java.lang.String
  var value: java.lang.String
}

object SelectProps {
  @scala.inline
  def apply(
    other: java.lang.String,
    value: java.lang.String,
    StringDictionary: /* selectForm */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("value")(value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SelectProps]
  }
}

