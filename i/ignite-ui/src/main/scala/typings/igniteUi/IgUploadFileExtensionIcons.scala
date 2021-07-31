package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgUploadFileExtensionIcons
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Css classes which sets icon.
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Default icons when the file extension is not found. It is taken only the first item which have def set to true, other are ignored.
    */
  var `def`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of string for file extensions
    */
  var ext: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object IgUploadFileExtensionIcons {
  
  @scala.inline
  def apply(): IgUploadFileExtensionIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUploadFileExtensionIcons]
  }
  
  @scala.inline
  implicit class IgUploadFileExtensionIconsMutableBuilder[Self <: IgUploadFileExtensionIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDef(value: Boolean): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    @scala.inline
    def setExt(value: js.Array[js.Any]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: js.Any*): Self = StObject.set(x, "ext", js.Array(value :_*))
  }
}
