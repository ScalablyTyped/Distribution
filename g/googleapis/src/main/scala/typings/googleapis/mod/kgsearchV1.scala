package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kgsearchV1 {
  
  /**
    * Knowledge Graph Search API
    *
    * Searches the Google Knowledge Graph for entities.
    *
    * @example
    * const {google} = require('googleapis');
    * const kgsearch = google.kgsearch('v1');
    *
    * @namespace kgsearch
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Kgsearch
    */
  @JSImport("googleapis", "kgsearch_v1.Kgsearch")
  @js.native
  class Kgsearch protected ()
    extends typings.googleapis.kgsearchV1Mod.kgsearchV1.Kgsearch {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "kgsearch_v1.Resource$Entities")
  @js.native
  class ResourceEntities protected ()
    extends typings.googleapis.kgsearchV1Mod.kgsearchV1.ResourceEntities {
    def this(context: APIRequestContext) = this()
  }
}
