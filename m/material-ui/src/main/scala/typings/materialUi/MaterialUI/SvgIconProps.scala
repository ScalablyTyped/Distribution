package typings.materialUi.MaterialUI

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined ref, key */ @js.native
trait SvgIconProps
  extends SVGAttributes[js.Object] {
  
  var hoverColor: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var ref: js.UndefOr[LegacyRef[SvgIcon]] = js.native
}
object SvgIconProps {
  
  @scala.inline
  def apply(): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconProps]
  }
  
  @scala.inline
  implicit class SvgIconPropsMutableBuilder[Self <: SvgIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[SvgIcon]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ SvgIcon | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
