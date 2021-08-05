package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseRootObject extends StObject {
  
  var reel: HighlightsRepositoryEditReelResponseReel
  
  var status: String
}
object HighlightsRepositoryEditReelResponseRootObject {
  
  inline def apply(reel: HighlightsRepositoryEditReelResponseReel, status: String): HighlightsRepositoryEditReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseRootObject]
  }
  
  extension [Self <: HighlightsRepositoryEditReelResponseRootObject](x: Self) {
    
    inline def setReel(value: HighlightsRepositoryEditReelResponseReel): Self = StObject.set(x, "reel", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
