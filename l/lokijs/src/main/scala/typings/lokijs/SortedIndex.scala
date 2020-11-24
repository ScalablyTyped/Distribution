package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortedIndex extends js.Object {
  
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found] = js.native
  
  // clear will zap the index
  def clear(): Unit = js.native
  
  var field: String = js.native
  
  // get all values which have a key == the given key
  def get(key: js.Any): js.Array[_] = js.native
  
  // get all vals from start to end
  def getAll(key: js.Any, start: Double, end: Double): js.Array[_] = js.native
  
  // get all values which have a key > the given key
  def getGt(key: js.Any): js.Array[_] = js.native
  
  // get all values which have a key < the given key
  def getLt(key: js.Any): js.Array[_] = js.native
  
  // just in case someone wants to do something smart with ranges
  def getPos(key: js.Any): Found = js.native
  
  var keys: js.Array[_] = js.native
  
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: js.Any, value: js.Any): Unit = js.native
  
  // add the value you want returned  to the key in the index
  def set(key: js.Any, value: js.Any): Unit = js.native
  
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, Double]): Unit = js.native
  
  // set the default sort
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
  
  var values: js.Array[_] = js.native
}
object SortedIndex {
  
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found],
    clear: () => Unit,
    field: String,
    get: js.Any => js.Array[_],
    getAll: (js.Any, Double, Double) => js.Array[_],
    getGt: js.Any => js.Array[_],
    getLt: js.Any => js.Array[_],
    getPos: js.Any => Found,
    keys: js.Array[_],
    remove: (js.Any, js.Any) => Unit,
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[_]
  ): SortedIndex = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), clear = js.Any.fromFunction0(clear), field = field.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction3(getAll), getGt = js.Any.fromFunction1(getGt), getLt = js.Any.fromFunction1(getLt), getPos = js.Any.fromFunction1(getPos), keys = keys.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedIndex]
  }
  
  @scala.inline
  implicit class SortedIndexOps[Self <: SortedIndex] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: js.Any => js.Array[_]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAll(value: (js.Any, Double, Double) => js.Array[_]): Self = this.set("getAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetGt(value: js.Any => js.Array[_]): Self = this.set("getGt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLt(value: js.Any => js.Array[_]): Self = this.set("getLt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPos(value: js.Any => Found): Self = this.set("getPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: (js.Any, js.Any) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit): Self = this.set("setSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: (js.Any, js.Any) => `-1` | `0` | `1`): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
