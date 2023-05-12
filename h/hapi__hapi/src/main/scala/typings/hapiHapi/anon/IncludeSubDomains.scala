package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSubDomains extends StObject {
  
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubDomains: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: js.UndefOr[Boolean] = js.undefined
}
object IncludeSubDomains {
  
  inline def apply(): IncludeSubDomains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeSubDomains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeSubDomains] (val x: Self) extends AnyVal {
    
    inline def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubDomainsUndefined: Self = StObject.set(x, "includeSubDomains", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
  }
}
