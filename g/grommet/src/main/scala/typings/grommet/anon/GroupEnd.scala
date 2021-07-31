package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupEnd extends StObject {
  
  var body: js.UndefOr[`14`] = js.undefined
  
  var groupEnd: js.UndefOr[`16`] = js.undefined
  
  var groupHeader: js.UndefOr[Fill] = js.undefined
  
  var header: js.UndefOr[Gap] = js.undefined
  
  var icons: js.UndefOr[Ascending] = js.undefined
  
  var pinned: js.UndefOr[Body] = js.undefined
  
  var primary: js.UndefOr[`18`] = js.undefined
  
  var resize: js.UndefOr[`17`] = js.undefined
}
object GroupEnd {
  
  @scala.inline
  def apply(): GroupEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEnd]
  }
  
  @scala.inline
  implicit class GroupEndMutableBuilder[Self <: GroupEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: `14`): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setGroupEnd(value: `16`): Self = StObject.set(x, "groupEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupEndUndefined: Self = StObject.set(x, "groupEnd", js.undefined)
    
    @scala.inline
    def setGroupHeader(value: Fill): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
    
    @scala.inline
    def setHeader(value: Gap): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setIcons(value: Ascending): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setPinned(value: Body): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setPrimary(value: `18`): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setResize(value: `17`): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
