package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageV1 {
  
  @JSImport("googleapis", "storage_v1.Resource$Bucketaccesscontrols")
  @js.native
  class ResourceBucketaccesscontrols protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceBucketaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Buckets")
  @js.native
  class ResourceBuckets protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceBuckets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Defaultobjectaccesscontrols")
  @js.native
  class ResourceDefaultobjectaccesscontrols protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceDefaultobjectaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Notifications")
  @js.native
  class ResourceNotifications protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceNotifications {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Objectaccesscontrols")
  @js.native
  class ResourceObjectaccesscontrols protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceObjectaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Objects")
  @js.native
  class ResourceObjects protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceObjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1.Resource$Projects$Serviceaccount")
  @js.native
  class ResourceProjectsServiceaccount protected ()
    extends typings.googleapis.storageV1Mod.storageV1.ResourceProjectsServiceaccount {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Storage JSON API
    *
    * Stores and retrieves potentially large, immutable data objects.
    *
    * @example
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * @namespace storage
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Storage
    */
  @JSImport("googleapis", "storage_v1.Storage")
  @js.native
  class Storage protected ()
    extends typings.googleapis.storageV1Mod.storageV1.Storage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
