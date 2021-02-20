package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a predicate.
  */
@js.native
trait SchemaCondition extends StObject {
  
  /**
    * A list of named parameters (key/value), depending on the condition&#39;s
    * type. Notes:  - For binary operators, include parameters named arg0 and
    * arg1 for specifying the left and right operands, respectively.  - At this
    * time, the left operand (arg0) must be a reference to a variable.  - For
    * case-insensitive Regex matching, include a boolean parameter named
    * ignore_case that is set to true. If not specified or set to any other
    * value, the matching will be case sensitive.  - To negate an operator,
    * include a boolean parameter named negate boolean parameter that is set to
    * true.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  
  /**
    * The type of operator for this condition.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaCondition {
  
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  
  @scala.inline
  implicit class SchemaConditionMutableBuilder[Self <: SchemaCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
