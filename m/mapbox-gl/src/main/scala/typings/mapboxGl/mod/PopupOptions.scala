package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupOptions extends StObject {
  
  var anchor: js.UndefOr[Anchor] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeButton: js.UndefOr[Boolean] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * @param {boolean} [options.closeOnMove=false] If `true`, the popup will closed when the map moves.
    */
  var closeOnMove: js.UndefOr[Boolean] = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double | PointLike | StringDictionary[PointLike]] = js.native
}
object PopupOptions {
  
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  @scala.inline
  implicit class PopupOptionsMutableBuilder[Self <: PopupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setCloseOnMove(value: Boolean): Self = StObject.set(x, "closeOnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnMoveUndefined: Self = StObject.set(x, "closeOnMove", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | PointLike | StringDictionary[PointLike]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
