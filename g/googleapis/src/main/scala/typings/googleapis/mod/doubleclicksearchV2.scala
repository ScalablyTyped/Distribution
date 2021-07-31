package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleclicksearchV2 {
  
  /**
    * DoubleClick Search API
    *
    * Reports and modifies your advertising data in DoubleClick Search (for
    * example, campaigns, ad groups, keywords, and conversions).
    *
    * @example
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * @namespace doubleclicksearch
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Doubleclicksearch
    */
  @JSImport("googleapis", "doubleclicksearch_v2.Doubleclicksearch")
  @js.native
  class Doubleclicksearch protected ()
    extends typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.Doubleclicksearch {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "doubleclicksearch_v2.Resource$Conversion")
  @js.native
  class ResourceConversion protected ()
    extends typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.ResourceConversion {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "doubleclicksearch_v2.Resource$Reports")
  @js.native
  class ResourceReports protected ()
    extends typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.ResourceReports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "doubleclicksearch_v2.Resource$Savedcolumns")
  @js.native
  class ResourceSavedcolumns protected ()
    extends typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.ResourceSavedcolumns {
    def this(context: APIRequestContext) = this()
  }
}
