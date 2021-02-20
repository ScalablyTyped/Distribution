package typings.grommet.anon

import typings.grommet.utilsMod.OpacityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacityOpacityType extends StObject {
  
  var opacity: OpacityType = js.native
}
object OpacityOpacityType {
  
  @scala.inline
  def apply(opacity: OpacityType): OpacityOpacityType = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityOpacityType]
  }
  
  @scala.inline
  implicit class OpacityOpacityTypeMutableBuilder[Self <: OpacityOpacityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: OpacityType): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
