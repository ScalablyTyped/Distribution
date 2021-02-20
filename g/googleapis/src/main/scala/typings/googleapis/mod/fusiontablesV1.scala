package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusiontablesV1 {
  
  /**
    * Fusion Tables API
    *
    * API for working with Fusion Tables data.
    *
    * @example
    * const {google} = require('googleapis');
    * const fusiontables = google.fusiontables('v1');
    *
    * @namespace fusiontables
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Fusiontables
    */
  @JSImport("googleapis", "fusiontables_v1.Fusiontables")
  @js.native
  class Fusiontables protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.Fusiontables {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v1.Resource$Column")
  @js.native
  class ResourceColumn protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.ResourceColumn {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v1.Resource$Query")
  @js.native
  class ResourceQuery protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.ResourceQuery {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v1.Resource$Style")
  @js.native
  class ResourceStyle protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.ResourceStyle {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v1.Resource$Table")
  @js.native
  class ResourceTable protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.ResourceTable {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v1.Resource$Task")
  @js.native
  class ResourceTask protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.ResourceTask {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fusiontables_v1.Resource$Template")
  @js.native
  class ResourceTemplate protected ()
    extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.ResourceTemplate {
    def this(context: APIRequestContext) = this()
  }
}
