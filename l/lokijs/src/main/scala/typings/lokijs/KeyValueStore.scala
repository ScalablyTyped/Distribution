package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueStore extends js.Object {
  
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
  implicit class KeyValueStoreOps[Self <: KeyValueStore] (val x: Self) extends AnyVal {
    
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
    def setBs(value: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found]): Self = this.set("bs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: js.Any => js.Array[_]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, _] => Unit): Self = this.set("setSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: (js.Any, js.Any) => `-1` | `0` | `1`): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
