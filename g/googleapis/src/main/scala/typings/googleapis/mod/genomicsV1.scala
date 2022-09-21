package typings.googleapis.mod

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genomicsV1 {
  
  /**
    * Genomics API
    *
    * Uploads, processes, queries, and searches Genomics data in the cloud.
    *
    * @example
    * ```js
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1');
    * ```
    */
  @JSImport("googleapis", "genomics_v1.Genomics")
  @js.native
  open class Genomics protected ()
    extends typings.googleapis.genomicsV1Mod.genomicsV1.Genomics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
