package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileHashes extends StObject {
  
  /** Required. Collection of file hashes. */
  var fileHash: js.UndefOr[js.Array[Hash]] = js.undefined
}
object FileHashes {
  
  inline def apply(): FileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileHashes]
  }
  
  extension [Self <: FileHashes](x: Self) {
    
    inline def setFileHash(value: js.Array[Hash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setFileHashVarargs(value: Hash*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
  }
}
