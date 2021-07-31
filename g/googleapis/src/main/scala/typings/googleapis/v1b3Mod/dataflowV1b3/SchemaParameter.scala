package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured data associated with this message.
  */
trait SchemaParameter extends StObject {
  
  /**
    * Key or name for this parameter.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Value for this parameter.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object SchemaParameter {
  
  @scala.inline
  def apply(): SchemaParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameter]
  }
  
  @scala.inline
  implicit class SchemaParameterMutableBuilder[Self <: SchemaParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
