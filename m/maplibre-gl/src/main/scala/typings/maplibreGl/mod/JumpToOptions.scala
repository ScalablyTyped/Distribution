package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpToOptions
  extends StObject
     with CameraOptions {
  
  var padding: js.UndefOr[PaddingOptions] = js.undefined
}
object JumpToOptions {
  
  inline def apply(): JumpToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpToOptions]
  }
  
  extension [Self <: JumpToOptions](x: Self) {
    
    inline def setPadding(value: PaddingOptions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
