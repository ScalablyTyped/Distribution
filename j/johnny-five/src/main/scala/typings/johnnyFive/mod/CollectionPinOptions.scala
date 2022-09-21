package typings.johnnyFive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionPinOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var pins: js.Array[String | Double]
}
object CollectionPinOptions {
  
  inline def apply(pins: js.Array[String | Double]): CollectionPinOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPinOptions]
  }
  
  extension [Self <: CollectionPinOptions](x: Self) {
    
    inline def setPins(value: js.Array[String | Double]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setPinsVarargs(value: (String | Double)*): Self = StObject.set(x, "pins", js.Array(value*))
  }
}
