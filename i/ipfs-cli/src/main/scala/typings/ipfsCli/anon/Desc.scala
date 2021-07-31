package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desc extends StObject {
  
  var default: Boolean
  
  var alias: String
  
  var desc: String
  
  var `type`: String
}
object Desc {
  
  @scala.inline
  def apply(alias: String, default: Boolean, desc: String, `type`: String): Desc = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desc]
  }
  
  @scala.inline
  implicit class DescMutableBuilder[Self <: Desc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
