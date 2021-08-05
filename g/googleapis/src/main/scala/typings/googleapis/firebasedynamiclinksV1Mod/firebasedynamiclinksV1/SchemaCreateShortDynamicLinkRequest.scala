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
  
  inline def apply(): SchemaCreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShortDynamicLinkRequest]
  }
  
  extension [Self <: SchemaCreateShortDynamicLinkRequest](x: Self) {
    
    inline def setDynamicLinkInfo(value: SchemaDynamicLinkInfo): Self = StObject.set(x, "dynamicLinkInfo", value.asInstanceOf[js.Any])
    
    inline def setDynamicLinkInfoUndefined: Self = StObject.set(x, "dynamicLinkInfo", js.undefined)
    
    inline def setLongDynamicLink(value: String): Self = StObject.set(x, "longDynamicLink", value.asInstanceOf[js.Any])
    
    inline def setLongDynamicLinkUndefined: Self = StObject.set(x, "longDynamicLink", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setSuffix(value: SchemaSuffix): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
