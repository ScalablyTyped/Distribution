package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "drive_v2")
@js.native
object drive_v2 extends js.Object {
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
  @js.native
  class Drive protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Drive {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$About protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$About {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Apps protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Apps {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Changes protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Changes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Channels protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Channels {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Children protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Children {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Comments protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Comments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Files protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Files {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Parents protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Parents {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Permissions protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Permissions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Properties protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Properties {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Realtime protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Realtime {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Replies protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Replies {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Revisions protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Revisions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Teamdrives protected ()
    extends typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Resource$Teamdrives {
    def this(context: APIRequestContext) = this()
  }
  
}

