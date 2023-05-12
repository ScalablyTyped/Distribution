package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureId extends StObject {
  
  var featureId: String
}
object FeatureId {
  
  inline def apply(featureId: String): FeatureId = {
    val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureId] (val x: Self) extends AnyVal {
    
    inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
  }
}
