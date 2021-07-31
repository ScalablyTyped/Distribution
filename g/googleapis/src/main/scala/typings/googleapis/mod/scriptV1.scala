package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptV1 {
  
  @JSImport("googleapis", "script_v1.Resource$Processes")
  @js.native
  class ResourceProcesses protected ()
    extends typings.googleapis.scriptV1Mod.scriptV1.ResourceProcesses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "script_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.scriptV1Mod.scriptV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "script_v1.Resource$Projects$Deployments")
  @js.native
  class ResourceProjectsDeployments protected ()
    extends typings.googleapis.scriptV1Mod.scriptV1.ResourceProjectsDeployments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "script_v1.Resource$Projects$Versions")
  @js.native
  class ResourceProjectsVersions protected ()
    extends typings.googleapis.scriptV1Mod.scriptV1.ResourceProjectsVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "script_v1.Resource$Scripts")
  @js.native
  class ResourceScripts protected ()
    extends typings.googleapis.scriptV1Mod.scriptV1.ResourceScripts {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Apps Script API
    *
    * Manages and executes Google Apps Script projects.
    *
    * @example
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * @namespace script
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Script
    */
  @JSImport("googleapis", "script_v1.Script")
  @js.native
  class Script protected ()
    extends typings.googleapis.scriptV1Mod.scriptV1.Script {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
