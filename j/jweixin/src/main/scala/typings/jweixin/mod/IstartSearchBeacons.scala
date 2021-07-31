package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
trait IstartSearchBeacons
  extends StObject
     with BaseParams {
  
  // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: js.Any): Unit
  
  var ticket: String
}
object IstartSearchBeacons {
  
  @scala.inline
  def apply(complete: js.Any => Unit, ticket: String): IstartSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IstartSearchBeacons]
  }
  
  @scala.inline
  implicit class IstartSearchBeaconsMutableBuilder[Self <: IstartSearchBeacons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
