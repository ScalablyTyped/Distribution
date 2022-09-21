package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends StObject
     with HummerComponent {
  
  /**
    * 是否处于激活状态, 默认false
    */
  var focused: Boolean = js.native
  
  /**
    * 占位提示文本
    */
  var placeholder: String = js.native
  
  @JSName("style")
  var style_Input: InputStyle = js.native
  
  /**
    * 输入文本内容
    */
  var text: String = js.native
}
