package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssetlinksCheck
  extends StObject
     with StandardParameters {
  
  /**
    * Query string for the relation. We identify relations with strings of the format `/`, where `` must be one of a set of pre-defined purpose categories, and `` is a free-form lowercase alphanumeric string that describes the specific use case of the statement. Refer to [our API documentation](/digital-asset-links/v1/relation-strings) for the current list of supported relations. For a query to match an asset link, both the query's and the asset link's relation strings must match exactly. Example: A query with relation `delegate_permission/common.handle_all_urls` matches an asset link with relation `delegate_permission/common.handle_all_urls`.
    */
  var relation: js.UndefOr[String] = js.undefined
  
  /**
    * The uppercase SHA-265 fingerprint of the certificate. From the PEM certificate, it can be acquired like this: $ keytool -printcert -file $CERTFILE | grep SHA256: SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \ 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 or like this: $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256 SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \ 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`. If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
    */
  @JSName("source.androidApp.certificate.sha256Fingerprint")
  var sourceDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    */
  @JSName("source.androidApp.packageName")
  var sourceDotandroidAppDotpackageName: js.UndefOr[String] = js.undefined
  
  /**
    * Web assets are identified by a URL that contains only the scheme, hostname and port parts. The format is http[s]://[:] Hostnames must be fully qualified: they must end in a single period ("`.`"). Only the schemes "http" and "https" are currently allowed. Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https. We call this limited URL the "site". All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset. Example: the asset with the site `https://www.google.com` contains all these URLs: * `https://www.google.com/` * `https://www.google.com:443/` * `https://www.google.com/foo` * `https://www.google.com/foo?bar` * `https://www.google.com/foo#bar` * `https://user@password:www.google.com/` But it does not contain these URLs: * `http://www.google.com/` (wrong scheme) * `https://google.com/` (hostname does not match) * `https://www.google.com:444/` (port does not match) REQUIRED
    */
  @JSName("source.web.site")
  var sourceDotwebDotsite: js.UndefOr[String] = js.undefined
  
  /**
    * The uppercase SHA-265 fingerprint of the certificate. From the PEM certificate, it can be acquired like this: $ keytool -printcert -file $CERTFILE | grep SHA256: SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \ 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 or like this: $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256 SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \ 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`. If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
    */
  @JSName("target.androidApp.certificate.sha256Fingerprint")
  var targetDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    */
  @JSName("target.androidApp.packageName")
  var targetDotandroidAppDotpackageName: js.UndefOr[String] = js.undefined
  
  /**
    * Web assets are identified by a URL that contains only the scheme, hostname and port parts. The format is http[s]://[:] Hostnames must be fully qualified: they must end in a single period ("`.`"). Only the schemes "http" and "https" are currently allowed. Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https. We call this limited URL the "site". All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset. Example: the asset with the site `https://www.google.com` contains all these URLs: * `https://www.google.com/` * `https://www.google.com:443/` * `https://www.google.com/foo` * `https://www.google.com/foo?bar` * `https://www.google.com/foo#bar` * `https://user@password:www.google.com/` But it does not contain these URLs: * `http://www.google.com/` (wrong scheme) * `https://google.com/` (hostname does not match) * `https://www.google.com:444/` (port does not match) REQUIRED
    */
  @JSName("target.web.site")
  var targetDotwebDotsite: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssetlinksCheck {
  
  inline def apply(): ParamsResourceAssetlinksCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetlinksCheck]
  }
  
  extension [Self <: ParamsResourceAssetlinksCheck](x: Self) {
    
    inline def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
    
    inline def setSourceDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = StObject.set(x, "source.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSourceDotandroidAppDotcertificateDotsha256FingerprintUndefined: Self = StObject.set(x, "source.androidApp.certificate.sha256Fingerprint", js.undefined)
    
    inline def setSourceDotandroidAppDotpackageName(value: String): Self = StObject.set(x, "source.androidApp.packageName", value.asInstanceOf[js.Any])
    
    inline def setSourceDotandroidAppDotpackageNameUndefined: Self = StObject.set(x, "source.androidApp.packageName", js.undefined)
    
    inline def setSourceDotwebDotsite(value: String): Self = StObject.set(x, "source.web.site", value.asInstanceOf[js.Any])
    
    inline def setSourceDotwebDotsiteUndefined: Self = StObject.set(x, "source.web.site", js.undefined)
    
    inline def setTargetDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = StObject.set(x, "target.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setTargetDotandroidAppDotcertificateDotsha256FingerprintUndefined: Self = StObject.set(x, "target.androidApp.certificate.sha256Fingerprint", js.undefined)
    
    inline def setTargetDotandroidAppDotpackageName(value: String): Self = StObject.set(x, "target.androidApp.packageName", value.asInstanceOf[js.Any])
    
    inline def setTargetDotandroidAppDotpackageNameUndefined: Self = StObject.set(x, "target.androidApp.packageName", js.undefined)
    
    inline def setTargetDotwebDotsite(value: String): Self = StObject.set(x, "target.web.site", value.asInstanceOf[js.Any])
    
    inline def setTargetDotwebDotsiteUndefined: Self = StObject.set(x, "target.web.site", js.undefined)
  }
}
