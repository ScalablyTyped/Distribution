package typings.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalResult extends js.Object {
  
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
  implicit class DescribeGlobalResultOps[Self <: DescribeGlobalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchSize(value: Double): Self = this.set("maxBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSobjectsVarargs(value: DescribeGlobalSObjectResult*): Self = this.set("sobjects", js.Array(value :_*))
    
    @scala.inline
    def setSobjects(value: js.Array[DescribeGlobalSObjectResult]): Self = this.set("sobjects", value.asInstanceOf[js.Any])
  }
}
