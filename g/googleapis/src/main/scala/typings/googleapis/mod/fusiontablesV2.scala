package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusiontablesV2 {
  
  /**
    * Fusion Tables API
    *
    * API for working with Fusion Tables data.
    *
    * @example
    * const {google} = require('googleapis');
    * const fusiontables = google.fusiontables('v2');
    *
    * @namespace fusiontables
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Fusiontables
    */
  @JSImport("googleapis", "fusiontables_v2.Fusiontables")
  @js.native
  class Fusiontables protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.Fusiontables {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v2.Resource$Column")
  @js.native
  class ResourceColumn protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.ResourceColumn {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v2.Resource$Query")
  @js.native
  class ResourceQuery protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.ResourceQuery {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v2.Resource$Style")
  @js.native
  class ResourceStyle protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.ResourceStyle {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v2.Resource$Table")
  @js.native
  class ResourceTable protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.ResourceTable {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v2.Resource$Task")
  @js.native
  class ResourceTask protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.ResourceTask {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v2.Resource$Template")
  @js.native
  class ResourceTemplate protected ()
    extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.ResourceTemplate {
    def this(context: APIRequestContext) = this()
  }
}
