package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Variables Response.
  */
trait SchemaListVariablesResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * All GTM Variables of a GTM Container.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
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
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVariable(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: SchemaVariable*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
