package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instructions extends StObject {
  
  var instructions: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var signer_index: js.UndefOr[String] = js.undefined
}
object Instructions {
  
  inline def apply(): Instructions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instructions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instructions] (val x: Self) extends AnyVal {
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSigner_index(value: String): Self = StObject.set(x, "signer_index", value.asInstanceOf[js.Any])
    
    inline def setSigner_indexUndefined: Self = StObject.set(x, "signer_index", js.undefined)
  }
}
