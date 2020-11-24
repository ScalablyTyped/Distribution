package typings.gtmetrix.mod

import typings.gtmetrix.anon.ReadonlyAccountStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountApi extends js.Object {
  
  /**
    * Get account status
    */
  def status(): Unit = js.native
  def status(callback: js.Function2[/* err */ MetricsError, /* data */ ReadonlyAccountStatus, Unit]): Unit = js.native
  @JSName("status")
  def status_Promise(): js.Promise[ReadonlyAccountStatus] = js.native
}
