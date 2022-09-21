package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCursor extends StObject {
  
  /**
    * The offset of a message within a topic partition. Must be greater than or equal 0.
    */
  var offset: js.UndefOr[String | Null] = js.undefined
}
object SchemaCursor {
  
  inline def apply(): SchemaCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCursor]
  }
  
  extension [Self <: SchemaCursor](x: Self) {
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
