package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchema extends StObject {
  
  /**
    * The definition of the schema. This should contain a string representing the full definition of the schema that is a valid schema definition of the type specified in `type`.
    */
  var definition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the schema. Format is `projects/{project\}/schemas/{schema\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp that the revision was created.
    */
  var revisionCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The revision ID of the schema.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the schema definition.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchema {
  
  inline def apply(): SchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchema]
  }
  
  extension [Self <: SchemaSchema](x: Self) {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionNull: Self = StObject.set(x, "definition", null)
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeNull: Self = StObject.set(x, "revisionCreateTime", null)
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
