package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragParsingMetadata extends StObject {
  
  var frag: Fragment
  
  var id: String
  
  var samples: js.Array[js.Any]
}
object fragParsingMetadata {
  
  @scala.inline
  def apply(frag: Fragment, id: String, samples: js.Array[js.Any]): fragParsingMetadata = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingMetadata]
  }
  
  @scala.inline
  implicit class fragParsingMetadataMutableBuilder[Self <: fragParsingMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamples(value: js.Array[js.Any]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesVarargs(value: js.Any*): Self = StObject.set(x, "samples", js.Array(value :_*))
  }
}
