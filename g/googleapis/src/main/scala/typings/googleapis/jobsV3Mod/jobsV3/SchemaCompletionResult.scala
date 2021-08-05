package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Resource that represents completion results.
  */
trait SchemaCompletionResult extends StObject {
  
  /**
    * The URI of the company image for CompletionType.COMPANY_NAME.
    */
  var imageUri: js.UndefOr[String] = js.undefined
  
  /**
    * The suggestion for the query.
    */
  var suggestion: js.UndefOr[String] = js.undefined
  
  /**
    * The completion topic.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCompletionResult {
  
  inline def apply(): SchemaCompletionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompletionResult]
  }
  
  extension [Self <: SchemaCompletionResult](x: Self) {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
