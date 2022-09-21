package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastoreV1beta3 {
  
  @JSImport("googleapis", "datastore_v1beta3.Datastore")
  @js.native
  open class Datastore protected ()
    extends typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "datastore_v1beta3.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.v1beta3Mod.datastoreV1beta3.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
}
