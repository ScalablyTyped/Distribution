package typings.jupyterlabServices.anon

import typings.jupyterlabServices.libContentsMod.Contents.ContentType
import typings.jupyterlabServices.libContentsMod.Contents.FileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel> */
trait PartialIModel extends StObject {
  
  var chunk: js.UndefOr[Double] = js.undefined
  
  var content: js.UndefOr[Any] = js.undefined
  
  var created: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[FileFormat] = js.undefined
  
  var indices: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var last_modified: js.UndefOr[String] = js.undefined
  
  var mimetype: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[ContentType] = js.undefined
  
  var writable: js.UndefOr[Boolean] = js.undefined
}
object PartialIModel {
  
  inline def apply(): PartialIModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIModel] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: Double): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setFormat(value: FileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesNull: Self = StObject.set(x, "indices", null)
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setLast_modified(value: String): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
    
    inline def setLast_modifiedUndefined: Self = StObject.set(x, "last_modified", js.undefined)
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
