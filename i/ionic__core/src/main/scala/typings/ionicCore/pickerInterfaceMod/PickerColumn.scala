package typings.ionicCore.pickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerColumn extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var columnWidth: js.UndefOr[String] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: String
  var options: js.Array[PickerColumnOption]
  var optionsWidth: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prefixWidth: js.UndefOr[String] = js.undefined
  var prevSelected: js.UndefOr[Double] = js.undefined
  var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var suffixWidth: js.UndefOr[String] = js.undefined
}

object PickerColumn {
  @scala.inline
  def apply(
    name: String,
    options: js.Array[PickerColumnOption],
    align: String = null,
    columnWidth: String = null,
    cssClass: String | js.Array[String] = null,
    optionsWidth: String = null,
    prefix: String = null,
    prefixWidth: String = null,
    prevSelected: Int | Double = null,
    refresh: () => Unit = null,
    selectedIndex: Int | Double = null,
    suffix: String = null,
    suffixWidth: String = null
  ): PickerColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (optionsWidth != null) __obj.updateDynamic("optionsWidth")(optionsWidth.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixWidth != null) __obj.updateDynamic("prefixWidth")(prefixWidth.asInstanceOf[js.Any])
    if (prevSelected != null) __obj.updateDynamic("prevSelected")(prevSelected.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction0(refresh))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (suffixWidth != null) __obj.updateDynamic("suffixWidth")(suffixWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumn]
  }
}

