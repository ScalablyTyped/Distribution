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
  
  extension [Self <: MetadataParam](x: Self) {
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
