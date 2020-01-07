package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "fusiontables_v1")
@js.native
object fusiontables_v1 extends js.Object {
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
  @js.native
  class Fusiontables protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Fusiontables {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Column protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Resource$Column {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Query protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Resource$Query {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Style protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Resource$Style {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Table protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Resource$Table {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Task protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Resource$Task {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Template protected ()
    extends typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1.Resource$Template {
    def this(context: APIRequestContext) = this()
  }
  
}

