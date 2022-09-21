package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes extends StObject {
  
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash]] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes](x: Self) {
    
    inline def setFileHash(value: js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setFileHashVarargs(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash*): Self = StObject.set(x, "fileHash", js.Array(value*))
  }
}
