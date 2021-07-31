package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasCoerceDescribe extends StObject {
  
  var alias: String
  
  def coerce(value: js.Any): js.Any
  
  var describe: String
  
  var `type`: String
}
object AliasCoerceDescribe {
  
  @scala.inline
  def apply(alias: String, coerce: js.Any => js.Any, describe: String, `type`: String): AliasCoerceDescribe = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasCoerceDescribe]
  }
  
  @scala.inline
  implicit class AliasCoerceDescribeMutableBuilder[Self <: AliasCoerceDescribe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerce(value: js.Any => js.Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
