package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DNS resource record.
  */
@js.native
trait SchemaResourceRecord extends js.Object {
  /**
    * Relative name of the object affected by this record. Only applicable for
    * `CNAME` records. Example: &#39;www&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Data for this record. Values vary by record type, as defined in RFC 1035
    * (section 5) and RFC 1034 (section 3.6.1).
    */
  var rrdata: js.UndefOr[String] = js.native
  /**
    * Resource record type. Example: `AAAA`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaResourceRecord {
  @scala.inline
  def apply(name: String = null, rrdata: String = null, `type`: String = null): SchemaResourceRecord = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rrdata != null) __obj.updateDynamic("rrdata")(rrdata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceRecord]
  }
}

