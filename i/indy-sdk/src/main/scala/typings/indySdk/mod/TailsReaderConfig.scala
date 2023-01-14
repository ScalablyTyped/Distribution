package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TailsReaderConfig extends StObject {
  
  var base_dir: String
}
object TailsReaderConfig {
  
  inline def apply(base_dir: String): TailsReaderConfig = {
    val __obj = js.Dynamic.literal(base_dir = base_dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[TailsReaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TailsReaderConfig] (val x: Self) extends AnyVal {
    
    inline def setBase_dir(value: String): Self = StObject.set(x, "base_dir", value.asInstanceOf[js.Any])
  }
}
