package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  /** Link to the account for this web property. */
  var href: js.UndefOr[String] = js.undefined
  
  /** Type of the parent link. Its value is "analytics#account". */
  var `type`: js.UndefOr[String] = js.undefined
}
object Href {
  
  inline def apply(): Href = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Href]
  }
  
  extension [Self <: Href](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
