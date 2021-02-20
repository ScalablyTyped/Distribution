package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driveV3 {
  
  /**
    * Drive API
    *
    * Manages files in Drive including uploading, downloading, searching,
    * detecting changes, and updating sharing permissions.
    *
    * @example
    * const {google} = require('googleapis');
    * const drive = google.drive('v3');
    *
    * @namespace drive
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Drive
    */
  @JSImport("googleapis", "drive_v3.Drive")
  @js.native
  class Drive protected ()
    extends typings.googleapis.driveV3Mod.driveV3.Drive {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$About")
  @js.native
  class ResourceAbout protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceAbout {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Changes")
  @js.native
  class ResourceChanges protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceChanges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Comments")
  @js.native
  class ResourceComments protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Files")
  @js.native
  class ResourceFiles protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceFiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Permissions")
  @js.native
  class ResourcePermissions protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourcePermissions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Replies")
  @js.native
  class ResourceReplies protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceReplies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Revisions")
  @js.native
  class ResourceRevisions protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceRevisions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v3.Resource$Teamdrives")
  @js.native
  class ResourceTeamdrives protected ()
    extends typings.googleapis.driveV3Mod.driveV3.ResourceTeamdrives {
    def this(context: APIRequestContext) = this()
  }
}
