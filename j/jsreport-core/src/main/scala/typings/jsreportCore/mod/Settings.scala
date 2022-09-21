package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var _collection: js.Array[SettingItem]
  
  def add(key: String, value: Any, req: Request): Any
  
  def addOrSet(key: String, avalue: Any, req: Request): Double | Null
  
  var documentStore: Any
  
  def findValue(key: String, req: Request): Any
  
  def get(key: String): js.Array[SettingItem]
  
  def init(documentStore: Any, authorization: Any): Any
  
  def registerEntity(documentStore: Any): Unit
  
  def set(key: String, avalue: Any, req: Request): Any
}
object Settings {
  
  inline def apply(
    _collection: js.Array[SettingItem],
    add: (String, Any, Request) => Any,
    addOrSet: (String, Any, Request) => Double | Null,
    documentStore: Any,
    findValue: (String, Request) => Any,
    get: String => js.Array[SettingItem],
    init: (Any, Any) => Any,
    registerEntity: Any => Unit,
    set: (String, Any, Request) => Any
  ): Settings = {
    val __obj = js.Dynamic.literal(_collection = _collection.asInstanceOf[js.Any], add = js.Any.fromFunction3(add), addOrSet = js.Any.fromFunction3(addOrSet), documentStore = documentStore.asInstanceOf[js.Any], findValue = js.Any.fromFunction2(findValue), get = js.Any.fromFunction1(get), init = js.Any.fromFunction2(init), registerEntity = js.Any.fromFunction1(registerEntity), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setAdd(value: (String, Any, Request) => Any): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setAddOrSet(value: (String, Any, Request) => Double | Null): Self = StObject.set(x, "addOrSet", js.Any.fromFunction3(value))
    
    inline def setDocumentStore(value: Any): Self = StObject.set(x, "documentStore", value.asInstanceOf[js.Any])
    
    inline def setFindValue(value: (String, Request) => Any): Self = StObject.set(x, "findValue", js.Any.fromFunction2(value))
    
    inline def setGet(value: String => js.Array[SettingItem]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setInit(value: (Any, Any) => Any): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    inline def setRegisterEntity(value: Any => Unit): Self = StObject.set(x, "registerEntity", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any, Request) => Any): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def set_collection(value: js.Array[SettingItem]): Self = StObject.set(x, "_collection", value.asInstanceOf[js.Any])
    
    inline def set_collectionVarargs(value: SettingItem*): Self = StObject.set(x, "_collection", js.Array(value*))
  }
}
