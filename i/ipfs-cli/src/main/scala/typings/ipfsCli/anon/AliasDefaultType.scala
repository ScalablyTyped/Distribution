package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasDefaultType extends StObject {
  
  var default: String
  
  var alias: String
  
  var `type`: String
}
object AliasDefaultType {
  
  @scala.inline
  def apply(alias: String, default: String, `type`: String): AliasDefaultType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultType]
  }
  
  @scala.inline
  implicit class AliasDefaultTypeMutableBuilder[Self <: AliasDefaultType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
