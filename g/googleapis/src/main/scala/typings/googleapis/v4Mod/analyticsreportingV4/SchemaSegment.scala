package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegment extends StObject {
  
  /**
    * A dynamic segment definition in the request.
    */
  var dynamicSegment: js.UndefOr[SchemaDynamicSegment] = js.undefined
  
  /**
    * The segment ID of a built-in or custom segment, for example `gaid::-3`.
    */
  var segmentId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSegment {
  
  inline def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  extension [Self <: SchemaSegment](x: Self) {
    
    inline def setDynamicSegment(value: SchemaDynamicSegment): Self = StObject.set(x, "dynamicSegment", value.asInstanceOf[js.Any])
    
    inline def setDynamicSegmentUndefined: Self = StObject.set(x, "dynamicSegment", js.undefined)
    
    inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdNull: Self = StObject.set(x, "segmentId", null)
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
