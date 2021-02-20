package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ! Information about a vulnerability with an HTML.
  */
@js.native
trait SchemaForm extends StObject {
  
  /**
    * ! The URI where to send the form when it&#39;s submitted.
    */
  var actionUri: js.UndefOr[String] = js.native
  
  /**
    * ! The names of form fields related to the vulnerability.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
}
object SchemaForm {
  
  @scala.inline
  def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  
  @scala.inline
  implicit class SchemaFormMutableBuilder[Self <: SchemaForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionUri(value: String): Self = StObject.set(x, "actionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUriUndefined: Self = StObject.set(x, "actionUri", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
