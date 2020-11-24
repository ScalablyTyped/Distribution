package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describing buckets with arbitrary user-provided width.
  */
@js.native
trait SchemaExplicitBuckets extends js.Object {
  
  /**
    * &#39;bound&#39; is a list of strictly increasing boundaries between
    * buckets. Note that a list of length N-1 defines N buckets because of
    * fenceposting. See comments on `bucket_options` for details.  The i&#39;th
    * finite bucket covers the interval   [bound[i-1], bound[i]) where i ranges
    * from 1 to bound_size() - 1. Note that there are no finite buckets at all
    * if &#39;bound&#39; only contains a single element; in that special case
    * the single bound defines the boundary between the underflow and overflow
    * buckets.  bucket number                   lower bound    upper bound  i
    * == 0 (underflow)              -inf           bound[i]  0 &lt; i &lt;
    * bound_size()            bound[i-1]     bound[i]  i == bound_size()
    * (overflow)    bound[i-1]     +inf
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaExplicitBuckets {
  
  @scala.inline
  def apply(): SchemaExplicitBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplicitBuckets]
  }
  
  @scala.inline
  implicit class SchemaExplicitBucketsOps[Self <: SchemaExplicitBuckets] (val x: Self) extends AnyVal {
    
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
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
  }
}
