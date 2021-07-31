package typings.highcharts.mod

import typings.std.RegExp
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
  
  var regex: RegExp
}
object DataDateFormatObject {
  
  @scala.inline
  def apply(parser: /* match */ js.Array[Double] => Double, regex: RegExp): DataDateFormatObject = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser), regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDateFormatObject]
  }
  
  @scala.inline
  implicit class DataDateFormatObjectMutableBuilder[Self <: DataDateFormatObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternative(value: String): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
    
    @scala.inline
    def setParser(value: /* match */ js.Array[Double] => Double): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
