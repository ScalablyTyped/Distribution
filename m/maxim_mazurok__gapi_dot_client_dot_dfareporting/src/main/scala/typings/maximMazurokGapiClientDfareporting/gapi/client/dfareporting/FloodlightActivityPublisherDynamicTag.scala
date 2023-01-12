package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightActivityPublisherDynamicTag extends StObject {
  
  /** Whether this tag is applicable only for click-throughs. */
  var clickThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that can be used as an alternative to the siteId field. When this resource is retrieved, only the siteId field will
    * be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.undefined
  
  /** Dynamic floodlight tag. */
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.undefined
  
  /** Site ID of this dynamic tag. */
  var siteId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the site. This is a read-only, auto-generated field. */
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether this tag is applicable only for view-throughs. */
  var viewThrough: js.UndefOr[Boolean] = js.undefined
}
object FloodlightActivityPublisherDynamicTag {
  
  inline def apply(): FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityPublisherDynamicTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
    
    inline def setClickThrough(value: Boolean): Self = StObject.set(x, "clickThrough", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUndefined: Self = StObject.set(x, "clickThrough", js.undefined)
    
    inline def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    inline def setDynamicTag(value: FloodlightActivityDynamicTag): Self = StObject.set(x, "dynamicTag", value.asInstanceOf[js.Any])
    
    inline def setDynamicTagUndefined: Self = StObject.set(x, "dynamicTag", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValueUndefined: Self = StObject.set(x, "siteIdDimensionValue", js.undefined)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    inline def setViewThrough(value: Boolean): Self = StObject.set(x, "viewThrough", value.asInstanceOf[js.Any])
    
    inline def setViewThroughUndefined: Self = StObject.set(x, "viewThrough", js.undefined)
  }
}
