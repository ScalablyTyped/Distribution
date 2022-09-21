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
import typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.Datalabeling
import typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.Options
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datalabelingMod {
  
  @JSImport("googleapis/build/src/apis/datalabeling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/datalabeling", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/datalabeling", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datalabeling", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected () extends Datalabeling {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/datalabeling", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Datalabeling
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Datalabeling
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/datalabeling", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/datalabeling", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/datalabeling", "auth.OAuth2")
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
  
  inline def datalabeling(options: Options): Datalabeling = ^.asInstanceOf[js.Dynamic].applyDynamic("datalabeling")(options.asInstanceOf[js.Any]).asInstanceOf[Datalabeling]
  
  object datalabelingV1beta1 {
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Datalabeling")
    @js.native
    open class Datalabeling protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.Datalabeling {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Annotationspecsets")
    @js.native
    open class ResourceProjectsAnnotationspecsets protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsAnnotationspecsets {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets")
    @js.native
    open class ResourceProjectsDatasets protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasets {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets")
    @js.native
    open class ResourceProjectsDatasetsAnnotateddatasets protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsAnnotateddatasets {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Dataitems")
    @js.native
    open class ResourceProjectsDatasetsAnnotateddatasetsDataitems protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsAnnotateddatasetsDataitems {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Examples")
    @js.native
    open class ResourceProjectsDatasetsAnnotateddatasetsExamples protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsAnnotateddatasetsExamples {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Feedbackthreads")
    @js.native
    open class ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreads protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreads {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Feedbackthreads$Feedbackmessages")
    @js.native
    open class ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessages protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Dataitems")
    @js.native
    open class ResourceProjectsDatasetsDataitems protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsDataitems {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Evaluations")
    @js.native
    open class ResourceProjectsDatasetsEvaluations protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsEvaluations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Evaluations$Examplecomparisons")
    @js.native
    open class ResourceProjectsDatasetsEvaluationsExamplecomparisons protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsEvaluationsExamplecomparisons {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Image")
    @js.native
    open class ResourceProjectsDatasetsImage protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsImage {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Text")
    @js.native
    open class ResourceProjectsDatasetsText protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsText {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Datasets$Video")
    @js.native
    open class ResourceProjectsDatasetsVideo protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsDatasetsVideo {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Evaluationjobs")
    @js.native
    open class ResourceProjectsEvaluationjobs protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsEvaluationjobs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Evaluations")
    @js.native
    open class ResourceProjectsEvaluations protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsEvaluations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Instructions")
    @js.native
    open class ResourceProjectsInstructions protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsInstructions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datalabeling", "datalabeling_v1beta1.Resource$Projects$Operations")
    @js.native
    open class ResourceProjectsOperations protected ()
      extends typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1.ResourceProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def datalabeling_v1beta1(version: v1beta1): Datalabeling = ^.asInstanceOf[js.Dynamic].applyDynamic("datalabeling")(version.asInstanceOf[js.Any]).asInstanceOf[Datalabeling]
}
