package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaThreatHit extends js.Object {
  /**
    * Client-reported identification.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The threat entry responsible for the hit. Full hash should be reported
    * for hash-based hits.
    */
  var entry: js.UndefOr[SchemaThreatEntry] = js.native
  /**
    * The platform type reported.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The resources related to the threat hit.
    */
  var resources: js.UndefOr[js.Array[SchemaThreatSource]] = js.native
  /**
    * The threat type reported.
    */
  var threatType: js.UndefOr[String] = js.native
  /**
    * Details about the user that encountered the threat.
    */
  var userInfo: js.UndefOr[SchemaUserInfo] = js.native
}

object SchemaThreatHit {
  @scala.inline
  def apply(): SchemaThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatHit]
  }
  @scala.inline
  implicit class SchemaThreatHitOps[Self <: SchemaThreatHit] (val x: Self) extends AnyVal {
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
    def setClientInfo(value: SchemaClientInfo): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    @scala.inline
    def setEntry(value: SchemaThreatEntry): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: SchemaThreatSource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[SchemaThreatSource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
    @scala.inline
    def setUserInfo(value: SchemaUserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
  
}

