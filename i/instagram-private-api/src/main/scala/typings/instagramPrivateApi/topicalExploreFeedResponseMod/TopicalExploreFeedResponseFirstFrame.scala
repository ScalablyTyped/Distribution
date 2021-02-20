package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseFirstFrame extends StObject {
  
  var estimated_scans_sizes: js.Array[Double] = js.native
  
  var height: Double = js.native
  
  var scans_profile: String = js.native
  
  var url: String = js.native
  
  var width: Double = js.native
}
object TopicalExploreFeedResponseFirstFrame {
  
  @scala.inline
  def apply(
    estimated_scans_sizes: js.Array[Double],
    height: Double,
    scans_profile: String,
    url: String,
    width: Double
  ): TopicalExploreFeedResponseFirstFrame = {
    val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scans_profile = scans_profile.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseFirstFrame]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseFirstFrameMutableBuilder[Self <: TopicalExploreFeedResponseFirstFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScans_profile(value: String): Self = StObject.set(x, "scans_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
