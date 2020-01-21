package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site List Response
  */
@js.native
trait SchemaSitesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Site collection.
    */
  var sites: js.UndefOr[js.Array[SchemaSite]] = js.native
}

object SchemaSitesListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, sites: js.Array[SchemaSite] = null): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sites != null) __obj.updateDynamic("sites")(sites.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
}

