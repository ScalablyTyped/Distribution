package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultType extends StObject {
  
  var default: Double
  
  var `type`: String
}
object DefaultType {
  
  @scala.inline
  def apply(default: Double, `type`: String): DefaultType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
  
  @scala.inline
  implicit class DefaultTypeMutableBuilder[Self <: DefaultType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
