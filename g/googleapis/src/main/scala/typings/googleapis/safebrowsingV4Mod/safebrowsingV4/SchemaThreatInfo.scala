package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information regarding one or more threats that a client submits when
  * checking for matches in threat lists.
  */
@js.native
trait SchemaThreatInfo extends js.Object {
  /**
    * The platform types to be checked.
    */
  var platformTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The threat entries to be checked.
    */
  var threatEntries: js.UndefOr[js.Array[SchemaThreatEntry]] = js.native
  /**
    * The entry types to be checked.
    */
  var threatEntryTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The threat types to be checked.
    */
  var threatTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaThreatInfo {
  @scala.inline
  def apply(
    platformTypes: js.Array[String] = null,
    threatEntries: js.Array[SchemaThreatEntry] = null,
    threatEntryTypes: js.Array[String] = null,
    threatTypes: js.Array[String] = null
  ): SchemaThreatInfo = {
    val __obj = js.Dynamic.literal()
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    if (threatEntries != null) __obj.updateDynamic("threatEntries")(threatEntries.asInstanceOf[js.Any])
    if (threatEntryTypes != null) __obj.updateDynamic("threatEntryTypes")(threatEntryTypes.asInstanceOf[js.Any])
    if (threatTypes != null) __obj.updateDynamic("threatTypes")(threatTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThreatInfo]
  }
}

