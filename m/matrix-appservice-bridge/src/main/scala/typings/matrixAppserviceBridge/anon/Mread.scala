package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mread extends StObject {
  
  @JSName("m.read")
  var mDotread: StringDictionary[Ts] = js.native
}
object Mread {
  
  @scala.inline
  def apply(mDotread: StringDictionary[Ts]): Mread = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m.read")(mDotread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mread]
  }
  
  @scala.inline
  implicit class MreadMutableBuilder[Self <: Mread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMDotread(value: StringDictionary[Ts]): Self = StObject.set(x, "m.read", value.asInstanceOf[js.Any])
  }
}
