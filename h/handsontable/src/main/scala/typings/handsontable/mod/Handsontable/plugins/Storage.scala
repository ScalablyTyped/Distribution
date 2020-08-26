package typings.handsontable.mod.Handsontable.plugins

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var prefix: String = js.native
  var rootWindow: Window = js.native
  var savedKeys: js.Array[String] = js.native
  def clearSavedKeys(): Unit = js.native
  def loadSavedKeys(): Unit = js.native
  def loadValue(key: String, defaultValue: js.Object): js.Any = js.native
  def resetAll(): Unit = js.native
  def saveSavedKeys(): Unit = js.native
  def saveValue(key: String, value: js.Any): Unit = js.native
}

object Storage {
  @scala.inline
  def apply(
    clearSavedKeys: () => Unit,
    loadSavedKeys: () => Unit,
    loadValue: (String, js.Object) => js.Any,
    prefix: String,
    resetAll: () => Unit,
    rootWindow: Window,
    saveSavedKeys: () => Unit,
    saveValue: (String, js.Any) => Unit,
    savedKeys: js.Array[String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clearSavedKeys = js.Any.fromFunction0(clearSavedKeys), loadSavedKeys = js.Any.fromFunction0(loadSavedKeys), loadValue = js.Any.fromFunction2(loadValue), prefix = prefix.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), rootWindow = rootWindow.asInstanceOf[js.Any], saveSavedKeys = js.Any.fromFunction0(saveSavedKeys), saveValue = js.Any.fromFunction2(saveValue), savedKeys = savedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
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
    def setClearSavedKeys(value: () => Unit): Self = this.set("clearSavedKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadSavedKeys(value: () => Unit): Self = this.set("loadSavedKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadValue(value: (String, js.Object) => js.Any): Self = this.set("loadValue", js.Any.fromFunction2(value))
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetAll(value: () => Unit): Self = this.set("resetAll", js.Any.fromFunction0(value))
    @scala.inline
    def setRootWindow(value: Window): Self = this.set("rootWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveSavedKeys(value: () => Unit): Self = this.set("saveSavedKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setSaveValue(value: (String, js.Any) => Unit): Self = this.set("saveValue", js.Any.fromFunction2(value))
    @scala.inline
    def setSavedKeysVarargs(value: String*): Self = this.set("savedKeys", js.Array(value :_*))
    @scala.inline
    def setSavedKeys(value: js.Array[String]): Self = this.set("savedKeys", value.asInstanceOf[js.Any])
  }
  
}

