package typings.grommet.anon

import typings.grommet.utilsMod.AlignContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var align: js.UndefOr[AlignContentType] = js.undefined
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setAlign(value: AlignContentType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
  }
}
