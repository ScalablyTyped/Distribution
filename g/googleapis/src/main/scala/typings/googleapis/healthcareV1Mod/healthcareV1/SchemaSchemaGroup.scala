package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchemaGroup extends StObject {
  
  /**
    * True indicates that this is a choice group, meaning that only one of its segments can exist in a given message.
    */
  var choice: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The maximum number of times this group can be repeated. 0 or -1 means unbounded.
    */
  var maxOccurs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Nested groups and/or segments.
    */
  var members: js.UndefOr[js.Array[SchemaGroupOrSegment]] = js.undefined
  
  /**
    * The minimum number of times this group must be present/repeated.
    */
  var minOccurs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of this group. For example, "ORDER_DETAIL".
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchemaGroup {
  
  inline def apply(): SchemaSchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaGroup]
  }
  
  extension [Self <: SchemaSchemaGroup](x: Self) {
    
    inline def setChoice(value: Boolean): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceNull: Self = StObject.set(x, "choice", null)
    
    inline def setChoiceUndefined: Self = StObject.set(x, "choice", js.undefined)
    
    inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
    
    inline def setMaxOccursNull: Self = StObject.set(x, "maxOccurs", null)
    
    inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
    
    inline def setMembers(value: js.Array[SchemaGroupOrSegment]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: SchemaGroupOrSegment*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
    
    inline def setMinOccursNull: Self = StObject.set(x, "minOccurs", null)
    
    inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
