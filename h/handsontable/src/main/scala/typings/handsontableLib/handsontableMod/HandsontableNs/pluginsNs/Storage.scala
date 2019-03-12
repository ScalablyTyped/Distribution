package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  var prefix: java.lang.String
  var rootWindow: stdLib.Window
  var savedKeys: js.Array[java.lang.String]
  def clearSavedKeys(): scala.Unit
  def loadSavedKeys(): scala.Unit
  def loadValue(key: java.lang.String, defaultValue: js.Object): js.Any
  def resetAll(): scala.Unit
  def saveSavedKeys(): scala.Unit
  def saveValue(key: java.lang.String, value: js.Any): scala.Unit
}

object Storage {
  @scala.inline
  def apply(
    clearSavedKeys: () => scala.Unit,
    loadSavedKeys: () => scala.Unit,
    loadValue: (java.lang.String, js.Object) => js.Any,
    prefix: java.lang.String,
    resetAll: () => scala.Unit,
    rootWindow: stdLib.Window,
    saveSavedKeys: () => scala.Unit,
    saveValue: (java.lang.String, js.Any) => scala.Unit,
    savedKeys: js.Array[java.lang.String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clearSavedKeys = js.Any.fromFunction0(clearSavedKeys), loadSavedKeys = js.Any.fromFunction0(loadSavedKeys), loadValue = js.Any.fromFunction2(loadValue), prefix = prefix, resetAll = js.Any.fromFunction0(resetAll), rootWindow = rootWindow, saveSavedKeys = js.Any.fromFunction0(saveSavedKeys), saveValue = js.Any.fromFunction2(saveValue), savedKeys = savedKeys)
  
    __obj.asInstanceOf[Storage]
  }
}

