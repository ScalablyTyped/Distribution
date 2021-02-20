package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driveV2 {
  
  /**
    * Drive API
    *
    * Manages files in Drive including uploading, downloading, searching,
    * detecting changes, and updating sharing permissions.
    *
    * @example
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * @namespace drive
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Drive
    */
  @JSImport("googleapis", "drive_v2.Drive")
  @js.native
  class Drive protected ()
    extends typings.googleapis.driveV2Mod.driveV2.Drive {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$About")
  @js.native
  class ResourceAbout protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceAbout {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Apps")
  @js.native
  class ResourceApps protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceApps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Changes")
  @js.native
  class ResourceChanges protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceChanges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Children")
  @js.native
  class ResourceChildren protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceChildren {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Comments")
  @js.native
  class ResourceComments protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Files")
  @js.native
  class ResourceFiles protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceFiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Parents")
  @js.native
  class ResourceParents protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceParents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Permissions")
  @js.native
  class ResourcePermissions protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourcePermissions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Properties")
  @js.native
  class ResourceProperties protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceProperties {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Realtime")
  @js.native
  class ResourceRealtime protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceRealtime {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Replies")
  @js.native
  class ResourceReplies protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceReplies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Revisions")
  @js.native
  class ResourceRevisions protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceRevisions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "drive_v2.Resource$Teamdrives")
  @js.native
  class ResourceTeamdrives protected ()
    extends typings.googleapis.driveV2Mod.driveV2.ResourceTeamdrives {
    def this(context: APIRequestContext) = this()
  }
}
