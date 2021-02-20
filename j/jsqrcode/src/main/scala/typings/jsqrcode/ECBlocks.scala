package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECBlocks extends StObject {
  
  val ECCodewordsPerBlock: Double = js.native
  
  val NumBlocks: Double = js.native
  
  val TotalECCodewords: Double = js.native
  
  var ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
  
  var ecCodewordsPerBlock: Double = js.native
  
  def getECBlocks(): js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
}
object ECBlocks {
  
  @scala.inline
  def apply(
    ECCodewordsPerBlock: Double,
    NumBlocks: Double,
    TotalECCodewords: Double,
    ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]),
    ecCodewordsPerBlock: Double,
    getECBlocks: () => js.Array[ECB] | (js.Tuple2[ECB, ECB])
  ): ECBlocks = {
    val __obj = js.Dynamic.literal(ECCodewordsPerBlock = ECCodewordsPerBlock.asInstanceOf[js.Any], NumBlocks = NumBlocks.asInstanceOf[js.Any], TotalECCodewords = TotalECCodewords.asInstanceOf[js.Any], ecBlocks = ecBlocks.asInstanceOf[js.Any], ecCodewordsPerBlock = ecCodewordsPerBlock.asInstanceOf[js.Any], getECBlocks = js.Any.fromFunction0(getECBlocks))
    __obj.asInstanceOf[ECBlocks]
  }
  
  @scala.inline
  implicit class ECBlocksMutableBuilder[Self <: ECBlocks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setECCodewordsPerBlock(value: Double): Self = StObject.set(x, "ECCodewordsPerBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcBlocks(value: js.Array[ECB] | (js.Tuple2[ECB, ECB])): Self = StObject.set(x, "ecBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcBlocksVarargs(value: ECB*): Self = StObject.set(x, "ecBlocks", js.Array(value :_*))
    
    @scala.inline
    def setGetECBlocks(value: () => js.Array[ECB] | (js.Tuple2[ECB, ECB])): Self = StObject.set(x, "getECBlocks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumBlocks(value: Double): Self = StObject.set(x, "NumBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalECCodewords(value: Double): Self = StObject.set(x, "TotalECCodewords", value.asInstanceOf[js.Any])
  }
}
