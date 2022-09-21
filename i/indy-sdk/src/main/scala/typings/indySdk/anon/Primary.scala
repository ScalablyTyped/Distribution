package typings.indySdk.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Primary extends StObject {
  
  var primary: Record[String, Any]
  
  var revocation: js.UndefOr[Any] = js.undefined
}
object Primary {
  
  inline def apply(primary: Record[String, Any]): Primary = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
  
  extension [Self <: Primary](x: Self) {
    
    inline def setPrimary(value: Record[String, Any]): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setRevocation(value: Any): Self = StObject.set(x, "revocation", value.asInstanceOf[js.Any])
    
    inline def setRevocationUndefined: Self = StObject.set(x, "revocation", js.undefined)
  }
}
