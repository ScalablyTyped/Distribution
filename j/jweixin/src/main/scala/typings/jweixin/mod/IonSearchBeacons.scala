package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSearchBeacons
  extends StObject
     with BaseParams {
  
  // 回调函数，可以数组形式取得该商家注册的在周边的相关设备列表
  @JSName("complete")
  def complete_MIonSearchBeacons(argv: js.Any): Unit
}
object IonSearchBeacons {
  
  @scala.inline
  def apply(complete: js.Any => Unit): IonSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IonSearchBeacons]
  }
  
  @scala.inline
  implicit class IonSearchBeaconsMutableBuilder[Self <: IonSearchBeacons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
