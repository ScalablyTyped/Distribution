package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalResult extends StObject {
  
  var encoding: String
  
  var maxBatchSize: Double
  
  var sobjects: js.Array[DescribeGlobalSObjectResult]
}
object DescribeGlobalResult {
  
  inline def apply(encoding: String, maxBatchSize: Double, sobjects: js.Array[DescribeGlobalSObjectResult]): DescribeGlobalResult = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], maxBatchSize = maxBatchSize.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGlobalResult] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSize(value: Double): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    inline def setSobjects(value: js.Array[DescribeGlobalSObjectResult]): Self = StObject.set(x, "sobjects", value.asInstanceOf[js.Any])
    
    inline def setSobjectsVarargs(value: DescribeGlobalSObjectResult*): Self = StObject.set(x, "sobjects", js.Array(value*))
  }
}
