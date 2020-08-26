package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an exponential sequence of buckets that have a width that is
  * proportional to the value of the lower bound. Each bucket represents a
  * constant relative uncertainty on a specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): scale * (growth_factor ^ i).
  * Lower bound (1 &lt;= i &lt; N): scale * (growth_factor ^ (i - 1)).
  */
@js.native
trait SchemaExponential extends js.Object {
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
  implicit class SchemaExponentialOps[Self <: SchemaExponential] (val x: Self) extends AnyVal {
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
    def setGrowthFactor(value: Double): Self = this.set("growthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthFactor: Self = this.set("growthFactor", js.undefined)
    @scala.inline
    def setNumFiniteBuckets(value: Double): Self = this.set("numFiniteBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFiniteBuckets: Self = this.set("numFiniteBuckets", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

