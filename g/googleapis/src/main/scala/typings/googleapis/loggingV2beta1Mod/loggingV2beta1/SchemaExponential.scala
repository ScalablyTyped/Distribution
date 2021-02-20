package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies an exponential sequence of buckets that have a width that is
  * proportional to the value of the lower bound. Each bucket represents a
  * constant relative uncertainty on a specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): scale * (growth_factor ^ i).
  * Lower bound (1 &lt;= i &lt; N): scale * (growth_factor ^ (i - 1)).
  */
@js.native
trait SchemaExponential extends StObject {
  
  /**
    * Must be greater than 1.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  
  /**
    * Must be greater than 0.
    */
  var scale: js.UndefOr[Double] = js.native
}
object SchemaExponential {
  
  @scala.inline
  def apply(): SchemaExponential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExponential]
  }
  
  @scala.inline
  implicit class SchemaExponentialMutableBuilder[Self <: SchemaExponential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrowthFactor(value: Double): Self = StObject.set(x, "growthFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthFactorUndefined: Self = StObject.set(x, "growthFactor", js.undefined)
    
    @scala.inline
    def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
