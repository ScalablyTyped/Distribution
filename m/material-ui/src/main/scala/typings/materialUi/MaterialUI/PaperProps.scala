package typings.materialUi.MaterialUI

import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined ref, key */ trait PaperProps
  extends StObject
     with HTMLAttributes[js.Object] {
  
  var circle: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[Paper]] = js.undefined
  
  var rounded: js.UndefOr[Boolean] = js.undefined
  
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var zDepth: js.UndefOr[Double] = js.undefined
}
object PaperProps {
  
  @scala.inline
  def apply(): PaperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaperProps]
  }
  
  @scala.inline
  implicit class PaperPropsMutableBuilder[Self <: PaperProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[Paper]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Paper | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    @scala.inline
    def setTransitionEnabled(value: Boolean): Self = StObject.set(x, "transitionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEnabledUndefined: Self = StObject.set(x, "transitionEnabled", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
