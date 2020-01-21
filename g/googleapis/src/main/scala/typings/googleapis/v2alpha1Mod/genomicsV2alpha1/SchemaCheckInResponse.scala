package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to the CheckIn method.
  */
@js.native
trait SchemaCheckInResponse extends js.Object {
  /**
    * The deadline by which the worker must request an extension.  The backend
    * will allow for network transmission time and other delays, but the worker
    * must attempt to transmit the extension request no later than the
    * deadline.
    */
  var deadline: js.UndefOr[String] = js.native
  /**
    * The metadata that describes the operation assigned to the worker.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaCheckInResponse {
  @scala.inline
  def apply(deadline: String = null, metadata: StringDictionary[js.Any] = null): SchemaCheckInResponse = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckInResponse]
  }
}

