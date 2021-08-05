package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a relation entry.
  */
trait SchemaUserRelation extends StObject {
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.undefined
  
  /**
    * The relation of the user. Some of the possible values are mother, father,
    * sister, brother, manager, assistant, partner.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the relation.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaUserRelation {
  
  inline def apply(): SchemaUserRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRelation]
  }
  
  extension [Self <: SchemaUserRelation](x: Self) {
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
