package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.srcTypesMod.TYPE.pound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoundElement
  extends StObject
     with _MessageFormatElement {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var `type`: pound
}
object PoundElement {
  
  @scala.inline
  def apply(`type`: pound): PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoundElement]
  }
  
  @scala.inline
  implicit class PoundElementMutableBuilder[Self <: PoundElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setType(value: pound): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
