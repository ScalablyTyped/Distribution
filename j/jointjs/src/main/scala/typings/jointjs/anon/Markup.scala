package typings.jointjs.anon

import typings.jointjs.mod.dia.Element.PositionType
import typings.jointjs.mod.dia.MarkupJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Markup extends StObject {
  
  var markup: js.UndefOr[String | MarkupJSON] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
}
object Markup {
  
  @scala.inline
  def apply(): Markup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Markup]
  }
  
  @scala.inline
  implicit class MarkupMutableBuilder[Self <: Markup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkup(value: String | MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
