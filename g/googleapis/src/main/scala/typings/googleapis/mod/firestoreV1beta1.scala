package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreV1beta1 {
  
  @JSImport("googleapis", "firestore_v1beta1.Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects$Databases")
  @js.native
  open class ResourceProjectsDatabases protected ()
    extends typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjectsDatabases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects$Databases$Documents")
  @js.native
  open class ResourceProjectsDatabasesDocuments protected ()
    extends typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjectsDatabasesDocuments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects$Databases$Indexes")
  @js.native
  open class ResourceProjectsDatabasesIndexes protected ()
    extends typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjectsDatabasesIndexes {
    def this(context: APIRequestContext) = this()
  }
}
