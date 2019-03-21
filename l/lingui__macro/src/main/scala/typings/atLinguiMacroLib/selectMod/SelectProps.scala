package typings
package atLinguiMacroLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps
  extends /* selectForm */ org.scalablytyped.runtime.StringDictionary[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] {
  var other: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor
  var value: java.lang.String
}

object SelectProps {
  @scala.inline
  def apply(
    other: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor,
    value: java.lang.String,
    StringDictionary: /* selectForm */ org.scalablytyped.runtime.StringDictionary[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SelectProps]
  }
}

