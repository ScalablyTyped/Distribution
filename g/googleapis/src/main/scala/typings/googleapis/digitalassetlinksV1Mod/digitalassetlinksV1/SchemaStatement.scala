package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatement extends StObject {
  
  /**
    * The relation identifies the use of the statement as intended by the source asset's owner (that is, the person or entity who issued the statement). Every complete statement has a relation. We identify relations with strings of the format `/`, where `` must be one of a set of pre-defined purpose categories, and `` is a free-form lowercase alphanumeric string that describes the specific use case of the statement. Refer to [our API documentation](/digital-asset-links/v1/relation-strings) for the current list of supported relations. Example: `delegate_permission/common.handle_all_urls` REQUIRED
    */
  var relation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Every statement has a source asset. REQUIRED
    */
  var source: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * Every statement has a target asset. REQUIRED
    */
  var target: js.UndefOr[SchemaAsset] = js.undefined
}
object SchemaStatement {
  
  inline def apply(): SchemaStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatement]
  }
  
  extension [Self <: SchemaStatement](x: Self) {
    
    inline def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationNull: Self = StObject.set(x, "relation", null)
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
    
    inline def setSource(value: SchemaAsset): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: SchemaAsset): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
