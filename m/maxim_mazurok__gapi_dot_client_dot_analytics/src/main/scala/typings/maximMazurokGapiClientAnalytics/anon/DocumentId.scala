package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentId extends StObject {
  
  /** Id of the document/file containing the report data. */
  var documentId: js.UndefOr[String] = js.undefined
}
object DocumentId {
  
  inline def apply(): DocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentId] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
  }
}
