package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Resource that represents completion results.
  */
@js.native
trait SchemaCompletionResult extends StObject {
  
  /**
    * The URI of the company image for CompletionType.COMPANY_NAME.
    */
  var imageUri: js.UndefOr[String] = js.native
  
  /**
    * The suggestion for the query.
    */
  var suggestion: js.UndefOr[String] = js.native
  
  /**
    * The completion topic.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaCompletionResult {
  
  @scala.inline
  def apply(): SchemaCompletionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompletionResult]
  }
  
  @scala.inline
  implicit class SchemaCompletionResultMutableBuilder[Self <: SchemaCompletionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
