package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "factchecktools_v1alpha1")
@js.native
object factchecktools_v1alpha1 extends js.Object {
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
  @js.native
  class Factchecktools protected ()
    extends typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1.Factchecktools {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Claims protected ()
    extends typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1.Resource$Claims {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Pages protected ()
    extends typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1.Resource$Pages {
    def this(context: APIRequestContext) = this()
  }
  
}

