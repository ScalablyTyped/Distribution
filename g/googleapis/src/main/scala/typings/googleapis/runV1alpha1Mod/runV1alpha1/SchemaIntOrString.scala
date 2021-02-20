package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IntOrString is a type that can hold an int32 or a string.  When used in
  * JSON or YAML marshalling and unmarshalling, it produces or consumes the
  * inner type.  This allows you to have, for example, a JSON field that can
  * accept a name or number.
  */
@js.native
trait SchemaIntOrString extends StObject {
  
  /**
    * The int value.
    */
  var intVal: js.UndefOr[Double] = js.native
  
  /**
    * The string value.
    */
  var strVal: js.UndefOr[String] = js.native
  
  /**
    * The type of the value.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaIntOrString {
  
  @scala.inline
  def apply(): SchemaIntOrString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntOrString]
  }
  
  @scala.inline
  implicit class SchemaIntOrStringMutableBuilder[Self <: SchemaIntOrString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntVal(value: Double): Self = StObject.set(x, "intVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValUndefined: Self = StObject.set(x, "intVal", js.undefined)
    
    @scala.inline
    def setStrVal(value: String): Self = StObject.set(x, "strVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValUndefined: Self = StObject.set(x, "strVal", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
