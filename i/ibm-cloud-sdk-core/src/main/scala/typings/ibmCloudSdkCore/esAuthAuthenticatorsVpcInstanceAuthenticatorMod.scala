package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.BaseOptions
import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.TokenRequestBasedAuthenticator
import typings.ibmCloudSdkCore.esAuthTokenManagersMod.VpcInstanceTokenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsVpcInstanceAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/vpc-instance-authenticator", "VpcInstanceAuthenticator")
  @js.native
  open class VpcInstanceAuthenticator protected () extends TokenRequestBasedAuthenticator {
    /**
      * Create a new [[VpcInstanceAuthenticator]] instance.
      *
      * @param {object} [options] Configuration options for VpcInstance authentication.
      * @param {string} [options.iamProfileCrn] The CRN of the linked trusted IAM profile to be used as the identity of the compute resource.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.iamProfileId] The ID of the linked trusted IAM profile to be used when obtaining the IAM access token.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.url] The VPC Instance Metadata Service's base endpoint URL. Default value: "http://169.254.169.254"
      */
    def this(options: Options) = this()
    
    /* private */ var iamProfileCrn: Any = js.native
    
    /* private */ var iamProfileId: Any = js.native
    
    /**
      * Setter for the "profile_crn" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} A string that makes up the iamProfileCrn parameter
      */
    def setIamProfileCrn(iamProfileCrn: String): Unit = js.native
    
    /**
      * Setter for the "profile_id" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} A string that makes up the iamProfileId parameter
      */
    def setIamProfileId(iamProfileId: String): Unit = js.native
    
    /* protected */ @JSName("tokenManager")
    var tokenManager_VpcInstanceAuthenticator: VpcInstanceTokenManager = js.native
  }
  
  trait Options
    extends StObject
       with BaseOptions {
    
    /** The CRN of the linked trusted IAM profile to be used as the identity of the compute resource */
    var iamProfileCrn: js.UndefOr[String] = js.undefined
    
    /** The ID of the linked trusted IAM profile to be used when obtaining the IAM access token */
    var iamProfileId: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIamProfileCrn(value: String): Self = StObject.set(x, "iamProfileCrn", value.asInstanceOf[js.Any])
      
      inline def setIamProfileCrnUndefined: Self = StObject.set(x, "iamProfileCrn", js.undefined)
      
      inline def setIamProfileId(value: String): Self = StObject.set(x, "iamProfileId", value.asInstanceOf[js.Any])
      
      inline def setIamProfileIdUndefined: Self = StObject.set(x, "iamProfileId", js.undefined)
    }
  }
}
