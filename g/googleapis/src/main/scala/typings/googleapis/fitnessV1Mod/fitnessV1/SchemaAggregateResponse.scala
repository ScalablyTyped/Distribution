package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAggregateResponse extends js.Object {
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
  implicit class SchemaAggregateResponseOps[Self <: SchemaAggregateResponse] (val x: Self) extends AnyVal {
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
    def setBucketVarargs(value: SchemaAggregateBucket*): Self = this.set("bucket", js.Array(value :_*))
    @scala.inline
    def setBucket(value: js.Array[SchemaAggregateBucket]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
  }
  
}

