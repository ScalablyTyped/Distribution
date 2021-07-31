package typings.lokijs

import typings.lokijs.anon.Found
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedIndex extends StObject {
  
  def bs(): js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found]
  
  // clear will zap the index
  def clear(): Unit
  
  var field: String
  
  // get all values which have a key == the given key
  def get(key: js.Any): js.Array[js.Any]
  
  // get all vals from start to end
  def getAll(key: js.Any, start: Double, end: Double): js.Array[js.Any]
  
  // get all values which have a key > the given key
  def getGt(key: js.Any): js.Array[js.Any]
  
  // get all values which have a key < the given key
  def getLt(key: js.Any): js.Array[js.Any]
  
  // just in case someone wants to do something smart with ranges
  def getPos(key: js.Any): Found
  
  var keys: js.Array[js.Any]
  
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: js.Any, value: js.Any): Unit
  
  // add the value you want returned  to the key in the index
  def set(key: js.Any, value: js.Any): Unit
  
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, Double]): Unit
  
  // set the default sort
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1`
  
  var values: js.Array[js.Any]
}
object SortedIndex {
  
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found],
    clear: () => Unit,
    field: String,
    get: js.Any => js.Array[js.Any],
    getAll: (js.Any, Double, Double) => js.Array[js.Any],
    getGt: js.Any => js.Array[js.Any],
    getLt: js.Any => js.Array[js.Any],
    getPos: js.Any => Found,
    keys: js.Array[js.Any],
    remove: (js.Any, js.Any) => Unit,
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[js.Any]
  ): SortedIndex = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), clear = js.Any.fromFunction0(clear), field = field.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction3(getAll), getGt = js.Any.fromFunction1(getGt), getLt = js.Any.fromFunction1(getLt), getPos = js.Any.fromFunction1(getPos), keys = keys.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedIndex]
  }
  
  @scala.inline
  implicit class SortedIndexMutableBuilder[Self <: SortedIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBs(value: () => js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found]): Self = StObject.set(x, "bs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: js.Any => js.Array[js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAll(value: (js.Any, Double, Double) => js.Array[js.Any]): Self = StObject.set(x, "getAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetGt(value: js.Any => js.Array[js.Any]): Self = StObject.set(x, "getGt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLt(value: js.Any => js.Array[js.Any]): Self = StObject.set(x, "getLt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPos(value: js.Any => Found): Self = StObject.set(x, "getPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: js.Array[js.Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit): Self = StObject.set(x, "setSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: (js.Any, js.Any) => `-1` | `0` | `1`): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
