package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMapBackgroundContent
  extends /**
	 * Option for IgMapBackgroundContent
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets the bing maps url
  	 */
  var bingUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the type of the imagery.
  	 */
  var imagerySet: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the key.
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the parameter.
  	 */
  var parameter: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the map tile image uri.
  	 *                 For Bing Maps this is populated by bing imagery.
  	 *                 For Open Street Map this option can accept custom URL for the tiles. Default is: 'tile.openstreetmap.org/{Z}/{X}/{Y}.png'. No protocol set means that 'http://' or 'https://' will be prepended automatically depending on the hosting site protocol. {Z} - denotes tile zoom, {X} - denotes tile horizontal position, {Y} - denotes tile vertical position.
  	 */
  var tilePath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Type of the background content for the map.
  	 *
  	 * Valid values:
  	 * "openStreet" Specify the background content to display OpenStreetMap geographic data. Set as default.
  	 * "cloudMade"  Specify the background content to display CloudMade geographic data.
  	 * "bing"  Specify the background content to BingMaps geographic data.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IgMapBackgroundContent {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgMapBackgroundContent
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bingUrl: java.lang.String = null,
    imagerySet: java.lang.String = null,
    key: java.lang.String = null,
    parameter: java.lang.String = null,
    tilePath: java.lang.String = null,
    `type`: java.lang.String = null
  ): IgMapBackgroundContent = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bingUrl != null) __obj.updateDynamic("bingUrl")(bingUrl)
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet)
    if (key != null) __obj.updateDynamic("key")(key)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (tilePath != null) __obj.updateDynamic("tilePath")(tilePath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IgMapBackgroundContent]
  }
}

