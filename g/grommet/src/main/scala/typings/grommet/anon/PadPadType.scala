package typings.grommet.anon

import typings.grommet.utilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PadPadType extends StObject {
  
  var pad: PadType
}
object PadPadType {
  
  inline def apply(pad: PadType): PadPadType = {
    val __obj = js.Dynamic.literal(pad = pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadPadType]
  }
  
  extension [Self <: PadPadType](x: Self) {
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
  }
}
