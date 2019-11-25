package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMapBackgroundContent
  extends /**
	 * Option for IgMapBackgroundContent
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the bing maps url
  	 */
  var bingUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the type of the imagery.
  	 */
  var imagerySet: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the key.
  	 */
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the parameter.
  	 */
  var parameter: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the map tile image uri.
  	 *                 For Bing Maps this is populated by bing imagery.
  	 *                 For Open Street Map this option can accept custom URL for the tiles. Default is: 'tile.openstreetmap.org/{Z}/{X}/{Y}.png'. No protocol set means that 'http://' or 'https://' will be prepended automatically depending on the hosting site protocol. {Z} - denotes tile zoom, {X} - denotes tile horizontal position, {Y} - denotes tile vertical position.
  	 */
  var tilePath: js.UndefOr[String] = js.undefined
  /**
  	 * Type of the background content for the map.
  	 *
  	 * Valid values:
  	 * "openStreet" Specify the background content to display OpenStreetMap geographic data. Set as default.
  	 * "cloudMade"  Specify the background content to display CloudMade geographic data.
  	 * "bing"  Specify the background content to BingMaps geographic data.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object IgMapBackgroundContent {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgMapBackgroundContent
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    bingUrl: String = null,
    imagerySet: String = null,
    key: String = null,
    parameter: String = null,
    tilePath: String = null,
    `type`: String = null
  ): IgMapBackgroundContent = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bingUrl != null) __obj.updateDynamic("bingUrl")(bingUrl.asInstanceOf[js.Any])
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (tilePath != null) __obj.updateDynamic("tilePath")(tilePath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgMapBackgroundContent]
  }
}

