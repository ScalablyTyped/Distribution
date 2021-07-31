package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of text values.
  */
trait SchemaTextValues extends StObject {
  
  /**
    * The maximum allowable length for text values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTextValues {
  
  @scala.inline
  def apply(): SchemaTextValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextValues]
  }
  
  @scala.inline
  implicit class SchemaTextValuesMutableBuilder[Self <: SchemaTextValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
