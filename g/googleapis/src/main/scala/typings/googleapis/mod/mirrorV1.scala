package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorV1 {
  
  /**
    * Google Mirror API
    *
    * Interacts with Glass users via the timeline.
    *
    * @example
    * const {google} = require('googleapis');
    * const mirror = google.mirror('v1');
    *
    * @namespace mirror
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Mirror
    */
  @JSImport("googleapis", "mirror_v1.Mirror")
  @js.native
  class Mirror protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.Mirror {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Contacts")
  @js.native
  class ResourceContacts protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceContacts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Locations")
  @js.native
  class ResourceLocations protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Settings")
  @js.native
  class ResourceSettings protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceSettings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Subscriptions")
  @js.native
  class ResourceSubscriptions protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceSubscriptions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Timeline")
  @js.native
  class ResourceTimeline protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceTimeline {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "mirror_v1.Resource$Timeline$Attachments")
  @js.native
  class ResourceTimelineAttachments protected ()
    extends typings.googleapis.mirrorV1Mod.mirrorV1.ResourceTimelineAttachments {
    def this(context: APIRequestContext) = this()
  }
}
