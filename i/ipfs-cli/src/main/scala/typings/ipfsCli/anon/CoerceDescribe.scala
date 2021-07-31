package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceDescribe extends StObject {
  
  def coerce(value: js.Any): Double
  
  var describe: String
  
  var `type`: String
}
object CoerceDescribe {
  
  @scala.inline
  def apply(coerce: js.Any => Double, describe: String, `type`: String): CoerceDescribe = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoerceDescribe]
  }
  
  @scala.inline
  implicit class CoerceDescribeMutableBuilder[Self <: CoerceDescribe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoerce(value: js.Any => Double): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
