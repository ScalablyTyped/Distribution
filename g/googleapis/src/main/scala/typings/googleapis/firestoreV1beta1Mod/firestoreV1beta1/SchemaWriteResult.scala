package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of applying a write.
  */
@js.native
trait SchemaWriteResult extends js.Object {
  /**
    * The results of applying each DocumentTransform.FieldTransform, in the
    * same order.
    */
  var transformResults: js.UndefOr[js.Array[SchemaValue]] = js.native
  /**
    * The last update time of the document after applying the write. Not set
    * after a `delete`.  If the write did not actually change the document,
    * this will be the previous update_time.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaWriteResult {
  @scala.inline
  def apply(): SchemaWriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteResult]
  }
  @scala.inline
  implicit class SchemaWriteResultOps[Self <: SchemaWriteResult] (val x: Self) extends AnyVal {
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
    def setTransformResultsVarargs(value: SchemaValue*): Self = this.set("transformResults", js.Array(value :_*))
    @scala.inline
    def setTransformResults(value: js.Array[SchemaValue]): Self = this.set("transformResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformResults: Self = this.set("transformResults", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

