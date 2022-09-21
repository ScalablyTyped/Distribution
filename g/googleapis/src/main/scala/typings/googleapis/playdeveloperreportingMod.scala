package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v1alpha1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.Options
import typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.Playdeveloperreporting
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playdeveloperreportingMod {
  
  @JSImport("googleapis/build/src/apis/playdeveloperreporting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/playdeveloperreporting", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "VERSIONS.v1alpha1")
    @js.native
    open class v1alpha1 protected () extends Playdeveloperreporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "VERSIONS.v1alpha1")
    @js.native
    def v1alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Playdeveloperreporting
      ] = js.native
    inline def v1alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Playdeveloperreporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.AwsClient")
    @js.native
    open class AwsClient protected ()
      extends typings.googleAuthLibrary.mod.AwsClient {
      /**
        * Instantiates an AwsClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid AWS credential.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: AwsClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    open class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.IdentityPoolClient")
    @js.native
    open class IdentityPoolClient protected ()
      extends typings.googleAuthLibrary.mod.IdentityPoolClient {
      /**
        * Instantiate an IdentityPoolClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid file-sourced or
        * url-sourced credential or a workforce pool user project is provided
        * with a non workforce audience.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: IdentityPoolClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.JWT")
    @js.native
    open class JWT protected ()
      extends typings.googleAuthLibrary.mod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "auth.OAuth2")
    @js.native
    /**
      * Handles OAuth2 flow for Google APIs.
      *
      * @param clientId The authentication client ID.
      * @param clientSecret The authentication client secret.
      * @param redirectUri The URI to redirect to after completing the auth
      * request.
      * @param opts optional options for overriding the given parameters.
      * @constructor
      */
    open class OAuth2 () extends OAuth2Client
    
    type _To = typings.googleapisCommon.mod.AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleapisCommon.mod.AuthPlus = ^
  }
  
  inline def playdeveloperreporting(options: Options): Playdeveloperreporting = ^.asInstanceOf[js.Dynamic].applyDynamic("playdeveloperreporting")(options.asInstanceOf[js.Any]).asInstanceOf[Playdeveloperreporting]
  inline def playdeveloperreporting(options: typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Options): typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting = ^.asInstanceOf[js.Dynamic].applyDynamic("playdeveloperreporting")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting]
  
  object playdeveloperreportingV1alpha1 {
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Playdeveloperreporting")
    @js.native
    open class Playdeveloperreporting protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.Playdeveloperreporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Anomalies")
    @js.native
    open class ResourceAnomalies protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceAnomalies {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals")
    @js.native
    open class ResourceVitals protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitals {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Anrrate")
    @js.native
    open class ResourceVitalsAnrrate protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsAnrrate {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Crashrate")
    @js.native
    open class ResourceVitalsCrashrate protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsCrashrate {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Errors")
    @js.native
    open class ResourceVitalsErrors protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsErrors {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Errors$Counts")
    @js.native
    open class ResourceVitalsErrorsCounts protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsErrorsCounts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Errors$Issues")
    @js.native
    open class ResourceVitalsErrorsIssues protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsErrorsIssues {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Errors$Reports")
    @js.native
    open class ResourceVitalsErrorsReports protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsErrorsReports {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Excessivewakeuprate")
    @js.native
    open class ResourceVitalsExcessivewakeuprate protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsExcessivewakeuprate {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1alpha1.Resource$Vitals$Stuckbackgroundwakelockrate")
    @js.native
    open class ResourceVitalsStuckbackgroundwakelockrate protected ()
      extends typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1.ResourceVitalsStuckbackgroundwakelockrate {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object playdeveloperreportingV1beta1 {
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Playdeveloperreporting")
    @js.native
    open class Playdeveloperreporting protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Resource$Anomalies")
    @js.native
    open class ResourceAnomalies protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.ResourceAnomalies {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Resource$Vitals")
    @js.native
    open class ResourceVitals protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.ResourceVitals {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Resource$Vitals$Anrrate")
    @js.native
    open class ResourceVitalsAnrrate protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.ResourceVitalsAnrrate {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Resource$Vitals$Crashrate")
    @js.native
    open class ResourceVitalsCrashrate protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.ResourceVitalsCrashrate {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Resource$Vitals$Excessivewakeuprate")
    @js.native
    open class ResourceVitalsExcessivewakeuprate protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.ResourceVitalsExcessivewakeuprate {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/playdeveloperreporting", "playdeveloperreporting_v1beta1.Resource$Vitals$Stuckbackgroundwakelockrate")
    @js.native
    open class ResourceVitalsStuckbackgroundwakelockrate protected ()
      extends typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.ResourceVitalsStuckbackgroundwakelockrate {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def playdeveloperreporting_v1alpha1(version: v1alpha1): Playdeveloperreporting = ^.asInstanceOf[js.Dynamic].applyDynamic("playdeveloperreporting")(version.asInstanceOf[js.Any]).asInstanceOf[Playdeveloperreporting]
  
  inline def playdeveloperreporting_v1beta1(version: v1beta1): typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting = ^.asInstanceOf[js.Dynamic].applyDynamic("playdeveloperreporting")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1.Playdeveloperreporting]
}
