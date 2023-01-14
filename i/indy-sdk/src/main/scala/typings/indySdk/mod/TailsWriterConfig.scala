package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TailsWriterConfig extends StObject {
  
  var base_dir: String
  
  var uri_pattern: String
}
object TailsWriterConfig {
  
  inline def apply(base_dir: String, uri_pattern: String): TailsWriterConfig = {
    val __obj = js.Dynamic.literal(base_dir = base_dir.asInstanceOf[js.Any], uri_pattern = uri_pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TailsWriterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TailsWriterConfig] (val x: Self) extends AnyVal {
    
    inline def setBase_dir(value: String): Self = StObject.set(x, "base_dir", value.asInstanceOf[js.Any])
    
    inline def setUri_pattern(value: String): Self = StObject.set(x, "uri_pattern", value.asInstanceOf[js.Any])
  }
}
