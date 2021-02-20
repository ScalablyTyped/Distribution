package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Release` is a particular [collection of configurations and
  * files](sites.versions) that is set to be public at a particular time.
  */
@js.native
trait SchemaRelease extends StObject {
  
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
  implicit class SchemaReleaseMutableBuilder[Self <: SchemaRelease] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReleaseTime(value: String): Self = StObject.set(x, "releaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseTimeUndefined: Self = StObject.set(x, "releaseTime", js.undefined)
    
    @scala.inline
    def setReleaseUser(value: SchemaActingUser): Self = StObject.set(x, "releaseUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUserUndefined: Self = StObject.set(x, "releaseUser", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: SchemaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
