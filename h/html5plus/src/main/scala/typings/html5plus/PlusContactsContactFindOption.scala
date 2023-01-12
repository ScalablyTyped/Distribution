package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，查找联系人参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactFindOption extends StObject {
  
  /**
    * 数组，查找时的过滤器
    * 可设置为空，表示不过滤。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var filter: js.UndefOr[PlusContactsContactFindFilter] = js.undefined
  
  /**
    * 是否查找多个联系人，默认值为true
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object PlusContactsContactFindOption {
  
  inline def apply(): PlusContactsContactFindOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactFindOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusContactsContactFindOption] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: PlusContactsContactFindFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
