package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultsMask extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaFieldMask]] = js.undefined
  
  var projection: js.UndefOr[String] = js.undefined
}
object SchemaResultsMask {
  
  @scala.inline
  def apply(): SchemaResultsMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsMask]
  }
  
  @scala.inline
  implicit class SchemaResultsMaskMutableBuilder[Self <: SchemaResultsMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaFieldMask]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaFieldMask*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
  }
}
