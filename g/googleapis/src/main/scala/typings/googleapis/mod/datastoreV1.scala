package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastoreV1 {
  
  /**
    * Cloud Datastore API
    *
    * Accesses the schemaless NoSQL database to provide fully managed, robust,
    * scalable storage for your application.
    *
    * @example
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
    *
    * @namespace datastore
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Datastore
    */
  @JSImport("googleapis", "datastore_v1.Datastore")
  @js.native
  class Datastore protected ()
    extends typings.googleapis.datastoreV1Mod.datastoreV1.Datastore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "datastore_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.datastoreV1Mod.datastoreV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "datastore_v1.Resource$Projects$Indexes")
  @js.native
  class ResourceProjectsIndexes protected ()
    extends typings.googleapis.datastoreV1Mod.datastoreV1.ResourceProjectsIndexes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "datastore_v1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.datastoreV1Mod.datastoreV1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
}
