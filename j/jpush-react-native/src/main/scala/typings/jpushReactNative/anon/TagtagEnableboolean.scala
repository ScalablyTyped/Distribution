package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpush-react-native.jpush-react-native.Tag & {  tagEnable :boolean} */
@js.native
trait TagtagEnableboolean extends StObject {
  
  /**
    * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
    * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
    *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
    */
  var tag: String = js.native
  
  /**
    * 执行查询指定tag(queryTag)操作时会返回是否可用
    */
  var tagEnable: Boolean = js.native
}
object TagtagEnableboolean {
  
  @scala.inline
  def apply(tag: String, tagEnable: Boolean): TagtagEnableboolean = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], tagEnable = tagEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagtagEnableboolean]
  }
  
  @scala.inline
  implicit class TagtagEnablebooleanMutableBuilder[Self <: TagtagEnableboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagEnable(value: Boolean): Self = StObject.set(x, "tagEnable", value.asInstanceOf[js.Any])
  }
}
