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
    clearSavedKeys: js.Function0[scala.Unit],
    loadSavedKeys: js.Function0[scala.Unit],
    loadValue: js.Function2[java.lang.String, js.Object, js.Any],
    prefix: java.lang.String,
    resetAll: js.Function0[scala.Unit],
    rootWindow: stdLib.Window,
    saveSavedKeys: js.Function0[scala.Unit],
    saveValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    savedKeys: js.Array[java.lang.String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clearSavedKeys = clearSavedKeys, loadSavedKeys = loadSavedKeys, loadValue = loadValue, prefix = prefix, resetAll = resetAll, rootWindow = rootWindow, saveSavedKeys = saveSavedKeys, saveValue = saveValue, savedKeys = savedKeys)
  
    __obj.asInstanceOf[Storage]
  }
}

