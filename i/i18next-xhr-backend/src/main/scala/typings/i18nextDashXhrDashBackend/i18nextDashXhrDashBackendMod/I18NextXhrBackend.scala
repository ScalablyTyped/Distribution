package typings.i18nextDashXhrDashBackend.i18nextDashXhrDashBackendMod

import typings.i18nextDashXhrDashBackend.i18nextDashXhrDashBackendStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.BackendModule<BackendOptions> * / any */ @js.native
trait I18NextXhrBackend extends js.Object {
  var options: BackendOptions = js.native
  var services: js.Any = js.native
  var `type`: backend = js.native
  def create(languages: String, namespace: String, key: String, fallbackValue: String): Unit = js.native
  def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
  def init(): Unit = js.native
  def init(services: js.Any): Unit = js.native
  def init(services: js.Any, options: BackendOptions): Unit = js.native
  def loadUrl(
    url: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.ReadCallback */ js.Any
  ): Unit = js.native
  def read(
    language: String,
    namespace: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.ReadCallback */ js.Any
  ): Unit = js.native
  def readMulti(
    languages: js.Array[String],
    namespaces: js.Array[String],
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.ReadCallback */ js.Any
  ): Unit = js.native
}

