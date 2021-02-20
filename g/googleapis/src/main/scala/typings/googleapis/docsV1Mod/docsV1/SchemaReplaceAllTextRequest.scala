package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait SchemaReplaceAllTextRequest extends StObject {
  
  /**
    * Finds text in the document matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String] = js.native
}
object SchemaReplaceAllTextRequest {
  
  @scala.inline
  def apply(): SchemaReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllTextRequest]
  }
  
  @scala.inline
  implicit class SchemaReplaceAllTextRequestMutableBuilder[Self <: SchemaReplaceAllTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsText(value: SchemaSubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    @scala.inline
    def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
  }
}
