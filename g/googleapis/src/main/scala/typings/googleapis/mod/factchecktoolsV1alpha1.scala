package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factchecktoolsV1alpha1 {
  
  /**
    * Fact Check Tools API
    *
    *
    *
    * @example
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
    *
    * @namespace factchecktools
    * @type {Function}
    * @version v1alpha1
    * @variation v1alpha1
    * @param {object=} options Options for Factchecktools
    */
  @JSImport("googleapis", "factchecktools_v1alpha1.Factchecktools")
  @js.native
  class Factchecktools protected ()
    extends typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1.Factchecktools {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "factchecktools_v1alpha1.Resource$Claims")
  @js.native
  class ResourceClaims protected ()
    extends typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1.ResourceClaims {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "factchecktools_v1alpha1.Resource$Pages")
  @js.native
  class ResourcePages protected ()
    extends typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1.ResourcePages {
    def this(context: APIRequestContext) = this()
  }
}
