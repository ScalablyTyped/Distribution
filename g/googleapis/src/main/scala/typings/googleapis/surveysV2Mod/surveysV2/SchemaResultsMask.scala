package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultsMask extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaFieldMask]] = js.undefined
  
  var projection: js.UndefOr[String] = js.undefined
}
object SchemaResultsMask {
  
  inline def apply(): SchemaResultsMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsMask]
  }
  
  extension [Self <: SchemaResultsMask](x: Self) {
    
    inline def setFields(value: js.Array[SchemaFieldMask]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaFieldMask*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
  }
}
