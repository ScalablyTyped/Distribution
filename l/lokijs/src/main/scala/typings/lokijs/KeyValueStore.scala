package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsInts.`-1`
import typings.lokijs.lokijsInts.`0`
import typings.lokijs.lokijsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueStore extends StObject {
  
  def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]
  
  def get(key: Any): js.Array[Any]
  
  var keys: js.Array[Any]
  
  def set(key: Any, value: Any): Unit
  
  def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Any]): Unit
  
  def sort(a: Any, b: Any): `-1` | `0` | `1`
  
  var values: js.Array[Any]
}
object KeyValueStore {
  
  inline def apply(
    bs: () => js.Function2[/* array */ js.Array[Any], /* item */ Any, Found],
    get: Any => js.Array[Any],
    keys: js.Array[Any],
    set: (Any, Any) => Unit,
    setSort: js.Function2[/* target */ Any, /* test */ Any, Any] => Unit,
    sort: (Any, Any) => `-1` | `0` | `1`,
    values: js.Array[Any]
  ): KeyValueStore = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), get = js.Any.fromFunction1(get), keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueStore]
  }
  
  extension [Self <: KeyValueStore](x: Self) {
    
    inline def setBs(value: () => js.Function2[/* array */ js.Array[Any], /* item */ Any, Found]): Self = StObject.set(x, "bs", js.Any.fromFunction0(value))
    
    inline def setGet(value: Any => js.Array[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetSort(value: js.Function2[/* target */ Any, /* test */ Any, Any] => Unit): Self = StObject.set(x, "setSort", js.Any.fromFunction1(value))
    
    inline def setSort(value: (Any, Any) => `-1` | `0` | `1`): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
