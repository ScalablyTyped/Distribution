package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure for alternative date formats to parse.
  */
trait DataDateFormatObject extends StObject {
  
  var alternative: js.UndefOr[String] = js.undefined
  
  def parser(`match`: js.Array[Double]): Double
  @JSName("parser")
  var parser_Original: typings.highcharts.dataMod.highchartsAugmentingMod.DataDateFormatCallbackFunction
  
  var regex: js.RegExp
}
object DataDateFormatObject {
  
  inline def apply(parser: /* match */ js.Array[Double] => Double, regex: js.RegExp): DataDateFormatObject = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser), regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDateFormatObject]
  }
  
  extension [Self <: DataDateFormatObject](x: Self) {
    
    inline def setAlternative(value: String): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
    
    inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
    
    inline def setParser(value: /* match */ js.Array[Double] => Double): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
