package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupOrSegment extends StObject {
  
  var group: js.UndefOr[SchemaSchemaGroup] = js.undefined
  
  var segment: js.UndefOr[SchemaSchemaSegment] = js.undefined
}
object SchemaGroupOrSegment {
  
  inline def apply(): SchemaGroupOrSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupOrSegment]
  }
  
  extension [Self <: SchemaGroupOrSegment](x: Self) {
    
    inline def setGroup(value: SchemaSchemaGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setSegment(value: SchemaSchemaSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
