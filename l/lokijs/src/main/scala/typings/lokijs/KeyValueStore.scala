package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueStore extends StObject {
  
  def bs(): js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found]
  
  def get(key: js.Any): js.Array[js.Any]
  
  var keys: js.Array[js.Any]
  
  def set(key: js.Any, value: js.Any): Unit
  
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, js.Any]): Unit
  
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1`
  
  var values: js.Array[js.Any]
}
object KeyValueStore {
  
  inline def apply(
    bs: () => js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found],
    get: js.Any => js.Array[js.Any],
    keys: js.Array[js.Any],
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, js.Any] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[js.Any]
  ): KeyValueStore = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), get = js.Any.fromFunction1(get), keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueStore]
  }
  
  extension [Self <: KeyValueStore](x: Self) {
    
    inline def setBs(value: () => js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found]): Self = StObject.set(x, "bs", js.Any.fromFunction0(value))
    
    inline def setGet(value: js.Any => js.Array[js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKeys(value: js.Array[js.Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    inline def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, js.Any] => Unit): Self = StObject.set(x, "setSort", js.Any.fromFunction1(value))
    
    inline def setSort(value: (js.Any, js.Any) => `-1` | `0` | `1`): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
