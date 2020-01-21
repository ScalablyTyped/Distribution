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
  def apply(transformResults: js.Array[SchemaValue] = null, updateTime: String = null): SchemaWriteResult = {
    val __obj = js.Dynamic.literal()
    if (transformResults != null) __obj.updateDynamic("transformResults")(transformResults.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWriteResult]
  }
}

