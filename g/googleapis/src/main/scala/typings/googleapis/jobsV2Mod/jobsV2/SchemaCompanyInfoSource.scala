package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that represents an external  Google identifier for a company,
  * for example, a Google+ business page or a Google Maps business page. For
  * unsupported types, use `unknown_type_id`.
  */
@js.native
trait SchemaCompanyInfoSource extends js.Object {
  /**
    * Optional.  The Google&#39;s Knowledge Graph value for the employer&#39;s
    * company.
    */
  var freebaseMid: js.UndefOr[String] = js.native
  /**
    * Optional.  The numeric identifier for the employer&#39;s Google+ business
    * page.
    */
  var gplusId: js.UndefOr[String] = js.native
  /**
    * Optional.  The numeric identifier for the employer&#39;s headquarters on
    * Google Maps, namely, the Google Maps CID (cell id).
    */
  var mapsCid: js.UndefOr[String] = js.native
  /**
    * Optional.  A Google identifier that does not match any of the other
    * types.
    */
  var unknownTypeId: js.UndefOr[String] = js.native
}

object SchemaCompanyInfoSource {
  @scala.inline
  def apply(
    freebaseMid: String = null,
    gplusId: String = null,
    mapsCid: String = null,
    unknownTypeId: String = null
  ): SchemaCompanyInfoSource = {
    val __obj = js.Dynamic.literal()
    if (freebaseMid != null) __obj.updateDynamic("freebaseMid")(freebaseMid.asInstanceOf[js.Any])
    if (gplusId != null) __obj.updateDynamic("gplusId")(gplusId.asInstanceOf[js.Any])
    if (mapsCid != null) __obj.updateDynamic("mapsCid")(mapsCid.asInstanceOf[js.Any])
    if (unknownTypeId != null) __obj.updateDynamic("unknownTypeId")(unknownTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompanyInfoSource]
  }
}

