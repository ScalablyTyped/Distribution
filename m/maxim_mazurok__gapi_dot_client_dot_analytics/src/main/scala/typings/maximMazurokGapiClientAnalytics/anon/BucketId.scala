package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketId extends StObject {
  
  /** Id of the bucket the file object is stored in. */
  var bucketId: js.UndefOr[String] = js.undefined
  
  /** Id of the file object containing the report data. */
  var objectId: js.UndefOr[String] = js.undefined
}
object BucketId {
  
  inline def apply(): BucketId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketId]
  }
  
  extension [Self <: BucketId](x: Self) {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
