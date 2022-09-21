package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSource extends StObject {
  
  /**
    * If provided, get the source from this location in a Cloud Source Repository.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.undefined
  
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setRepoSource(value: SchemaRepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    inline def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    inline def setStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
