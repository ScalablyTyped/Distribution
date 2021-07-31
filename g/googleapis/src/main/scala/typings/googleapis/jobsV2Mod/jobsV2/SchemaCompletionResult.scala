package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Resource that represents completion results.
  */
trait SchemaCompletionResult extends StObject {
  
  /**
    * The URL for the company logo if `type=COMPANY_NAME`.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
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
  
  @scala.inline
  def apply(): SchemaCompletionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompletionResult]
  }
  
  @scala.inline
  implicit class SchemaCompletionResultMutableBuilder[Self <: SchemaCompletionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
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
