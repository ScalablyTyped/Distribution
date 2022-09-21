package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionSchemaMetadata extends StObject {
  
  /**
    * Output only. List of actions.
    */
  var actions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. List of entity names.
    */
  var entities: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaConnectionSchemaMetadata {
  
  inline def apply(): SchemaConnectionSchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionSchemaMetadata]
  }
  
  extension [Self <: SchemaConnectionSchemaMetadata](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsNull: Self = StObject.set(x, "actions", null)
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setEntities(value: js.Array[String]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: String*): Self = StObject.set(x, "entities", js.Array(value*))
  }
}
