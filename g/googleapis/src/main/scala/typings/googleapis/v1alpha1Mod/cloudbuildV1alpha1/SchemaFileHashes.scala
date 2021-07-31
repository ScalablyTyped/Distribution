package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container message for hashes of byte content of files, used in
  * SourceProvenance messages to verify integrity of source input to the build.
  */
trait SchemaFileHashes extends StObject {
  
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.undefined
}
object SchemaFileHashes {
  
  @scala.inline
  def apply(): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileHashes]
  }
  
  @scala.inline
  implicit class SchemaFileHashesMutableBuilder[Self <: SchemaFileHashes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHash(value: js.Array[SchemaHash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    @scala.inline
    def setFileHashVarargs(value: SchemaHash*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
  }
}
