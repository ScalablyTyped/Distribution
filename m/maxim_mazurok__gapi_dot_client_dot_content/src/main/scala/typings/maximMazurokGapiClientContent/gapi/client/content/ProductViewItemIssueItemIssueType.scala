package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewItemIssueItemIssueType extends StObject {
  
  /** Canonical attribute name for attribute-specific issues. */
  var canonicalAttribute: js.UndefOr[String] = js.undefined
}
object ProductViewItemIssueItemIssueType {
  
  inline def apply(): ProductViewItemIssueItemIssueType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewItemIssueItemIssueType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductViewItemIssueItemIssueType] (val x: Self) extends AnyVal {
    
    inline def setCanonicalAttribute(value: String): Self = StObject.set(x, "canonicalAttribute", value.asInstanceOf[js.Any])
    
    inline def setCanonicalAttributeUndefined: Self = StObject.set(x, "canonicalAttribute", js.undefined)
  }
}
