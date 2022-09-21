package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLodgingMetadata extends StObject {
  
  /**
    * Required. The latest time at which the Lodging data is asserted to be true in the real world. This is not necessarily the time at which the request is made.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaLodgingMetadata {
  
  inline def apply(): SchemaLodgingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLodgingMetadata]
  }
  
  extension [Self <: SchemaLodgingMetadata](x: Self) {
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
