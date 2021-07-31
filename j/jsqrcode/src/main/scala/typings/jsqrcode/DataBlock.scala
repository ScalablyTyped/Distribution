package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBlock extends StObject {
  
  val Codewords: js.Array[Double]
  
  val NumDataCodewords: Double
  
  var codewords: js.Array[Double]
  
  var numDataCodewords: Double
}
object DataBlock {
  
  @scala.inline
  def apply(
    Codewords: js.Array[Double],
    NumDataCodewords: Double,
    codewords: js.Array[Double],
    numDataCodewords: Double
  ): DataBlock = {
    val __obj = js.Dynamic.literal(Codewords = Codewords.asInstanceOf[js.Any], NumDataCodewords = NumDataCodewords.asInstanceOf[js.Any], codewords = codewords.asInstanceOf[js.Any], numDataCodewords = numDataCodewords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBlock]
  }
  
  @scala.inline
  implicit class DataBlockMutableBuilder[Self <: DataBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodewords(value: js.Array[Double]): Self = StObject.set(x, "Codewords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodewordsVarargs(value: Double*): Self = StObject.set(x, "Codewords", js.Array(value :_*))
    
    @scala.inline
    def setNumDataCodewords(value: Double): Self = StObject.set(x, "NumDataCodewords", value.asInstanceOf[js.Any])
  }
}
