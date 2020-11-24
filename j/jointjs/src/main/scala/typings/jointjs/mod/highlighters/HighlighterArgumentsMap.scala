package typings.jointjs.mod.highlighters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlighterArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  
  var addClass: AddClassHighlighterArguments = js.native
  
  var opacity: OpacityHighlighterArguments = js.native
  
  var stroke: StrokeHighlighterArguments = js.native
}
object HighlighterArgumentsMap {
  
  @scala.inline
  def apply(
    addClass: AddClassHighlighterArguments,
    opacity: OpacityHighlighterArguments,
    stroke: StrokeHighlighterArguments
  ): HighlighterArgumentsMap = {
    val __obj = js.Dynamic.literal(addClass = addClass.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlighterArgumentsMap]
  }
  
  @scala.inline
  implicit class HighlighterArgumentsMapOps[Self <: HighlighterArgumentsMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddClass(value: AddClassHighlighterArguments): Self = this.set("addClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: OpacityHighlighterArguments): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: StrokeHighlighterArguments): Self = this.set("stroke", value.asInstanceOf[js.Any])
  }
}
