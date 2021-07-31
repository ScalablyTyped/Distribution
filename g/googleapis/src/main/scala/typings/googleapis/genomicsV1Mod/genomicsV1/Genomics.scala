package typings.googleapis.genomicsV1Mod.genomicsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Genomics API
  *
  * Uploads, processes, queries, and searches Genomics data in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const genomics = google.genomics('v1');
  *
  * @namespace genomics
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Genomics
  */
@JSImport("googleapis/build/src/apis/genomics/v1", "genomics_v1.Genomics")
@js.native
class Genomics protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
}
