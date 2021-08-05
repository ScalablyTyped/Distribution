package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Installation extends StObject {
  
  /** Required. All of the places within the filesystem versions of this package have been found. */
  var location: js.UndefOr[js.Array[Location]] = js.undefined
  
  /** Output only. The name of the installed package. */
  var name: js.UndefOr[String] = js.undefined
}
object Installation {
  
  inline def apply(): Installation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Installation]
  }
  
  extension [Self <: Installation](x: Self) {
    
    inline def setLocation(value: js.Array[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Location*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
