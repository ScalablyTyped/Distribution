package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "drive_v3")
@js.native
object drive_v3 extends js.Object {
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
  @js.native
  class Drive protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Drive {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$About protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$About {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Changes protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Changes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Channels protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Channels {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Comments protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Comments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Files protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Files {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Permissions protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Permissions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Replies protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Replies {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Revisions protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Revisions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Teamdrives protected ()
    extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Resource$Teamdrives {
    def this(context: APIRequestContext) = this()
  }
  
}

