package typings.googleapis.runV1alpha1Mod.runV1alpha1

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
trait SchemaIntOrString extends js.Object {
  
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
  implicit class SchemaIntOrStringOps[Self <: SchemaIntOrString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntVal(value: Double): Self = this.set("intVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntVal: Self = this.set("intVal", js.undefined)
    
    @scala.inline
    def setStrVal(value: String): Self = this.set("strVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrVal: Self = this.set("strVal", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
