package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoosePrivateKeyRule extends StObject {
  
  // tslint:disable:max-line-length
  /**
    * The package names to which this rule applies. The hash of the signing certificate for each app is verified against the hash provided by Play. If no package names are specified, then
    * the alias is provided to all apps that call KeyChain.choosePrivateKeyAlias
    * (https://developer.android.com/reference/android/security/KeyChain#choosePrivateKeyAlias%28android.app.Activity,%20android.security.KeyChainAliasCallback,%20java.lang.String[],%20java.security.Principal[],%20java.lang.String,%20int,%20java.lang.String%29)
    * or any overloads (but not without calling KeyChain.choosePrivateKeyAlias, even on Android 11 and above). Any app with the same Android UID as a package specified here will have
    * access when they call KeyChain.choosePrivateKeyAlias.
    */
  // tslint:enable:max-line-length
  var packageNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The alias of the private key to be used. */
  var privateKeyAlias: js.UndefOr[String] = js.undefined
  
  /** The URL pattern to match against the URL of the request. If not set or empty, it matches all URLs. This uses the regular expression syntax of java.util.regex.Pattern. */
  var urlPattern: js.UndefOr[String] = js.undefined
}
object ChoosePrivateKeyRule {
  
  inline def apply(): ChoosePrivateKeyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoosePrivateKeyRule]
  }
  
  extension [Self <: ChoosePrivateKeyRule](x: Self) {
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
    
    inline def setPrivateKeyAlias(value: String): Self = StObject.set(x, "privateKeyAlias", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAliasUndefined: Self = StObject.set(x, "privateKeyAlias", js.undefined)
    
    inline def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}
