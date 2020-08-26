package typings.i18next.mod

import typings.i18next.i18nextStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendModule[TOptions] extends Module {
  /** Load multiple languages and namespaces. For backends supporting multiple resources loading */
  var readMulti: js.UndefOr[
    js.Function3[
      /* languages */ js.Array[String], 
      /* namespaces */ js.Array[String], 
      /* callback */ ReadCallback, 
      Unit
    ]
  ] = js.native
  /** Store the translation. For backends acting as cache layer */
  var save: js.UndefOr[
    js.Function3[/* language */ String, /* namespace */ String, /* data */ ResourceLanguage, Unit]
  ] = js.native
  @JSName("type")
  var type_BackendModule: backend = js.native
  /** Save the missing translation */
  def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
  def init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions): Unit = js.native
  def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
}

object BackendModule {
  @scala.inline
  def apply[TOptions](
    create: (js.Array[String], String, String, String) => Unit,
    init: (Services, TOptions, InitOptions) => Unit,
    read: (String, String, ReadCallback) => Unit,
    `type`: backend
  ): BackendModule[TOptions] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), read = js.Any.fromFunction3(read))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendModule[TOptions]]
  }
  @scala.inline
  implicit class BackendModuleOps[Self <: BackendModule[_], TOptions] (val x: Self with BackendModule[TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: (js.Array[String], String, String, String) => Unit): Self = this.set("create", js.Any.fromFunction4(value))
    @scala.inline
    def setInit(value: (Services, TOptions, InitOptions) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
    @scala.inline
    def setRead(value: (String, String, ReadCallback) => Unit): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def setType(value: backend): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadMulti(
      value: (/* languages */ js.Array[String], /* namespaces */ js.Array[String], /* callback */ ReadCallback) => Unit
    ): Self = this.set("readMulti", js.Any.fromFunction3(value))
    @scala.inline
    def deleteReadMulti: Self = this.set("readMulti", js.undefined)
    @scala.inline
    def setSave(value: (/* language */ String, /* namespace */ String, /* data */ ResourceLanguage) => Unit): Self = this.set("save", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
  }
  
}

