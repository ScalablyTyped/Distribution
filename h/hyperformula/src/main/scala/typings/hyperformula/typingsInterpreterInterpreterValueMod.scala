package typings.hyperformula

import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsCellMod.CellValueDetailedType
import typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterInterpreterValueMod {
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "CurrencyNumber")
  @js.native
  open class CurrencyNumber protected () extends RichNumber {
    def this(`val`: Double) = this()
    def this(`val`: Double, format: String) = this()
  }
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "DateNumber")
  @js.native
  open class DateNumber protected () extends RichNumber {
    def this(`val`: Double) = this()
    def this(`val`: Double, format: String) = this()
  }
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "DateTimeNumber")
  @js.native
  open class DateTimeNumber protected () extends RichNumber {
    def this(`val`: Double) = this()
    def this(`val`: Double, format: String) = this()
  }
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "EmptyValue")
  @js.native
  val EmptyValue: js.Symbol = js.native
  
  @js.native
  sealed trait NumberType
    extends StObject
       with CellValueDetailedType
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "NumberType")
  @js.native
  object NumberType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NumberType & String] = js.native
    
    @js.native
    sealed trait NUMBER_CURRENCY
      extends StObject
         with NumberType
    /* "NUMBER_CURRENCY" */ val NUMBER_CURRENCY: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_CURRENCY & String = js.native
    
    @js.native
    sealed trait NUMBER_DATE
      extends StObject
         with NumberType
    /* "NUMBER_DATE" */ val NUMBER_DATE: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_DATE & String = js.native
    
    @js.native
    sealed trait NUMBER_DATETIME
      extends StObject
         with NumberType
    /* "NUMBER_DATETIME" */ val NUMBER_DATETIME: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_DATETIME & String = js.native
    
    @js.native
    sealed trait NUMBER_PERCENT
      extends StObject
         with NumberType
    /* "NUMBER_PERCENT" */ val NUMBER_PERCENT: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_PERCENT & String = js.native
    
    @js.native
    sealed trait NUMBER_RAW
      extends StObject
         with NumberType
    /* "NUMBER_RAW" */ val NUMBER_RAW: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_RAW & String = js.native
    
    @js.native
    sealed trait NUMBER_TIME
      extends StObject
         with NumberType
    /* "NUMBER_TIME" */ val NUMBER_TIME: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_TIME & String = js.native
  }
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "PercentNumber")
  @js.native
  open class PercentNumber protected () extends RichNumber {
    def this(`val`: Double) = this()
    def this(`val`: Double, format: String) = this()
  }
  
  /* note: abstract class */ @JSImport("hyperformula/typings/interpreter/InterpreterValue", "RichNumber")
  @js.native
  open class RichNumber protected () extends StObject {
    def this(`val`: Double) = this()
    def this(`val`: Double, format: String) = this()
    
    var format: js.UndefOr[String] = js.native
    
    def fromNumber(`val`: Double): this.type = js.native
    
    def getDetailedType(): NumberType = js.native
    
    var `val`: Double = js.native
  }
  
  @JSImport("hyperformula/typings/interpreter/InterpreterValue", "TimeNumber")
  @js.native
  open class TimeNumber protected () extends RichNumber {
    def this(`val`: Double) = this()
    def this(`val`: Double, format: String) = this()
  }
  
  inline def cloneNumber(`val`: ExtendedNumber, newVal: Double): ExtendedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNumber")(`val`.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[ExtendedNumber]
  
  inline def getFormatOfExtendedNumber(num: ExtendedNumber): FormatInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatOfExtendedNumber")(num.asInstanceOf[js.Any]).asInstanceOf[FormatInfo]
  
  inline def getRawValue[T](num: T): Double | T = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawValue")(num.asInstanceOf[js.Any]).asInstanceOf[Double | T]
  inline def getRawValue[T](num: RichNumber): Double | T = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawValue")(num.asInstanceOf[js.Any]).asInstanceOf[Double | T]
  
  inline def getTypeFormatOfExtendedNumber(num: ExtendedNumber): NumberTypeWithFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeFormatOfExtendedNumber")(num.asInstanceOf[js.Any]).asInstanceOf[NumberTypeWithFormat]
  
  inline def getTypeOfExtendedNumber(num: ExtendedNumber): NumberType = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeOfExtendedNumber")(num.asInstanceOf[js.Any]).asInstanceOf[NumberType]
  
  inline def isExtendedNumber(`val`: Any): /* is hyperformula.hyperformula/typings/interpreter/InterpreterValue.ExtendedNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtendedNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is hyperformula.hyperformula/typings/interpreter/InterpreterValue.ExtendedNumber */ Boolean]
  
  type EmptyValueType = js.Symbol
  
  type ExtendedNumber = Double | RichNumber
  
  type FormatInfo = js.UndefOr[String]
  
  type InternalNoErrorScalarValue = RichNumber | RawNoErrorScalarValue
  
  type InternalScalarValue = RichNumber | RawScalarValue
  
  type InterpreterValue = RichNumber | RawInterpreterValue
  
  trait NumberTypeWithFormat extends StObject {
    
    var format: js.UndefOr[FormatInfo] = js.undefined
    
    var `type`: NumberType
  }
  object NumberTypeWithFormat {
    
    inline def apply(`type`: NumberType): NumberTypeWithFormat = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberTypeWithFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberTypeWithFormat] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: FormatInfo): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setType(value: NumberType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RawInterpreterValue = RawScalarValue | SimpleRangeValue
  
  type RawNoErrorScalarValue = Double | String | Boolean | EmptyValueType
  
  type RawScalarValue = RawNoErrorScalarValue | CellError
}
