package typings.mapboxGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenControlOptions extends StObject {
  
  /**
    * A compatible DOM element which should be made full screen.
    * By default, the map container element will be made full screen.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
}
object FullscreenControlOptions {
  
  @scala.inline
  def apply(): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlOptions]
  }
  
  @scala.inline
  implicit class FullscreenControlOptionsMutableBuilder[Self <: FullscreenControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
