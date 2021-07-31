package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 区域信息对象
  * 包括位置、大小等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjRect extends StObject {
  
  /**
    * 区域的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于作用对象的高度。
    *         内容自适应，如"wrap_content"，根据内容计算高度（如调用drawText绘制文本时支持）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * 区域左上角的水平偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于作用对象的宽度；
    *         自动计算，如"auto",根据width值自动计算，相对于作用对象水平居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var left: js.UndefOr[String] = js.undefined
  
  /**
    * 区域左上角的垂直偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于作用对象的高度；
    *         自动计算，如"auto",根据height值自动计算，相对于作用对象垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var top: js.UndefOr[String] = js.undefined
  
  /**
    * 区域的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于作用对象的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[String] = js.undefined
}
object PlusNativeObjRect {
  
  @scala.inline
  def apply(): PlusNativeObjRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjRect]
  }
  
  @scala.inline
  implicit class PlusNativeObjRectMutableBuilder[Self <: PlusNativeObjRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
