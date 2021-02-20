package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebasedynamiclinksV1 {
  
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
  @JSImport("googleapis", "firebasedynamiclinks_v1.Firebasedynamiclinks")
  @js.native
  class Firebasedynamiclinks protected ()
    extends typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1.Firebasedynamiclinks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firebasedynamiclinks_v1.Resource$Managedshortlinks")
  @js.native
  class ResourceManagedshortlinks protected ()
    extends typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1.ResourceManagedshortlinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebasedynamiclinks_v1.Resource$Shortlinks")
  @js.native
  class ResourceShortlinks protected ()
    extends typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1.ResourceShortlinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebasedynamiclinks_v1.Resource$V1")
  @js.native
  class ResourceV1 protected ()
    extends typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1.ResourceV1 {
    def this(context: APIRequestContext) = this()
  }
}
