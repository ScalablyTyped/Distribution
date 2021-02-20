package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appstateV1 {
  
  /**
    * Google App State API
    *
    * The Google App State API.
    *
    * @example
    * const {google} = require('googleapis');
    * const appstate = google.appstate('v1');
    *
    * @namespace appstate
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Appstate
    */
  @JSImport("googleapis", "appstate_v1.Appstate")
  @js.native
  class Appstate protected ()
    extends typings.googleapis.appstateV1Mod.appstateV1.Appstate {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "appstate_v1.Resource$States")
  @js.native
  class ResourceStates protected ()
    extends typings.googleapis.appstateV1Mod.appstateV1.ResourceStates {
    def this(context: APIRequestContext) = this()
  }
}
