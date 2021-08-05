package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgMapBackgroundContent
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  
  inline def apply(): IgMapBackgroundContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMapBackgroundContent]
  }
  
  extension [Self <: IgMapBackgroundContent](x: Self) {
    
    inline def setBingUrl(value: String): Self = StObject.set(x, "bingUrl", value.asInstanceOf[js.Any])
    
    inline def setBingUrlUndefined: Self = StObject.set(x, "bingUrl", js.undefined)
    
    inline def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
    
    inline def setImagerySetUndefined: Self = StObject.set(x, "imagerySet", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setTilePath(value: String): Self = StObject.set(x, "tilePath", value.asInstanceOf[js.Any])
    
    inline def setTilePathUndefined: Self = StObject.set(x, "tilePath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
