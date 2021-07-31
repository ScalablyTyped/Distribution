package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataParam extends StObject {
  
  var metadata: js.Any
}
object MetadataParam {
  
  @scala.inline
  def apply(metadata: js.Any): MetadataParam = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataParam]
  }
  
  @scala.inline
  implicit class MetadataParamMutableBuilder[Self <: MetadataParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
