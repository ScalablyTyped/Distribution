package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFieldMask extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaFieldMask]] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
}
object SchemaFieldMask {
  
  @scala.inline
  def apply(): SchemaFieldMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMask]
  }
  
  @scala.inline
  implicit class SchemaFieldMaskMutableBuilder[Self <: SchemaFieldMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaFieldMask]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaFieldMask*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
