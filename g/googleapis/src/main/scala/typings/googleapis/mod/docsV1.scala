package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docsV1 {
  
  /**
    * Google Docs API
    *
    * Reads and writes Google Docs documents.
    *
    * @example
    * const {google} = require('googleapis');
    * const docs = google.docs('v1');
    *
    * @namespace docs
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Docs
    */
  @JSImport("googleapis", "docs_v1.Docs")
  @js.native
  class Docs protected ()
    extends typings.googleapis.docsV1Mod.docsV1.Docs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "docs_v1.Resource$Documents")
  @js.native
  class ResourceDocuments protected ()
    extends typings.googleapis.docsV1Mod.docsV1.ResourceDocuments {
    def this(context: APIRequestContext) = this()
  }
}
