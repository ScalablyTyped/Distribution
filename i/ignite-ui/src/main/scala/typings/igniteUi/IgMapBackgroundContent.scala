package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMapBackgroundContent
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets or sets the bing maps url
    */
  var bingUrl: js.UndefOr[String] = js.native
  /**
    * Gets or sets the type of the imagery.
    */
  var imagerySet: js.UndefOr[String] = js.native
  /**
    * Gets or sets the key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Gets or sets the parameter.
    */
  var parameter: js.UndefOr[String] = js.native
  /**
    * Gets or sets the map tile image uri.
    *                 For Bing Maps this is populated by bing imagery.
    *                 For Open Street Map this option can accept custom URL for the tiles. Default is: 'tile.openstreetmap.org/{Z}/{X}/{Y}.png'. No protocol set means that 'http://' or 'https://' will be prepended automatically depending on the hosting site protocol. {Z} - denotes tile zoom, {X} - denotes tile horizontal position, {Y} - denotes tile vertical position.
    */
  var tilePath: js.UndefOr[String] = js.native
  /**
    * Type of the background content for the map.
    *
    * Valid values:
    * "openStreet" Specify the background content to display OpenStreetMap geographic data. Set as default.
    * "cloudMade"  Specify the background content to display CloudMade geographic data.
    * "bing"  Specify the background content to BingMaps geographic data.
    */
  var `type`: js.UndefOr[String] = js.native
}

object IgMapBackgroundContent {
  @scala.inline
  def apply(): IgMapBackgroundContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMapBackgroundContent]
  }
  @scala.inline
  implicit class IgMapBackgroundContentOps[Self <: IgMapBackgroundContent] (val x: Self) extends AnyVal {
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
    def setBingUrl(value: String): Self = this.set("bingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBingUrl: Self = this.set("bingUrl", js.undefined)
    @scala.inline
    def setImagerySet(value: String): Self = this.set("imagerySet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagerySet: Self = this.set("imagerySet", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    @scala.inline
    def setTilePath(value: String): Self = this.set("tilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilePath: Self = this.set("tilePath", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

