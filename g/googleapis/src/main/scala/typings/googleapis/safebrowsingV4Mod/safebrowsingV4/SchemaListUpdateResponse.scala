package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An update to an individual list.
  */
@js.native
trait SchemaListUpdateResponse extends js.Object {
  /**
    * A set of entries to add to a local threat type&#39;s list. Repeated to
    * allow for a combination of compressed and raw data to be sent in a single
    * response.
    */
  var additions: js.UndefOr[js.Array[SchemaThreatEntrySet]] = js.native
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list
    * of all hashes present in the database after applying the provided update.
    * If the client state doesn&#39;t match the expected state, the client must
    * disregard this update and retry later.
    */
  var checksum: js.UndefOr[SchemaChecksum] = js.native
  /**
    * The new client state, in encrypted format. Opaque to clients.
    */
  var newClientState: js.UndefOr[String] = js.native
  /**
    * The platform type for which data is returned.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * A set of entries to remove from a local threat type&#39;s list. In
    * practice, this field is empty or contains exactly one ThreatEntrySet.
    */
  var removals: js.UndefOr[js.Array[SchemaThreatEntrySet]] = js.native
  /**
    * The type of response. This may indicate that an action is required by the
    * client when the response is received.
    */
  var responseType: js.UndefOr[String] = js.native
  /**
    * The format of the threats.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  /**
    * The threat type for which data is returned.
    */
  var threatType: js.UndefOr[String] = js.native
}

object SchemaListUpdateResponse {
  @scala.inline
  def apply(
    additions: js.Array[SchemaThreatEntrySet] = null,
    checksum: SchemaChecksum = null,
    newClientState: String = null,
    platformType: String = null,
    removals: js.Array[SchemaThreatEntrySet] = null,
    responseType: String = null,
    threatEntryType: String = null,
    threatType: String = null
  ): SchemaListUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (additions != null) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (newClientState != null) __obj.updateDynamic("newClientState")(newClientState.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (removals != null) __obj.updateDynamic("removals")(removals.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListUpdateResponse]
  }
}

