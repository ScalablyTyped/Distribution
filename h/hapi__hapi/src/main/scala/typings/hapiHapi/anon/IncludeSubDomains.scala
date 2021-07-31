package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSubDomains extends StObject {
  
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubDomains: Boolean
  
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: Double
  
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: Boolean
}
object IncludeSubDomains {
  
  @scala.inline
  def apply(includeSubDomains: Boolean, maxAge: Double, preload: Boolean): IncludeSubDomains = {
    val __obj = js.Dynamic.literal(includeSubDomains = includeSubDomains.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSubDomains]
  }
  
  @scala.inline
  implicit class IncludeSubDomainsMutableBuilder[Self <: IncludeSubDomains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
  }
}
