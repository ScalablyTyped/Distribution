package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kafkajs.kafkajs.SeekEntry & {  high :string,   low :string} */
trait SeekEntryhighstringlowstr extends StObject {
  
  var high: String
  
  var low: String
  
  var offset: String
  
  var partition: Double
}
object SeekEntryhighstringlowstr {
  
  inline def apply(high: String, low: String, offset: String, partition: Double): SeekEntryhighstringlowstr = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekEntryhighstringlowstr]
  }
  
  extension [Self <: SeekEntryhighstringlowstr](x: Self) {
    
    inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
