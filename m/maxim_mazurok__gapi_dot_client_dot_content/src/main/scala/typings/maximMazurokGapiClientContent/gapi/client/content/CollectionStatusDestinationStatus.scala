package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionStatusDestinationStatus extends StObject {
  
  /** The name of the destination */
  var destination: js.UndefOr[String] = js.undefined
  
  /** The status for the specified destination in the collections target country. */
  var status: js.UndefOr[String] = js.undefined
}
object CollectionStatusDestinationStatus {
  
  inline def apply(): CollectionStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionStatusDestinationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionStatusDestinationStatus] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
