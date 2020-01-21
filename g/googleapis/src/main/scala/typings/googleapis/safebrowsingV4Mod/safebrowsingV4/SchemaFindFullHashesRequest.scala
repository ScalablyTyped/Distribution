package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to return full hashes matched by the provided hash prefixes.
  */
@js.native
trait SchemaFindFullHashesRequest extends js.Object {
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client&#39;s implementation.
    */
  var apiClient: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The current client states for each of the client&#39;s local threat
    * lists.
    */
  var clientStates: js.UndefOr[js.Array[String]] = js.native
  /**
    * The lists and hashes to be checked.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.native
}

object SchemaFindFullHashesRequest {
  @scala.inline
  def apply(
    apiClient: SchemaClientInfo = null,
    client: SchemaClientInfo = null,
    clientStates: js.Array[String] = null,
    threatInfo: SchemaThreatInfo = null
  ): SchemaFindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    if (apiClient != null) __obj.updateDynamic("apiClient")(apiClient.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (clientStates != null) __obj.updateDynamic("clientStates")(clientStates.asInstanceOf[js.Any])
    if (threatInfo != null) __obj.updateDynamic("threatInfo")(threatInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindFullHashesRequest]
  }
}

