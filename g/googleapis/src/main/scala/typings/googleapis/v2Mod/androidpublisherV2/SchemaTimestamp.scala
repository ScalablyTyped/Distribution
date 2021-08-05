package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimestamp extends StObject {
  
  var nanos: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[String] = js.undefined
}
object SchemaTimestamp {
  
  inline def apply(): SchemaTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestamp]
  }
  
  extension [Self <: SchemaTimestamp](x: Self) {
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
