package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManager
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersVpcInstanceTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/vpc-instance-token-manager", "VpcInstanceTokenManager")
  @js.native
  open class VpcInstanceTokenManager protected () extends JwtTokenManager {
    /**
      * Create a new [[VpcInstanceTokenManager]] instance.
      *
      * @param {object} [options] Configuration options.
      * @param {string} [options.iamProfileCrn] The CRN of the linked trusted IAM profile to be used as the identity of the compute resource.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.iamProfileId] The ID of the linked trusted IAM profile to be used when obtaining the IAM access token.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.url] The VPC Instance Metadata Service's base endpoint URL. Default value: "http://169.254.169.254"
      * @constructor
      */
    def this(options: Options) = this()
    
    /* private */ var getInstanceIdentityToken: Any = js.native
    
    /* private */ var iamProfileCrn: Any = js.native
    
    /* private */ var iamProfileId: Any = js.native
    
    /**
      * Setter for the "trusted_profile" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} iamProfileCrn A string that makes up the iamProfileCrn parameter
      */
    def setIamProfileCrn(iamProfileCrn: String): Unit = js.native
    
    /**
      * Setter for the "trusted_profile" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} iamProfileId A string that makes up the iamProfileId parameter
      */
    def setIamProfileId(iamProfileId: String): Unit = js.native
  }
  
  /** Configuration options for VPC token retrieval. */
  trait Options
    extends StObject
       with TokenManagerOptions {
    
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
