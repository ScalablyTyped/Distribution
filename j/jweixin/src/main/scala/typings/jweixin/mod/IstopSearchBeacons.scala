package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IstopSearchBeacons extends BaseParams {
  
  // 关闭查找完成后的回调函数
  @JSName("complete")
  def complete_MIstopSearchBeacons(res: js.Any): Unit = js.native
}
object IstopSearchBeacons {
  
  @scala.inline
  def apply(complete: js.Any => Unit): IstopSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IstopSearchBeacons]
  }
  
  @scala.inline
  implicit class IstopSearchBeaconsMutableBuilder[Self <: IstopSearchBeacons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
