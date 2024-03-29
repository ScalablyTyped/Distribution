package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntity extends StObject {
  
  /**
    * Represents how the entity has been changed in the workspace.
    */
  var changeStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The client being represented by the entity.
    */
  var client: js.UndefOr[SchemaClient] = js.undefined
  
  /**
    * The folder being represented by the entity.
    */
  var folder: js.UndefOr[SchemaFolder] = js.undefined
  
  /**
    * The tag being represented by the entity.
    */
  var tag: js.UndefOr[SchemaTag] = js.undefined
  
  /**
    * The trigger being represented by the entity.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.undefined
  
  /**
    * The variable being represented by the entity.
    */
  var variable: js.UndefOr[SchemaVariable] = js.undefined
}
object SchemaEntity {
  
  inline def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  
  extension [Self <: SchemaEntity](x: Self) {
    
    inline def setChangeStatus(value: String): Self = StObject.set(x, "changeStatus", value.asInstanceOf[js.Any])
    
    inline def setChangeStatusNull: Self = StObject.set(x, "changeStatus", null)
    
    inline def setChangeStatusUndefined: Self = StObject.set(x, "changeStatus", js.undefined)
    
    inline def setClient(value: SchemaClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setFolder(value: SchemaFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setTag(value: SchemaTag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTrigger(value: SchemaTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setVariable(value: SchemaVariable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
