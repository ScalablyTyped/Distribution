package typings.jupyterlabDocregistry

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import typings.jupyterlabUiComponents.mod.LabIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/docregistry.@jupyterlab/docregistry/lib/registry.DocumentRegistry.IFileType> */
  @js.native
  trait PartialIFileType extends StObject {
    
    var contentType: js.UndefOr[ContentType] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var fileFormat: js.UndefOr[FileFormat] = js.native
    
    var icon: js.UndefOr[LabIcon] = js.native
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconLabel: js.UndefOr[String] = js.native
    
    var mimeTypes: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var pattern: js.UndefOr[String] = js.native
  }
  object PartialIFileType {
    
    @scala.inline
    def apply(): PartialIFileType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIFileType]
    }
    
    @scala.inline
    implicit class PartialIFileTypeMutableBuilder[Self <: PartialIFileType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
      
      @scala.inline
      def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Kernel.IModel> */
  @js.native
  trait PartialIModel extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
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
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Contents.IModel> */
  @js.native
  trait PartialIModelChunk extends StObject {
    
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
  object PartialIModelChunk {
    
    @scala.inline
    def apply(): PartialIModelChunk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModelChunk]
    }
    
    @scala.inline
    implicit class PartialIModelChunkMutableBuilder[Self <: PartialIModelChunk] (val x: Self) extends AnyVal {
      
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
}
