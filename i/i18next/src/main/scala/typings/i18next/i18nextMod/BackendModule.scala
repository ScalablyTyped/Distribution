package typings.i18next.i18nextMod

import typings.i18next.i18nextStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to load data for i18next.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'backend'` For a prototype constructor set static property.
  */
trait BackendModule[TOptions] extends Module {
  /** Load multiple languages and namespaces. For backends supporting multiple resources loading */
  var readMulti: js.UndefOr[
    js.Function3[
      /* languages */ js.Array[String], 
      /* namespaces */ js.Array[String], 
      /* callback */ ReadCallback, 
      Unit
    ]
  ] = js.undefined
  /** Store the translation. For backends acting as cache layer */
  var save: js.UndefOr[
    js.Function3[/* language */ String, /* namespace */ String, /* data */ ResourceLanguage, Unit]
  ] = js.undefined
  @JSName("type")
  var type_BackendModule: backend
  /** Save the missing translation */
  def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit
  def init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions): Unit
  def read(language: String, namespace: String, callback: ReadCallback): Unit
}

object BackendModule {
  @scala.inline
  def apply[TOptions](
    create: (js.Array[String], String, String, String) => Unit,
    init: (Services, TOptions, InitOptions) => Unit,
    read: (String, String, ReadCallback) => Unit,
    `type`: backend,
    readMulti: (/* languages */ js.Array[String], /* namespaces */ js.Array[String], /* callback */ ReadCallback) => Unit = null,
    save: (/* language */ String, /* namespace */ String, /* data */ ResourceLanguage) => Unit = null
  ): BackendModule[TOptions] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), read = js.Any.fromFunction3(read))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (readMulti != null) __obj.updateDynamic("readMulti")(js.Any.fromFunction3(readMulti))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction3(save))
    __obj.asInstanceOf[BackendModule[TOptions]]
  }
}

