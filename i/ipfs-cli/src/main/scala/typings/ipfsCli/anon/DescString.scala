package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescString extends StObject {
  
  var desc: String
  
  var `type`: String
}
object DescString {
  
  @scala.inline
  def apply(desc: String, `type`: String): DescString = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescString]
  }
  
  @scala.inline
  implicit class DescStringMutableBuilder[Self <: DescString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
