package typings
package atIonicCoreLib.distTypesComponentsPickerPickerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerColumn extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var columnWidth: js.UndefOr[java.lang.String] = js.undefined
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var options: js.Array[PickerColumnOption]
  var optionsWidth: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var prefixWidth: js.UndefOr[java.lang.String] = js.undefined
  var prevSelected: js.UndefOr[scala.Double] = js.undefined
  var refresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var suffixWidth: js.UndefOr[java.lang.String] = js.undefined
}

object PickerColumn {
  @scala.inline
  def apply(
    name: java.lang.String,
    options: js.Array[PickerColumnOption],
    align: java.lang.String = null,
    columnWidth: java.lang.String = null,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    optionsWidth: java.lang.String = null,
    prefix: java.lang.String = null,
    prefixWidth: java.lang.String = null,
    prevSelected: scala.Int | scala.Double = null,
    refresh: () => scala.Unit = null,
    selectedIndex: scala.Int | scala.Double = null,
    suffix: java.lang.String = null,
    suffixWidth: java.lang.String = null
  ): PickerColumn = {
    val __obj = js.Dynamic.literal(name = name, options = options)
    if (align != null) __obj.updateDynamic("align")(align)
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (optionsWidth != null) __obj.updateDynamic("optionsWidth")(optionsWidth)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixWidth != null) __obj.updateDynamic("prefixWidth")(prefixWidth)
    if (prevSelected != null) __obj.updateDynamic("prevSelected")(prevSelected.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction0(refresh))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (suffixWidth != null) __obj.updateDynamic("suffixWidth")(suffixWidth)
    __obj.asInstanceOf[PickerColumn]
  }
}

