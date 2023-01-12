package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes extends StObject {
  
  /** Collection of file hashes. */
  var fileHash: js.UndefOr[js.Array[ContaineranalysisGoogleDevtoolsCloudbuildV1Hash]] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes] (val x: Self) extends AnyVal {
    
    inline def setFileHash(value: js.Array[ContaineranalysisGoogleDevtoolsCloudbuildV1Hash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setFileHashVarargs(value: ContaineranalysisGoogleDevtoolsCloudbuildV1Hash*): Self = StObject.set(x, "fileHash", js.Array(value*))
  }
}
