package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Variables Response.
  */
@js.native
trait SchemaListVariablesResponse extends StObject {
  
  /**
    * All GTM Variables of a GTM Container.
    */
  var variables: js.UndefOr[js.Array[SchemaVariable]] = js.native
}
object SchemaListVariablesResponse {
  
  @scala.inline
  def apply(): SchemaListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVariablesResponse]
  }
  
  @scala.inline
  implicit class SchemaListVariablesResponseMutableBuilder[Self <: SchemaListVariablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariables(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    @scala.inline
    def setVariablesVarargs(value: SchemaVariable*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
