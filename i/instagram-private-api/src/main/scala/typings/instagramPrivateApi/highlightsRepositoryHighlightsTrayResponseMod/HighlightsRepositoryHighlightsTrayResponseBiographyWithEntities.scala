package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryHighlightsTrayResponseBiographyWithEntities extends StObject {
  
  var entities: js.Array[js.Any]
  
  var raw_text: String
}
object HighlightsRepositoryHighlightsTrayResponseBiographyWithEntities {
  
  inline def apply(entities: js.Array[js.Any], raw_text: String): HighlightsRepositoryHighlightsTrayResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseBiographyWithEntities]
  }
  
  extension [Self <: HighlightsRepositoryHighlightsTrayResponseBiographyWithEntities](x: Self) {
    
    inline def setEntities(value: js.Array[js.Any]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
  }
}
