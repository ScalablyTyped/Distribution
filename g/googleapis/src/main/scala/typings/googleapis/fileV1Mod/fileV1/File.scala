package typings.googleapis.fileV1Mod.fileV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Filestore API
  *
  * The Cloud Filestore API is used for creating and managing cloud file
  * servers.
  *
  * @example
  * const {google} = require('googleapis');
  * const file = google.file('v1');
  *
  * @namespace file
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for File
  */
@JSImport("googleapis/build/src/apis/file/v1", "file_v1.File")
@js.native
class File protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
