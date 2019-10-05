package typings.i18nextDashNodeDashFsDashBackend.i18nextDashNodeDashFsDashBackendMod

import typings.i18next.i18nextMod.BackendModule
import typings.i18next.i18nextMod.Services
import typings.i18nextDashNodeDashFsDashBackend.i18nextDashNodeDashFsDashBackendStrings.backend
import typings.i18nextDashNodeDashFsDashBackend.i18nextNodeFsBackEnd.i18nextNodeFsBackEndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends BackendModule[i18nextNodeFsBackEndOptions] {
  @JSName("type")
  var type_Backend: backend = js.native
  def init(services: Services): Unit = js.native
  def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions): Unit = js.native
}

