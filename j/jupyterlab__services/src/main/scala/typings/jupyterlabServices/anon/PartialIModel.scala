package typings.jupyterlabServices.anon

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel> */
@js.native
trait PartialIModel extends StObject {
  
  var chunk: js.UndefOr[Double] = js.native
  
  var content: js.UndefOr[js.Any] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[FileFormat] = js.native
  
  var last_modified: js.UndefOr[String] = js.native
  
  var mimetype: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[ContentType] = js.native
  
  var writable: js.UndefOr[Boolean] = js.native
}
object PartialIModel {
  
  @scala.inline
  def apply(): PartialIModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIModel]
  }
  
  @scala.inline
  implicit class PartialIModelMutableBuilder[Self <: PartialIModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunk(value: Double): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setFormat(value: FileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLast_modified(value: String): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modifiedUndefined: Self = StObject.set(x, "last_modified", js.undefined)
    
    @scala.inline
    def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
