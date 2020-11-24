package typings.i18nextFsBackend.mod

import typings.i18next.mod.BackendModule
import typings.i18next.mod.InitOptions
import typings.i18next.mod.ReadCallback
import typings.i18next.mod.Services
import typings.i18nextFsBackend.i18nextFsBackendStrings.backend
import typings.i18nextFsBackend.mod.i18nextFsBackend.i18nextFsBackendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends BackendModule[i18nextFsBackendOptions] {
  
  def queue(lng: String, namespace: String, key: String, fallbackValue: String, callback: js.Any): Unit = js.native
  
  @JSName("type")
  var type_Backend: backend = js.native
  
  def write(): Unit = js.native
  
  def writeFile(lng: String, namespace: String): Unit = js.native
}
object Backend {
  
  @scala.inline
  def apply(
    create: (js.Array[String], String, String, String) => Unit,
    init: (Services, i18nextFsBackendOptions, InitOptions) => Unit,
    queue: (String, String, String, String, js.Any) => Unit,
    read: (String, String, ReadCallback) => Unit,
    `type`: backend,
    write: () => Unit,
    writeFile: (String, String) => Unit
  ): Backend = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), queue = js.Any.fromFunction5(queue), read = js.Any.fromFunction3(read), write = js.Any.fromFunction0(write), writeFile = js.Any.fromFunction2(writeFile))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit class BackendOps[Self <: Backend] (val x: Self) extends AnyVal {
    
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
    def setQueue(value: (String, String, String, String, js.Any) => Unit): Self = this.set("queue", js.Any.fromFunction5(value))
    
    @scala.inline
    def setType(value: backend): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: () => Unit): Self = this.set("write", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteFile(value: (String, String) => Unit): Self = this.set("writeFile", js.Any.fromFunction2(value))
  }
}
