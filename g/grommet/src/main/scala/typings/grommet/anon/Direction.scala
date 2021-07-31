package typings.grommet.anon

import typings.grommet.grommetStrings.asc
import typings.grommet.grommetStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: asc | desc
  
  var external: js.UndefOr[Boolean] = js.undefined
  
  var property: String
}
object Direction {
  
  @scala.inline
  def apply(direction: asc | desc, property: String): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
