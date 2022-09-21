package typings.googleapis

import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleclickbidmanagerV1Mod {
  
  object doubleclickbidmanagerV1 {
    
    /**
      * DoubleClick Bid Manager API
      *
      * DoubleClick Bid Manager API allows users to manage and create campaigns and reports.
      *
      * @example
      * ```js
      * const {google} = require('googleapis');
      * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
      * ```
      */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Doubleclickbidmanager")
    @js.native
    open class Doubleclickbidmanager protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
