package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsZone extends StObject {
  
  /**
    * The DNS name suffix of this zone e.g. `example.com.`.
    */
  var dnsSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDnsZone {
  
  inline def apply(): SchemaDnsZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsZone]
  }
  
  extension [Self <: SchemaDnsZone](x: Self) {
    
    inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    inline def setDnsSuffixNull: Self = StObject.set(x, "dnsSuffix", null)
    
    inline def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
