package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatementTemplate extends StObject {
  
  /**
    * The relationship being asserted between the source and target. If omitted, you must specify a BulkCheckRequest.default_relation value to use here.
    */
  var relation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source asset that is asserting the statement. If omitted, you must specify a BulkCheckRequest.default_source value to use here.
    */
  var source: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * The target that the source is declaring the relationship with. If omitted, you must specify a BulkCheckRequest.default_target to use here.
    */
  var target: js.UndefOr[SchemaAsset] = js.undefined
}
object SchemaStatementTemplate {
  
  inline def apply(): SchemaStatementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatementTemplate]
  }
  
  extension [Self <: SchemaStatementTemplate](x: Self) {
    
    inline def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationNull: Self = StObject.set(x, "relation", null)
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
    
    inline def setSource(value: SchemaAsset): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: SchemaAsset): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
