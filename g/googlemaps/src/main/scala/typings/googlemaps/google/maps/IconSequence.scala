package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSequence extends StObject {
  
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  
  // tslint:disable-next-line:no-unnecessary-qualifier
  var icon: js.UndefOr[Symbol] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
  
  var repeat: js.UndefOr[String] = js.undefined
}
object IconSequence {
  
  @scala.inline
  def apply(): IconSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSequence]
  }
  
  @scala.inline
  implicit class IconSequenceMutableBuilder[Self <: IconSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    @scala.inline
    def setIcon(value: Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
