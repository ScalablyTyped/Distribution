package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom error rule.
  */
trait SchemaCustomErrorRule extends StObject {
  
  /**
    * Mark this message as possible payload in error response.  Otherwise,
    * objects of this type will be filtered when they appear in error payload.
    */
  var isErrorType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Selects messages to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}
object SchemaCustomErrorRule {
  
  @scala.inline
  def apply(): SchemaCustomErrorRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomErrorRule]
  }
  
  @scala.inline
  implicit class SchemaCustomErrorRuleMutableBuilder[Self <: SchemaCustomErrorRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsErrorType(value: Boolean): Self = StObject.set(x, "isErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsErrorTypeUndefined: Self = StObject.set(x, "isErrorType", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
