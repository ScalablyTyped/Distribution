package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Firebase Dynamic Links API
  *
  * Programmatically creates and manages Firebase Dynamic Links.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
  *
  * @namespace firebasedynamiclinks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firebasedynamiclinks
  */
@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Firebasedynamiclinks")
@js.native
class Firebasedynamiclinks protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var managedShortLinks: ResourceManagedshortlinks = js.native
  
  var shortLinks: ResourceShortlinks = js.native
  
  var v1: ResourceV1 = js.native
}
