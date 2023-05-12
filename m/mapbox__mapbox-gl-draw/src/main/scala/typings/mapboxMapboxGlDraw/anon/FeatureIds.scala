package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureIds extends StObject {
  
  var featureIds: js.Array[String]
}
object FeatureIds {
  
  inline def apply(featureIds: js.Array[String]): FeatureIds = {
    val __obj = js.Dynamic.literal(featureIds = featureIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureIds] (val x: Self) extends AnyVal {
    
    inline def setFeatureIds(value: js.Array[String]): Self = StObject.set(x, "featureIds", value.asInstanceOf[js.Any])
    
    inline def setFeatureIdsVarargs(value: String*): Self = StObject.set(x, "featureIds", js.Array(value*))
  }
}
