package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpush-react-native.jpush-react-native.Alias & {  code :number} & jpush-react-native.jpush-react-native.Sequence */
trait AliascodenumberSequence extends StObject {
  
  /**
    * 有效的别名组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
    * 限制：alias 命名长度限制为 40 字节。（判断长度需采用 UTF-8 编码）
    */
  var alias: String
  
  /**
    * 结果, 0为操作成功
    */
  var code: Double
  
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
}
object AliascodenumberSequence {
  
  inline def apply(alias: String, code: Double, sequence: Double): AliascodenumberSequence = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliascodenumberSequence]
  }
  
  extension [Self <: AliascodenumberSequence](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
