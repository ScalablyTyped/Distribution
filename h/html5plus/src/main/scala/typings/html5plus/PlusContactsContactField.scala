package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，联系人域数据对象
  * 联系人域数据对象，保存联系人特定域信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContactField extends StObject {
  
  /**
    * 是否为首选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var preferred: js.UndefOr[Boolean] = js.native
  
  /**
    * 联系人域类型，如电话号码中的“mobile”、“home”、“company”
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * 联系人域值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var value: js.UndefOr[String] = js.native
}
object PlusContactsContactField {
  
  @scala.inline
  def apply(): PlusContactsContactField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactField]
  }
  
  @scala.inline
  implicit class PlusContactsContactFieldMutableBuilder[Self <: PlusContactsContactField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
