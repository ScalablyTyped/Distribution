package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseImpressions extends StObject {
  
  var surfaces: InsightsServicePostResponseSurfaces = js.native
  
  var value: Double = js.native
}
object InsightsServicePostResponseImpressions {
  
  @scala.inline
  def apply(surfaces: InsightsServicePostResponseSurfaces, value: Double): InsightsServicePostResponseImpressions = {
    val __obj = js.Dynamic.literal(surfaces = surfaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseImpressions]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseImpressionsMutableBuilder[Self <: InsightsServicePostResponseImpressions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSurfaces(value: InsightsServicePostResponseSurfaces): Self = StObject.set(x, "surfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
