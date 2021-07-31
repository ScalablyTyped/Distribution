package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastoreV1beta1 {
  
  /**
    * Cloud Datastore API
    *
    * Accesses the schemaless NoSQL database to provide fully managed, robust,
    * scalable storage for your application.
    *
    * @example
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1beta1');
    *
    * @namespace datastore
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Datastore
    */
  @JSImport("googleapis", "datastore_v1beta1.Datastore")
  @js.native
  class Datastore protected ()
    extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "datastore_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
}
