package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，获取文件操作的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoFlags extends StObject {
  
  /**
    * 是否创建对象标记
    * 指示如果文件或目录不存在时是否进行创建，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var create: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 反向操作标记
    * 其本身没有任何效果，需与create属性值设置为true时一起使用，如果目标文件或目录已经存在则会导致文件或目录打开失败，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
}
object PlusIoFlags {
  
  @scala.inline
  def apply(): PlusIoFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoFlags]
  }
  
  @scala.inline
  implicit class PlusIoFlagsMutableBuilder[Self <: PlusIoFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}
