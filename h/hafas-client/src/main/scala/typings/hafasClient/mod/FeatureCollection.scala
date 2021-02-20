package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureCollection extends StObject {
  
  var features: js.Array[Feature] = js.native
  
  var `type`: typings.hafasClient.hafasClientStrings.FeatureCollection = js.native
}
object FeatureCollection {
  
  @scala.inline
  def apply(features: js.Array[Feature], `type`: typings.hafasClient.hafasClientStrings.FeatureCollection): FeatureCollection = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection]
  }
  
  @scala.inline
  implicit class FeatureCollectionMutableBuilder[Self <: FeatureCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.hafasClient.hafasClientStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
