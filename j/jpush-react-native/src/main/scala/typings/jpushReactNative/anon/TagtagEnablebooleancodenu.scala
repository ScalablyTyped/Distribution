package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpush-react-native.jpush-react-native.Tag & {  tagEnable :boolean} & {  code :number} & jpush-react-native.jpush-react-native.Sequence */
trait TagtagEnablebooleancodenu extends StObject {
  
  /**
    * 结果, 0为操作成功
    */
  var code: Double
  
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
  
  /**
    * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
    * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
    *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
    */
  var tag: String
  
  /**
    * 执行查询指定tag(queryTag)操作时会返回是否可用
    */
  var tagEnable: Boolean
}
object TagtagEnablebooleancodenu {
  
  inline def apply(code: Double, sequence: Double, tag: String, tagEnable: Boolean): TagtagEnablebooleancodenu = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagEnable = tagEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagtagEnablebooleancodenu]
  }
  
  extension [Self <: TagtagEnablebooleancodenu](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagEnable(value: Boolean): Self = StObject.set(x, "tagEnable", value.asInstanceOf[js.Any])
  }
}
