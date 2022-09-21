package typings.googleapis.iamMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamV2beta {
  
  @JSImport("googleapis/build/src/apis/iam", "iam_v2beta.Iam")
  @js.native
  open class Iam protected ()
    extends typings.googleapis.iamV2betaMod.iamV2beta.Iam {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/iam", "iam_v2beta.Resource$Policies")
  @js.native
  open class ResourcePolicies protected ()
    extends typings.googleapis.iamV2betaMod.iamV2beta.ResourcePolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/iam", "iam_v2beta.Resource$Policies$Operations")
  @js.native
  open class ResourcePoliciesOperations protected ()
    extends typings.googleapis.iamV2betaMod.iamV2beta.ResourcePoliciesOperations {
    def this(context: APIRequestContext) = this()
  }
}
