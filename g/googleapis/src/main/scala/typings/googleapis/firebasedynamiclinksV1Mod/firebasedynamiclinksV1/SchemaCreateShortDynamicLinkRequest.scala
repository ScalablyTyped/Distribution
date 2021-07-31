package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a short Dynamic Link.
  */
trait SchemaCreateShortDynamicLinkRequest extends StObject {
  
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
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Short Dynamic Link suffix. Optional.
    */
  var suffix: js.UndefOr[SchemaSuffix] = js.undefined
}
object SchemaCreateShortDynamicLinkRequest {
  
  @scala.inline
  def apply(): SchemaCreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShortDynamicLinkRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateShortDynamicLinkRequestMutableBuilder[Self <: SchemaCreateShortDynamicLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicLinkInfo(value: SchemaDynamicLinkInfo): Self = StObject.set(x, "dynamicLinkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkInfoUndefined: Self = StObject.set(x, "dynamicLinkInfo", js.undefined)
    
    @scala.inline
    def setLongDynamicLink(value: String): Self = StObject.set(x, "longDynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDynamicLinkUndefined: Self = StObject.set(x, "longDynamicLink", js.undefined)
    
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
