package typings.hummerEnv

import typings.hummerEnv.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button
  extends StObject
     with HummerComponent {
  
  /**
    * 禁用状态下的样式
    */
  var disabled: BackgroundColor = js.native
  
  /**
    * 按压状态下的样式
    */
  var pressed: BackgroundColor = js.native
  
  @JSName("style")
  var style_Button: ButtonStyle = js.native
  
  /**
    * 按钮文本
    */
  var text: String = js.native
}
