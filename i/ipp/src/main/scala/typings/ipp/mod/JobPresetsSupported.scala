package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPresetsSupported extends StObject {
  
  var `preset-name`: js.UndefOr[String] = js.undefined
}
object JobPresetsSupported {
  
  inline def apply(): JobPresetsSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobPresetsSupported]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobPresetsSupported] (val x: Self) extends AnyVal {
    
    inline def `setPreset-name`(value: String): Self = StObject.set(x, "preset-name", value.asInstanceOf[js.Any])
    
    inline def `setPreset-nameUndefined`: Self = StObject.set(x, "preset-name", js.undefined)
  }
}
