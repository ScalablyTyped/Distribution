package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mread extends StObject {
  
  @JSName("m.read")
  var mDotread: StringDictionary[TsNumber]
}
object Mread {
  
  inline def apply(mDotread: StringDictionary[TsNumber]): Mread = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m.read")(mDotread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mread]
  }
  
  extension [Self <: Mread](x: Self) {
    
    inline def setMDotread(value: StringDictionary[TsNumber]): Self = StObject.set(x, "m.read", value.asInstanceOf[js.Any])
  }
}
