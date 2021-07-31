package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreV1beta2 {
  
  /**
    * Cloud Firestore API
    *
    * Accesses the NoSQL document database built for automatic scaling, high
    * performance, and ease of application development.
    *
    * @example
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta2');
    *
    * @namespace firestore
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Firestore
    */
  @JSImport("googleapis", "firestore_v1beta2.Firestore")
  @js.native
  class Firestore protected ()
    extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta2.Resource$Projects$Databases")
  @js.native
  class ResourceProjectsDatabases protected ()
    extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.ResourceProjectsDatabases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta2.Resource$Projects$Databases$Collectiongroups")
  @js.native
  class ResourceProjectsDatabasesCollectiongroups protected ()
    extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.ResourceProjectsDatabasesCollectiongroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta2.Resource$Projects$Databases$Collectiongroups$Fields")
  @js.native
  class ResourceProjectsDatabasesCollectiongroupsFields protected ()
    extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.ResourceProjectsDatabasesCollectiongroupsFields {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta2.Resource$Projects$Databases$Collectiongroups$Indexes")
  @js.native
  class ResourceProjectsDatabasesCollectiongroupsIndexes protected ()
    extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.ResourceProjectsDatabasesCollectiongroupsIndexes {
    def this(context: APIRequestContext) = this()
  }
}
