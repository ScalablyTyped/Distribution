package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abusiveexperiencereportV1 {
  
  /**
    * Abusive Experience Report API
    *
    * Views Abusive Experience Report data, and gets a list of sites that have a
    * significant number of abusive experiences.
    *
    * @example
    * const {google} = require('googleapis');
    * const abusiveexperiencereport = google.abusiveexperiencereport('v1');
    *
    * @namespace abusiveexperiencereport
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Abusiveexperiencereport
    */
  @JSImport("googleapis", "abusiveexperiencereport_v1.Abusiveexperiencereport")
  @js.native
  class Abusiveexperiencereport protected ()
    extends typings.googleapis.v1Mod.abusiveexperiencereportV1.Abusiveexperiencereport {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "abusiveexperiencereport_v1.Resource$Sites")
  @js.native
  class ResourceSites protected ()
    extends typings.googleapis.v1Mod.abusiveexperiencereportV1.ResourceSites {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "abusiveexperiencereport_v1.Resource$Violatingsites")
  @js.native
  class ResourceViolatingsites protected ()
    extends typings.googleapis.v1Mod.abusiveexperiencereportV1.ResourceViolatingsites {
    def this(context: APIRequestContext) = this()
  }
}
