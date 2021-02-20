package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAggregateResponse extends StObject {
  
  /**
    * A list of buckets containing the aggregated data.
    */
  var bucket: js.UndefOr[js.Array[SchemaAggregateBucket]] = js.native
}
object SchemaAggregateResponse {
  
  @scala.inline
  def apply(): SchemaAggregateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateResponse]
  }
  
  @scala.inline
  implicit class SchemaAggregateResponseMutableBuilder[Self <: SchemaAggregateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: js.Array[SchemaAggregateBucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setBucketVarargs(value: SchemaAggregateBucket*): Self = StObject.set(x, "bucket", js.Array(value :_*))
  }
}
