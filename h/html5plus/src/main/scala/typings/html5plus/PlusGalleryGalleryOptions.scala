package typings.html5plus

import typings.html5plus.html5plusStrings.image
import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，从相册中选择文件的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
trait PlusGalleryGalleryOptions extends StObject {
  
  /**
    * 是否显示系统相册文件选择界面的动画
    * 可取值true、false，默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 选择文件保存的路径
    * 某些系统不能直接使用系统相册的路径，这时需要将选择的文件保存到应用可访问的目录中，可通过此参数设置保存文件的路径。
    *     如果路径中包括文件后缀名称，则表明指定文件路径及名称，否则仅指定文件保存目录，文件名称自动生成。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * 相册中选择文件类型过滤器
    * 系统相册选择器中可选择的文件类型，可设置为仅选择图片文件（“image”）、视频文件（“video”）或所有文件（“none”），默认值为“image”。
    * - image: 仅可选择图片文件
    * - video: 仅可选择视频文件
    * - none: 可选择图片或视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var filter: js.UndefOr[image | video | none] = js.undefined
  
  /**
    * 最多选择的图片数量
    * 仅在支持多选时有效，取值范围为1到Infinity，默认值为Infinity，即不限制选择的图片数。
    *     如果设置的值非法则使用默认值Infinity。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var maximum: js.UndefOr[Double] = js.undefined
  
  /**
    * 是否支持多选图片
    * 可从系统相册中选择多张图片，选择图片后通过GalleryMultiplePickSuccessCallback回调返回选择的图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 超过最多选择图片数量事件
    * 使用相册多选图片时，可通过maximum属性设置最多选择的图片数量，当用户操作选择的数量大于此时触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var onmaxed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 相册选择界面弹出指示区域
    * 对于大屏幕设备如iPad，相册选择界面为弹出窗口，此时可通过此参数设置弹出窗口位置。
    *     其为JSON对象，格式如{top:"10px",left:"10px",width:"200px",height:"200px"}，所有值为像素值，左上坐标相对于容器的位置，默认弹出位置为屏幕居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var popover: js.UndefOr[PlusGalleryPopPosition] = js.undefined
  
  /**
    * 已选择的图片路径列表
    * 仅在多图片选择时生效，相册选择界面将选中指定的图片路径列表。
    *     如果指定的路径无效，则忽略此项；如果指定的路径数超过maximum属性指定的最大选择数目则超出的图片不选中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var selected: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 是否使用系统相册文件选择界面
    * multiple属性设置为true时，如果系统自带相册选择控件时则优先使用，否则使用5+统一相册选择控件；设置为false则不使用系统自带相册选择控件，直接使用5+统一相册选择界面。
    *     默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var system: js.UndefOr[Boolean] = js.undefined
}
object PlusGalleryGalleryOptions {
  
  inline def apply(): PlusGalleryGalleryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGalleryGalleryOptions]
  }
  
  extension [Self <: PlusGalleryGalleryOptions](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFilter(value: image | video | none): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnmaxed(value: () => Unit): Self = StObject.set(x, "onmaxed", js.Any.fromFunction0(value))
    
    inline def setOnmaxedUndefined: Self = StObject.set(x, "onmaxed", js.undefined)
    
    inline def setPopover(value: PlusGalleryPopPosition): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    inline def setSelected(value: js.Array[Any]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: Any*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
