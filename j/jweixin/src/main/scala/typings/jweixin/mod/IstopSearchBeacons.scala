package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IstopSearchBeacons
  extends StObject
     with BaseParams {
  
  // 关闭查找完成后的回调函数
  @JSName("complete")
  def complete_MIstopSearchBeacons(res: Any): Unit
}
object IstopSearchBeacons {
  
  inline def apply(complete: Any => Unit): IstopSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IstopSearchBeacons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IstopSearchBeacons] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
