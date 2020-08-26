package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties referring a single dimension (either row or column). If both
  * BandedRange.row_properties and BandedRange.column_properties are set, the
  * fill colors are applied to cells according to the following rules:  *
  * header_color and footer_color take priority over band colors. *
  * first_band_color takes priority over second_band_color. * row_properties
  * takes priority over column_properties.  For example, the first row color
  * takes priority over the first column color, but the first column color
  * takes priority over the second row color. Similarly, the row header takes
  * priority over the column header in the top left cell, but the column header
  * takes priority over the first row color if the row header is not set.
  */
@js.native
trait SchemaBandingProperties extends js.Object {
  /**
    * The first color that is alternating. (Required)
    */
  var firstBandColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The color of the last row or column. If this field is not set, the last
    * row or column will be filled with either first_band_color or
    * second_band_color, depending on the color of the previous row or column.
    */
  var footerColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The color of the first row or column. If this field is set, the first row
    * or column will be filled with this color and the colors will alternate
    * between first_band_color and second_band_color starting from the second
    * row or column. Otherwise, the first row or column will be filled with
    * first_band_color and the colors will proceed to alternate as they
    * normally would.
    */
  var headerColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The second color that is alternating. (Required)
    */
  var secondBandColor: js.UndefOr[SchemaColor] = js.native
}

object SchemaBandingProperties {
  @scala.inline
  def apply(): SchemaBandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBandingProperties]
  }
  @scala.inline
  implicit class SchemaBandingPropertiesOps[Self <: SchemaBandingProperties] (val x: Self) extends AnyVal {
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
    def setFirstBandColor(value: SchemaColor): Self = this.set("firstBandColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstBandColor: Self = this.set("firstBandColor", js.undefined)
    @scala.inline
    def setFooterColor(value: SchemaColor): Self = this.set("footerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterColor: Self = this.set("footerColor", js.undefined)
    @scala.inline
    def setHeaderColor(value: SchemaColor): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    @scala.inline
    def setSecondBandColor(value: SchemaColor): Self = this.set("secondBandColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondBandColor: Self = this.set("secondBandColor", js.undefined)
  }
  
}

