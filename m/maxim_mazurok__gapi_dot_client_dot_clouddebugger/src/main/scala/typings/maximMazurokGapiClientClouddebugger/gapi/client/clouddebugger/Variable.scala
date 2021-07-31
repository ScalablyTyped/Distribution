package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variable extends StObject {
  
  /** Members contained or pointed to by the variable. */
  var members: js.UndefOr[js.Array[Variable]] = js.undefined
  
  /** Name of the variable, if any. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Status associated with the variable. This field will usually stay unset. A status of a single variable only applies to that variable or expression. The rest of breakpoint data still
    * remains valid. Variables might be reported in error state even when breakpoint is not in final state. The message may refer to variable name with `refers_to` set to `VARIABLE_NAME`.
    * Alternatively `refers_to` will be set to `VARIABLE_VALUE`. In either case variable value and members will be unset. Example of error message applied to name: `Invalid expression
    * syntax`. Example of information message applied to value: `Not captured`. Examples of error message applied to value: * `Malformed string`, * `Field f not found in class C` * `Null
    * pointer dereference`
    */
  var status: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * Variable type (e.g. `MyClass`). If the variable is split with `var_table_index`, `type` goes next to `value`. The interpretation of a type is agent specific. It is recommended to
    * include the dynamic type rather than a static type of an object.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Simple value of the variable. */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to a variable in the shared variable table. More than one variable can reference the same variable in the table. The `var_table_index` field is an index into
    * `variable_table` in Breakpoint.
    */
  var varTableIndex: js.UndefOr[Double] = js.undefined
}
object Variable {
  
  @scala.inline
  def apply(): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variable]
  }
  
  @scala.inline
  implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[Variable]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: Variable*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusMessage): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVarTableIndex(value: Double): Self = StObject.set(x, "varTableIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarTableIndexUndefined: Self = StObject.set(x, "varTableIndex", js.undefined)
  }
}
