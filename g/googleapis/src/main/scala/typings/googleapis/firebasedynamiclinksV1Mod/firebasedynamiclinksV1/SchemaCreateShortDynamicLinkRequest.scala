package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a short Dynamic Link.
  */
@js.native
trait SchemaCreateShortDynamicLinkRequest extends js.Object {
  
  /**
    * Information about the Dynamic Link to be shortened. [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var dynamicLinkInfo: js.UndefOr[SchemaDynamicLinkInfo] = js.native
  
  /**
    * Full long Dynamic Link URL with desired query parameters specified. For
    * example,
    * &quot;https://sample.app.goo.gl/?link=http://www.google.com&amp;apn=com.sample&quot;,
    * [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var longDynamicLink: js.UndefOr[String] = js.native
  
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
  
  /**
    * Short Dynamic Link suffix. Optional.
    */
  var suffix: js.UndefOr[SchemaSuffix] = js.native
}
object SchemaCreateShortDynamicLinkRequest {
  
  @scala.inline
  def apply(): SchemaCreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShortDynamicLinkRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateShortDynamicLinkRequestOps[Self <: SchemaCreateShortDynamicLinkRequest] (val x: Self) extends AnyVal {
    
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
    def setDynamicLinkInfo(value: SchemaDynamicLinkInfo): Self = this.set("dynamicLinkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicLinkInfo: Self = this.set("dynamicLinkInfo", js.undefined)
    
    @scala.inline
    def setLongDynamicLink(value: String): Self = this.set("longDynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongDynamicLink: Self = this.set("longDynamicLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
    
    @scala.inline
    def setSuffix(value: SchemaSuffix): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
