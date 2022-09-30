package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclusive extends StObject {
  
  /**
    * Whether or not the application service holds an exclusive lock on the namespace. This means
    * that no other user on the homeserver may register aliases that match this namespace.
    */
  var exclusive: Boolean
  
  /**
    * The regular expression that the homeserver uses to determine if an alias is in this namespace.
    */
  var regex: String
}
object Exclusive {
  
  inline def apply(exclusive: Boolean, regex: String): Exclusive = {
    val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusive]
  }
  
  extension [Self <: Exclusive](x: Self) {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
