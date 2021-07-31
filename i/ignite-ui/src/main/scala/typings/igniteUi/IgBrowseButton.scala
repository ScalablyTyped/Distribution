package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgBrowseButton
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var autoselect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * M.H. 13 Feb 2014 Fix for bug #164347: Move input  from document body to the upload container
    */
  var container: js.UndefOr[js.Any] = js.undefined
  
  var multipleFiles: js.UndefOr[Boolean] = js.undefined
}
object IgBrowseButton {
  
  @scala.inline
  def apply(): IgBrowseButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBrowseButton]
  }
  
  @scala.inline
  implicit class IgBrowseButtonMutableBuilder[Self <: IgBrowseButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoselectUndefined: Self = StObject.set(x, "autoselect", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setMultipleFiles(value: Boolean): Self = StObject.set(x, "multipleFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleFilesUndefined: Self = StObject.set(x, "multipleFiles", js.undefined)
  }
}
