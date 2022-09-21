package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchemaSegment extends StObject {
  
  /**
    * The maximum number of times this segment can be present in this group. 0 or -1 means unbounded.
    */
  var maxOccurs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum number of times this segment can be present in this group.
    */
  var minOccurs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Segment type. For example, "PID".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchemaSegment {
  
  inline def apply(): SchemaSchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaSegment]
  }
  
  extension [Self <: SchemaSchemaSegment](x: Self) {
    
    inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
    
    inline def setMaxOccursNull: Self = StObject.set(x, "maxOccurs", null)
    
    inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
    
    inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
    
    inline def setMinOccursNull: Self = StObject.set(x, "minOccurs", null)
    
    inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
