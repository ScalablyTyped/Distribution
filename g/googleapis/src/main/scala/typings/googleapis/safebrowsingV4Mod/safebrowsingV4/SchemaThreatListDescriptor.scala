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
  def apply(): SchemaThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatListDescriptor]
  }
  @scala.inline
  implicit class SchemaThreatListDescriptorOps[Self <: SchemaThreatListDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    @scala.inline
    def setThreatEntryType(value: String): Self = this.set("threatEntryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatEntryType: Self = this.set("threatEntryType", js.undefined)
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
  }
  
}

