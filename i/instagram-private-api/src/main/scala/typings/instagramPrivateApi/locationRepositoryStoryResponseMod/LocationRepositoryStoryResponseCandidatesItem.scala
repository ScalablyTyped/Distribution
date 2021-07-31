package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseCandidatesItem extends StObject {
  
  var estimated_scans_sizes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var height: Double
  
  var url: String
  
  var width: Double
}
object LocationRepositoryStoryResponseCandidatesItem {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): LocationRepositoryStoryResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseCandidatesItem]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseCandidatesItemMutableBuilder[Self <: LocationRepositoryStoryResponseCandidatesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimated_scans_sizesUndefined: Self = StObject.set(x, "estimated_scans_sizes", js.undefined)
    
    @scala.inline
    def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
