package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageV1beta2 {
  
  @JSImport("googleapis", "storage_v1beta2.Resource$Bucketaccesscontrols")
  @js.native
  class ResourceBucketaccesscontrols protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.ResourceBucketaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta2.Resource$Buckets")
  @js.native
  class ResourceBuckets protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.ResourceBuckets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta2.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta2.Resource$Defaultobjectaccesscontrols")
  @js.native
  class ResourceDefaultobjectaccesscontrols protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.ResourceDefaultobjectaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta2.Resource$Objectaccesscontrols")
  @js.native
  class ResourceObjectaccesscontrols protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.ResourceObjectaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta2.Resource$Objects")
  @js.native
  class ResourceObjects protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.ResourceObjects {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Storage JSON API
    *
    * Lets you store and retrieve potentially-large, immutable data objects.
    *
    * @example
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta2');
    *
    * @namespace storage
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Storage
    */
  @JSImport("googleapis", "storage_v1beta2.Storage")
  @js.native
  class Storage protected ()
    extends typings.googleapis.storageV1beta2Mod.storageV1beta2.Storage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
