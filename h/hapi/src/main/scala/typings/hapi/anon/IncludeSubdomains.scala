package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSubdomains extends StObject {
  
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubdomains: Boolean
  
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: Double
  
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: Boolean
}
object IncludeSubdomains {
  
  inline def apply(includeSubdomains: Boolean, maxAge: Double, preload: Boolean): IncludeSubdomains = {
    val __obj = js.Dynamic.literal(includeSubdomains = includeSubdomains.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSubdomains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeSubdomains] (val x: Self) extends AnyVal {
    
    inline def setIncludeSubdomains(value: Boolean): Self = StObject.set(x, "includeSubdomains", value.asInstanceOf[js.Any])
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
  }
}
