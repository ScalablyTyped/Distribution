package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataParam extends StObject {
  
  var metadata: Any
}
object MetadataParam {
  
  inline def apply(metadata: Any): MetadataParam = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataParam] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
