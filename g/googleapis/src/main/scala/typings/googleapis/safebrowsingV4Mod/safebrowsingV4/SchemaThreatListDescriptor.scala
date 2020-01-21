package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an individual threat list. A list is defined by three parameters:
  * the type of threat posed, the type of platform targeted by the threat, and
  * the type of entries in the list.
  */
@js.native
trait SchemaThreatListDescriptor extends js.Object {
  /**
    * The platform type targeted by the list&#39;s entries.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The entry types contained in the list.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  /**
    * The threat type posed by the list&#39;s entries.
    */
  var threatType: js.UndefOr[String] = js.native
}

object SchemaThreatListDescriptor {
  @scala.inline
  def apply(platformType: String = null, threatEntryType: String = null, threatType: String = null): SchemaThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThreatListDescriptor]
  }
}

