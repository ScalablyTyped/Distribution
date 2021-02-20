package typings.handsontable.mod.Handsontable.plugins

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage extends StObject {
  
  def clearSavedKeys(): Unit = js.native
  
  def loadSavedKeys(): Unit = js.native
  
  def loadValue(key: String, defaultValue: js.Object): js.Any = js.native
  
  var prefix: String = js.native
  
  def resetAll(): Unit = js.native
  
  var rootWindow: Window = js.native
  
  def saveSavedKeys(): Unit = js.native
  
  def saveValue(key: String, value: js.Any): Unit = js.native
  
  var savedKeys: js.Array[String] = js.native
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
  implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearSavedKeys(value: () => Unit): Self = StObject.set(x, "clearSavedKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadSavedKeys(value: () => Unit): Self = StObject.set(x, "loadSavedKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadValue(value: (String, js.Object) => js.Any): Self = StObject.set(x, "loadValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRootWindow(value: Window): Self = StObject.set(x, "rootWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveSavedKeys(value: () => Unit): Self = StObject.set(x, "saveSavedKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "saveValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSavedKeys(value: js.Array[String]): Self = StObject.set(x, "savedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedKeysVarargs(value: String*): Self = StObject.set(x, "savedKeys", js.Array(value :_*))
  }
}
