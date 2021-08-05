package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastModifiedInfo extends StObject {
  
  /** Timestamp of the last change in milliseconds since epoch. */
  var time: js.UndefOr[String] = js.undefined
}
object LastModifiedInfo {
  
  inline def apply(): LastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastModifiedInfo]
  }
  
  extension [Self <: LastModifiedInfo](x: Self) {
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
