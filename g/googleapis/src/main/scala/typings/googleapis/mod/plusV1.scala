package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plusV1 {
  
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
  @JSImport("googleapis", "plus_v1.Plus")
  @js.native
  class Plus protected ()
    extends typings.googleapis.plusV1Mod.plusV1.Plus {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "plus_v1.Resource$Activities")
  @js.native
  class ResourceActivities protected ()
    extends typings.googleapis.plusV1Mod.plusV1.ResourceActivities {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plus_v1.Resource$Comments")
  @js.native
  class ResourceComments protected ()
    extends typings.googleapis.plusV1Mod.plusV1.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plus_v1.Resource$People")
  @js.native
  class ResourcePeople protected ()
    extends typings.googleapis.plusV1Mod.plusV1.ResourcePeople {
    def this(context: APIRequestContext) = this()
  }
}
