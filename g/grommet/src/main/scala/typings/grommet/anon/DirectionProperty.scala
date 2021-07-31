package typings.grommet.anon

import typings.grommet.grommetStrings.asc
import typings.grommet.grommetStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionProperty extends StObject {
  
  var direction: asc | desc
  
  var property: String
}
object DirectionProperty {
  
  @scala.inline
  def apply(direction: asc | desc, property: String): DirectionProperty = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionProperty]
  }
  
  @scala.inline
  implicit class DirectionPropertyMutableBuilder[Self <: DirectionProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
