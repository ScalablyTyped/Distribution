package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event describing a message sent/received between Spans.
  */
@js.native
trait SchemaMessageEvent extends js.Object {
  /**
    * The number of compressed bytes sent or received. If missing assumed to be
    * the same size as uncompressed.
    */
  var compressedSizeBytes: js.UndefOr[String] = js.native
  /**
    * An identifier for the MessageEvent&#39;s message that can be used to
    * match SENT and RECEIVED MessageEvents. It is recommended to be unique
    * within a Span.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of MessageEvent. Indicates whether the message was sent or received.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The number of uncompressed bytes sent or received.
    */
  var uncompressedSizeBytes: js.UndefOr[String] = js.native
}

object SchemaMessageEvent {
  @scala.inline
  def apply(
    compressedSizeBytes: String = null,
    id: String = null,
    `type`: String = null,
    uncompressedSizeBytes: String = null
  ): SchemaMessageEvent = {
    val __obj = js.Dynamic.literal()
    if (compressedSizeBytes != null) __obj.updateDynamic("compressedSizeBytes")(compressedSizeBytes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uncompressedSizeBytes != null) __obj.updateDynamic("uncompressedSizeBytes")(uncompressedSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMessageEvent]
  }
}

