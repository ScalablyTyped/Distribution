package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Publisher Dynamic Tag
  */
@js.native
trait SchemaFloodlightActivityPublisherDynamicTag extends StObject {
  
  /**
    * Whether this tag is applicable only for click-throughs.
    */
  var clickThrough: js.UndefOr[Boolean] = js.native
  
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that
    * can be used as an alternative to the siteId field. When this resource is
    * retrieved, only the siteId field will be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  
  /**
    * Dynamic floodlight tag.
    */
  var dynamicTag: js.UndefOr[SchemaFloodlightActivityDynamicTag] = js.native
  
  /**
    * Site ID of this dynamic tag.
    */
  var siteId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether this tag is applicable only for view-throughs.
    */
  var viewThrough: js.UndefOr[Boolean] = js.native
}
object SchemaFloodlightActivityPublisherDynamicTag {
  
  @scala.inline
  def apply(): SchemaFloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityPublisherDynamicTag]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivityPublisherDynamicTagMutableBuilder[Self <: SchemaFloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThrough(value: Boolean): Self = StObject.set(x, "clickThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUndefined: Self = StObject.set(x, "clickThrough", js.undefined)
    
    @scala.inline
    def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    @scala.inline
    def setDynamicTag(value: SchemaFloodlightActivityDynamicTag): Self = StObject.set(x, "dynamicTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTagUndefined: Self = StObject.set(x, "dynamicTag", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdDimensionValueUndefined: Self = StObject.set(x, "siteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    @scala.inline
    def setViewThrough(value: Boolean): Self = StObject.set(x, "viewThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewThroughUndefined: Self = StObject.set(x, "viewThrough", js.undefined)
  }
}
