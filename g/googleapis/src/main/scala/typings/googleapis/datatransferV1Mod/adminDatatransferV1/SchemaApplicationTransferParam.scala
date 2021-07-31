package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for application transfer parameters.
  */
trait SchemaApplicationTransferParam extends StObject {
  
  /**
    * The type of the transfer parameter. eg: &#39;PRIVACY_LEVEL&#39;
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the coressponding transfer parameter. eg: &#39;PRIVATE&#39;
    * or &#39;SHARED&#39;
    */
  var value: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaApplicationTransferParam {
  
  @scala.inline
  def apply(): SchemaApplicationTransferParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationTransferParam]
  }
  
  @scala.inline
  implicit class SchemaApplicationTransferParamMutableBuilder[Self <: SchemaApplicationTransferParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
