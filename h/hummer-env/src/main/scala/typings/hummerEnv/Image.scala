package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image
  extends StObject
     with HummerComponent {
  
  /**
    * gifRepeatCount must set before gifSrc
    * gif play time count default = 0
    */
  var gifRepeatCount: Double = js.native
  
  /**
    * gif图片地址
    */
  var gifSrc: String = js.native
  
  /**
    * 加载图片（支持加载回调）
    * @param src 图片源，可以直接是一个路径（简写），也可以是一个配置对象
    *
    * ImageStyle = {
    *     src: string  // 图片路径
    *     placeholder: string  // 占位图片
    *     failedImage: string  // 失败图片
    *     gifSrc: string  // Gif图路径
    *     gifRepeatCount: number  // Gif图重复次数
    * }
    */
  def load(src: String, cb: js.Function2[/* srcType */ Double, /* isSuccess */ Boolean, Unit]): Unit = js.native
  def load(
    src: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.imageStyle */ Any,
    cb: js.Function2[/* srcType */ Double, /* isSuccess */ Boolean, Unit]
  ): Unit = js.native
  
  /**
    * 图片地址
    * this.src = "test"; // Native资源图片
    * this.src = '/sdcard/test.png'; // 绝对路径图片（手机设备路径）
    * this.src = require('../res/test.png'); // 相对路径图片（工程目录）
    * this.src = './images/test.png'; // 相对路径图片（编译产物目录）
    * this.src = 'http://xxx/test.jpg'; // 网络图片
    * this.src = '//xxx/test.jpg'; // 网络图片简写（默认加https:）
    * this.src = 'data:application/json;charset=utf-8;base64,iVBO...'; // base64图片
    */
  var src: String = js.native
  
  @JSName("style")
  var style_Image: ImageStyle = js.native
}
