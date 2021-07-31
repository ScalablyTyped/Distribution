package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generated advice about this change, used for providing more information
  * about how a change will affect the existing service.
  */
trait SchemaAdvice extends StObject {
  
  /**
    * Useful description for why this advice was applied and what actions
    * should be taken to mitigate any implied risks.
    */
  var description: js.UndefOr[String] = js.undefined
}
object SchemaAdvice {
  
  @scala.inline
  def apply(): SchemaAdvice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvice]
  }
  
  @scala.inline
  implicit class SchemaAdviceMutableBuilder[Self <: SchemaAdvice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
