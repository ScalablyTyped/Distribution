package typings.jqueryTotalStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * @desc Set or get a key's value
    * @param key Key to set.
    * @param value Value to set for key. If ommited, current value for key is returned.
    * @param options Not implemented.
    */
  def totalStorage(key: String): js.Any
  def totalStorage(key: String, value: js.Any): js.Any
  def totalStorage(key: String, value: js.Any, options: JQueryTotalStorageOptions): js.Any
  def totalStorage(key: String, value: Unit, options: JQueryTotalStorageOptions): js.Any
  @JSName("totalStorage")
  var totalStorage_Original: JQueryTotalStorage
}
object JQueryStatic {
  
  @scala.inline
  def apply(totalStorage: JQueryTotalStorage): JQueryStatic = {
    val __obj = js.Dynamic.literal(totalStorage = totalStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalStorage(value: JQueryTotalStorage): Self = StObject.set(x, "totalStorage", value.asInstanceOf[js.Any])
  }
}
