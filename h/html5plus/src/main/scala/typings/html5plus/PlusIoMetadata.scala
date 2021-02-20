package typings.html5plus

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，保存文件或目录的状态信息对象
  * 可通过DirectoryEntry或FileEntry对象的getMetaData方法获取
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoMetadata extends StObject {
  
  /**
    * 包含的子目录数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var directoryCount: js.UndefOr[Double] = js.native
  
  /**
    * 目录的文件数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fileCount: js.UndefOr[Double] = js.native
  
  /**
    * 文件或目录的最后修改时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var modificationTime: js.UndefOr[Date] = js.native
  
  /**
    * 文件的大小
    * 若获取的是目录对象的属性则值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var size: js.UndefOr[Double] = js.native
}
object PlusIoMetadata {
  
  @scala.inline
  def apply(): PlusIoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoMetadata]
  }
  
  @scala.inline
  implicit class PlusIoMetadataMutableBuilder[Self <: PlusIoMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryCount(value: Double): Self = StObject.set(x, "directoryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryCountUndefined: Self = StObject.set(x, "directoryCount", js.undefined)
    
    @scala.inline
    def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCountUndefined: Self = StObject.set(x, "fileCount", js.undefined)
    
    @scala.inline
    def setModificationTime(value: Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationTimeUndefined: Self = StObject.set(x, "modificationTime", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
