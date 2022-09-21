package typings.hyperformula

import typings.hyperformula.anon.Operator
import typings.hyperformula.arithmeticHelperMod.ArithmeticHelper
import typings.hyperformula.configMod.Config
import typings.hyperformula.interpreterValueMod.RawScalarValue
import typings.hyperformula.maybeMod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object criterionMod {
  
  @JSImport("hyperformula/typings/interpreter/Criterion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/Criterion", "CriterionBuilder")
  @js.native
  open class CriterionBuilder protected () extends StObject {
    def this(config: Config) = this()
    
    /* private */ var falseString: Any = js.native
    
    def fromCellValue(raw: RawScalarValue, arithmeticHelper: ArithmeticHelper): Maybe[CriterionPackage] = js.native
    
    def parseCriterion(criterion: RawScalarValue, arithmeticHelper: ArithmeticHelper): Maybe[Criterion] = js.native
    
    /* private */ var trueString: Any = js.native
  }
  
  @js.native
  sealed trait CriterionType extends StObject
  @JSImport("hyperformula/typings/interpreter/Criterion", "CriterionType")
  @js.native
  object CriterionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CriterionType & String] = js.native
    
    @js.native
    sealed trait EQUAL
      extends StObject
         with CriterionType
    /* "EQUAL" */ val EQUAL: typings.hyperformula.criterionMod.CriterionType.EQUAL & String = js.native
    
    @js.native
    sealed trait GREATER_THAN
      extends StObject
         with CriterionType
    /* "GREATER_THAN" */ val GREATER_THAN: typings.hyperformula.criterionMod.CriterionType.GREATER_THAN & String = js.native
    
    @js.native
    sealed trait GREATER_THAN_OR_EQUAL
      extends StObject
         with CriterionType
    /* "GREATER_THAN_OR_EQUAL" */ val GREATER_THAN_OR_EQUAL: typings.hyperformula.criterionMod.CriterionType.GREATER_THAN_OR_EQUAL & String = js.native
    
    @js.native
    sealed trait LESS_THAN
      extends StObject
         with CriterionType
    /* "LESS_THAN" */ val LESS_THAN: typings.hyperformula.criterionMod.CriterionType.LESS_THAN & String = js.native
    
    @js.native
    sealed trait LESS_THAN_OR_EQUAL
      extends StObject
         with CriterionType
    /* "LESS_THAN_OR_EQUAL" */ val LESS_THAN_OR_EQUAL: typings.hyperformula.criterionMod.CriterionType.LESS_THAN_OR_EQUAL & String = js.native
    
    @js.native
    sealed trait NOT_EQUAL
      extends StObject
         with CriterionType
    /* "NOT_EQUAL" */ val NOT_EQUAL: typings.hyperformula.criterionMod.CriterionType.NOT_EQUAL & String = js.native
  }
  
  inline def buildCriterion(operator: CriterionType): Operator = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCriterion")(operator.asInstanceOf[js.Any]).asInstanceOf[Operator]
  inline def buildCriterion(operator: CriterionType, value: String): Operator = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCriterion")(operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Operator]
  inline def buildCriterion(operator: CriterionType, value: Boolean): Operator = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCriterion")(operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Operator]
  inline def buildCriterion(operator: CriterionType, value: Double): Operator = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCriterion")(operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Operator]
  
  inline def buildCriterionLambda(criterion: Criterion, arithmeticHelper: ArithmeticHelper): CriterionLambda = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCriterionLambda")(criterion.asInstanceOf[js.Any], arithmeticHelper.asInstanceOf[js.Any])).asInstanceOf[CriterionLambda]
  
  trait Criterion extends StObject {
    
    var operator: CriterionType
    
    var value: Double | String | Boolean | Null
  }
  object Criterion {
    
    inline def apply(operator: CriterionType): Criterion = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Criterion]
    }
    
    extension [Self <: Criterion](x: Self) {
      
      inline def setOperator(value: CriterionType): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | String | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  type CriterionLambda = js.Function1[/* cellValue */ RawScalarValue, Boolean]
  
  trait CriterionPackage extends StObject {
    
    def lambda(cellValue: RawScalarValue): Boolean
    @JSName("lambda")
    var lambda_Original: CriterionLambda
    
    var raw: String | Double | Boolean
  }
  object CriterionPackage {
    
    inline def apply(lambda: /* cellValue */ RawScalarValue => Boolean, raw: String | Double | Boolean): CriterionPackage = {
      val __obj = js.Dynamic.literal(lambda = js.Any.fromFunction1(lambda), raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[CriterionPackage]
    }
    
    extension [Self <: CriterionPackage](x: Self) {
      
      inline def setLambda(value: /* cellValue */ RawScalarValue => Boolean): Self = StObject.set(x, "lambda", js.Any.fromFunction1(value))
      
      inline def setRaw(value: String | Double | Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
