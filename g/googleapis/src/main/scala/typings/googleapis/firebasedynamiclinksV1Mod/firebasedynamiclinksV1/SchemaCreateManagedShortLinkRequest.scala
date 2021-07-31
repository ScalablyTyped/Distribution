package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a managed Short Dynamic Link.
  */
trait SchemaCreateManagedShortLinkRequest extends StObject {
  
  /**
    * Information about the Dynamic Link to be shortened. [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var dynamicLinkInfo: js.UndefOr[SchemaDynamicLinkInfo] = js.undefined
  
  /**
    * Full long Dynamic Link URL with desired query parameters specified. For
    * example,
    * &quot;https://sample.app.goo.gl/?link=http://www.google.com&amp;apn=com.sample&quot;,
    * [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var longDynamicLink: js.UndefOr[String] = js.undefined
  
  /**
    * Link name to associate with the link. It&#39;s used for marketer to
    * identify manually-created links in the Firebase console
    * (https://console.firebase.google.com/). Links must be named to be
    * tracked.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Short Dynamic Link suffix. Optional.
    */
  var suffix: js.UndefOr[SchemaSuffix] = js.undefined
}
object SchemaCreateManagedShortLinkRequest {
  
  @scala.inline
  def apply(): SchemaCreateManagedShortLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateManagedShortLinkRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateManagedShortLinkRequestMutableBuilder[Self <: SchemaCreateManagedShortLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicLinkInfo(value: SchemaDynamicLinkInfo): Self = StObject.set(x, "dynamicLinkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkInfoUndefined: Self = StObject.set(x, "dynamicLinkInfo", js.undefined)
    
    @scala.inline
    def setLongDynamicLink(value: String): Self = StObject.set(x, "longDynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDynamicLinkUndefined: Self = StObject.set(x, "longDynamicLink", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    @scala.inline
    def setSuffix(value: SchemaSuffix): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
