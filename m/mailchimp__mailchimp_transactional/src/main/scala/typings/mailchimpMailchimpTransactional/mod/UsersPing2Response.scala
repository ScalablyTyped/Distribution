package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.PONGExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersPing2Response extends StObject {
  
  /** a simple pong response */
  var PING: PONGExclamationmark
}
object UsersPing2Response {
  
  inline def apply(): UsersPing2Response = {
    val __obj = js.Dynamic.literal(PING = "PONG!")
    __obj.asInstanceOf[UsersPing2Response]
  }
  
  extension [Self <: UsersPing2Response](x: Self) {
    
    inline def setPING(value: PONGExclamationmark): Self = StObject.set(x, "PING", value.asInstanceOf[js.Any])
  }
}
