package typings.leafletDraw.anon

import typings.leaflet.mod.FeatureGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureGroup extends StObject {
  
  var featureGroup: FeatureGroup_[Any]
}
object FeatureGroup {
  
  inline def apply(featureGroup: FeatureGroup_[Any]): FeatureGroup = {
    val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureGroup] (val x: Self) extends AnyVal {
    
    inline def setFeatureGroup(value: FeatureGroup_[Any]): Self = StObject.set(x, "featureGroup", value.asInstanceOf[js.Any])
  }
}
