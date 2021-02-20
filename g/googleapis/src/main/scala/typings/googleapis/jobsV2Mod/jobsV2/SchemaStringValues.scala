package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents array of string values.
  */
@js.native
trait SchemaStringValues extends StObject {
  
  /**
    * Required.  String values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaStringValues {
  
  @scala.inline
  def apply(): SchemaStringValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringValues]
  }
  
  @scala.inline
  implicit class SchemaStringValuesMutableBuilder[Self <: SchemaStringValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
