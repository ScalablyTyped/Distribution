package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** The name of the data source. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Whether this data comes from an official government source. */
  var official: js.UndefOr[Boolean] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOfficial(value: Boolean): Self = StObject.set(x, "official", value.asInstanceOf[js.Any])
    
    inline def setOfficialUndefined: Self = StObject.set(x, "official", js.undefined)
  }
}
