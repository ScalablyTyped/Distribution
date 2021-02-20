package typings.jsonEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorObjectOptions extends StObject {
  
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the Edit JSON button will be hidden
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the Edit Properties button will be hidden
    */
  var disable_properties: js.UndefOr[Boolean] = js.native
}
object JSONEditorObjectOptions {
  
  @scala.inline
  def apply(): JSONEditorObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorObjectOptions]
  }
  
  @scala.inline
  implicit class JSONEditorObjectOptionsMutableBuilder[Self <: JSONEditorObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setDisable_collapse(value: Boolean): Self = StObject.set(x, "disable_collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_collapseUndefined: Self = StObject.set(x, "disable_collapse", js.undefined)
    
    @scala.inline
    def setDisable_edit_json(value: Boolean): Self = StObject.set(x, "disable_edit_json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_edit_jsonUndefined: Self = StObject.set(x, "disable_edit_json", js.undefined)
    
    @scala.inline
    def setDisable_properties(value: Boolean): Self = StObject.set(x, "disable_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_propertiesUndefined: Self = StObject.set(x, "disable_properties", js.undefined)
  }
}
