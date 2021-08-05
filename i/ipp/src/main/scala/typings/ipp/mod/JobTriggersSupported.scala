package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTriggersSupported extends StObject {
  
  var `preset-name`: js.UndefOr[String] = js.undefined
}
object JobTriggersSupported {
  
  inline def apply(): JobTriggersSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTriggersSupported]
  }
  
  extension [Self <: JobTriggersSupported](x: Self) {
    
    inline def `setPreset-name`(value: String): Self = StObject.set(x, "preset-name", value.asInstanceOf[js.Any])
    
    inline def `setPreset-nameUndefined`: Self = StObject.set(x, "preset-name", js.undefined)
  }
}
