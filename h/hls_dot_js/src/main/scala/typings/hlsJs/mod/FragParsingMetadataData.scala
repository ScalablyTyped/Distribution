package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragParsingMetadataData extends StObject {
  
  var details: LevelDetails
  
  var frag: Fragment
  
  var id: String
  
  var samples: js.Array[MetadataSample]
}
object FragParsingMetadataData {
  
  inline def apply(details: LevelDetails, frag: Fragment, id: String, samples: js.Array[MetadataSample]): FragParsingMetadataData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragParsingMetadataData]
  }
  
  extension [Self <: FragParsingMetadataData](x: Self) {
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: js.Array[MetadataSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesVarargs(value: MetadataSample*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
