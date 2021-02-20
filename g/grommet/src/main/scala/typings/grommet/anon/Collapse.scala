package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapse extends StObject {
  
  var collapse: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var expand: js.UndefOr[js.Any] = js.native
}
object Collapse {
  
  @scala.inline
  def apply(): Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapse]
  }
  
  @scala.inline
  implicit class CollapseMutableBuilder[Self <: Collapse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: js.Any): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setExpand(value: js.Any): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
