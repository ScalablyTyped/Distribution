package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndPoint extends StObject {
  
  /**
    * A URL suitable for loading in a web browser for the requested endpoint.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndPoint {
  
  inline def apply(): SchemaEndPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndPoint]
  }
  
  extension [Self <: SchemaEndPoint](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
