package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFloodlightActivityPublisherDynamicTag extends StObject {
  
  /**
    * Whether this tag is applicable only for click-throughs.
    */
  var clickThrough: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that can be used as an alternative to the siteId field. When this resource is retrieved, only the siteId field will be populated.
    */
  var directorySiteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dynamic floodlight tag.
    */
  var dynamicTag: js.UndefOr[SchemaFloodlightActivityDynamicTag] = js.undefined
  
  /**
    * Site ID of this dynamic tag.
    */
  var siteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the site. This is a read-only, auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether this tag is applicable only for view-throughs.
    */
  var viewThrough: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFloodlightActivityPublisherDynamicTag {
  
  inline def apply(): SchemaFloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityPublisherDynamicTag]
  }
  
  extension [Self <: SchemaFloodlightActivityPublisherDynamicTag](x: Self) {
    
    inline def setClickThrough(value: Boolean): Self = StObject.set(x, "clickThrough", value.asInstanceOf[js.Any])
    
    inline def setClickThroughNull: Self = StObject.set(x, "clickThrough", null)
    
    inline def setClickThroughUndefined: Self = StObject.set(x, "clickThrough", js.undefined)
    
    inline def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdNull: Self = StObject.set(x, "directorySiteId", null)
    
    inline def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    inline def setDynamicTag(value: SchemaFloodlightActivityDynamicTag): Self = StObject.set(x, "dynamicTag", value.asInstanceOf[js.Any])
    
    inline def setDynamicTagUndefined: Self = StObject.set(x, "dynamicTag", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValueUndefined: Self = StObject.set(x, "siteIdDimensionValue", js.undefined)
    
    inline def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    inline def setViewThrough(value: Boolean): Self = StObject.set(x, "viewThrough", value.asInstanceOf[js.Any])
    
    inline def setViewThroughNull: Self = StObject.set(x, "viewThrough", null)
    
    inline def setViewThroughUndefined: Self = StObject.set(x, "viewThrough", js.undefined)
  }
}
