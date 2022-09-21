package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceProvenance extends StObject {
  
  /**
    * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
    */
  var resolvedRepoSource: js.UndefOr[SchemaRepoSource] = js.undefined
  
  /**
    * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
    */
  var resolvedStorageSource: js.UndefOr[SchemaStorageSource] = js.undefined
}
object SchemaSourceProvenance {
  
  inline def apply(): SchemaSourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceProvenance]
  }
  
  extension [Self <: SchemaSourceProvenance](x: Self) {
    
    inline def setResolvedRepoSource(value: SchemaRepoSource): Self = StObject.set(x, "resolvedRepoSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedRepoSourceUndefined: Self = StObject.set(x, "resolvedRepoSource", js.undefined)
    
    inline def setResolvedStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "resolvedStorageSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedStorageSourceUndefined: Self = StObject.set(x, "resolvedStorageSource", js.undefined)
  }
}
