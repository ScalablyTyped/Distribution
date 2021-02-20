package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryauthorizationV1beta1 {
  
  /**
    * Binary Authorization API
    *
    * The management interface for Binary Authorization, a system providing
    * policy control for images deployed to Kubernetes Engine clusters.
    *
    * @example
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
    *
    * @namespace binaryauthorization
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Binaryauthorization
    */
  @JSImport("googleapis", "binaryauthorization_v1beta1.Binaryauthorization")
  @js.native
  class Binaryauthorization protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.Binaryauthorization {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Projects$Attestors")
  @js.native
  class ResourceProjectsAttestors protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceProjectsAttestors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Projects$Policy")
  @js.native
  class ResourceProjectsPolicy protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceProjectsPolicy {
    def this(context: APIRequestContext) = this()
  }
}
