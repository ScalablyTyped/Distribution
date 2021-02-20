package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tag Manager API
  *
  * Accesses Tag Manager accounts and containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const tagmanager = google.tagmanager('v2');
  *
  * @namespace tagmanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Tagmanager
  */
@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Tagmanager")
@js.native
class Tagmanager protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var context: APIRequestContext = js.native
}
