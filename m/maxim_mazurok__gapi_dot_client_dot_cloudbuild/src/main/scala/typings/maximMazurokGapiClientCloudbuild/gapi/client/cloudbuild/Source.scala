package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

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
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepoSource(value: RepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    @scala.inline
    def setStorageSource(value: StorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
