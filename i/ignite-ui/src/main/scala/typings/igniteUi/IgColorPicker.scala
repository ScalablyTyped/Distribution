package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgColorPicker
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The event is fired when a color is selected.
    *
    * Function takes arguments evt and ui.
    * Use ui.color to get a reference to the color object.
    */
  var colorSelected: js.UndefOr[ColorSelectedEvent] = js.native
  /**
    * Gets/Sets the default colors. Default colors are the ones displayed in the upper table of the color picker.
    *             The array should contain arrays that contain the color values for every next row.
    *
    */
  var colors: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the standard colors. Standard colors are the ones displayed in the color picker bottom,
    *             visually separated from the default colors. The array should contain the color values.
    *
    */
  var standardColors: js.UndefOr[js.Array[_]] = js.native
}

object IgColorPicker {
  @scala.inline
  def apply(): IgColorPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgColorPicker]
  }
  @scala.inline
  implicit class IgColorPickerOps[Self <: IgColorPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorSelected(value: (/* event */ Event, /* ui */ ColorSelectedEventUIParam) => Unit): Self = this.set("colorSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColorSelected: Self = this.set("colorSelected", js.undefined)
    @scala.inline
    def setColors(value: String): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setStandardColorsVarargs(value: js.Any*): Self = this.set("standardColors", js.Array(value :_*))
    @scala.inline
    def setStandardColors(value: js.Array[_]): Self = this.set("standardColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardColors: Self = this.set("standardColors", js.undefined)
  }
  
}

