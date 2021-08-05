package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileProperties extends StObject {
  
  var createdById: String
  
  var createdByName: String
  
  var createdDate: String
  
  var fileName: String
  
  var fullName: String
  
  var id: String
  
  var lastModifiedById: String
  
  var lastModifiedByName: String
  
  var lastModifiedDate: String
  
  var manageableState: js.UndefOr[String] = js.undefined
  
  var namespacePrefix: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object FileProperties {
  
  inline def apply(
    createdById: String,
    createdByName: String,
    createdDate: String,
    fileName: String,
    fullName: String,
    id: String,
    lastModifiedById: String,
    lastModifiedByName: String,
    lastModifiedDate: String,
    `type`: String
  ): FileProperties = {
    val __obj = js.Dynamic.literal(createdById = createdById.asInstanceOf[js.Any], createdByName = createdByName.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedById = lastModifiedById.asInstanceOf[js.Any], lastModifiedByName = lastModifiedByName.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProperties]
  }
  
  extension [Self <: FileProperties](x: Self) {
    
    inline def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    inline def setCreatedByName(value: String): Self = StObject.set(x, "createdByName", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedById(value: String): Self = StObject.set(x, "lastModifiedById", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByName(value: String): Self = StObject.set(x, "lastModifiedByName", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setManageableState(value: String): Self = StObject.set(x, "manageableState", value.asInstanceOf[js.Any])
    
    inline def setManageableStateUndefined: Self = StObject.set(x, "manageableState", js.undefined)
    
    inline def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamespacePrefixUndefined: Self = StObject.set(x, "namespacePrefix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
