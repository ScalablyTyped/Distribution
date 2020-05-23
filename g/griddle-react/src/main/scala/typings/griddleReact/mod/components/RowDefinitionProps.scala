package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDefinitionProps
  extends /* x */ StringDictionary[js.Any] {
  //The column that will be known used to track child data
  //By default this will be "children"
  var childColumnName: js.UndefOr[String] = js.undefined
  //The css class name, or a function to generate a class name from props, to apply to this row.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.undefined
  //The column value that should be used as the key for the row
  //if this is not set it will make one up (not efficient)
  var rowKey: js.UndefOr[String] = js.undefined
}

object RowDefinitionProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    childColumnName: String = null,
    cssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    rowKey: String = null
  ): RowDefinitionProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childColumnName != null) __obj.updateDynamic("childColumnName")(childColumnName.asInstanceOf[js.Any])
    if (cssClassName != null) __obj.updateDynamic("cssClassName")(cssClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDefinitionProps]
  }
}

