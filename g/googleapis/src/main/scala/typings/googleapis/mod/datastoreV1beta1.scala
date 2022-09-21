package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastoreV1beta1 {
  
  @JSImport("googleapis", "datastore_v1beta1.Datastore")
  @js.native
  open class Datastore protected ()
    extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "datastore_v1beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
}
