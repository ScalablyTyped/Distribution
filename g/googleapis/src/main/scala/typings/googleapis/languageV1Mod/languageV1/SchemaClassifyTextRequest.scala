package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document classification request message.
  */
@js.native
trait SchemaClassifyTextRequest extends StObject {
  
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
}
object SchemaClassifyTextRequest {
  
  @scala.inline
  def apply(): SchemaClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextRequest]
  }
  
  @scala.inline
  implicit class SchemaClassifyTextRequestMutableBuilder[Self <: SchemaClassifyTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
