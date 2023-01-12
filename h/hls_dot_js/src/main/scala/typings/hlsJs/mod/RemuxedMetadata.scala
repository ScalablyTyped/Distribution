package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemuxedMetadata extends StObject {
  
  var samples: js.Array[MetadataSample]
}
object RemuxedMetadata {
  
  inline def apply(samples: js.Array[MetadataSample]): RemuxedMetadata = {
    val __obj = js.Dynamic.literal(samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemuxedMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemuxedMetadata] (val x: Self) extends AnyVal {
    
    inline def setSamples(value: js.Array[MetadataSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesVarargs(value: MetadataSample*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
