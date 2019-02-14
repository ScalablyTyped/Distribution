package typings
package i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18NextXhrBackend extends js.Object {
  var options: i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod.I18NextXhrBackendNs.BackendOptions = js.native
  var services: js.Any = js.native
  var `type`: i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendLibStrings.backend = js.native
  def create(
    languages: java.lang.String,
    namespace: java.lang.String,
    key: java.lang.String,
    fallbackValue: java.lang.String
  ): scala.Unit = js.native
  def create(
    languages: js.Array[java.lang.String],
    namespace: java.lang.String,
    key: java.lang.String,
    fallbackValue: java.lang.String
  ): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def init(services: js.Any): scala.Unit = js.native
  def init(
    services: js.Any,
    options: i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod.I18NextXhrBackendNs.BackendOptions
  ): scala.Unit = js.native
  def loadUrl(
    url: java.lang.String,
    callback: i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod.I18NextXhrBackendNs.LoadCallback
  ): scala.Unit = js.native
  def read(
    language: java.lang.String,
    namespace: java.lang.String,
    callback: i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod.I18NextXhrBackendNs.LoadCallback
  ): scala.Unit = js.native
  def readMulti(
    languages: js.Array[java.lang.String],
    namespaces: js.Array[java.lang.String],
    callback: i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod.I18NextXhrBackendNs.LoadCallback
  ): scala.Unit = js.native
}

