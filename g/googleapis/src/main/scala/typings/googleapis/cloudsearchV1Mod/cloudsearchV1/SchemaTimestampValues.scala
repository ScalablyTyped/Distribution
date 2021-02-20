package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of timestamp values.
  */
@js.native
trait SchemaTimestampValues extends StObject {
  
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTimestampValues {
  
  @scala.inline
  def apply(): SchemaTimestampValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampValues]
  }
  
  @scala.inline
  implicit class SchemaTimestampValuesMutableBuilder[Self <: SchemaTimestampValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
