package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalResult extends StObject {
  
  var encoding: String = js.native
  
  var maxBatchSize: Double = js.native
  
  var sobjects: js.Array[DescribeGlobalSObjectResult] = js.native
}
object DescribeGlobalResult {
  
  @scala.inline
  def apply(encoding: String, maxBatchSize: Double, sobjects: js.Array[DescribeGlobalSObjectResult]): DescribeGlobalResult = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], maxBatchSize = maxBatchSize.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalResult]
  }
  
  @scala.inline
  implicit class DescribeGlobalResultMutableBuilder[Self <: DescribeGlobalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchSize(value: Double): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSobjects(value: js.Array[DescribeGlobalSObjectResult]): Self = StObject.set(x, "sobjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSobjectsVarargs(value: DescribeGlobalSObjectResult*): Self = StObject.set(x, "sobjects", js.Array(value :_*))
  }
}
