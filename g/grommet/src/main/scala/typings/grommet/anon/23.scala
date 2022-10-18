package typings.grommet.anon

import typings.grommet.utilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
