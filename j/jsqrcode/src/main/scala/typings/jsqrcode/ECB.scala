package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECB extends StObject {
  
  val Count: Double = js.native
  
  val DataCodewords: Double = js.native
  
  var count: Double = js.native
  
  var dataCodewords: Double = js.native
}
object ECB {
  
  @scala.inline
  def apply(Count: Double, DataCodewords: Double, count: Double, dataCodewords: Double): ECB = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DataCodewords = DataCodewords.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dataCodewords = dataCodewords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECB]
  }
  
  @scala.inline
  implicit class ECBMutableBuilder[Self <: ECB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCodewords(value: Double): Self = StObject.set(x, "DataCodewords", value.asInstanceOf[js.Any])
  }
}
