package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthSourcetype extends StObject {
  
  var length: Double
  
  var source_type: `3` | `4`
}
object LengthSourcetype {
  
  inline def apply(length: Double, source_type: `3` | `4`): LengthSourcetype = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthSourcetype]
  }
  
  extension [Self <: LengthSourcetype](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSource_type(value: `3` | `4`): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
  }
}
