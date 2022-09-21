package typings.googleapis.driveV2Mod.driveV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Drive")
@js.native
open class Drive protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var about: ResourceAbout = js.native
  
  var apps: ResourceApps = js.native
  
  var changes: ResourceChanges = js.native
  
  var channels: ResourceChannels = js.native
  
  var children: ResourceChildren = js.native
  
  var comments: ResourceComments = js.native
  
  var context: APIRequestContext = js.native
  
  var drives: ResourceDrives = js.native
  
  var files: ResourceFiles = js.native
  
  var parents: ResourceParents = js.native
  
  var permissions: ResourcePermissions = js.native
  
  var properties: ResourceProperties = js.native
  
  var replies: ResourceReplies = js.native
  
  var revisions: ResourceRevisions = js.native
  
  var teamdrives: ResourceTeamdrives = js.native
}
