package typings.jupyterlabDocregistry

import typings.jupyterlabServices.libContentsMod.Contents.ContentType
import typings.jupyterlabServices.libContentsMod.Contents.FileFormat
import typings.jupyterlabUiComponents.mod.LabIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/docregistry.@jupyterlab/docregistry/lib/registry.DocumentRegistry.IFileType> */
  trait PartialIFileType extends StObject {
    
    var contentType: js.UndefOr[ContentType] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var fileFormat: js.UndefOr[FileFormat] = js.undefined
    
    var icon: js.UndefOr[LabIcon] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconLabel: js.UndefOr[String] = js.undefined
    
    var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
  }
  object PartialIFileType {
    
    inline def apply(): PartialIFileType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIFileType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIFileType] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
      
      inline def setFileFormatNull: Self = StObject.set(x, "fileFormat", null)
      
      inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
      
      inline def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Kernel.IModel> */
  trait PartialIModel extends StObject {
    
    var connections: js.UndefOr[Double] = js.undefined
    
    var execution_state: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var last_activity: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var traceback: js.UndefOr[String] = js.undefined
  }
  object PartialIModel {
    
    inline def apply(): PartialIModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIModel] (val x: Self) extends AnyVal {
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setExecution_state(value: String): Self = StObject.set(x, "execution_state", value.asInstanceOf[js.Any])
      
      inline def setExecution_stateUndefined: Self = StObject.set(x, "execution_state", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLast_activity(value: String): Self = StObject.set(x, "last_activity", value.asInstanceOf[js.Any])
      
      inline def setLast_activityUndefined: Self = StObject.set(x, "last_activity", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTraceback(value: String): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
      
      inline def setTracebackUndefined: Self = StObject.set(x, "traceback", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Contents.IModel> */
  trait PartialIModelChunk extends StObject {
    
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
  object PartialIModelChunk {
    
    inline def apply(): PartialIModelChunk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModelChunk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIModelChunk] (val x: Self) extends AnyVal {
      
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
}
