package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.typesMod.TYPE.pound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoundElement extends _MessageFormatElement {
  
  var location: js.UndefOr[Location] = js.native
  
  var `type`: pound = js.native
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
