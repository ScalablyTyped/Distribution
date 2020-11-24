package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Release` is a particular [collection of configurations and
  * files](sites.versions) that is set to be public at a particular time.
  */
@js.native
trait SchemaRelease extends js.Object {
  
  /**
    * The deploy description when the release was created. The value can be up
    * to 512&amp;nbsp;characters.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Output only. The unique identifier for the release, in the format:
    * &lt;code&gt;sites/&lt;var&gt;site-name&lt;/var&gt;/releases/&lt;var&gt;releaseID&lt;/var&gt;&lt;/code&gt;
    * This name is provided in the response body when you call the
    * [`CreateRelease`](sites.releases/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time at which the version is set to be public.
    */
  var releaseTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. Identifies the user who created the release.
    */
  var releaseUser: js.UndefOr[SchemaActingUser] = js.native
  
  /**
    * Explains the reason for the release. &lt;br&gt;Specify a value for this
    * field only when creating a `SITE_DISABLE` type release.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Output only.  The configuration and content that was released.
    */
  var version: js.UndefOr[SchemaVersion] = js.native
}
object SchemaRelease {
  
  @scala.inline
  def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  
  @scala.inline
  implicit class SchemaReleaseOps[Self <: SchemaRelease] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReleaseTime(value: String): Self = this.set("releaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseTime: Self = this.set("releaseTime", js.undefined)
    
    @scala.inline
    def setReleaseUser(value: SchemaActingUser): Self = this.set("releaseUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseUser: Self = this.set("releaseUser", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: SchemaVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
