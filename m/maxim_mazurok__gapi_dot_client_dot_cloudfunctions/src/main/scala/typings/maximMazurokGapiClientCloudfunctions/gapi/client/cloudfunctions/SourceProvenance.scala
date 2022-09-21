package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceProvenance extends StObject {
  
  /** A copy of the build's `source.repo_source`, if exists, with any revisions resolved. */
  var resolvedRepoSource: js.UndefOr[RepoSource] = js.undefined
  
  /** A copy of the build's `source.storage_source`, if exists, with any generations resolved. */
  var resolvedStorageSource: js.UndefOr[StorageSource] = js.undefined
}
object SourceProvenance {
  
  inline def apply(): SourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceProvenance]
  }
  
  extension [Self <: SourceProvenance](x: Self) {
    
    inline def setResolvedRepoSource(value: RepoSource): Self = StObject.set(x, "resolvedRepoSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedRepoSourceUndefined: Self = StObject.set(x, "resolvedRepoSource", js.undefined)
    
    inline def setResolvedStorageSource(value: StorageSource): Self = StObject.set(x, "resolvedStorageSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedStorageSourceUndefined: Self = StObject.set(x, "resolvedStorageSource", js.undefined)
  }
}
