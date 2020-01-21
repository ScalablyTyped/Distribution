package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFindFullHashesResponse extends js.Object {
  /**
    * The full hashes that matched the requested prefixes.
    */
  var matches: js.UndefOr[js.Array[SchemaThreatMatch]] = js.native
  /**
    * The minimum duration the client must wait before issuing any find hashes
    * request. If this field is not set, clients can issue a request as soon as
    * they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
  /**
    * For requested entities that did not match the threat list, how long to
    * cache the response.
    */
  var negativeCacheDuration: js.UndefOr[String] = js.native
}

object SchemaFindFullHashesResponse {
  @scala.inline
  def apply(
    matches: js.Array[SchemaThreatMatch] = null,
    minimumWaitDuration: String = null,
    negativeCacheDuration: String = null
  ): SchemaFindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (minimumWaitDuration != null) __obj.updateDynamic("minimumWaitDuration")(minimumWaitDuration.asInstanceOf[js.Any])
    if (negativeCacheDuration != null) __obj.updateDynamic("negativeCacheDuration")(negativeCacheDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindFullHashesResponse]
  }
}

