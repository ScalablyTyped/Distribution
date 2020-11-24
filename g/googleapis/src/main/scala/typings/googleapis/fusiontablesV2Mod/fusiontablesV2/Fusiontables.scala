package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Fusiontables")
@js.native
class Fusiontables protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var column: ResourceColumn = js.native
  
  var context: APIRequestContext = js.native
  
  var query: ResourceQuery = js.native
  
  var style: ResourceStyle = js.native
  
  var table: ResourceTable = js.native
  
  var task: ResourceTask = js.native
  
  var template: ResourceTemplate = js.native
}
