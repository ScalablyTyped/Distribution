package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepeatedString extends StObject {
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRepeatedString {
  
  @scala.inline
  def apply(): SchemaRepeatedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepeatedString]
  }
  
  @scala.inline
  implicit class SchemaRepeatedStringMutableBuilder[Self <: SchemaRepeatedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
