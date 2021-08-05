package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseCandidatesItem extends StObject {
  
  var estimated_scans_sizes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var height: Double
  
  var scans_profile: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var width: Double
}
object TopicalExploreFeedResponseCandidatesItem {
  
  inline def apply(height: Double, url: String, width: Double): TopicalExploreFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseCandidatesItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseCandidatesItem](x: Self) {
    
    inline def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
    
    inline def setEstimated_scans_sizesUndefined: Self = StObject.set(x, "estimated_scans_sizes", js.undefined)
    
    inline def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScans_profile(value: String): Self = StObject.set(x, "scans_profile", value.asInstanceOf[js.Any])
    
    inline def setScans_profileUndefined: Self = StObject.set(x, "scans_profile", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
