package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about an i18n region, such as region code and human-readable
  * name.
  */
@js.native
trait SchemaI18nRegionSnippet extends StObject {
  
  /**
    * The region code as a 2-letter ISO country code.
    */
  var gl: js.UndefOr[String] = js.native
  
  /**
    * The human-readable name of the region.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaI18nRegionSnippet {
  
  @scala.inline
  def apply(): SchemaI18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nRegionSnippet]
  }
  
  @scala.inline
  implicit class SchemaI18nRegionSnippetMutableBuilder[Self <: SchemaI18nRegionSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
