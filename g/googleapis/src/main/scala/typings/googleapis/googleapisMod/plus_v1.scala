package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "plus_v1")
@js.native
object plus_v1 extends js.Object {
  /**
    * Google+ API
    *
    * Builds on top of the Google+ platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * @namespace plus
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Plus
    */
  @js.native
  class Plus protected ()
    extends typings.googleapis.buildSrcApisPlusV1Mod.plus_v1.Plus {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Activities protected ()
    extends typings.googleapis.buildSrcApisPlusV1Mod.plus_v1.Resource$Activities {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Comments protected ()
    extends typings.googleapis.buildSrcApisPlusV1Mod.plus_v1.Resource$Comments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$People protected ()
    extends typings.googleapis.buildSrcApisPlusV1Mod.plus_v1.Resource$People {
    def this(context: APIRequestContext) = this()
  }
  
}

