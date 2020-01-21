package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile app List Response
  */
@js.native
trait SchemaMobileAppsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Mobile apps collection.
    */
  var mobileApps: js.UndefOr[js.Array[SchemaMobileApp]] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaMobileAppsListResponse {
  @scala.inline
  def apply(kind: String = null, mobileApps: js.Array[SchemaMobileApp] = null, nextPageToken: String = null): SchemaMobileAppsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileApps != null) __obj.updateDynamic("mobileApps")(mobileApps.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileAppsListResponse]
  }
}

