package typings.hippyReact.mod

import typings.hippyReact.anon.Networkinfo
import typings.hippyReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetInfo extends StObject {
  
  def addEventListener(eventName: String, handler: js.Function1[/* event */ Networkinfo, Unit]): NetInfoRevoker = js.native
  
  def fetch(): js.Promise[Any] = js.native
  
  def removeEventListener(eventName: String, handler: js.Function0[Unit]): Unit = js.native
  def removeEventListener(eventName: String, handler: NetInfoRevoker): Unit = js.native
}
object NetInfo {
  
  inline def apply: NetInfo = ^.asInstanceOf[js.Dynamic].selectDynamic("NetInfo").asInstanceOf[NetInfo]
}
