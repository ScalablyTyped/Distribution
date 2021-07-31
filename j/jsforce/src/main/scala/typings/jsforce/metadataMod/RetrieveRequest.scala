package typings.jsforce.metadataMod

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
  
  @scala.inline
  def apply(): RetrieveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRequest]
  }
  
  @scala.inline
  implicit class RetrieveRequestMutableBuilder[Self <: RetrieveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    @scala.inline
    def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value :_*))
    
    @scala.inline
    def setSinglePackage(value: Boolean): Self = StObject.set(x, "singlePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinglePackageUndefined: Self = StObject.set(x, "singlePackage", js.undefined)
    
    @scala.inline
    def setSpecificFiles(value: js.Array[String]): Self = StObject.set(x, "specificFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificFilesUndefined: Self = StObject.set(x, "specificFiles", js.undefined)
    
    @scala.inline
    def setSpecificFilesVarargs(value: String*): Self = StObject.set(x, "specificFiles", js.Array(value :_*))
    
    @scala.inline
    def setUnpackaged(value: Package): Self = StObject.set(x, "unpackaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpackagedUndefined: Self = StObject.set(x, "unpackaged", js.undefined)
  }
}
