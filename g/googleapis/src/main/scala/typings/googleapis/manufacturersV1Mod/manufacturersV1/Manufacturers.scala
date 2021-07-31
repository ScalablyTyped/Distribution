package typings.googleapis.manufacturersV1Mod.manufacturersV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manufacturer Center API
  *
  * Public API for managing Manufacturer Center related data.
  *
  * @example
  * const {google} = require('googleapis');
  * const manufacturers = google.manufacturers('v1');
  *
  * @namespace manufacturers
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Manufacturers
  */
@JSImport("googleapis/build/src/apis/manufacturers/v1", "manufacturers_v1.Manufacturers")
@js.native
class Manufacturers protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var context: APIRequestContext = js.native
}
