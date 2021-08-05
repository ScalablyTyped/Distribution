package typings.maximMazurokGapiClientDigitalassetlinks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDigitalassetlinks.anon.Accesstoken
import typings.maximMazurokGapiClientDigitalassetlinks.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object digitalassetlinks {
      
      trait AndroidAppAsset extends StObject {
        
        /**
          * Because there is no global enforcement of package name uniqueness, we also require a signing certificate, which in combination with the package name uniquely identifies an app. Some
          * apps' signing keys are rotated, so they may be signed by different keys over time. We treat these as distinct assets, since we use (package name, cert) as the unique ID. This should
          * not normally pose any problems as both versions of the app will make the same or similar statements. Other assets making statements about the app will have to be updated when a key
          * is rotated, however. (Note that the syntaxes for publishing and querying for statements contain syntactic sugar to easily let you specify apps that are known by multiple
          * certificates.) REQUIRED
          */
        var certificate: js.UndefOr[CertificateInfo] = js.undefined
        
        /** Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED */
        var packageName: js.UndefOr[String] = js.undefined
      }
      object AndroidAppAsset {
        
        inline def apply(): AndroidAppAsset = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AndroidAppAsset]
        }
        
        extension [Self <: AndroidAppAsset](x: Self) {
          
          inline def setCertificate(value: CertificateInfo): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
          
          inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
          
          inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
          
          inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        }
      }
      
      trait Asset extends StObject {
        
        /** Set if this is an Android App asset. */
        var androidApp: js.UndefOr[AndroidAppAsset] = js.undefined
        
        /** Set if this is a web asset. */
        var web: js.UndefOr[WebAsset] = js.undefined
      }
      object Asset {
        
        inline def apply(): Asset = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Asset]
        }
        
        extension [Self <: Asset](x: Self) {
          
          inline def setAndroidApp(value: AndroidAppAsset): Self = StObject.set(x, "androidApp", value.asInstanceOf[js.Any])
          
          inline def setAndroidAppUndefined: Self = StObject.set(x, "androidApp", js.undefined)
          
          inline def setWeb(value: WebAsset): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
          
          inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
        }
      }
      
      @js.native
      trait AssetlinksResource extends StObject {
        
        /**
          * Determines whether the specified (directional) relationship exists between the specified source and target assets. The relation describes the intent of the link between the two
          * assets as claimed by the source asset. An example for such relationships is the delegation of privileges or permissions. This command is most often used by infrastructure systems to
          * check preconditions for an action. For example, a client may want to know if it is OK to send a web URL to a particular mobile app instead. The client can check for the relevant
          * asset link from the website to the mobile app to decide if the operation should be allowed. A note about security: if you specify a secure asset as the source, such as an HTTPS
          * website or an Android app, the API will ensure that any statements used to generate the response have been made in a secure way by the owner of that asset. Conversely, if the source
          * asset is an insecure HTTP website (that is, the URL starts with `http://` instead of `https://`), the API cannot verify its statements securely, and it is not possible to ensure
          * that the website's statements have not been altered by a third party. For more information, see the [Digital Asset Links technical design
          * specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md).
          */
        def check(): Request[CheckResponse] = js.native
        def check(request: Accesstoken): Request[CheckResponse] = js.native
      }
      
      trait CertificateInfo extends StObject {
        
        /**
          * The uppercase SHA-265 fingerprint of the certificate. From the PEM certificate, it can be acquired like this: $ keytool -printcert -file $CERTFILE | grep SHA256: SHA256:
          * 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \ 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 or like this: $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256 SHA256
          * Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \ 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 In this example, the contents of this field would be
          * `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`. If these tools are not available to you, you can convert the PEM certificate
          * into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by
          * colons).
          */
        var sha256Fingerprint: js.UndefOr[String] = js.undefined
      }
      object CertificateInfo {
        
        inline def apply(): CertificateInfo = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CertificateInfo]
        }
        
        extension [Self <: CertificateInfo](x: Self) {
          
          inline def setSha256Fingerprint(value: String): Self = StObject.set(x, "sha256Fingerprint", value.asInstanceOf[js.Any])
          
          inline def setSha256FingerprintUndefined: Self = StObject.set(x, "sha256Fingerprint", js.undefined)
        }
      }
      
      trait CheckResponse extends StObject {
        
        /**
          * Human-readable message containing information intended to help end users understand, reproduce and debug the result. The message will be in English and we are currently not planning
          * to offer any translations. Please note that no guarantees are made about the contents or format of this string. Any aspect of it may be subject to change without notice. You should
          * not attempt to programmatically parse this data. For programmatic access, use the error_code field below.
          */
        var debugString: js.UndefOr[String] = js.undefined
        
        /** Error codes that describe the result of the Check operation. */
        var errorCode: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Set to true if the assets specified in the request are linked by the relation specified in the request. */
        var linked: js.UndefOr[Boolean] = js.undefined
        
        /** From serving time, how much longer the response should be considered valid barring further updates. REQUIRED */
        var maxAge: js.UndefOr[String] = js.undefined
      }
      object CheckResponse {
        
        inline def apply(): CheckResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CheckResponse]
        }
        
        extension [Self <: CheckResponse](x: Self) {
          
          inline def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
          
          inline def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
          
          inline def setErrorCode(value: js.Array[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
          
          inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
          
          inline def setErrorCodeVarargs(value: String*): Self = StObject.set(x, "errorCode", js.Array(value :_*))
          
          inline def setLinked(value: Boolean): Self = StObject.set(x, "linked", value.asInstanceOf[js.Any])
          
          inline def setLinkedUndefined: Self = StObject.set(x, "linked", js.undefined)
          
          inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
          
          inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
        }
      }
      
      trait ListResponse extends StObject {
        
        /**
          * Human-readable message containing information intended to help end users understand, reproduce and debug the result. The message will be in English and we are currently not planning
          * to offer any translations. Please note that no guarantees are made about the contents or format of this string. Any aspect of it may be subject to change without notice. You should
          * not attempt to programmatically parse this data. For programmatic access, use the error_code field below.
          */
        var debugString: js.UndefOr[String] = js.undefined
        
        /** Error codes that describe the result of the List operation. */
        var errorCode: js.UndefOr[js.Array[String]] = js.undefined
        
        /** From serving time, how much longer the response should be considered valid barring further updates. REQUIRED */
        var maxAge: js.UndefOr[String] = js.undefined
        
        /** A list of all the matching statements that have been found. */
        var statements: js.UndefOr[js.Array[Statement]] = js.undefined
      }
      object ListResponse {
        
        inline def apply(): ListResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListResponse]
        }
        
        extension [Self <: ListResponse](x: Self) {
          
          inline def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
          
          inline def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
          
          inline def setErrorCode(value: js.Array[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
          
          inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
          
          inline def setErrorCodeVarargs(value: String*): Self = StObject.set(x, "errorCode", js.Array(value :_*))
          
          inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
          
          inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
          
          inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
          
          inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
          
          inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
        }
      }
      
      trait Statement extends StObject {
        
        /**
          * The relation identifies the use of the statement as intended by the source asset's owner (that is, the person or entity who issued the statement). Every complete statement has a
          * relation. We identify relations with strings of the format `/`, where `` must be one of a set of pre-defined purpose categories, and `` is a free-form lowercase alphanumeric string
          * that describes the specific use case of the statement. Refer to [our API documentation](/digital-asset-links/v1/relation-strings) for the current list of supported relations.
          * Example: `delegate_permission/common.handle_all_urls` REQUIRED
          */
        var relation: js.UndefOr[String] = js.undefined
        
        /** Every statement has a source asset. REQUIRED */
        var source: js.UndefOr[Asset] = js.undefined
        
        /** Every statement has a target asset. REQUIRED */
        var target: js.UndefOr[Asset] = js.undefined
      }
      object Statement {
        
        inline def apply(): Statement = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Statement]
        }
        
        extension [Self <: Statement](x: Self) {
          
          inline def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
          
          inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
          
          inline def setSource(value: Asset): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
          
          inline def setTarget(value: Asset): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
          
          inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        }
      }
      
      @js.native
      trait StatementsResource extends StObject {
        
        /**
          * Retrieves a list of all statements from a given source that match the specified target and statement string. The API guarantees that all statements with secure source assets, such
          * as HTTPS websites or Android apps, have been made in a secure way by the owner of those assets, as described in the [Digital Asset Links technical design
          * specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md). Specifically, you should consider that for insecure websites (that is, where the URL
          * starts with `http://` instead of `https://`), this guarantee cannot be made. The `List` command is most useful in cases where the API client wants to know all the ways in which two
          * assets are related, or enumerate all the relationships from a particular source asset. Example: a feature that helps users navigate to related items. When a mobile app is running on
          * a device, the feature would make it easy to navigate to the corresponding web site or Google+ profile.
          */
        def list(): Request[ListResponse] = js.native
        def list(request: Alt): Request[ListResponse] = js.native
      }
      
      trait WebAsset extends StObject {
        
        /**
          * Web assets are identified by a URL that contains only the scheme, hostname and port parts. The format is http[s]://[:] Hostnames must be fully qualified: they must end in a single
          * period ("`.`"). Only the schemes "http" and "https" are currently allowed. Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are
          * used: 80 for http and 443 for https. We call this limited URL the "site". All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus
          * belong to the web asset. Example: the asset with the site `https://www.google.com` contains all these URLs: * `https://www.google.com/` * `https://www.google.com:443/` *
          * `https://www.google.com/foo` * `https://www.google.com/foo?bar` * `https://www.google.com/foo#bar` * `https://user@password:www.google.com/` But it does not contain these URLs: *
          * `http://www.google.com/` (wrong scheme) * `https://google.com/` (hostname does not match) * `https://www.google.com:444/` (port does not match) REQUIRED
          */
        var site: js.UndefOr[String] = js.undefined
      }
      object WebAsset {
        
        inline def apply(): WebAsset = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WebAsset]
        }
        
        extension [Self <: WebAsset](x: Self) {
          
          inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
          
          inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
        }
      }
    }
  }
}
