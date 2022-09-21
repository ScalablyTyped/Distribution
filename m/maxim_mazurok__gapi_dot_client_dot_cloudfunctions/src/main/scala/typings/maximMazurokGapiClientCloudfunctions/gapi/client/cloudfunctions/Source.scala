package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** If provided, get the source from this location in a Cloud Source Repository. */
  var repoSource: js.UndefOr[RepoSource] = js.undefined
  
  /** If provided, get the source from this location in Google Cloud Storage. */
  var storageSource: js.UndefOr[StorageSource] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setRepoSource(value: RepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    inline def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    inline def setStorageSource(value: StorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
