package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetProject extends StObject {
  
  /**
    * Output only. The time this target project resource was created (not related to when the Compute Engine project it points to was created).
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target project's description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the target project.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target project ID (number) or project name.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last time the target project resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetProject {
  
  inline def apply(): SchemaTargetProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetProject]
  }
  
  extension [Self <: SchemaTargetProject](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
