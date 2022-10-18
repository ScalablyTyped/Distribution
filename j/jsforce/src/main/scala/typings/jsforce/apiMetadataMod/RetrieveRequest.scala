package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveRequest extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var packageNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var singlePackage: js.UndefOr[Boolean] = js.undefined
  
  var specificFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var unpackaged: js.UndefOr[Package] = js.undefined
}
object RetrieveRequest {
  
  inline def apply(): RetrieveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRequest]
  }
  
  extension [Self <: RetrieveRequest](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
    
    inline def setSinglePackage(value: Boolean): Self = StObject.set(x, "singlePackage", value.asInstanceOf[js.Any])
    
    inline def setSinglePackageUndefined: Self = StObject.set(x, "singlePackage", js.undefined)
    
    inline def setSpecificFiles(value: js.Array[String]): Self = StObject.set(x, "specificFiles", value.asInstanceOf[js.Any])
    
    inline def setSpecificFilesUndefined: Self = StObject.set(x, "specificFiles", js.undefined)
    
    inline def setSpecificFilesVarargs(value: String*): Self = StObject.set(x, "specificFiles", js.Array(value*))
    
    inline def setUnpackaged(value: Package): Self = StObject.set(x, "unpackaged", value.asInstanceOf[js.Any])
    
    inline def setUnpackagedUndefined: Self = StObject.set(x, "unpackaged", js.undefined)
  }
}
