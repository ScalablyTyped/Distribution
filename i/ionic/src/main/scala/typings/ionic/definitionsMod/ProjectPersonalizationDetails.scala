package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectPersonalizationDetails extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var packageId: js.UndefOr[String] = js.undefined
  
  var projectId: String
  
  var version: js.UndefOr[String] = js.undefined
}
object ProjectPersonalizationDetails {
  
  inline def apply(name: String, projectId: String): ProjectPersonalizationDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPersonalizationDetails]
  }
  
  extension [Self <: ProjectPersonalizationDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
