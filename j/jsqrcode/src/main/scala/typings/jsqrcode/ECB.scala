package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECB extends StObject {
  
  val Count: Double
  
  val DataCodewords: Double
  
  /* private */ var count: Double
  
  /* private */ var dataCodewords: Double
}
object ECB {
  
  inline def apply(Count: Double, DataCodewords: Double, count: Double, dataCodewords: Double): ECB = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DataCodewords = DataCodewords.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dataCodewords = dataCodewords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECB]
  }
  
  extension [Self <: ECB](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDataCodewords(value: Double): Self = StObject.set(x, "DataCodewords", value.asInstanceOf[js.Any])
  }
}
