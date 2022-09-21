package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hub
  extends StObject
     with MediaObject {
  
  def createHubPort(): js.Promise[HubPort] = js.native
  def createHubPort(callback: Callback[HubPort]): js.Promise[HubPort] = js.native
}
