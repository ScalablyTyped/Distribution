package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var data: String
}
object PathConfig {
  
  inline def apply(data: String): PathConfig = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathConfig] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
