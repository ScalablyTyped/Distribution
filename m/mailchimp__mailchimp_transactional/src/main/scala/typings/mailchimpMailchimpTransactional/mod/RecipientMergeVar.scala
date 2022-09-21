package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientMergeVar extends StObject {
  
  /** The email address of the recipient that the merge variables should apply to. */
  var rcpt: String
  
  /** The recipient's merge variables. */
  var vars: js.Array[MergeVar]
}
object RecipientMergeVar {
  
  inline def apply(rcpt: String, vars: js.Array[MergeVar]): RecipientMergeVar = {
    val __obj = js.Dynamic.literal(rcpt = rcpt.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientMergeVar]
  }
  
  extension [Self <: RecipientMergeVar](x: Self) {
    
    inline def setRcpt(value: String): Self = StObject.set(x, "rcpt", value.asInstanceOf[js.Any])
    
    inline def setVars(value: js.Array[MergeVar]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setVarsVarargs(value: MergeVar*): Self = StObject.set(x, "vars", js.Array(value*))
  }
}
