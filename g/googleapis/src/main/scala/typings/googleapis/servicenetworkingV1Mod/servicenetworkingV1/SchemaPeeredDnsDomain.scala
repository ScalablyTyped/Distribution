package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPeeredDnsDomain extends StObject {
  
  /**
    * The DNS domain name suffix e.g. `example.com.`. Cloud DNS requires that a DNS suffix ends with a trailing dot.
    */
  var dnsSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User assigned name for this resource. Must be unique within the consumer network. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPeeredDnsDomain {
  
  inline def apply(): SchemaPeeredDnsDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeeredDnsDomain]
  }
  
  extension [Self <: SchemaPeeredDnsDomain](x: Self) {
    
    inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    inline def setDnsSuffixNull: Self = StObject.set(x, "dnsSuffix", null)
    
    inline def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
