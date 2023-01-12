package typings.maplibreGl.anon

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.mod.StyleImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  def callback(): Unit
  def callback(error: js.Error): Unit
  def callback(error: js.Error, result: StringDictionary[StyleImage]): Unit
  def callback(error: Null, result: StringDictionary[StyleImage]): Unit
  def callback(error: Unit, result: StringDictionary[StyleImage]): Unit
  @JSName("callback")
  var callback_Original: typings.maplibreGl.mod.Callback[StringDictionary[StyleImage]]
  
  var ids: js.Array[String]
}
object Callback {
  
  inline def apply(
    callback: (/* error */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[StringDictionary[StyleImage] | Null]) => Unit,
    ids: js.Array[String]
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(
      value: (/* error */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[StringDictionary[StyleImage] | Null]) => Unit
    ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
