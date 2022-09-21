package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestItem extends StObject {
  
  var featuredPart: js.UndefOr[Boolean | Null] = js.undefined
  
  var gaia: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var snippet: js.UndefOr[SchemaTestItemTestItemSnippet] = js.undefined
}
object SchemaTestItem {
  
  inline def apply(): SchemaTestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestItem]
  }
  
  extension [Self <: SchemaTestItem](x: Self) {
    
    inline def setFeaturedPart(value: Boolean): Self = StObject.set(x, "featuredPart", value.asInstanceOf[js.Any])
    
    inline def setFeaturedPartNull: Self = StObject.set(x, "featuredPart", null)
    
    inline def setFeaturedPartUndefined: Self = StObject.set(x, "featuredPart", js.undefined)
    
    inline def setGaia(value: String): Self = StObject.set(x, "gaia", value.asInstanceOf[js.Any])
    
    inline def setGaiaNull: Self = StObject.set(x, "gaia", null)
    
    inline def setGaiaUndefined: Self = StObject.set(x, "gaia", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSnippet(value: SchemaTestItemTestItemSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
