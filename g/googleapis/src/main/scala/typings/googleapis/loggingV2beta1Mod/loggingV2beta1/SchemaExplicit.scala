package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a set of buckets with arbitrary widths.There are size(bounds) + 1
  * (= N) buckets. Bucket i has the following boundaries:Upper bound (0 &lt;= i
  * &lt; N-1): boundsi  Lower bound (1 &lt;= i &lt; N); boundsi - 1The bounds
  * field must contain at least one element. If bounds has only one element,
  * then there are no finite buckets, and that single element is the common
  * boundary of the overflow and underflow buckets.
  */
@js.native
trait SchemaExplicit extends js.Object {
  /**
    * The values must be monotonically increasing.
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaExplicit {
  @scala.inline
  def apply(): SchemaExplicit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplicit]
  }
  @scala.inline
  implicit class SchemaExplicitOps[Self <: SchemaExplicit] (val x: Self) extends AnyVal {
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

