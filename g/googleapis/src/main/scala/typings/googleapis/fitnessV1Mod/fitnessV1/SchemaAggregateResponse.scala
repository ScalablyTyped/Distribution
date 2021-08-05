package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAggregateResponse extends StObject {
  
  /**
    * A list of buckets containing the aggregated data.
    */
  var bucket: js.UndefOr[js.Array[SchemaAggregateBucket]] = js.undefined
}
object SchemaAggregateResponse {
  
  inline def apply(): SchemaAggregateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateResponse]
  }
  
  extension [Self <: SchemaAggregateResponse](x: Self) {
    
    inline def setBucket(value: js.Array[SchemaAggregateBucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setBucketVarargs(value: SchemaAggregateBucket*): Self = StObject.set(x, "bucket", js.Array(value :_*))
  }
}
