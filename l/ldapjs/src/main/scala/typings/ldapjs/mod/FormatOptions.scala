package typings.ldapjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatOptions extends StObject {
  
  /** Attribute name case will be preserved instead of lowercased */
  var keepCase: js.UndefOr[Boolean] = js.undefined
  
  /** Preserve order of multi-value RDNs */
  var keepOrder: js.UndefOr[Boolean] = js.undefined
  
  /** RDN values which were quoted will remain so */
  var keepQuote: js.UndefOr[Boolean] = js.undefined
  
  /** Leading/trailing space will be preserved */
  var keepSpace: js.UndefOr[Boolean] = js.undefined
  
  /** Disable trailing space after RDN separators */
  var skipSpace: js.UndefOr[Boolean] = js.undefined
  
  /** RDN names will be uppercased instead of lowercased */
  var upperName: js.UndefOr[Boolean] = js.undefined
}
object FormatOptions {
  
  inline def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepCase(value: Boolean): Self = StObject.set(x, "keepCase", value.asInstanceOf[js.Any])
    
    inline def setKeepCaseUndefined: Self = StObject.set(x, "keepCase", js.undefined)
    
    inline def setKeepOrder(value: Boolean): Self = StObject.set(x, "keepOrder", value.asInstanceOf[js.Any])
    
    inline def setKeepOrderUndefined: Self = StObject.set(x, "keepOrder", js.undefined)
    
    inline def setKeepQuote(value: Boolean): Self = StObject.set(x, "keepQuote", value.asInstanceOf[js.Any])
    
    inline def setKeepQuoteUndefined: Self = StObject.set(x, "keepQuote", js.undefined)
    
    inline def setKeepSpace(value: Boolean): Self = StObject.set(x, "keepSpace", value.asInstanceOf[js.Any])
    
    inline def setKeepSpaceUndefined: Self = StObject.set(x, "keepSpace", js.undefined)
    
    inline def setSkipSpace(value: Boolean): Self = StObject.set(x, "skipSpace", value.asInstanceOf[js.Any])
    
    inline def setSkipSpaceUndefined: Self = StObject.set(x, "skipSpace", js.undefined)
    
    inline def setUpperName(value: Boolean): Self = StObject.set(x, "upperName", value.asInstanceOf[js.Any])
    
    inline def setUpperNameUndefined: Self = StObject.set(x, "upperName", js.undefined)
  }
}
