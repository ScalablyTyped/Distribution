package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSearchBeacons
  extends StObject
     with BaseParams {
  
  // 回调函数，可以数组形式取得该商家注册的在周边的相关设备列表
  @JSName("complete")
  def complete_MIonSearchBeacons(argv: Any): Unit
}
object IonSearchBeacons {
  
  inline def apply(complete: Any => Unit): IonSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IonSearchBeacons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IonSearchBeacons] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
