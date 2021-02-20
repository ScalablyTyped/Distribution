package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivityPublisherDynamicTag extends StObject {
  
  /** Whether this tag is applicable only for click-throughs. */
  var clickThrough: js.UndefOr[Boolean] = js.native
  
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that can be used as an alternative to the siteId field. When this resource is retrieved, only the siteId field will
    * be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  
  /** Dynamic floodlight tag. */
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.native
  
  /** Site ID of this dynamic tag. */
  var siteId: js.UndefOr[String] = js.native
  
  /** Dimension value for the ID of the site. This is a read-only, auto-generated field. */
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  /** Whether this tag is applicable only for view-throughs. */
  var viewThrough: js.UndefOr[Boolean] = js.native
}
object FloodlightActivityPublisherDynamicTag {
  
  @scala.inline
  def apply(): FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityPublisherDynamicTag]
  }
  
  @scala.inline
  implicit class FloodlightActivityPublisherDynamicTagMutableBuilder[Self <: FloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThrough(value: Boolean): Self = StObject.set(x, "clickThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUndefined: Self = StObject.set(x, "clickThrough", js.undefined)
    
    @scala.inline
    def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    @scala.inline
    def setDynamicTag(value: FloodlightActivityDynamicTag): Self = StObject.set(x, "dynamicTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTagUndefined: Self = StObject.set(x, "dynamicTag", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "siteIdDimensionValue", value.asInstanceOf[js.Any])
    
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
