package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseIgtvFirstFrame extends StObject {
  
  var estimated_scans_sizes: js.Array[Double]
  
  var height: Double
  
  var scans_profile: String
  
  var url: String
  
  var width: Double
}
object TopicalExploreFeedResponseIgtvFirstFrame {
  
  inline def apply(
    estimated_scans_sizes: js.Array[Double],
    height: Double,
    scans_profile: String,
    url: String,
    width: Double
  ): TopicalExploreFeedResponseIgtvFirstFrame = {
    val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scans_profile = scans_profile.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseIgtvFirstFrame]
  }
  
  extension [Self <: TopicalExploreFeedResponseIgtvFirstFrame](x: Self) {
    
    inline def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
    
    inline def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScans_profile(value: String): Self = StObject.set(x, "scans_profile", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
