package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  /** The property to project. */
  var property: js.UndefOr[PropertyReference] = js.undefined
}
object Projection {
  
  inline def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  
  extension [Self <: Projection](x: Self) {
    
    inline def setProperty(value: PropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
