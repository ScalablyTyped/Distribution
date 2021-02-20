package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describing buckets with constant width.
  */
@js.native
trait SchemaLinearBuckets extends StObject {
  
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  
  /**
    * The i&#39;th linear bucket covers the interval   [offset + (i-1) * width,
    * offset + i * width) where i ranges from 1 to num_finite_buckets,
    * inclusive.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The i&#39;th linear bucket covers the interval   [offset + (i-1) * width,
    * offset + i * width) where i ranges from 1 to num_finite_buckets,
    * inclusive. Must be strictly positive.
    */
  var width: js.UndefOr[Double] = js.native
}
object SchemaLinearBuckets {
  
  @scala.inline
  def apply(): SchemaLinearBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinearBuckets]
  }
  
  @scala.inline
  implicit class SchemaLinearBucketsMutableBuilder[Self <: SchemaLinearBuckets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
