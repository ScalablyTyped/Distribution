package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureKey extends StObject {
  
  var bucketInstanceId: Double
  
  var collisionGroupID: Double
  
  var featureIndex: Double
  
  var overlapMode: OverlapMode
}
object FeatureKey {
  
  inline def apply(bucketInstanceId: Double, collisionGroupID: Double, featureIndex: Double, overlapMode: OverlapMode): FeatureKey = {
    val __obj = js.Dynamic.literal(bucketInstanceId = bucketInstanceId.asInstanceOf[js.Any], collisionGroupID = collisionGroupID.asInstanceOf[js.Any], featureIndex = featureIndex.asInstanceOf[js.Any], overlapMode = overlapMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureKey]
  }
  
  extension [Self <: FeatureKey](x: Self) {
    
    inline def setBucketInstanceId(value: Double): Self = StObject.set(x, "bucketInstanceId", value.asInstanceOf[js.Any])
    
    inline def setCollisionGroupID(value: Double): Self = StObject.set(x, "collisionGroupID", value.asInstanceOf[js.Any])
    
    inline def setFeatureIndex(value: Double): Self = StObject.set(x, "featureIndex", value.asInstanceOf[js.Any])
    
    inline def setOverlapMode(value: OverlapMode): Self = StObject.set(x, "overlapMode", value.asInstanceOf[js.Any])
  }
}
