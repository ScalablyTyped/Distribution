package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about a potentially long-running operation with
  * which a log entry is associated.
  */
@js.native
trait SchemaLogEntryOperation extends js.Object {
  /**
    * Optional. Set this to True if this is the first log entry in the
    * operation.
    */
  var first: js.UndefOr[Boolean] = js.native
  /**
    * Optional. An arbitrary operation identifier. Log entries with the same
    * identifier are assumed to be part of the same operation.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Optional. Set this to True if this is the last log entry in the
    * operation.
    */
  var last: js.UndefOr[Boolean] = js.native
  /**
    * Optional. An arbitrary producer identifier. The combination of id and
    * producer must be globally unique. Examples for producer:
    * &quot;MyDivision.MyBigCompany.com&quot;,
    * &quot;github.com/MyProject/MyApplication&quot;.
    */
  var producer: js.UndefOr[String] = js.native
}

object SchemaLogEntryOperation {
  @scala.inline
  def apply(
    first: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    last: js.UndefOr[Boolean] = js.undefined,
    producer: String = null
  ): SchemaLogEntryOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.get.asInstanceOf[js.Any])
    if (producer != null) __obj.updateDynamic("producer")(producer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogEntryOperation]
  }
}

