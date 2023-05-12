package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merge_ extends StObject {
  
  var inV: EnumValue
  
  var onCreate: EnumValue
  
  var onMatch: EnumValue
  
  var outV: EnumValue
}
object Merge_ {
  
  inline def apply(inV: EnumValue, onCreate: EnumValue, onMatch: EnumValue, outV: EnumValue): Merge_ = {
    val __obj = js.Dynamic.literal(inV = inV.asInstanceOf[js.Any], onCreate = onCreate.asInstanceOf[js.Any], onMatch = onMatch.asInstanceOf[js.Any], outV = outV.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merge_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Merge_] (val x: Self) extends AnyVal {
    
    inline def setInV(value: EnumValue): Self = StObject.set(x, "inV", value.asInstanceOf[js.Any])
    
    inline def setOnCreate(value: EnumValue): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
    
    inline def setOnMatch(value: EnumValue): Self = StObject.set(x, "onMatch", value.asInstanceOf[js.Any])
    
    inline def setOutV(value: EnumValue): Self = StObject.set(x, "outV", value.asInstanceOf[js.Any])
  }
}
