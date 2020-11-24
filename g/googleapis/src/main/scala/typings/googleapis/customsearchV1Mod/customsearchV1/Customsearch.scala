package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomSearch API
  *
  * Searches over a website or collection of websites
  *
  * @example
  * const {google} = require('googleapis');
  * const customsearch = google.customsearch('v1');
  *
  * @namespace customsearch
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Customsearch
  */
@JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Customsearch")
@js.native
class Customsearch protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var cse: ResourceCse = js.native
}
