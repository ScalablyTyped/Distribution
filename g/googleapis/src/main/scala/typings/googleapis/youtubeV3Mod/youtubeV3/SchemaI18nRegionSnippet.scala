package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about an i18n region, such as region code and human-readable
  * name.
  */
trait SchemaI18nRegionSnippet extends StObject {
  
  /**
    * The region code as a 2-letter ISO country code.
    */
  var gl: js.UndefOr[String] = js.undefined
  
  /**
    * The human-readable name of the region.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaI18nRegionSnippet {
  
  inline def apply(): SchemaI18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nRegionSnippet]
  }
  
  extension [Self <: SchemaI18nRegionSnippet](x: Self) {
    
    inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
