package typings.googleapis.webriskV1Mod.webriskV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webrisk/v1", "webrisk_v1.Webrisk")
@js.native
open class Webrisk protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var hashes: ResourceHashes = js.native
  
  var projects: ResourceProjects = js.native
  
  var threatLists: ResourceThreatlists = js.native
  
  var uris: ResourceUris = js.native
}
