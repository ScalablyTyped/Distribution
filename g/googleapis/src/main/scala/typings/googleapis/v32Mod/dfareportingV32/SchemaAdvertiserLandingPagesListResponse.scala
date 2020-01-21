package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Landing Page List Response
  */
@js.native
trait SchemaAdvertiserLandingPagesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserLandingPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Landing page collection
    */
  var landingPages: js.UndefOr[js.Array[SchemaLandingPage]] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaAdvertiserLandingPagesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    landingPages: js.Array[SchemaLandingPage] = null,
    nextPageToken: String = null
  ): SchemaAdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (landingPages != null) __obj.updateDynamic("landingPages")(landingPages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdvertiserLandingPagesListResponse]
  }
}

