package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsDestination extends StObject {
  
  /**
    * The uri of the Cloud Storage object. It's the same uri that is used by gsutil. Example: "gs://bucket_name/object_name". See [Viewing and Editing Object
    * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata) for more information.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * The uri prefix of all generated Cloud Storage objects. Example: "gs://bucket_name/object_name_prefix". Each object uri is in format: "gs://bucket_name/object_name_prefix// and only
    * contains assets for that type. starts from 0. Example: "gs://bucket_name/object_name_prefix/compute.googleapis.com/Disk/0" is the first shard of output objects containing all
    * compute.googleapis.com/Disk assets. An INVALID_ARGUMENT error will be returned if file with the same name "gs://bucket_name/object_name_prefix" already exists.
    */
  var uriPrefix: js.UndefOr[String] = js.undefined
}
object GcsDestination {
  
  inline def apply(): GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsDestination]
  }
  
  extension [Self <: GcsDestination](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
