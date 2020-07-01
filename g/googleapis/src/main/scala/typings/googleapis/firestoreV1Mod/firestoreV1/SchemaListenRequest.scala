package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for Firestore.Listen
  */
@js.native
trait SchemaListenRequest extends js.Object {
  /**
    * A target to add to this stream.
    */
  var addTarget: js.UndefOr[SchemaTarget] = js.native
  /**
    * Labels associated with this target change.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of a target to remove from this stream.
    */
  var removeTarget: js.UndefOr[Double] = js.native
}

object SchemaListenRequest {
  @scala.inline
  def apply(
    addTarget: SchemaTarget = null,
    labels: StringDictionary[String] = null,
    removeTarget: js.UndefOr[Double] = js.undefined
  ): SchemaListenRequest = {
    val __obj = js.Dynamic.literal()
    if (addTarget != null) __obj.updateDynamic("addTarget")(addTarget.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(removeTarget)) __obj.updateDynamic("removeTarget")(removeTarget.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListenRequest]
  }
}

