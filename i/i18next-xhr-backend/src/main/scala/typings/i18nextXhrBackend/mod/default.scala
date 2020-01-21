package typings.i18nextXhrBackend.mod

import typings.i18next.i18nextStrings.`3rdParty`
import typings.i18next.i18nextStrings.backend
import typings.i18next.i18nextStrings.i18nFormat
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.i18nextStrings.logger
import typings.i18next.i18nextStrings.postProcessor
import typings.i18next.mod.InitOptions
import typings.i18next.mod.ReadCallback
import typings.i18next.mod.Services
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-xhr-backend", JSImport.Default)
@js.native
class default () extends I18NextXhrBackend {
  def this(services: js.Any) = this()
  def this(services: js.Any, options: BackendOptions) = this()
  /* CompleteClass */
  override var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_BackendModule: backend = js.native
  /** Save the missing translation */
  /* CompleteClass */
  override def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
  /* CompleteClass */
  override def init(services: Services, backendOptions: BackendOptions, i18nextOptions: InitOptions): Unit = js.native
  /* CompleteClass */
  override def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
}

