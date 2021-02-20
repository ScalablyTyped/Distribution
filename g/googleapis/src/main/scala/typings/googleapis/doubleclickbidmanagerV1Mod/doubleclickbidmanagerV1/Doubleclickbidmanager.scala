package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DoubleClick Bid Manager API
  *
  * API for viewing and managing your reports in DoubleClick Bid Manager.
  *
  * @example
  * const {google} = require('googleapis');
  * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
  *
  * @namespace doubleclickbidmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Doubleclickbidmanager
  */
@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Doubleclickbidmanager")
@js.native
class Doubleclickbidmanager protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var lineitems: ResourceLineitems = js.native
  
  var queries: ResourceQueries = js.native
  
  var reports: ResourceReports = js.native
  
  var sdf: ResourceSdf = js.native
}
