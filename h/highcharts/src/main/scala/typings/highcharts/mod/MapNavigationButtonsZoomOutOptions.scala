package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapNavigationButtonsZoomOutOptions extends js.Object {
  /**
    * (Highmaps) The alignment of the navigation buttons.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highmaps) What box to align the buttons to. Possible values are
    * `plotBox` and `spacingBox`.
    */
  var alignTo: js.UndefOr[ButtonRelativeToValue] = js.native
  /**
    * (Highmaps) The pixel height of the map navigation buttons.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) Click handler for the button.
    */
  var onclick: js.UndefOr[js.Function] = js.native
  /**
    * (Highmaps) Padding for the navigation buttons.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) Text styles for the map navigation buttons.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highmaps) The text for the button. The tooltip (title) is a language
    * option given by lang.zoomOut.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highmaps) A configuration object for the button theme. The object
    * accepts SVG properties like `stroke-width`, `stroke` and `fill`.
    * Tri-state button styles are supported by the `states.hover` and
    * `states.select` objects.
    */
  var theme: js.UndefOr[SVGAttributes] = js.native
  /**
    * (Highmaps) The vertical alignment of the buttons. Individual alignment
    * can be adjusted by each button's `y` offset.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highmaps) The width of the map navigation buttons.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The X offset of the buttons relative to its `align` setting.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The position of the zoomOut button relative to the vertical
    * alignment.
    */
  var y: js.UndefOr[Double] = js.native
}

object MapNavigationButtonsZoomOutOptions {
  @scala.inline
  def apply(): MapNavigationButtonsZoomOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapNavigationButtonsZoomOutOptions]
  }
  @scala.inline
  implicit class MapNavigationButtonsZoomOutOptionsOps[Self <: MapNavigationButtonsZoomOutOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignTo(value: ButtonRelativeToValue): Self = this.set("alignTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignTo: Self = this.set("alignTo", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnclick(value: js.Function): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: SVGAttributes): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

