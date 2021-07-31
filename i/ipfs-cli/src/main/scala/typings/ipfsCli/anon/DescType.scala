package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescType extends StObject {
  
  var default: String
  
  var desc: String
  
  var `type`: String
}
object DescType {
  
  @scala.inline
  def apply(default: String, desc: String, `type`: String): DescType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescType]
  }
  
  @scala.inline
  implicit class DescTypeMutableBuilder[Self <: DescType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
