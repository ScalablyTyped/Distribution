package typings.maplibreGl.anon

import typings.maplibreGl.mod.Tile
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeout extends StObject {
  
  var timeout: ReturnType[TypeofsetTimeout]
  
  var value: Tile
}
object Timeout {
  
  inline def apply(timeout: ReturnType[TypeofsetTimeout], value: Tile): Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  
  extension [Self <: Timeout](x: Self) {
    
    inline def setTimeout(value: ReturnType[TypeofsetTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Tile): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
