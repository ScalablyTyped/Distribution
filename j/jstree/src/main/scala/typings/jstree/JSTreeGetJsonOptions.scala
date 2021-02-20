package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeGetJsonOptions extends StObject {
  
  /**
    * return flat JSON instead of nested
    */
  var flat: js.UndefOr[Boolean] = js.native
  
  /**
    * do not include A attributes
    */
  var no_a_attr: js.UndefOr[Boolean] = js.native
  
  /**
    * do not include children
    */
  var no_children: js.UndefOr[Boolean] = js.native
  
  /**
    * do not include node data
    */
  var no_data: js.UndefOr[Boolean] = js.native
  
  /**
    * do not return ID
    */
  var no_id: js.UndefOr[Boolean] = js.native
  
  /**
    * do not include LI attributes
    */
  var no_li_attr: js.UndefOr[Boolean] = js.native
  
  /**
    * do not return state information
    */
  var no_state: js.UndefOr[Boolean] = js.native
}
object JSTreeGetJsonOptions {
  
  @scala.inline
  def apply(): JSTreeGetJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeGetJsonOptions]
  }
  
  @scala.inline
  implicit class JSTreeGetJsonOptionsMutableBuilder[Self <: JSTreeGetJsonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    @scala.inline
    def setNo_a_attr(value: Boolean): Self = StObject.set(x, "no_a_attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_a_attrUndefined: Self = StObject.set(x, "no_a_attr", js.undefined)
    
    @scala.inline
    def setNo_children(value: Boolean): Self = StObject.set(x, "no_children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_childrenUndefined: Self = StObject.set(x, "no_children", js.undefined)
    
    @scala.inline
    def setNo_data(value: Boolean): Self = StObject.set(x, "no_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_dataUndefined: Self = StObject.set(x, "no_data", js.undefined)
    
    @scala.inline
    def setNo_id(value: Boolean): Self = StObject.set(x, "no_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_idUndefined: Self = StObject.set(x, "no_id", js.undefined)
    
    @scala.inline
    def setNo_li_attr(value: Boolean): Self = StObject.set(x, "no_li_attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_li_attrUndefined: Self = StObject.set(x, "no_li_attr", js.undefined)
    
    @scala.inline
    def setNo_state(value: Boolean): Self = StObject.set(x, "no_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_stateUndefined: Self = StObject.set(x, "no_state", js.undefined)
  }
}
