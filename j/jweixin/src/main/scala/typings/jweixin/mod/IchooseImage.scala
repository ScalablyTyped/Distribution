package typings.jweixin.mod

import typings.jweixin.anon.LocalIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================基础接口================================*/
/*=============================图像接口================================*/
@js.native
trait IchooseImage extends BaseParams {
  
  def cancel(): Unit = js.native
  
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[Double] = js.native
  
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.native
  
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.native
  
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MIchooseImage(res: LocalIds): Unit = js.native
}
object IchooseImage {
  
  @scala.inline
  def apply(cancel: () => Unit, success: LocalIds => Unit): IchooseImage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IchooseImage]
  }
  
  @scala.inline
  implicit class IchooseImageMutableBuilder[Self <: IchooseImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSizeType(value: js.Array[ImageSizeType]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: ImageSizeType*): Self = StObject.set(x, "sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: js.Array[ImageSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: ImageSourceType*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: LocalIds => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
