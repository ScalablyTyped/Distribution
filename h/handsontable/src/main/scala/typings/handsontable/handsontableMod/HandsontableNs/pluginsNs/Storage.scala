package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  var prefix: String
  var rootWindow: Window
  var savedKeys: js.Array[String]
  def clearSavedKeys(): Unit
  def loadSavedKeys(): Unit
  def loadValue(key: String, defaultValue: js.Object): js.Any
  def resetAll(): Unit
  def saveSavedKeys(): Unit
  def saveValue(key: String, value: js.Any): Unit
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
    val __obj = js.Dynamic.literal(clearSavedKeys = js.Any.fromFunction0(clearSavedKeys), loadSavedKeys = js.Any.fromFunction0(loadSavedKeys), loadValue = js.Any.fromFunction2(loadValue), prefix = prefix, resetAll = js.Any.fromFunction0(resetAll), rootWindow = rootWindow, saveSavedKeys = js.Any.fromFunction0(saveSavedKeys), saveValue = js.Any.fromFunction2(saveValue), savedKeys = savedKeys)
  
    __obj.asInstanceOf[Storage]
  }
}

