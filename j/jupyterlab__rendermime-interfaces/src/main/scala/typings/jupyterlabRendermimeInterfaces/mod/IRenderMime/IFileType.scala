package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.LabIcon.IResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A file type to associate with the renderer.
  */
@js.native
trait IFileType extends StObject {
  
  /**
    * An optional display name for the file type.
    */
  val displayName: js.UndefOr[String] = js.native
  
  /**
    * The extensions of the file type (e.g. `".txt"`).  Can be a compound
    * extension (e.g. `".table.json`).
    */
  val extensions: js.Array[String] = js.native
  
  /**
    * The file format for the file type ('text', 'base64', or 'json').
    */
  val fileFormat: js.UndefOr[String] = js.native
  
  /**
    * The icon for the file type. Can either be a string containing the name
    * of an existing icon, or an object with {name, svgstr} fields, where
    * svgstr is a string containing the raw contents of an svg file.
    */
  val icon: js.UndefOr[IResolvable] = js.native
  
  /**
    * The icon class name for the file type.
    */
  val iconClass: js.UndefOr[String] = js.native
  
  /**
    * The icon label for the file type.
    */
  val iconLabel: js.UndefOr[String] = js.native
  
  /**
    * The mime types associated the file type.
    */
  val mimeTypes: js.Array[String] = js.native
  
  /**
    * The name of the file type.
    */
  val name: String = js.native
  
  /**
    * An optional pattern for a file name (e.g. `^Dockerfile$`).
    */
  val pattern: js.UndefOr[String] = js.native
}
object IFileType {
  
  @scala.inline
  def apply(extensions: js.Array[String], mimeTypes: js.Array[String], name: String): IFileType = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileType]
  }
  
  @scala.inline
  implicit class IFileTypeMutableBuilder[Self <: IFileType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFileFormat(value: String): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    @scala.inline
    def setIcon(value: IResolvable): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
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
    def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
