package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueStore extends StObject {
  
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found] = js.native
  
  def get(key: js.Any): js.Array[_] = js.native
  
  var keys: js.Array[_] = js.native
  
  def set(key: js.Any, value: js.Any): Unit = js.native
  
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): Unit = js.native
  
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
  
  var values: js.Array[_] = js.native
}
object KeyValueStore {
  
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found],
    get: js.Any => js.Array[_],
    keys: js.Array[_],
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, _] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[_]
  ): KeyValueStore = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), get = js.Any.fromFunction1(get), keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueStore]
  }
  
  @scala.inline
  implicit class KeyValueStoreMutableBuilder[Self <: KeyValueStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBs(value: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found]): Self = StObject.set(x, "bs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: js.Any => js.Array[_]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, _] => Unit): Self = StObject.set(x, "setSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: (js.Any, js.Any) => `-1` | `0` | `1`): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
