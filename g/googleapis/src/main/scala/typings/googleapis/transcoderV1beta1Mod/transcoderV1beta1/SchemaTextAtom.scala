package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextAtom extends StObject {
  
  /**
    * List of `Job.inputs` that should be embedded in this atom. Only one input is supported.
    */
  var inputs: js.UndefOr[js.Array[SchemaTextInput]] = js.undefined
  
  /**
    * Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextAtom {
  
  inline def apply(): SchemaTextAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextAtom]
  }
  
  extension [Self <: SchemaTextAtom](x: Self) {
    
    inline def setInputs(value: js.Array[SchemaTextInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaTextInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
