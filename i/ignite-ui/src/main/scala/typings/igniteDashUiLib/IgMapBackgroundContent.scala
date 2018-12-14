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

