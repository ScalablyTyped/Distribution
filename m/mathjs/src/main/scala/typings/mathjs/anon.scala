package typings.mathjs

import typings.mathjs.mathjsBooleans.`true`
import typings.mathjs.mathjsStrings.asc
import typings.mathjs.mathjsStrings.biased
import typings.mathjs.mathjsStrings.dense
import typings.mathjs.mathjsStrings.desc
import typings.mathjs.mathjsStrings.natural
import typings.mathjs.mathjsStrings.sparse
import typings.mathjs.mathjsStrings.unbiased
import typings.mathjs.mathjsStrings.uncorrected
import typings.mathjs.mod.BigNumber
import typings.mathjs.mod.Complex
import typings.mathjs.mod.ConfigOptions
import typings.mathjs.mod.CreateUnitOptions
import typings.mathjs.mod.EvalFunction
import typings.mathjs.mod.FactoryFunction
import typings.mathjs.mod.FactoryFunctionMap
import typings.mathjs.mod.FormatOptions
import typings.mathjs.mod.Fraction
import typings.mathjs.mod.Help
import typings.mathjs.mod.ImportObject
import typings.mathjs.mod.ImportOptions
import typings.mathjs.mod.Index
import typings.mathjs.mod.MathArray
import typings.mathjs.mod.MathExpression
import typings.mathjs.mod.MathJsChain
import typings.mathjs.mod.MathJsFunctionName
import typings.mathjs.mod.MathJsJson
import typings.mathjs.mod.MathJsStatic
import typings.mathjs.mod.MathNode
import typings.mathjs.mod.MathType
import typings.mathjs.mod.Matrix
import typings.mathjs.mod.NoLiteralType
import typings.mathjs.mod.Parser
import typings.mathjs.mod.PolarCoordinates
import typings.mathjs.mod.Unit
import typings.mathjs.mod.UnitDefinition
import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Coefficients extends StObject {
    
    var coefficients: js.Array[MathType] = js.native
    
    var expression: MathNode | String = js.native
    
    var variables: js.Array[String] = js.native
  }
  object Coefficients {
    
    @scala.inline
    def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): Coefficients = {
      val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coefficients]
    }
    
    @scala.inline
    implicit class CoefficientsMutableBuilder[Self <: Coefficients] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoefficients(value: js.Array[MathType]): Self = StObject.set(x, "coefficients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoefficientsVarargs(value: MathType*): Self = StObject.set(x, "coefficients", js.Array(value :_*))
      
      @scala.inline
      def setExpression(value: MathNode | String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: js.Array[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
  
  @js.native
  trait L extends StObject {
    
    var L: MathArray | Matrix = js.native
    
    var P: js.Array[Double] = js.native
    
    var U: MathArray | Matrix = js.native
  }
  object L {
    
    @scala.inline
    def apply(L: MathArray | Matrix, P: js.Array[Double], U: MathArray | Matrix): L = {
      val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
      __obj.asInstanceOf[L]
    }
    
    @scala.inline
    implicit class LMutableBuilder[Self <: L] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL(value: MathArray | Matrix): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "L", js.Array(value :_*))
      
      @scala.inline
      def setP(value: js.Array[Double]): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPVarargs(value: Double*): Self = StObject.set(x, "P", js.Array(value :_*))
      
      @scala.inline
      def setU(value: MathArray | Matrix): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "U", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<mathjs.mathjs.MathJsStatic> */
  @js.native
  trait PartialMathJsStatic extends StObject {
    
    var AccessorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ArrayNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var AssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var BigNumberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var BlockNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ChainDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ComplexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ConditionalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ConstantNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var DenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var FibonacciHeapDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var FractionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var FunctionAssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var FunctionNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var HelpDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ImmutableDenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var IndexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var IndexNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var Infinity: js.UndefOr[Double] = js.native
    
    var InfinityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var LN10: js.UndefOr[Double] = js.native
    
    var LN10Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var LN2: js.UndefOr[Double] = js.native
    
    var LN2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var LOG10E: js.UndefOr[Double] = js.native
    
    var LOG10EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var LOG2E: js.UndefOr[Double] = js.native
    
    var LOG2EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var MatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var NaN: js.UndefOr[Double] = js.native
    
    var NaNDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var NodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ObjectNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var OperatorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var PIDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ParenthesisNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ParserDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var RangeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var RangeNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var RelationalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ResultSetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var SQRT1_2: js.UndefOr[Double] = js.native
    
    var SQRT1_2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var SQRT2: js.UndefOr[Double] = js.native
    
    var SQRT2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var SpaDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var SparseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var SymbolNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var UnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var abs: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var absDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var acos: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var acosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var acosh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var acoshDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var acot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var acotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var acoth: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var acothDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var acsc: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var acscDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var acsch: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var acschDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var add: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
    
    var addDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var addScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var all: js.UndefOr[FactoryFunctionMap] = js.native
    
    var and: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.native
    
    var andDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var applyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var applyTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var arg: js.UndefOr[js.Function1[/* x */ Double | Complex, Double]] = js.native
    
    var argDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var asec: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var asecDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var asech: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var asechDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var asin: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var asinDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var asinh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var asinhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var atan: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var atan2: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Double]] = js.native
    
    var atan2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var atanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var atanh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var atanhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var atomicMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var avogadroDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bellNumbers: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.native
    
    var bellNumbersDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bignumber: js.UndefOr[
        js.Function1[
          /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null], 
          BigNumber
        ]
      ] = js.native
    
    var bignumberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bitAnd: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.native
    
    var bitAndDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bitNot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var bitNotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bitOr: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Double]] = js.native
    
    var bitOrDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bitXor: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.native
    
    var bitXorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bohrMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var bohrRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var boltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var boolean: js.UndefOr[
        js.Function1[
          /* x */ String | Double | Boolean | MathArray | Matrix | Null, 
          Boolean | MathArray | Matrix
        ]
      ] = js.native
    
    var booleanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var catalan: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.native
    
    var catalanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cbrt: js.UndefOr[js.Function2[/* x */ Double, /* allRoots */ js.UndefOr[Boolean], Double]] = js.native
    
    var cbrtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ceil: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var ceilDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var chain: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], MathJsChain]] = js.native
    
    var chainDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var classicalElectronRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cloneDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    @JSName("clone")
    var clone_FPartialMathJsStatic: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.native
    
    var columnDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var columnTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var combinations: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.native
    
    var combinationsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var compare: js.UndefOr[
        js.Function2[
          /* x */ MathType | String, 
          /* y */ MathType | String, 
          Double | BigNumber | Fraction | MathArray | Matrix
        ]
      ] = js.native
    
    var compareDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var compareNatural: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.native
    
    var compareNaturalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var compareText: js.UndefOr[
        js.Function2[
          /* x */ String | MathArray | Matrix, 
          /* y */ String | MathArray | Matrix, 
          Double | MathArray | Matrix
        ]
      ] = js.native
    
    var compareTextDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var compile: js.UndefOr[js.Function1[/* expr */ MathExpression, EvalFunction]] = js.native
    
    var compileDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var complex: js.UndefOr[js.Function1[/* arg */ js.UndefOr[Complex | String | PolarCoordinates], Complex]] = js.native
    
    var complexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var composition: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.native
    
    var compositionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var concat: js.UndefOr[js.Function1[/* repeated */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var concatDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var concatTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var conductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var config: js.UndefOr[js.Function1[/* options */ ConfigOptions, ConfigOptions]] = js.native
    
    var conj: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
        ]
      ] = js.native
    
    var conjDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cos: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var cosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cosh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var coshDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cot: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var cotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var coth: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var cothDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var coulombDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var create: js.UndefOr[
        js.Function2[
          /* factories */ FactoryFunctionMap, 
          /* config */ ConfigOptions, 
          Partial[MathJsStatic]
        ]
      ] = js.native
    
    var createUnit: js.UndefOr[
        js.Function3[
          /* name */ String, 
          /* definition */ js.UndefOr[String | UnitDefinition], 
          /* options */ js.UndefOr[CreateUnitOptions], 
          Unit
        ]
      ] = js.native
    
    var createUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cross: js.UndefOr[
        js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Matrix | MathArray]
      ] = js.native
    
    var crossDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var csc: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var cscDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var csch: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var cschDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ctransposeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var cube: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var cubeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var deepEqual: js.UndefOr[
        js.Function2[
          /* x */ MathType, 
          /* y */ MathType, 
          Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
        ]
      ] = js.native
    
    var deepEqualDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var derivative: js.UndefOr[
        js.Function3[
          /* expr */ MathNode | String, 
          /* variable */ MathNode | String, 
          /* options */ js.UndefOr[Simplify], 
          MathNode
        ]
      ] = js.native
    
    var derivativeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var det: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.native
    
    var detDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var deuteronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var diag: js.UndefOr[
        js.Function2[/* X */ MathArray | Matrix, /* format */ js.UndefOr[String], Matrix]
      ] = js.native
    
    var diagDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var distance: js.UndefOr[
        js.Function2[
          /* x */ MathArray | Matrix | js.Object, 
          /* y */ MathArray | Matrix | js.Object, 
          Double | BigNumber
        ]
      ] = js.native
    
    var distanceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var divide: js.UndefOr[js.Function2[/* x */ Unit, /* y */ Unit, Unit]] = js.native
    
    var divideDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var divideScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var dot: js.UndefOr[js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Double]] = js.native
    
    var dotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var dotDivide: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
    
    var dotDivideDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var dotMultiply: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
    
    var dotMultiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var dotPow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
    
    var dotPowDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var e: js.UndefOr[Double] = js.native
    
    var eDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var efimovFactorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var electricConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var electronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var elementaryChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var equal: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.native
    
    var equalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var equalScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var equalText: js.UndefOr[
        js.Function2[
          /* x */ String | MathArray | Matrix, 
          /* y */ String | MathArray | Matrix, 
          Double | MathArray | Matrix
        ]
      ] = js.native
    
    var equalTextDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var erf: js.UndefOr[
        js.Function1[/* x */ Double | MathArray | Matrix, NoLiteralType[Double | MathArray | Matrix]]
      ] = js.native
    
    var erfDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var evalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var evaluate: js.UndefOr[
        js.Function2[
          /* expr */ MathExpression | js.Array[MathExpression] | Matrix, 
          /* scope */ js.UndefOr[js.Object], 
          _
        ]
      ] = js.native
    
    var evaluateDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var exp: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var expDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var expm: js.UndefOr[js.Function1[/* x */ Matrix, Matrix]] = js.native
    
    var expm1: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var expm1Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var expmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var expression: js.UndefOr[MathNode] = js.native
    
    var eyeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var factorial: js.UndefOr[
        js.Function1[
          /* n */ Double | BigNumber | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.native
    
    var factorialDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var factory: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* dependencies */ js.Array[MathJsFunctionName], 
          /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], 
          /* meta */ js.UndefOr[js.Any], 
          FactoryFunction[_]
        ]
      ] = js.native
    
    var falseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var faradayDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var fermiCouplingDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var filter: js.UndefOr[
        js.Function2[
          /* x */ Matrix | MathArray | js.Array[String], 
          /* test */ (js.Function3[
            /* value */ js.Any, 
            /* index */ js.Any, 
            /* matrix */ Matrix | MathArray | js.Array[String], 
            Boolean
          ]) | RegExp, 
          Matrix | MathArray
        ]
      ] = js.native
    
    var filterDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var filterTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var fineStructureDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var firstRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var fix: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var fixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var flatten: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var flattenDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var floor: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var floorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var forEach: js.UndefOr[
        js.Function2[
          /* x */ Matrix | MathArray, 
          /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit], 
          scala.Unit
        ]
      ] = js.native
    
    var forEachDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var forEachTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var format: js.UndefOr[
        js.Function3[
          /* value */ js.Any, 
          /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], 
          /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]], 
          String
        ]
      ] = js.native
    
    var formatDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var fraction: js.UndefOr[
        js.Function1[/* args */ Fraction | MathArray | Matrix, Fraction | MathArray | Matrix]
      ] = js.native
    
    var fractionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var gamma: js.UndefOr[js.Function1[/* n */ Double | MathArray | Matrix, Double | MathArray | Matrix]] = js.native
    
    var gammaDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var gasConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var gcd: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.native
    
    var gcdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var getMatrixDataTypeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var gravitationConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var gravityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var hartreeEnergyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var hasNumericValueDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var help: js.UndefOr[js.Function1[/* search */ js.Function0[_], Help]] = js.native
    
    var helpDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var hypot: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.native
    
    var hypotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var i: js.UndefOr[Double] = js.native
    
    var iDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var identity: js.UndefOr[
        js.Function2[
          /* size */ Double | js.Array[Double] | Matrix | MathArray, 
          /* format */ js.UndefOr[String], 
          Matrix | MathArray | Double
        ]
      ] = js.native
    
    var identityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var im: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          Double | BigNumber | MathArray | Matrix
        ]
      ] = js.native
    
    var imDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var `import`: js.UndefOr[
        js.Function2[
          /* object */ ImportObject | js.Array[ImportObject], 
          /* options */ ImportOptions, 
          scala.Unit
        ]
      ] = js.native
    
    var index: js.UndefOr[js.Function1[/* repeated */ js.Any, Index]] = js.native
    
    var indexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var indexTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var intersect: js.UndefOr[
        js.Function4[
          /* w */ MathArray | Matrix, 
          /* x */ MathArray | Matrix, 
          /* y */ MathArray | Matrix, 
          /* z */ MathArray | Matrix, 
          MathArray
        ]
      ] = js.native
    
    var intersectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var inv: js.UndefOr[
        js.Function1[
          /* x */ Double | Complex | MathArray | Matrix, 
          NoLiteralType[Double | Complex | MathArray | Matrix]
        ]
      ] = js.native
    
    var invDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var inverseConductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isInteger: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix, Boolean]
      ] = js.native
    
    var isIntegerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isNaN: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
      ] = js.native
    
    var isNaNDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isNegative: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
      ] = js.native
    
    var isNegativeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isNumeric: js.UndefOr[js.Function1[/* x */ js.Any, Boolean]] = js.native
    
    var isNumericDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isPositive: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
      ] = js.native
    
    var isPositiveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isPrime: js.UndefOr[js.Function1[/* x */ Double | BigNumber | MathArray | Matrix, Boolean]] = js.native
    
    var isPrimeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var isZero: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex, 
          Boolean
        ]
      ] = js.native
    
    var isZeroDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var json: js.UndefOr[MathJsJson] = js.native
    
    var kldivergence: js.UndefOr[js.Function2[/* q */ MathArray | Matrix, /* p */ MathArray | Matrix, Double]] = js.native
    
    var kldivergenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var klitzingDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var kron: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ Matrix | MathArray, Matrix]] = js.native
    
    var kronDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var larger: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.native
    
    var largerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var largerEq: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.native
    
    var largerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var lcm: js.UndefOr[js.Function2[/* a */ Double, /* b */ Double, Double]] = js.native
    
    var lcmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var leftShift: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.native
    
    var leftShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var log: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          /* base */ js.UndefOr[Double | BigNumber | Complex], 
          NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
        ]
      ] = js.native
    
    var log10: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var log10Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var log1p: js.UndefOr[
        js.Function2[/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex], Double]
      ] = js.native
    
    var log1pDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var log2: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var log2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var logDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var loschmidtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var lsolve: js.UndefOr[
        js.Function2[/* L */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
      ] = js.native
    
    var lsolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var lup: js.UndefOr[js.Function1[/* A */ js.UndefOr[Matrix | MathArray], L]] = js.native
    
    var lupDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var lusolve: js.UndefOr[
        js.Function4[
          /* A */ Matrix | MathArray | Double, 
          /* b */ Matrix | MathArray, 
          /* order */ js.UndefOr[Double], 
          /* threshold */ js.UndefOr[Double], 
          Matrix | MathArray
        ]
      ] = js.native
    
    var lusolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var mad: js.UndefOr[js.Function1[/* array */ MathArray | Matrix, _]] = js.native
    
    var madDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var magneticConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var magneticFluxQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var map: js.UndefOr[
        js.Function2[
          /* x */ Matrix | MathArray, 
          /* callback */ js.Function3[
            /* value */ js.Any, 
            /* index */ js.Any, 
            /* matrix */ Matrix | MathArray, 
            MathType | String
          ], 
          Matrix | MathArray
        ]
      ] = js.native
    
    var mapDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var mapTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var matrix: js.UndefOr[js.Function1[/* format */ js.UndefOr[sparse | dense], Matrix]] = js.native
    
    var matrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var max: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
    
    var maxDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var maxTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var mean: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
    
    var meanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var meanTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var median: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
    
    var medianDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var min: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
    
    var minDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var minTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var mod: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Fraction | MathArray | Matrix, 
          /* y */ Double | BigNumber | Fraction | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
        ]
      ] = js.native
    
    var modDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var mode: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
    
    var modeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var molarMassC12Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var molarMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var molarPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var molarVolumeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var multinomial: js.UndefOr[
        js.Function1[/* a */ js.Array[Double | BigNumber], NoLiteralType[Double | BigNumber]]
      ] = js.native
    
    var multinomialDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var multiply: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ MathType, Matrix | MathArray]] = js.native
    
    var multiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var multiplyScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var neutronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var norm: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          /* p */ js.UndefOr[Double | BigNumber | String], 
          Double | BigNumber
        ]
      ] = js.native
    
    var normDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var not: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.native
    
    var notDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var nthRoot: js.UndefOr[
        js.Function2[
          /* a */ Double | BigNumber | MathArray | Matrix | Complex, 
          /* root */ js.UndefOr[Double | BigNumber], 
          Double | Complex | MathArray | Matrix
        ]
      ] = js.native
    
    var nthRootDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var nthRootsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var nuclearMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var `null`: js.UndefOr[Double] = js.native
    
    var nullDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var number: js.UndefOr[
        js.Function1[
          /* value */ js.UndefOr[
            String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
          ], 
          Double | MathArray | Matrix
        ]
      ] = js.native
    
    var numberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var numericDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var ones: js.UndefOr[
        js.Function2[
          /* size */ Double | js.Array[Double], 
          /* format */ js.UndefOr[String], 
          MathArray | Matrix
        ]
      ] = js.native
    
    var onesDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var or: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.native
    
    var orDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var parse: js.UndefOr[
        js.Function2[/* expr */ MathExpression, /* options */ js.UndefOr[js.Any], MathNode]
      ] = js.native
    
    var parseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var parser: js.UndefOr[js.Function0[Parser]] = js.native
    
    var parserDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var partitionSelect: js.UndefOr[
        js.Function3[
          /* x */ MathArray | Matrix, 
          /* k */ Double, 
          /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])], 
          _
        ]
      ] = js.native
    
    var partitionSelectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var permutations: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ js.UndefOr[Double | BigNumber], 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.native
    
    var permutationsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var phi: js.UndefOr[Double] = js.native
    
    var phiDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var pi: js.UndefOr[Double] = js.native
    
    var piDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var pickRandom: js.UndefOr[
        js.Function3[
          /* array */ js.Array[Double], 
          /* number */ js.UndefOr[Double], 
          /* weights */ js.UndefOr[js.Array[Double]], 
          Double | js.Array[Double]
        ]
      ] = js.native
    
    var pickRandomDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var planckChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var planckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var planckLengthDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var planckMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var planckTemperatureDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var planckTimeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var pow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ Double | BigNumber | Complex, MathType]] = js.native
    
    var powDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var print: js.UndefOr[
        js.Function4[
          /* template */ String, 
          /* values */ js.Any, 
          /* precision */ js.UndefOr[Double], 
          /* options */ js.UndefOr[Double | js.Object], 
          scala.Unit
        ]
      ] = js.native
    
    var printDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var prod: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
    
    var prodDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var protonMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var qr: js.UndefOr[js.Function1[/* A */ Matrix | MathArray, Q]] = js.native
    
    var qrDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var quantileSeq: js.UndefOr[
        js.Function3[
          /* A */ MathArray | Matrix, 
          /* prob */ Double | BigNumber | MathArray, 
          /* sorted */ js.UndefOr[Boolean], 
          Double | BigNumber | Unit | MathArray
        ]
      ] = js.native
    
    var quantileSeqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var quantumOfCirculationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var random: js.UndefOr[js.Function2[/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], Double]] = js.native
    
    var randomDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var randomInt: js.UndefOr[js.Function2[/* min */ Double, /* max */ js.UndefOr[Double], Double]] = js.native
    
    var randomIntDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var range: js.UndefOr[js.Function2[/* str */ String, /* includeEnd */ js.UndefOr[Boolean], Matrix]] = js.native
    
    var rangeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rangeTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rationalize: js.UndefOr[
        js.Function3[
          /* expr */ MathNode | String, 
          /* optional */ js.UndefOr[js.Object | Boolean], 
          /* detailed */ js.UndefOr[`true`], 
          Coefficients
        ]
      ] = js.native
    
    var rationalizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var re: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          Double | BigNumber | MathArray | Matrix
        ]
      ] = js.native
    
    var reDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var reducedPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var reshape: js.UndefOr[
        js.Function2[/* x */ MathArray | Matrix, /* sizes */ js.Array[Double], MathArray | Matrix]
      ] = js.native
    
    var reshapeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var resize: js.UndefOr[
        js.Function3[
          /* x */ MathArray | Matrix, 
          /* size */ MathArray | Matrix, 
          /* defaultValue */ js.UndefOr[Double | String], 
          MathArray | Matrix
        ]
      ] = js.native
    
    var resizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var reviverDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rightArithShift: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.native
    
    var rightArithShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rightLogShift: js.UndefOr[
        js.Function2[
          /* x */ Double | MathArray | Matrix, 
          /* y */ Double, 
          NoLiteralType[Double | MathArray | Matrix]
        ]
      ] = js.native
    
    var rightLogShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var round: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, 
          /* n */ js.UndefOr[Double | BigNumber | MathArray], 
          NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
        ]
      ] = js.native
    
    var roundDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rowDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rowTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var rydbergDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sackurTetrodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sec: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var secDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sech: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var sechDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var secondRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setCartesian: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.native
    
    var setCartesianDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setDifference: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.native
    
    var setDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setDistinct: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var setDistinctDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setIntersect: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.native
    
    var setIntersectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setIsSubset: js.UndefOr[js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, Boolean]] = js.native
    
    var setIsSubsetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setMultiplicity: js.UndefOr[
        js.Function2[/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix, Double]
      ] = js.native
    
    var setMultiplicityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setPowerset: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var setPowersetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setSize: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, Double]] = js.native
    
    var setSizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setSymDifference: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.native
    
    var setSymDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var setUnion: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.native
    
    var setUnionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sign: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var signDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var simplify: js.UndefOr[
        js.Function3[
          /* expr */ MathNode | String, 
          /* rules */ js.UndefOr[js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]], 
          /* scope */ js.UndefOr[js.Object], 
          MathNode
        ]
      ] = js.native
    
    var simplifyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sin: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var sinDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sinh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var sinhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var size: js.UndefOr[
        js.Function1[
          /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix, 
          MathArray | Matrix
        ]
      ] = js.native
    
    var sizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var slu: js.UndefOr[
        js.Function3[/* A */ Matrix, /* order */ Double, /* threshold */ Double, js.Object]
      ] = js.native
    
    var sluDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var smaller: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.native
    
    var smallerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var smallerEq: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.native
    
    var smallerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sort: js.UndefOr[
        js.Function2[
          /* x */ Matrix | MathArray, 
          /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural, 
          Matrix | MathArray
        ]
      ] = js.native
    
    var sortDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sparse: js.UndefOr[
        js.Function2[/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String], Matrix]
      ] = js.native
    
    var sparseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var speedOfLightDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var splitUnit: js.UndefOr[js.Function2[/* unit */ Unit, /* parts */ js.Array[Unit], js.Array[Unit]]] = js.native
    
    var splitUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sqrt: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var sqrtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sqrtm: js.UndefOr[js.Function1[/* A */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var sqrtmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var square: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var squareDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var squeeze: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var squeezeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var std: js.UndefOr[
        js.Function2[
          /* array */ MathArray | Matrix, 
          /* normalization */ js.UndefOr[unbiased | uncorrected | biased], 
          Double
        ]
      ] = js.native
    
    var stdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var stdTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var stefanBoltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var stirlingS2: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.native
    
    var stirlingS2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var string: js.UndefOr[js.Function1[/* value */ MathType | Null, String | MathArray | Matrix]] = js.native
    
    var stringDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var subset: js.UndefOr[
        js.Function4[
          /* value */ MathArray | Matrix | String, 
          /* index */ Index, 
          /* replacement */ js.UndefOr[js.Any], 
          /* defaultValue */ js.UndefOr[js.Any], 
          MathArray | Matrix | String
        ]
      ] = js.native
    
    var subsetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var subsetTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var subtract: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
    
    var subtractDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sum: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.native
    
    var sumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var sumTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var tan: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var tanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var tanh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
    
    var tanhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var tau: js.UndefOr[Double] = js.native
    
    var tauDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var thomsonCrossSectionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var to: js.UndefOr[
        js.Function2[
          /* x */ Unit | MathArray | Matrix, 
          /* unit */ Unit | String, 
          Unit | MathArray | Matrix
        ]
      ] = js.native
    
    var toDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var trace: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.native
    
    var traceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var transpose: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
    
    var transposeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var trueDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var typeOf: js.UndefOr[js.Function1[/* x */ js.Any, String]] = js.native
    
    var typeOfDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var typed: js.UndefOr[
        js.Function2[
          /* name */ String, 
          /* signatures */ Record[String, js.Function1[/* repeated */ _, _]], 
          js.Function1[/* repeated */ _, _]
        ]
      ] = js.native
    
    var typedDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var typeofDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var unaryMinus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var unaryMinusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var unaryPlus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var unaryPlusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var unequal: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.native
    
    var unequalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var uninitialized: js.UndefOr[js.Any] = js.native
    
    var unit: js.UndefOr[js.Function1[/* unit */ String, Unit]] = js.native
    
    var unitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var usolve: js.UndefOr[
        js.Function2[/* U */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
      ] = js.native
    
    var usolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var vacuumImpedanceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var varDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var variance: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.native
    
    var varianceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var varianceTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var versionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var weakMixingAngleDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var wienDisplacementDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var xgcd: js.UndefOr[js.Function2[/* a */ Double | BigNumber, /* b */ Double | BigNumber, MathArray]] = js.native
    
    var xgcdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var xor: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.native
    
    var xorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
    
    var zeros: js.UndefOr[
        js.Function2[
          /* size */ Double | js.Array[Double], 
          /* format */ js.UndefOr[String], 
          MathArray | Matrix
        ]
      ] = js.native
    
    var zerosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  }
  object PartialMathJsStatic {
    
    @scala.inline
    def apply(): PartialMathJsStatic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMathJsStatic]
    }
    
    @scala.inline
    implicit class PartialMathJsStaticMutableBuilder[Self <: PartialMathJsStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbs(value: /* x */ Double => Double): Self = StObject.set(x, "abs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAbsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "absDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsDependenciesUndefined: Self = StObject.set(x, "absDependencies", js.undefined)
      
      @scala.inline
      def setAbsUndefined: Self = StObject.set(x, "abs", js.undefined)
      
      @scala.inline
      def setAccessorNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "AccessorNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorNodeDependenciesUndefined: Self = StObject.set(x, "AccessorNodeDependencies", js.undefined)
      
      @scala.inline
      def setAcos(value: /* x */ Double => Double): Self = StObject.set(x, "acos", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcosDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acosDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcosDependenciesUndefined: Self = StObject.set(x, "acosDependencies", js.undefined)
      
      @scala.inline
      def setAcosUndefined: Self = StObject.set(x, "acos", js.undefined)
      
      @scala.inline
      def setAcosh(value: /* x */ Double => Double): Self = StObject.set(x, "acosh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcoshDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acoshDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcoshDependenciesUndefined: Self = StObject.set(x, "acoshDependencies", js.undefined)
      
      @scala.inline
      def setAcoshUndefined: Self = StObject.set(x, "acosh", js.undefined)
      
      @scala.inline
      def setAcot(value: /* x */ Double => Double): Self = StObject.set(x, "acot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acotDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcotDependenciesUndefined: Self = StObject.set(x, "acotDependencies", js.undefined)
      
      @scala.inline
      def setAcotUndefined: Self = StObject.set(x, "acot", js.undefined)
      
      @scala.inline
      def setAcoth(value: /* x */ Double => Double): Self = StObject.set(x, "acoth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcothDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acothDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcothDependenciesUndefined: Self = StObject.set(x, "acothDependencies", js.undefined)
      
      @scala.inline
      def setAcothUndefined: Self = StObject.set(x, "acoth", js.undefined)
      
      @scala.inline
      def setAcsc(value: /* x */ Double => Double): Self = StObject.set(x, "acsc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcscDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acscDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcscDependenciesUndefined: Self = StObject.set(x, "acscDependencies", js.undefined)
      
      @scala.inline
      def setAcscUndefined: Self = StObject.set(x, "acsc", js.undefined)
      
      @scala.inline
      def setAcsch(value: /* x */ Double => Double): Self = StObject.set(x, "acsch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcschDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acschDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcschDependenciesUndefined: Self = StObject.set(x, "acschDependencies", js.undefined)
      
      @scala.inline
      def setAcschUndefined: Self = StObject.set(x, "acsch", js.undefined)
      
      @scala.inline
      def setAdd(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "addDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddDependenciesUndefined: Self = StObject.set(x, "addDependencies", js.undefined)
      
      @scala.inline
      def setAddScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "addScalarDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddScalarDependenciesUndefined: Self = StObject.set(x, "addScalarDependencies", js.undefined)
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setAll(value: FactoryFunctionMap): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setAnd(
        value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "and", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAndDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "andDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndDependenciesUndefined: Self = StObject.set(x, "andDependencies", js.undefined)
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
      
      @scala.inline
      def setApplyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "applyDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyDependenciesUndefined: Self = StObject.set(x, "applyDependencies", js.undefined)
      
      @scala.inline
      def setApplyTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "applyTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyTransformDependenciesUndefined: Self = StObject.set(x, "applyTransformDependencies", js.undefined)
      
      @scala.inline
      def setArg(value: /* x */ Double | Complex => Double): Self = StObject.set(x, "arg", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArgDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "argDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgDependenciesUndefined: Self = StObject.set(x, "argDependencies", js.undefined)
      
      @scala.inline
      def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      @scala.inline
      def setArrayNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ArrayNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayNodeDependenciesUndefined: Self = StObject.set(x, "ArrayNodeDependencies", js.undefined)
      
      @scala.inline
      def setAsec(value: /* x */ Double => Double): Self = StObject.set(x, "asec", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsecDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asecDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsecDependenciesUndefined: Self = StObject.set(x, "asecDependencies", js.undefined)
      
      @scala.inline
      def setAsecUndefined: Self = StObject.set(x, "asec", js.undefined)
      
      @scala.inline
      def setAsech(value: /* x */ Double => Double): Self = StObject.set(x, "asech", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsechDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asechDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsechDependenciesUndefined: Self = StObject.set(x, "asechDependencies", js.undefined)
      
      @scala.inline
      def setAsechUndefined: Self = StObject.set(x, "asech", js.undefined)
      
      @scala.inline
      def setAsin(value: /* x */ Double => Double): Self = StObject.set(x, "asin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsinDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asinDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsinDependenciesUndefined: Self = StObject.set(x, "asinDependencies", js.undefined)
      
      @scala.inline
      def setAsinUndefined: Self = StObject.set(x, "asin", js.undefined)
      
      @scala.inline
      def setAsinh(value: /* x */ Double => Double): Self = StObject.set(x, "asinh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsinhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asinhDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsinhDependenciesUndefined: Self = StObject.set(x, "asinhDependencies", js.undefined)
      
      @scala.inline
      def setAsinhUndefined: Self = StObject.set(x, "asinh", js.undefined)
      
      @scala.inline
      def setAssignmentNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "AssignmentNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentNodeDependenciesUndefined: Self = StObject.set(x, "AssignmentNodeDependencies", js.undefined)
      
      @scala.inline
      def setAtan(value: /* x */ Double => Double): Self = StObject.set(x, "atan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAtan2(value: (/* y */ Double, /* x */ Double) => Double): Self = StObject.set(x, "atan2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAtan2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atan2Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtan2DependenciesUndefined: Self = StObject.set(x, "atan2Dependencies", js.undefined)
      
      @scala.inline
      def setAtan2Undefined: Self = StObject.set(x, "atan2", js.undefined)
      
      @scala.inline
      def setAtanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atanDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtanDependenciesUndefined: Self = StObject.set(x, "atanDependencies", js.undefined)
      
      @scala.inline
      def setAtanUndefined: Self = StObject.set(x, "atan", js.undefined)
      
      @scala.inline
      def setAtanh(value: /* x */ Double => Double): Self = StObject.set(x, "atanh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAtanhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atanhDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtanhDependenciesUndefined: Self = StObject.set(x, "atanhDependencies", js.undefined)
      
      @scala.inline
      def setAtanhUndefined: Self = StObject.set(x, "atanh", js.undefined)
      
      @scala.inline
      def setAtomicMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atomicMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtomicMassDependenciesUndefined: Self = StObject.set(x, "atomicMassDependencies", js.undefined)
      
      @scala.inline
      def setAvogadroDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "avogadroDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvogadroDependenciesUndefined: Self = StObject.set(x, "avogadroDependencies", js.undefined)
      
      @scala.inline
      def setBellNumbers(value: /* n */ Double => Double): Self = StObject.set(x, "bellNumbers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBellNumbersDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bellNumbersDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBellNumbersDependenciesUndefined: Self = StObject.set(x, "bellNumbersDependencies", js.undefined)
      
      @scala.inline
      def setBellNumbersUndefined: Self = StObject.set(x, "bellNumbers", js.undefined)
      
      @scala.inline
      def setBigNumberDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "BigNumberDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigNumberDependenciesUndefined: Self = StObject.set(x, "BigNumberDependencies", js.undefined)
      
      @scala.inline
      def setBignumber(
        value: /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null] => BigNumber
      ): Self = StObject.set(x, "bignumber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBignumberUndefined: Self = StObject.set(x, "bignumber", js.undefined)
      
      @scala.inline
      def setBitAnd(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "bitAnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBitAndDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitAndDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitAndDependenciesUndefined: Self = StObject.set(x, "bitAndDependencies", js.undefined)
      
      @scala.inline
      def setBitAndUndefined: Self = StObject.set(x, "bitAnd", js.undefined)
      
      @scala.inline
      def setBitNot(value: /* x */ Double => Double): Self = StObject.set(x, "bitNot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBitNotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitNotDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitNotDependenciesUndefined: Self = StObject.set(x, "bitNotDependencies", js.undefined)
      
      @scala.inline
      def setBitNotUndefined: Self = StObject.set(x, "bitNot", js.undefined)
      
      @scala.inline
      def setBitOr(value: (/* x */ Double, /* y */ Double) => Double): Self = StObject.set(x, "bitOr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBitOrDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitOrDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitOrDependenciesUndefined: Self = StObject.set(x, "bitOrDependencies", js.undefined)
      
      @scala.inline
      def setBitOrUndefined: Self = StObject.set(x, "bitOr", js.undefined)
      
      @scala.inline
      def setBitXor(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "bitXor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBitXorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitXorDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitXorDependenciesUndefined: Self = StObject.set(x, "bitXorDependencies", js.undefined)
      
      @scala.inline
      def setBitXorUndefined: Self = StObject.set(x, "bitXor", js.undefined)
      
      @scala.inline
      def setBlockNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "BlockNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNodeDependenciesUndefined: Self = StObject.set(x, "BlockNodeDependencies", js.undefined)
      
      @scala.inline
      def setBohrMagnetonDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bohrMagnetonDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBohrMagnetonDependenciesUndefined: Self = StObject.set(x, "bohrMagnetonDependencies", js.undefined)
      
      @scala.inline
      def setBohrRadiusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bohrRadiusDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBohrRadiusDependenciesUndefined: Self = StObject.set(x, "bohrRadiusDependencies", js.undefined)
      
      @scala.inline
      def setBoltzmannDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "boltzmannDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoltzmannDependenciesUndefined: Self = StObject.set(x, "boltzmannDependencies", js.undefined)
      
      @scala.inline
      def setBoolean(
        value: /* x */ String | Double | Boolean | MathArray | Matrix | Null => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBooleanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "booleanDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanDependenciesUndefined: Self = StObject.set(x, "booleanDependencies", js.undefined)
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setCatalan(value: /* n */ Double => Double): Self = StObject.set(x, "catalan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCatalanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "catalanDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalanDependenciesUndefined: Self = StObject.set(x, "catalanDependencies", js.undefined)
      
      @scala.inline
      def setCatalanUndefined: Self = StObject.set(x, "catalan", js.undefined)
      
      @scala.inline
      def setCbrt(value: (/* x */ Double, /* allRoots */ js.UndefOr[Boolean]) => Double): Self = StObject.set(x, "cbrt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCbrtDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cbrtDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCbrtDependenciesUndefined: Self = StObject.set(x, "cbrtDependencies", js.undefined)
      
      @scala.inline
      def setCbrtUndefined: Self = StObject.set(x, "cbrt", js.undefined)
      
      @scala.inline
      def setCeil(value: /* x */ Double => Double): Self = StObject.set(x, "ceil", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCeilDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ceilDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCeilDependenciesUndefined: Self = StObject.set(x, "ceilDependencies", js.undefined)
      
      @scala.inline
      def setCeilUndefined: Self = StObject.set(x, "ceil", js.undefined)
      
      @scala.inline
      def setChain(value: /* value */ js.UndefOr[js.Any] => MathJsChain): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChainDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ChainDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainDependenciesUndefined: Self = StObject.set(x, "ChainDependencies", js.undefined)
      
      @scala.inline
      def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      @scala.inline
      def setClassicalElectronRadiusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "classicalElectronRadiusDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassicalElectronRadiusDependenciesUndefined: Self = StObject.set(x, "classicalElectronRadiusDependencies", js.undefined)
      
      @scala.inline
      def setCloneDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cloneDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneDependenciesUndefined: Self = StObject.set(x, "cloneDependencies", js.undefined)
      
      @scala.inline
      def setClone_(value: /* x */ js.Any => _): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setColumnDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "columnDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDependenciesUndefined: Self = StObject.set(x, "columnDependencies", js.undefined)
      
      @scala.inline
      def setColumnTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "columnTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnTransformDependenciesUndefined: Self = StObject.set(x, "columnTransformDependencies", js.undefined)
      
      @scala.inline
      def setCombinations(
        value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "combinations", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCombinationsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "combinationsDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombinationsDependenciesUndefined: Self = StObject.set(x, "combinationsDependencies", js.undefined)
      
      @scala.inline
      def setCombinationsUndefined: Self = StObject.set(x, "combinations", js.undefined)
      
      @scala.inline
      def setCompare(
        value: (/* x */ MathType | String, /* y */ MathType | String) => Double | BigNumber | Fraction | MathArray | Matrix
      ): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompareDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compareDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareDependenciesUndefined: Self = StObject.set(x, "compareDependencies", js.undefined)
      
      @scala.inline
      def setCompareNatural(value: (/* x */ js.Any, /* y */ js.Any) => Double): Self = StObject.set(x, "compareNatural", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompareNaturalDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compareNaturalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareNaturalDependenciesUndefined: Self = StObject.set(x, "compareNaturalDependencies", js.undefined)
      
      @scala.inline
      def setCompareNaturalUndefined: Self = StObject.set(x, "compareNatural", js.undefined)
      
      @scala.inline
      def setCompareText(
        value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
      ): Self = StObject.set(x, "compareText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompareTextDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compareTextDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareTextDependenciesUndefined: Self = StObject.set(x, "compareTextDependencies", js.undefined)
      
      @scala.inline
      def setCompareTextUndefined: Self = StObject.set(x, "compareText", js.undefined)
      
      @scala.inline
      def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      @scala.inline
      def setCompile(value: /* expr */ MathExpression => EvalFunction): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompileDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compileDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDependenciesUndefined: Self = StObject.set(x, "compileDependencies", js.undefined)
      
      @scala.inline
      def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      @scala.inline
      def setComplex(value: /* arg */ js.UndefOr[Complex | String | PolarCoordinates] => Complex): Self = StObject.set(x, "complex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComplexDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ComplexDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexDependenciesUndefined: Self = StObject.set(x, "ComplexDependencies", js.undefined)
      
      @scala.inline
      def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
      
      @scala.inline
      def setComposition(
        value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "composition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compositionDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositionDependenciesUndefined: Self = StObject.set(x, "compositionDependencies", js.undefined)
      
      @scala.inline
      def setCompositionUndefined: Self = StObject.set(x, "composition", js.undefined)
      
      @scala.inline
      def setConcat(value: /* repeated */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConcatDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "concatDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatDependenciesUndefined: Self = StObject.set(x, "concatDependencies", js.undefined)
      
      @scala.inline
      def setConcatTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "concatTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatTransformDependenciesUndefined: Self = StObject.set(x, "concatTransformDependencies", js.undefined)
      
      @scala.inline
      def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      @scala.inline
      def setConditionalNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ConditionalNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalNodeDependenciesUndefined: Self = StObject.set(x, "ConditionalNodeDependencies", js.undefined)
      
      @scala.inline
      def setConductanceQuantumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "conductanceQuantumDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConductanceQuantumDependenciesUndefined: Self = StObject.set(x, "conductanceQuantumDependencies", js.undefined)
      
      @scala.inline
      def setConfig(value: /* options */ ConfigOptions => ConfigOptions): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConj(
        value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "conj", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConjDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "conjDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjDependenciesUndefined: Self = StObject.set(x, "conjDependencies", js.undefined)
      
      @scala.inline
      def setConjUndefined: Self = StObject.set(x, "conj", js.undefined)
      
      @scala.inline
      def setConstantNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ConstantNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantNodeDependenciesUndefined: Self = StObject.set(x, "ConstantNodeDependencies", js.undefined)
      
      @scala.inline
      def setCos(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "cos", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCosDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cosDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCosDependenciesUndefined: Self = StObject.set(x, "cosDependencies", js.undefined)
      
      @scala.inline
      def setCosUndefined: Self = StObject.set(x, "cos", js.undefined)
      
      @scala.inline
      def setCosh(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "cosh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoshDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "coshDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoshDependenciesUndefined: Self = StObject.set(x, "coshDependencies", js.undefined)
      
      @scala.inline
      def setCoshUndefined: Self = StObject.set(x, "cosh", js.undefined)
      
      @scala.inline
      def setCot(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "cot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cotDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCotDependenciesUndefined: Self = StObject.set(x, "cotDependencies", js.undefined)
      
      @scala.inline
      def setCotUndefined: Self = StObject.set(x, "cot", js.undefined)
      
      @scala.inline
      def setCoth(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "coth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCothDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cothDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCothDependenciesUndefined: Self = StObject.set(x, "cothDependencies", js.undefined)
      
      @scala.inline
      def setCothUndefined: Self = StObject.set(x, "coth", js.undefined)
      
      @scala.inline
      def setCoulombDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "coulombDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoulombDependenciesUndefined: Self = StObject.set(x, "coulombDependencies", js.undefined)
      
      @scala.inline
      def setCreate(value: (/* factories */ FactoryFunctionMap, /* config */ ConfigOptions) => Partial[MathJsStatic]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCreateUnit(
        value: (/* name */ String, /* definition */ js.UndefOr[String | UnitDefinition], /* options */ js.UndefOr[CreateUnitOptions]) => Unit
      ): Self = StObject.set(x, "createUnit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateUnitDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "createUnitDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUnitDependenciesUndefined: Self = StObject.set(x, "createUnitDependencies", js.undefined)
      
      @scala.inline
      def setCreateUnitUndefined: Self = StObject.set(x, "createUnit", js.undefined)
      
      @scala.inline
      def setCross(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Matrix | MathArray): Self = StObject.set(x, "cross", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCrossDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "crossDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossDependenciesUndefined: Self = StObject.set(x, "crossDependencies", js.undefined)
      
      @scala.inline
      def setCrossUndefined: Self = StObject.set(x, "cross", js.undefined)
      
      @scala.inline
      def setCsc(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "csc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCscDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cscDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscDependenciesUndefined: Self = StObject.set(x, "cscDependencies", js.undefined)
      
      @scala.inline
      def setCscUndefined: Self = StObject.set(x, "csc", js.undefined)
      
      @scala.inline
      def setCsch(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "csch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCschDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cschDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCschDependenciesUndefined: Self = StObject.set(x, "cschDependencies", js.undefined)
      
      @scala.inline
      def setCschUndefined: Self = StObject.set(x, "csch", js.undefined)
      
      @scala.inline
      def setCtransposeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ctransposeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtransposeDependenciesUndefined: Self = StObject.set(x, "ctransposeDependencies", js.undefined)
      
      @scala.inline
      def setCube(value: /* x */ Double => Double): Self = StObject.set(x, "cube", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCubeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cubeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubeDependenciesUndefined: Self = StObject.set(x, "cubeDependencies", js.undefined)
      
      @scala.inline
      def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
      
      @scala.inline
      def setDeepEqual(
        value: (/* x */ MathType, /* y */ MathType) => Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
      ): Self = StObject.set(x, "deepEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeepEqualDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "deepEqualDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepEqualDependenciesUndefined: Self = StObject.set(x, "deepEqualDependencies", js.undefined)
      
      @scala.inline
      def setDeepEqualUndefined: Self = StObject.set(x, "deepEqual", js.undefined)
      
      @scala.inline
      def setDenseMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "DenseMatrixDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseMatrixDependenciesUndefined: Self = StObject.set(x, "DenseMatrixDependencies", js.undefined)
      
      @scala.inline
      def setDerivative(
        value: (/* expr */ MathNode | String, /* variable */ MathNode | String, /* options */ js.UndefOr[Simplify]) => MathNode
      ): Self = StObject.set(x, "derivative", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDerivativeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "derivativeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerivativeDependenciesUndefined: Self = StObject.set(x, "derivativeDependencies", js.undefined)
      
      @scala.inline
      def setDerivativeUndefined: Self = StObject.set(x, "derivative", js.undefined)
      
      @scala.inline
      def setDet(value: /* x */ MathArray | Matrix => Double): Self = StObject.set(x, "det", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "detDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetDependenciesUndefined: Self = StObject.set(x, "detDependencies", js.undefined)
      
      @scala.inline
      def setDetUndefined: Self = StObject.set(x, "det", js.undefined)
      
      @scala.inline
      def setDeuteronMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "deuteronMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeuteronMassDependenciesUndefined: Self = StObject.set(x, "deuteronMassDependencies", js.undefined)
      
      @scala.inline
      def setDiag(value: (/* X */ MathArray | Matrix, /* format */ js.UndefOr[String]) => Matrix): Self = StObject.set(x, "diag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDiagDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "diagDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagDependenciesUndefined: Self = StObject.set(x, "diagDependencies", js.undefined)
      
      @scala.inline
      def setDiagUndefined: Self = StObject.set(x, "diag", js.undefined)
      
      @scala.inline
      def setDistance(
        value: (/* x */ MathArray | Matrix | js.Object, /* y */ MathArray | Matrix | js.Object) => Double | BigNumber
      ): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDistanceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "distanceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceDependenciesUndefined: Self = StObject.set(x, "distanceDependencies", js.undefined)
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setDivide(value: (/* x */ Unit, /* y */ Unit) => Unit): Self = StObject.set(x, "divide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDivideDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "divideDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivideDependenciesUndefined: Self = StObject.set(x, "divideDependencies", js.undefined)
      
      @scala.inline
      def setDivideScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "divideScalarDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivideScalarDependenciesUndefined: Self = StObject.set(x, "divideScalarDependencies", js.undefined)
      
      @scala.inline
      def setDivideUndefined: Self = StObject.set(x, "divide", js.undefined)
      
      @scala.inline
      def setDot(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Double): Self = StObject.set(x, "dot", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotDependenciesUndefined: Self = StObject.set(x, "dotDependencies", js.undefined)
      
      @scala.inline
      def setDotDivide(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "dotDivide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotDivideDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotDivideDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotDivideDependenciesUndefined: Self = StObject.set(x, "dotDivideDependencies", js.undefined)
      
      @scala.inline
      def setDotDivideUndefined: Self = StObject.set(x, "dotDivide", js.undefined)
      
      @scala.inline
      def setDotMultiply(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "dotMultiply", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotMultiplyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotMultiplyDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotMultiplyDependenciesUndefined: Self = StObject.set(x, "dotMultiplyDependencies", js.undefined)
      
      @scala.inline
      def setDotMultiplyUndefined: Self = StObject.set(x, "dotMultiply", js.undefined)
      
      @scala.inline
      def setDotPow(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "dotPow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotPowDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotPowDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotPowDependenciesUndefined: Self = StObject.set(x, "dotPowDependencies", js.undefined)
      
      @scala.inline
      def setDotPowUndefined: Self = StObject.set(x, "dotPow", js.undefined)
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "EDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEDependenciesUndefined: Self = StObject.set(x, "EDependencies", js.undefined)
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setEfimovFactorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "efimovFactorDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEfimovFactorDependenciesUndefined: Self = StObject.set(x, "efimovFactorDependencies", js.undefined)
      
      @scala.inline
      def setElectricConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "electricConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectricConstantDependenciesUndefined: Self = StObject.set(x, "electricConstantDependencies", js.undefined)
      
      @scala.inline
      def setElectronMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "electronMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronMassDependenciesUndefined: Self = StObject.set(x, "electronMassDependencies", js.undefined)
      
      @scala.inline
      def setElementaryChargeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "elementaryChargeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementaryChargeDependenciesUndefined: Self = StObject.set(x, "elementaryChargeDependencies", js.undefined)
      
      @scala.inline
      def setEqual(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqualDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "equalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualDependenciesUndefined: Self = StObject.set(x, "equalDependencies", js.undefined)
      
      @scala.inline
      def setEqualScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "equalScalarDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualScalarDependenciesUndefined: Self = StObject.set(x, "equalScalarDependencies", js.undefined)
      
      @scala.inline
      def setEqualText(
        value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
      ): Self = StObject.set(x, "equalText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqualTextDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "equalTextDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualTextDependenciesUndefined: Self = StObject.set(x, "equalTextDependencies", js.undefined)
      
      @scala.inline
      def setEqualTextUndefined: Self = StObject.set(x, "equalText", js.undefined)
      
      @scala.inline
      def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
      
      @scala.inline
      def setErf(value: /* x */ Double | MathArray | Matrix => NoLiteralType[Double | MathArray | Matrix]): Self = StObject.set(x, "erf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErfDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "erfDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErfDependenciesUndefined: Self = StObject.set(x, "erfDependencies", js.undefined)
      
      @scala.inline
      def setErfUndefined: Self = StObject.set(x, "erf", js.undefined)
      
      @scala.inline
      def setEvalDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "evalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalDependenciesUndefined: Self = StObject.set(x, "evalDependencies", js.undefined)
      
      @scala.inline
      def setEvaluate(
        value: (/* expr */ MathExpression | js.Array[MathExpression] | Matrix, /* scope */ js.UndefOr[js.Object]) => _
      ): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvaluateDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "evaluateDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluateDependenciesUndefined: Self = StObject.set(x, "evaluateDependencies", js.undefined)
      
      @scala.inline
      def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      @scala.inline
      def setExp(value: /* x */ Double => Double): Self = StObject.set(x, "exp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "expDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpDependenciesUndefined: Self = StObject.set(x, "expDependencies", js.undefined)
      
      @scala.inline
      def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      @scala.inline
      def setExpm(value: /* x */ Matrix => Matrix): Self = StObject.set(x, "expm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpm1(value: /* x */ Double => Double): Self = StObject.set(x, "expm1", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpm1Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "expm1Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpm1DependenciesUndefined: Self = StObject.set(x, "expm1Dependencies", js.undefined)
      
      @scala.inline
      def setExpm1Undefined: Self = StObject.set(x, "expm1", js.undefined)
      
      @scala.inline
      def setExpmDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "expmDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpmDependenciesUndefined: Self = StObject.set(x, "expmDependencies", js.undefined)
      
      @scala.inline
      def setExpmUndefined: Self = StObject.set(x, "expm", js.undefined)
      
      @scala.inline
      def setExpression(value: MathNode): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setEyeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "eyeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeDependenciesUndefined: Self = StObject.set(x, "eyeDependencies", js.undefined)
      
      @scala.inline
      def setFactorial(
        value: /* n */ Double | BigNumber | MathArray | Matrix => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "factorial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFactorialDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "factorialDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorialDependenciesUndefined: Self = StObject.set(x, "factorialDependencies", js.undefined)
      
      @scala.inline
      def setFactorialUndefined: Self = StObject.set(x, "factorial", js.undefined)
      
      @scala.inline
      def setFactory(
        value: (/* name */ String, /* dependencies */ js.Array[MathJsFunctionName], /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], /* meta */ js.UndefOr[js.Any]) => FactoryFunction[_]
      ): Self = StObject.set(x, "factory", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      @scala.inline
      def setFalseDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "falseDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFalseDependenciesUndefined: Self = StObject.set(x, "falseDependencies", js.undefined)
      
      @scala.inline
      def setFaradayDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "faradayDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaradayDependenciesUndefined: Self = StObject.set(x, "faradayDependencies", js.undefined)
      
      @scala.inline
      def setFermiCouplingDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "fermiCouplingDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFermiCouplingDependenciesUndefined: Self = StObject.set(x, "fermiCouplingDependencies", js.undefined)
      
      @scala.inline
      def setFibonacciHeapDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FibonacciHeapDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFibonacciHeapDependenciesUndefined: Self = StObject.set(x, "FibonacciHeapDependencies", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* x */ Matrix | MathArray | js.Array[String], /* test */ (js.Function3[
              /* value */ js.Any, 
              /* index */ js.Any, 
              /* matrix */ Matrix | MathArray | js.Array[String], 
              Boolean
            ]) | RegExp) => Matrix | MathArray
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "filterDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDependenciesUndefined: Self = StObject.set(x, "filterDependencies", js.undefined)
      
      @scala.inline
      def setFilterTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "filterTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTransformDependenciesUndefined: Self = StObject.set(x, "filterTransformDependencies", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFineStructureDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "fineStructureDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFineStructureDependenciesUndefined: Self = StObject.set(x, "fineStructureDependencies", js.undefined)
      
      @scala.inline
      def setFirstRadiationDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "firstRadiationDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstRadiationDependenciesUndefined: Self = StObject.set(x, "firstRadiationDependencies", js.undefined)
      
      @scala.inline
      def setFix(value: /* x */ Double => Double): Self = StObject.set(x, "fix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "fixDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixDependenciesUndefined: Self = StObject.set(x, "fixDependencies", js.undefined)
      
      @scala.inline
      def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      @scala.inline
      def setFlatten(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "flatten", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlattenDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "flattenDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenDependenciesUndefined: Self = StObject.set(x, "flattenDependencies", js.undefined)
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setFloor(value: /* x */ Double => Double): Self = StObject.set(x, "floor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFloorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "floorDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorDependenciesUndefined: Self = StObject.set(x, "floorDependencies", js.undefined)
      
      @scala.inline
      def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
      
      @scala.inline
      def setForEach(
        value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit]) => scala.Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForEachDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "forEachDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEachDependenciesUndefined: Self = StObject.set(x, "forEachDependencies", js.undefined)
      
      @scala.inline
      def setForEachTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "forEachTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEachTransformDependenciesUndefined: Self = StObject.set(x, "forEachTransformDependencies", js.undefined)
      
      @scala.inline
      def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      @scala.inline
      def setFormat(
        value: (/* value */ js.Any, /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]]) => String
      ): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "formatDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatDependenciesUndefined: Self = StObject.set(x, "formatDependencies", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFraction(value: /* args */ Fraction | MathArray | Matrix => Fraction | MathArray | Matrix): Self = StObject.set(x, "fraction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFractionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FractionDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionDependenciesUndefined: Self = StObject.set(x, "FractionDependencies", js.undefined)
      
      @scala.inline
      def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      @scala.inline
      def setFunctionAssignmentNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FunctionAssignmentNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionAssignmentNodeDependenciesUndefined: Self = StObject.set(x, "FunctionAssignmentNodeDependencies", js.undefined)
      
      @scala.inline
      def setFunctionNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FunctionNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNodeDependenciesUndefined: Self = StObject.set(x, "FunctionNodeDependencies", js.undefined)
      
      @scala.inline
      def setGamma(value: /* n */ Double | MathArray | Matrix => Double | MathArray | Matrix): Self = StObject.set(x, "gamma", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGammaDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gammaDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaDependenciesUndefined: Self = StObject.set(x, "gammaDependencies", js.undefined)
      
      @scala.inline
      def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
      
      @scala.inline
      def setGasConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gasConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasConstantDependenciesUndefined: Self = StObject.set(x, "gasConstantDependencies", js.undefined)
      
      @scala.inline
      def setGcd(value: /* repeated */ Double => Double): Self = StObject.set(x, "gcd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGcdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gcdDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGcdDependenciesUndefined: Self = StObject.set(x, "gcdDependencies", js.undefined)
      
      @scala.inline
      def setGcdUndefined: Self = StObject.set(x, "gcd", js.undefined)
      
      @scala.inline
      def setGetMatrixDataTypeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "getMatrixDataTypeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMatrixDataTypeDependenciesUndefined: Self = StObject.set(x, "getMatrixDataTypeDependencies", js.undefined)
      
      @scala.inline
      def setGravitationConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gravitationConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravitationConstantDependenciesUndefined: Self = StObject.set(x, "gravitationConstantDependencies", js.undefined)
      
      @scala.inline
      def setGravityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gravityDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityDependenciesUndefined: Self = StObject.set(x, "gravityDependencies", js.undefined)
      
      @scala.inline
      def setHartreeEnergyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "hartreeEnergyDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHartreeEnergyDependenciesUndefined: Self = StObject.set(x, "hartreeEnergyDependencies", js.undefined)
      
      @scala.inline
      def setHasNumericValueDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "hasNumericValueDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNumericValueDependenciesUndefined: Self = StObject.set(x, "hasNumericValueDependencies", js.undefined)
      
      @scala.inline
      def setHelp(value: /* search */ js.Function0[_] => Help): Self = StObject.set(x, "help", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHelpDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "HelpDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpDependenciesUndefined: Self = StObject.set(x, "HelpDependencies", js.undefined)
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setHypot(value: /* repeated */ Double => Double): Self = StObject.set(x, "hypot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHypotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "hypotDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHypotDependenciesUndefined: Self = StObject.set(x, "hypotDependencies", js.undefined)
      
      @scala.inline
      def setHypotUndefined: Self = StObject.set(x, "hypot", js.undefined)
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "iDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDependenciesUndefined: Self = StObject.set(x, "iDependencies", js.undefined)
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setIdentity(
        value: (/* size */ Double | js.Array[Double] | Matrix | MathArray, /* format */ js.UndefOr[String]) => Matrix | MathArray | Double
      ): Self = StObject.set(x, "identity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIdentityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "identityDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityDependenciesUndefined: Self = StObject.set(x, "identityDependencies", js.undefined)
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setIm(
        value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
      ): Self = StObject.set(x, "im", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "imDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImDependenciesUndefined: Self = StObject.set(x, "imDependencies", js.undefined)
      
      @scala.inline
      def setImUndefined: Self = StObject.set(x, "im", js.undefined)
      
      @scala.inline
      def setImmutableDenseMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ImmutableDenseMatrixDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutableDenseMatrixDependenciesUndefined: Self = StObject.set(x, "ImmutableDenseMatrixDependencies", js.undefined)
      
      @scala.inline
      def setImport(
        value: (/* object */ ImportObject | js.Array[ImportObject], /* options */ ImportOptions) => scala.Unit
      ): Self = StObject.set(x, "import", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      @scala.inline
      def setIndex(value: /* repeated */ js.Any => Index): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "IndexDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexDependenciesUndefined: Self = StObject.set(x, "IndexDependencies", js.undefined)
      
      @scala.inline
      def setIndexNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "IndexNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNodeDependenciesUndefined: Self = StObject.set(x, "IndexNodeDependencies", js.undefined)
      
      @scala.inline
      def setIndexTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "indexTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexTransformDependenciesUndefined: Self = StObject.set(x, "indexTransformDependencies", js.undefined)
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInfinity(value: Double): Self = StObject.set(x, "Infinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfinityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "InfinityDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfinityDependenciesUndefined: Self = StObject.set(x, "InfinityDependencies", js.undefined)
      
      @scala.inline
      def setInfinityUndefined: Self = StObject.set(x, "Infinity", js.undefined)
      
      @scala.inline
      def setIntersect(
        value: (/* w */ MathArray | Matrix, /* x */ MathArray | Matrix, /* y */ MathArray | Matrix, /* z */ MathArray | Matrix) => MathArray
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction4(value))
      
      @scala.inline
      def setIntersectDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "intersectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectDependenciesUndefined: Self = StObject.set(x, "intersectDependencies", js.undefined)
      
      @scala.inline
      def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
      
      @scala.inline
      def setInv(
        value: /* x */ Double | Complex | MathArray | Matrix => NoLiteralType[Double | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "inv", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "invDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvDependenciesUndefined: Self = StObject.set(x, "invDependencies", js.undefined)
      
      @scala.inline
      def setInvUndefined: Self = StObject.set(x, "inv", js.undefined)
      
      @scala.inline
      def setInverseConductanceQuantumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "inverseConductanceQuantumDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseConductanceQuantumDependenciesUndefined: Self = StObject.set(x, "inverseConductanceQuantumDependencies", js.undefined)
      
      @scala.inline
      def setIsInteger(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix => Boolean): Self = StObject.set(x, "isInteger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsIntegerDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isIntegerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIntegerDependenciesUndefined: Self = StObject.set(x, "isIntegerDependencies", js.undefined)
      
      @scala.inline
      def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
      
      @scala.inline
      def setIsNaN(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = StObject.set(x, "isNaN", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNaNDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isNaNDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNaNDependenciesUndefined: Self = StObject.set(x, "isNaNDependencies", js.undefined)
      
      @scala.inline
      def setIsNaNUndefined: Self = StObject.set(x, "isNaN", js.undefined)
      
      @scala.inline
      def setIsNegative(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = StObject.set(x, "isNegative", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNegativeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isNegativeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNegativeDependenciesUndefined: Self = StObject.set(x, "isNegativeDependencies", js.undefined)
      
      @scala.inline
      def setIsNegativeUndefined: Self = StObject.set(x, "isNegative", js.undefined)
      
      @scala.inline
      def setIsNumeric(value: /* x */ js.Any => Boolean): Self = StObject.set(x, "isNumeric", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNumericDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isNumericDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumericDependenciesUndefined: Self = StObject.set(x, "isNumericDependencies", js.undefined)
      
      @scala.inline
      def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      @scala.inline
      def setIsPositive(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = StObject.set(x, "isPositive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPositiveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isPositiveDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPositiveDependenciesUndefined: Self = StObject.set(x, "isPositiveDependencies", js.undefined)
      
      @scala.inline
      def setIsPositiveUndefined: Self = StObject.set(x, "isPositive", js.undefined)
      
      @scala.inline
      def setIsPrime(value: /* x */ Double | BigNumber | MathArray | Matrix => Boolean): Self = StObject.set(x, "isPrime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPrimeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isPrimeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrimeDependenciesUndefined: Self = StObject.set(x, "isPrimeDependencies", js.undefined)
      
      @scala.inline
      def setIsPrimeUndefined: Self = StObject.set(x, "isPrime", js.undefined)
      
      @scala.inline
      def setIsZero(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex => Boolean): Self = StObject.set(x, "isZero", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsZeroDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isZeroDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsZeroDependenciesUndefined: Self = StObject.set(x, "isZeroDependencies", js.undefined)
      
      @scala.inline
      def setIsZeroUndefined: Self = StObject.set(x, "isZero", js.undefined)
      
      @scala.inline
      def setJson(value: MathJsJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setKldivergence(value: (/* q */ MathArray | Matrix, /* p */ MathArray | Matrix) => Double): Self = StObject.set(x, "kldivergence", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKldivergenceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "kldivergenceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKldivergenceDependenciesUndefined: Self = StObject.set(x, "kldivergenceDependencies", js.undefined)
      
      @scala.inline
      def setKldivergenceUndefined: Self = StObject.set(x, "kldivergence", js.undefined)
      
      @scala.inline
      def setKlitzingDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "klitzingDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKlitzingDependenciesUndefined: Self = StObject.set(x, "klitzingDependencies", js.undefined)
      
      @scala.inline
      def setKron(value: (/* x */ Matrix | MathArray, /* y */ Matrix | MathArray) => Matrix): Self = StObject.set(x, "kron", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKronDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "kronDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKronDependenciesUndefined: Self = StObject.set(x, "kronDependencies", js.undefined)
      
      @scala.inline
      def setKronUndefined: Self = StObject.set(x, "kron", js.undefined)
      
      @scala.inline
      def setLN10(value: Double): Self = StObject.set(x, "LN10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLN10Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LN10Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLN10DependenciesUndefined: Self = StObject.set(x, "LN10Dependencies", js.undefined)
      
      @scala.inline
      def setLN10Undefined: Self = StObject.set(x, "LN10", js.undefined)
      
      @scala.inline
      def setLN2(value: Double): Self = StObject.set(x, "LN2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLN2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LN2Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLN2DependenciesUndefined: Self = StObject.set(x, "LN2Dependencies", js.undefined)
      
      @scala.inline
      def setLN2Undefined: Self = StObject.set(x, "LN2", js.undefined)
      
      @scala.inline
      def setLOG10E(value: Double): Self = StObject.set(x, "LOG10E", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOG10EDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LOG10EDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOG10EDependenciesUndefined: Self = StObject.set(x, "LOG10EDependencies", js.undefined)
      
      @scala.inline
      def setLOG10EUndefined: Self = StObject.set(x, "LOG10E", js.undefined)
      
      @scala.inline
      def setLOG2E(value: Double): Self = StObject.set(x, "LOG2E", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOG2EDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LOG2EDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOG2EDependenciesUndefined: Self = StObject.set(x, "LOG2EDependencies", js.undefined)
      
      @scala.inline
      def setLOG2EUndefined: Self = StObject.set(x, "LOG2E", js.undefined)
      
      @scala.inline
      def setLarger(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "larger", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLargerDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "largerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargerDependenciesUndefined: Self = StObject.set(x, "largerDependencies", js.undefined)
      
      @scala.inline
      def setLargerEq(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "largerEq", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLargerEqDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "largerEqDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargerEqDependenciesUndefined: Self = StObject.set(x, "largerEqDependencies", js.undefined)
      
      @scala.inline
      def setLargerEqUndefined: Self = StObject.set(x, "largerEq", js.undefined)
      
      @scala.inline
      def setLargerUndefined: Self = StObject.set(x, "larger", js.undefined)
      
      @scala.inline
      def setLcm(value: (/* a */ Double, /* b */ Double) => Double): Self = StObject.set(x, "lcm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLcmDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lcmDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcmDependenciesUndefined: Self = StObject.set(x, "lcmDependencies", js.undefined)
      
      @scala.inline
      def setLcmUndefined: Self = StObject.set(x, "lcm", js.undefined)
      
      @scala.inline
      def setLeftShift(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "leftShift", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeftShiftDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "leftShiftDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftShiftDependenciesUndefined: Self = StObject.set(x, "leftShiftDependencies", js.undefined)
      
      @scala.inline
      def setLeftShiftUndefined: Self = StObject.set(x, "leftShift", js.undefined)
      
      @scala.inline
      def setLog(
        value: (/* x */ Double | BigNumber | Complex | MathArray | Matrix, /* base */ js.UndefOr[Double | BigNumber | Complex]) => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLog10(value: /* x */ Double => Double): Self = StObject.set(x, "log10", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog10Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "log10Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog10DependenciesUndefined: Self = StObject.set(x, "log10Dependencies", js.undefined)
      
      @scala.inline
      def setLog10Undefined: Self = StObject.set(x, "log10", js.undefined)
      
      @scala.inline
      def setLog1p(value: (/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex]) => Double): Self = StObject.set(x, "log1p", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLog1pDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "log1pDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog1pDependenciesUndefined: Self = StObject.set(x, "log1pDependencies", js.undefined)
      
      @scala.inline
      def setLog1pUndefined: Self = StObject.set(x, "log1p", js.undefined)
      
      @scala.inline
      def setLog2(value: /* x */ Double => Double): Self = StObject.set(x, "log2", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "log2Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog2DependenciesUndefined: Self = StObject.set(x, "log2Dependencies", js.undefined)
      
      @scala.inline
      def setLog2Undefined: Self = StObject.set(x, "log2", js.undefined)
      
      @scala.inline
      def setLogDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "logDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDependenciesUndefined: Self = StObject.set(x, "logDependencies", js.undefined)
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setLoschmidtDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "loschmidtDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoschmidtDependenciesUndefined: Self = StObject.set(x, "loschmidtDependencies", js.undefined)
      
      @scala.inline
      def setLsolve(value: (/* L */ Matrix | MathArray, /* b */ Matrix | MathArray) => Matrix | MathArray): Self = StObject.set(x, "lsolve", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLsolveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lsolveDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLsolveDependenciesUndefined: Self = StObject.set(x, "lsolveDependencies", js.undefined)
      
      @scala.inline
      def setLsolveUndefined: Self = StObject.set(x, "lsolve", js.undefined)
      
      @scala.inline
      def setLup(value: /* A */ js.UndefOr[Matrix | MathArray] => L): Self = StObject.set(x, "lup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLupDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lupDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLupDependenciesUndefined: Self = StObject.set(x, "lupDependencies", js.undefined)
      
      @scala.inline
      def setLupUndefined: Self = StObject.set(x, "lup", js.undefined)
      
      @scala.inline
      def setLusolve(
        value: (/* A */ Matrix | MathArray | Double, /* b */ Matrix | MathArray, /* order */ js.UndefOr[Double], /* threshold */ js.UndefOr[Double]) => Matrix | MathArray
      ): Self = StObject.set(x, "lusolve", js.Any.fromFunction4(value))
      
      @scala.inline
      def setLusolveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lusolveDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLusolveDependenciesUndefined: Self = StObject.set(x, "lusolveDependencies", js.undefined)
      
      @scala.inline
      def setLusolveUndefined: Self = StObject.set(x, "lusolve", js.undefined)
      
      @scala.inline
      def setMad(value: /* array */ MathArray | Matrix => _): Self = StObject.set(x, "mad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMadDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "madDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMadDependenciesUndefined: Self = StObject.set(x, "madDependencies", js.undefined)
      
      @scala.inline
      def setMadUndefined: Self = StObject.set(x, "mad", js.undefined)
      
      @scala.inline
      def setMagneticConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "magneticConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagneticConstantDependenciesUndefined: Self = StObject.set(x, "magneticConstantDependencies", js.undefined)
      
      @scala.inline
      def setMagneticFluxQuantumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "magneticFluxQuantumDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagneticFluxQuantumDependenciesUndefined: Self = StObject.set(x, "magneticFluxQuantumDependencies", js.undefined)
      
      @scala.inline
      def setMap(
        value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[
              /* value */ js.Any, 
              /* index */ js.Any, 
              /* matrix */ Matrix | MathArray, 
              MathType | String
            ]) => Matrix | MathArray
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMapDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "mapDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapDependenciesUndefined: Self = StObject.set(x, "mapDependencies", js.undefined)
      
      @scala.inline
      def setMapTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "mapTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapTransformDependenciesUndefined: Self = StObject.set(x, "mapTransformDependencies", js.undefined)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMatrix(value: /* format */ js.UndefOr[sparse | dense] => Matrix): Self = StObject.set(x, "matrix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "MatrixDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixDependenciesUndefined: Self = StObject.set(x, "MatrixDependencies", js.undefined)
      
      @scala.inline
      def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      @scala.inline
      def setMax(value: /* repeated */ MathType => _): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "maxDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDependenciesUndefined: Self = StObject.set(x, "maxDependencies", js.undefined)
      
      @scala.inline
      def setMaxTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "maxTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTransformDependenciesUndefined: Self = StObject.set(x, "maxTransformDependencies", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMean(value: /* repeated */ MathType => _): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMeanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "meanDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanDependenciesUndefined: Self = StObject.set(x, "meanDependencies", js.undefined)
      
      @scala.inline
      def setMeanTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "meanTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanTransformDependenciesUndefined: Self = StObject.set(x, "meanTransformDependencies", js.undefined)
      
      @scala.inline
      def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      @scala.inline
      def setMedian(value: /* repeated */ MathType => _): Self = StObject.set(x, "median", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMedianDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "medianDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedianDependenciesUndefined: Self = StObject.set(x, "medianDependencies", js.undefined)
      
      @scala.inline
      def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
      
      @scala.inline
      def setMin(value: /* repeated */ MathType => _): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "minDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDependenciesUndefined: Self = StObject.set(x, "minDependencies", js.undefined)
      
      @scala.inline
      def setMinTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "minTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTransformDependenciesUndefined: Self = StObject.set(x, "minTransformDependencies", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMod(
        value: (/* x */ Double | BigNumber | Fraction | MathArray | Matrix, /* y */ Double | BigNumber | Fraction | MathArray | Matrix) => NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
      ): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setModDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "modDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModDependenciesUndefined: Self = StObject.set(x, "modDependencies", js.undefined)
      
      @scala.inline
      def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
      
      @scala.inline
      def setMode(value: /* repeated */ MathType => _): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "modeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeDependenciesUndefined: Self = StObject.set(x, "modeDependencies", js.undefined)
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMolarMassC12Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarMassC12Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMolarMassC12DependenciesUndefined: Self = StObject.set(x, "molarMassC12Dependencies", js.undefined)
      
      @scala.inline
      def setMolarMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMolarMassDependenciesUndefined: Self = StObject.set(x, "molarMassDependencies", js.undefined)
      
      @scala.inline
      def setMolarPlanckConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarPlanckConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMolarPlanckConstantDependenciesUndefined: Self = StObject.set(x, "molarPlanckConstantDependencies", js.undefined)
      
      @scala.inline
      def setMolarVolumeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarVolumeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMolarVolumeDependenciesUndefined: Self = StObject.set(x, "molarVolumeDependencies", js.undefined)
      
      @scala.inline
      def setMultinomial(value: /* a */ js.Array[Double | BigNumber] => NoLiteralType[Double | BigNumber]): Self = StObject.set(x, "multinomial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultinomialDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "multinomialDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultinomialDependenciesUndefined: Self = StObject.set(x, "multinomialDependencies", js.undefined)
      
      @scala.inline
      def setMultinomialUndefined: Self = StObject.set(x, "multinomial", js.undefined)
      
      @scala.inline
      def setMultiply(value: (/* x */ Matrix | MathArray, /* y */ MathType) => Matrix | MathArray): Self = StObject.set(x, "multiply", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiplyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "multiplyDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplyDependenciesUndefined: Self = StObject.set(x, "multiplyDependencies", js.undefined)
      
      @scala.inline
      def setMultiplyScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "multiplyScalarDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplyScalarDependenciesUndefined: Self = StObject.set(x, "multiplyScalarDependencies", js.undefined)
      
      @scala.inline
      def setMultiplyUndefined: Self = StObject.set(x, "multiply", js.undefined)
      
      @scala.inline
      def setNaN(value: Double): Self = StObject.set(x, "NaN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaNDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "NaNDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaNDependenciesUndefined: Self = StObject.set(x, "NaNDependencies", js.undefined)
      
      @scala.inline
      def setNaNUndefined: Self = StObject.set(x, "NaN", js.undefined)
      
      @scala.inline
      def setNeutronMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "neutronMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutronMassDependenciesUndefined: Self = StObject.set(x, "neutronMassDependencies", js.undefined)
      
      @scala.inline
      def setNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "NodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDependenciesUndefined: Self = StObject.set(x, "NodeDependencies", js.undefined)
      
      @scala.inline
      def setNorm(
        value: (/* x */ Double | BigNumber | Complex | MathArray | Matrix, /* p */ js.UndefOr[Double | BigNumber | String]) => Double | BigNumber
      ): Self = StObject.set(x, "norm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNormDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "normDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormDependenciesUndefined: Self = StObject.set(x, "normDependencies", js.undefined)
      
      @scala.inline
      def setNormUndefined: Self = StObject.set(x, "norm", js.undefined)
      
      @scala.inline
      def setNot(
        value: /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "notDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotDependenciesUndefined: Self = StObject.set(x, "notDependencies", js.undefined)
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setNthRoot(
        value: (/* a */ Double | BigNumber | MathArray | Matrix | Complex, /* root */ js.UndefOr[Double | BigNumber]) => Double | Complex | MathArray | Matrix
      ): Self = StObject.set(x, "nthRoot", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNthRootDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nthRootDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNthRootDependenciesUndefined: Self = StObject.set(x, "nthRootDependencies", js.undefined)
      
      @scala.inline
      def setNthRootUndefined: Self = StObject.set(x, "nthRoot", js.undefined)
      
      @scala.inline
      def setNthRootsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nthRootsDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNthRootsDependenciesUndefined: Self = StObject.set(x, "nthRootsDependencies", js.undefined)
      
      @scala.inline
      def setNuclearMagnetonDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nuclearMagnetonDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNuclearMagnetonDependenciesUndefined: Self = StObject.set(x, "nuclearMagnetonDependencies", js.undefined)
      
      @scala.inline
      def setNull(value: Double): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nullDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullDependenciesUndefined: Self = StObject.set(x, "nullDependencies", js.undefined)
      
      @scala.inline
      def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      @scala.inline
      def setNumber(
        value: /* value */ js.UndefOr[
              String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
            ] => Double | MathArray | Matrix
      ): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumberDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "numberDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberDependenciesUndefined: Self = StObject.set(x, "numberDependencies", js.undefined)
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setNumericDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "numericDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericDependenciesUndefined: Self = StObject.set(x, "numericDependencies", js.undefined)
      
      @scala.inline
      def setObjectNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ObjectNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectNodeDependenciesUndefined: Self = StObject.set(x, "ObjectNodeDependencies", js.undefined)
      
      @scala.inline
      def setOnes(
        value: (/* size */ Double | js.Array[Double], /* format */ js.UndefOr[String]) => MathArray | Matrix
      ): Self = StObject.set(x, "ones", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnesDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "onesDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnesDependenciesUndefined: Self = StObject.set(x, "onesDependencies", js.undefined)
      
      @scala.inline
      def setOnesUndefined: Self = StObject.set(x, "ones", js.undefined)
      
      @scala.inline
      def setOperatorNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "OperatorNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorNodeDependenciesUndefined: Self = StObject.set(x, "OperatorNodeDependencies", js.undefined)
      
      @scala.inline
      def setOr(
        value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "or", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOrDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "orDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrDependenciesUndefined: Self = StObject.set(x, "orDependencies", js.undefined)
      
      @scala.inline
      def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
      
      @scala.inline
      def setPIDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "PIDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPIDependenciesUndefined: Self = StObject.set(x, "PIDependencies", js.undefined)
      
      @scala.inline
      def setParenthesisNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ParenthesisNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParenthesisNodeDependenciesUndefined: Self = StObject.set(x, "ParenthesisNodeDependencies", js.undefined)
      
      @scala.inline
      def setParse(value: (/* expr */ MathExpression, /* options */ js.UndefOr[js.Any]) => MathNode): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "parseDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseDependenciesUndefined: Self = StObject.set(x, "parseDependencies", js.undefined)
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setParser(value: () => Parser): Self = StObject.set(x, "parser", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParserDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ParserDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserDependenciesUndefined: Self = StObject.set(x, "ParserDependencies", js.undefined)
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPartitionSelect(
        value: (/* x */ MathArray | Matrix, /* k */ Double, /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])]) => _
      ): Self = StObject.set(x, "partitionSelect", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPartitionSelectDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "partitionSelectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionSelectDependenciesUndefined: Self = StObject.set(x, "partitionSelectDependencies", js.undefined)
      
      @scala.inline
      def setPartitionSelectUndefined: Self = StObject.set(x, "partitionSelect", js.undefined)
      
      @scala.inline
      def setPermutations(
        value: (/* n */ Double | BigNumber, /* k */ js.UndefOr[Double | BigNumber]) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "permutations", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPermutationsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "permutationsDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermutationsDependenciesUndefined: Self = StObject.set(x, "permutationsDependencies", js.undefined)
      
      @scala.inline
      def setPermutationsUndefined: Self = StObject.set(x, "permutations", js.undefined)
      
      @scala.inline
      def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhiDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "phiDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhiDependenciesUndefined: Self = StObject.set(x, "phiDependencies", js.undefined)
      
      @scala.inline
      def setPhiUndefined: Self = StObject.set(x, "phi", js.undefined)
      
      @scala.inline
      def setPi(value: Double): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
      
      @scala.inline
      def setPickRandom(
        value: (/* array */ js.Array[Double], /* number */ js.UndefOr[Double], /* weights */ js.UndefOr[js.Array[Double]]) => Double | js.Array[Double]
      ): Self = StObject.set(x, "pickRandom", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPickRandomDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "pickRandomDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickRandomDependenciesUndefined: Self = StObject.set(x, "pickRandomDependencies", js.undefined)
      
      @scala.inline
      def setPickRandomUndefined: Self = StObject.set(x, "pickRandom", js.undefined)
      
      @scala.inline
      def setPlanckChargeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckChargeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanckChargeDependenciesUndefined: Self = StObject.set(x, "planckChargeDependencies", js.undefined)
      
      @scala.inline
      def setPlanckConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanckConstantDependenciesUndefined: Self = StObject.set(x, "planckConstantDependencies", js.undefined)
      
      @scala.inline
      def setPlanckLengthDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckLengthDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanckLengthDependenciesUndefined: Self = StObject.set(x, "planckLengthDependencies", js.undefined)
      
      @scala.inline
      def setPlanckMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanckMassDependenciesUndefined: Self = StObject.set(x, "planckMassDependencies", js.undefined)
      
      @scala.inline
      def setPlanckTemperatureDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckTemperatureDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanckTemperatureDependenciesUndefined: Self = StObject.set(x, "planckTemperatureDependencies", js.undefined)
      
      @scala.inline
      def setPlanckTimeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckTimeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanckTimeDependenciesUndefined: Self = StObject.set(x, "planckTimeDependencies", js.undefined)
      
      @scala.inline
      def setPow(value: (/* x */ MathType, /* y */ Double | BigNumber | Complex) => MathType): Self = StObject.set(x, "pow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPowDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "powDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowDependenciesUndefined: Self = StObject.set(x, "powDependencies", js.undefined)
      
      @scala.inline
      def setPowUndefined: Self = StObject.set(x, "pow", js.undefined)
      
      @scala.inline
      def setPrint(
        value: (/* template */ String, /* values */ js.Any, /* precision */ js.UndefOr[Double], /* options */ js.UndefOr[Double | js.Object]) => scala.Unit
      ): Self = StObject.set(x, "print", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPrintDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "printDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintDependenciesUndefined: Self = StObject.set(x, "printDependencies", js.undefined)
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setProd(value: /* repeated */ MathType => _): Self = StObject.set(x, "prod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "prodDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProdDependenciesUndefined: Self = StObject.set(x, "prodDependencies", js.undefined)
      
      @scala.inline
      def setProdUndefined: Self = StObject.set(x, "prod", js.undefined)
      
      @scala.inline
      def setProtonMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "protonMassDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtonMassDependenciesUndefined: Self = StObject.set(x, "protonMassDependencies", js.undefined)
      
      @scala.inline
      def setQr(value: /* A */ Matrix | MathArray => Q): Self = StObject.set(x, "qr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQrDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "qrDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQrDependenciesUndefined: Self = StObject.set(x, "qrDependencies", js.undefined)
      
      @scala.inline
      def setQrUndefined: Self = StObject.set(x, "qr", js.undefined)
      
      @scala.inline
      def setQuantileSeq(
        value: (/* A */ MathArray | Matrix, /* prob */ Double | BigNumber | MathArray, /* sorted */ js.UndefOr[Boolean]) => Double | BigNumber | Unit | MathArray
      ): Self = StObject.set(x, "quantileSeq", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQuantileSeqDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "quantileSeqDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantileSeqDependenciesUndefined: Self = StObject.set(x, "quantileSeqDependencies", js.undefined)
      
      @scala.inline
      def setQuantileSeqUndefined: Self = StObject.set(x, "quantileSeq", js.undefined)
      
      @scala.inline
      def setQuantumOfCirculationDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "quantumOfCirculationDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantumOfCirculationDependenciesUndefined: Self = StObject.set(x, "quantumOfCirculationDependencies", js.undefined)
      
      @scala.inline
      def setRandom(value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "random", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandomDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "randomDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomDependenciesUndefined: Self = StObject.set(x, "randomDependencies", js.undefined)
      
      @scala.inline
      def setRandomInt(value: (/* min */ Double, /* max */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "randomInt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandomIntDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "randomIntDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomIntDependenciesUndefined: Self = StObject.set(x, "randomIntDependencies", js.undefined)
      
      @scala.inline
      def setRandomIntUndefined: Self = StObject.set(x, "randomInt", js.undefined)
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setRange(value: (/* str */ String, /* includeEnd */ js.UndefOr[Boolean]) => Matrix): Self = StObject.set(x, "range", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRangeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "RangeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeDependenciesUndefined: Self = StObject.set(x, "RangeDependencies", js.undefined)
      
      @scala.inline
      def setRangeNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "RangeNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeNodeDependenciesUndefined: Self = StObject.set(x, "RangeNodeDependencies", js.undefined)
      
      @scala.inline
      def setRangeTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rangeTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeTransformDependenciesUndefined: Self = StObject.set(x, "rangeTransformDependencies", js.undefined)
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRationalize(
        value: (/* expr */ MathNode | String, /* optional */ js.UndefOr[js.Object | Boolean], /* detailed */ js.UndefOr[`true`]) => Coefficients
      ): Self = StObject.set(x, "rationalize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRationalizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rationalizeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRationalizeDependenciesUndefined: Self = StObject.set(x, "rationalizeDependencies", js.undefined)
      
      @scala.inline
      def setRationalizeUndefined: Self = StObject.set(x, "rationalize", js.undefined)
      
      @scala.inline
      def setRe(
        value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
      ): Self = StObject.set(x, "re", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReDependenciesUndefined: Self = StObject.set(x, "reDependencies", js.undefined)
      
      @scala.inline
      def setReUndefined: Self = StObject.set(x, "re", js.undefined)
      
      @scala.inline
      def setReducedPlanckConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reducedPlanckConstantDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReducedPlanckConstantDependenciesUndefined: Self = StObject.set(x, "reducedPlanckConstantDependencies", js.undefined)
      
      @scala.inline
      def setRelationalNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "RelationalNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationalNodeDependenciesUndefined: Self = StObject.set(x, "RelationalNodeDependencies", js.undefined)
      
      @scala.inline
      def setReshape(value: (/* x */ MathArray | Matrix, /* sizes */ js.Array[Double]) => MathArray | Matrix): Self = StObject.set(x, "reshape", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReshapeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reshapeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReshapeDependenciesUndefined: Self = StObject.set(x, "reshapeDependencies", js.undefined)
      
      @scala.inline
      def setReshapeUndefined: Self = StObject.set(x, "reshape", js.undefined)
      
      @scala.inline
      def setResize(
        value: (/* x */ MathArray | Matrix, /* size */ MathArray | Matrix, /* defaultValue */ js.UndefOr[Double | String]) => MathArray | Matrix
      ): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "resizeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeDependenciesUndefined: Self = StObject.set(x, "resizeDependencies", js.undefined)
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setResultSetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ResultSetDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultSetDependenciesUndefined: Self = StObject.set(x, "ResultSetDependencies", js.undefined)
      
      @scala.inline
      def setReviverDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reviverDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviverDependenciesUndefined: Self = StObject.set(x, "reviverDependencies", js.undefined)
      
      @scala.inline
      def setRightArithShift(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "rightArithShift", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRightArithShiftDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rightArithShiftDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightArithShiftDependenciesUndefined: Self = StObject.set(x, "rightArithShiftDependencies", js.undefined)
      
      @scala.inline
      def setRightArithShiftUndefined: Self = StObject.set(x, "rightArithShift", js.undefined)
      
      @scala.inline
      def setRightLogShift(
        value: (/* x */ Double | MathArray | Matrix, /* y */ Double) => NoLiteralType[Double | MathArray | Matrix]
      ): Self = StObject.set(x, "rightLogShift", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRightLogShiftDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rightLogShiftDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLogShiftDependenciesUndefined: Self = StObject.set(x, "rightLogShiftDependencies", js.undefined)
      
      @scala.inline
      def setRightLogShiftUndefined: Self = StObject.set(x, "rightLogShift", js.undefined)
      
      @scala.inline
      def setRound(
        value: (/* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, /* n */ js.UndefOr[Double | BigNumber | MathArray]) => NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "round", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRoundDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "roundDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundDependenciesUndefined: Self = StObject.set(x, "roundDependencies", js.undefined)
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setRowDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rowDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDependenciesUndefined: Self = StObject.set(x, "rowDependencies", js.undefined)
      
      @scala.inline
      def setRowTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rowTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowTransformDependenciesUndefined: Self = StObject.set(x, "rowTransformDependencies", js.undefined)
      
      @scala.inline
      def setRydbergDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rydbergDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRydbergDependenciesUndefined: Self = StObject.set(x, "rydbergDependencies", js.undefined)
      
      @scala.inline
      def setSQRT1_2(value: Double): Self = StObject.set(x, "SQRT1_2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSQRT1_2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SQRT1_2Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSQRT1_2DependenciesUndefined: Self = StObject.set(x, "SQRT1_2Dependencies", js.undefined)
      
      @scala.inline
      def setSQRT1_2Undefined: Self = StObject.set(x, "SQRT1_2", js.undefined)
      
      @scala.inline
      def setSQRT2(value: Double): Self = StObject.set(x, "SQRT2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSQRT2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SQRT2Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSQRT2DependenciesUndefined: Self = StObject.set(x, "SQRT2Dependencies", js.undefined)
      
      @scala.inline
      def setSQRT2Undefined: Self = StObject.set(x, "SQRT2", js.undefined)
      
      @scala.inline
      def setSackurTetrodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sackurTetrodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSackurTetrodeDependenciesUndefined: Self = StObject.set(x, "sackurTetrodeDependencies", js.undefined)
      
      @scala.inline
      def setSec(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sec", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSecDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "secDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecDependenciesUndefined: Self = StObject.set(x, "secDependencies", js.undefined)
      
      @scala.inline
      def setSecUndefined: Self = StObject.set(x, "sec", js.undefined)
      
      @scala.inline
      def setSech(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sech", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSechDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sechDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSechDependenciesUndefined: Self = StObject.set(x, "sechDependencies", js.undefined)
      
      @scala.inline
      def setSechUndefined: Self = StObject.set(x, "sech", js.undefined)
      
      @scala.inline
      def setSecondRadiationDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "secondRadiationDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondRadiationDependenciesUndefined: Self = StObject.set(x, "secondRadiationDependencies", js.undefined)
      
      @scala.inline
      def setSetCartesian(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setCartesian", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetCartesianDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setCartesianDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCartesianDependenciesUndefined: Self = StObject.set(x, "setCartesianDependencies", js.undefined)
      
      @scala.inline
      def setSetCartesianUndefined: Self = StObject.set(x, "setCartesian", js.undefined)
      
      @scala.inline
      def setSetDifference(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setDifference", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDifferenceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setDifferenceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDifferenceDependenciesUndefined: Self = StObject.set(x, "setDifferenceDependencies", js.undefined)
      
      @scala.inline
      def setSetDifferenceUndefined: Self = StObject.set(x, "setDifference", js.undefined)
      
      @scala.inline
      def setSetDistinct(value: /* a */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "setDistinct", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDistinctDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setDistinctDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDistinctDependenciesUndefined: Self = StObject.set(x, "setDistinctDependencies", js.undefined)
      
      @scala.inline
      def setSetDistinctUndefined: Self = StObject.set(x, "setDistinct", js.undefined)
      
      @scala.inline
      def setSetIntersect(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setIntersect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetIntersectDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setIntersectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetIntersectDependenciesUndefined: Self = StObject.set(x, "setIntersectDependencies", js.undefined)
      
      @scala.inline
      def setSetIntersectUndefined: Self = StObject.set(x, "setIntersect", js.undefined)
      
      @scala.inline
      def setSetIsSubset(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => Boolean): Self = StObject.set(x, "setIsSubset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetIsSubsetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setIsSubsetDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetIsSubsetDependenciesUndefined: Self = StObject.set(x, "setIsSubsetDependencies", js.undefined)
      
      @scala.inline
      def setSetIsSubsetUndefined: Self = StObject.set(x, "setIsSubset", js.undefined)
      
      @scala.inline
      def setSetMultiplicity(value: (/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix) => Double): Self = StObject.set(x, "setMultiplicity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetMultiplicityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setMultiplicityDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetMultiplicityDependenciesUndefined: Self = StObject.set(x, "setMultiplicityDependencies", js.undefined)
      
      @scala.inline
      def setSetMultiplicityUndefined: Self = StObject.set(x, "setMultiplicity", js.undefined)
      
      @scala.inline
      def setSetPowerset(value: /* a */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "setPowerset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPowersetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setPowersetDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetPowersetDependenciesUndefined: Self = StObject.set(x, "setPowersetDependencies", js.undefined)
      
      @scala.inline
      def setSetPowersetUndefined: Self = StObject.set(x, "setPowerset", js.undefined)
      
      @scala.inline
      def setSetSize(value: /* a */ MathArray | Matrix => Double): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setSizeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetSizeDependenciesUndefined: Self = StObject.set(x, "setSizeDependencies", js.undefined)
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSetSymDifference(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setSymDifference", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSymDifferenceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setSymDifferenceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetSymDifferenceDependenciesUndefined: Self = StObject.set(x, "setSymDifferenceDependencies", js.undefined)
      
      @scala.inline
      def setSetSymDifferenceUndefined: Self = StObject.set(x, "setSymDifference", js.undefined)
      
      @scala.inline
      def setSetUnion(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setUnion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetUnionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setUnionDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUnionDependenciesUndefined: Self = StObject.set(x, "setUnionDependencies", js.undefined)
      
      @scala.inline
      def setSetUnionUndefined: Self = StObject.set(x, "setUnion", js.undefined)
      
      @scala.inline
      def setSign(value: /* x */ Double => Double): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "signDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignDependenciesUndefined: Self = StObject.set(x, "signDependencies", js.undefined)
      
      @scala.inline
      def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      @scala.inline
      def setSimplify(
        value: (/* expr */ MathNode | String, /* rules */ js.UndefOr[js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]], /* scope */ js.UndefOr[js.Object]) => MathNode
      ): Self = StObject.set(x, "simplify", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSimplifyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "simplifyDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimplifyDependenciesUndefined: Self = StObject.set(x, "simplifyDependencies", js.undefined)
      
      @scala.inline
      def setSimplifyUndefined: Self = StObject.set(x, "simplify", js.undefined)
      
      @scala.inline
      def setSin(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSinDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sinDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinDependenciesUndefined: Self = StObject.set(x, "sinDependencies", js.undefined)
      
      @scala.inline
      def setSinUndefined: Self = StObject.set(x, "sin", js.undefined)
      
      @scala.inline
      def setSinh(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sinh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSinhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sinhDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinhDependenciesUndefined: Self = StObject.set(x, "sinhDependencies", js.undefined)
      
      @scala.inline
      def setSinhUndefined: Self = StObject.set(x, "sinh", js.undefined)
      
      @scala.inline
      def setSize(
        value: /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix => MathArray | Matrix
      ): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sizeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeDependenciesUndefined: Self = StObject.set(x, "sizeDependencies", js.undefined)
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSlu(value: (/* A */ Matrix, /* order */ Double, /* threshold */ Double) => js.Object): Self = StObject.set(x, "slu", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSluDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sluDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSluDependenciesUndefined: Self = StObject.set(x, "sluDependencies", js.undefined)
      
      @scala.inline
      def setSluUndefined: Self = StObject.set(x, "slu", js.undefined)
      
      @scala.inline
      def setSmaller(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "smaller", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSmallerDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "smallerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallerDependenciesUndefined: Self = StObject.set(x, "smallerDependencies", js.undefined)
      
      @scala.inline
      def setSmallerEq(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "smallerEq", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSmallerEqDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "smallerEqDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallerEqDependenciesUndefined: Self = StObject.set(x, "smallerEqDependencies", js.undefined)
      
      @scala.inline
      def setSmallerEqUndefined: Self = StObject.set(x, "smallerEq", js.undefined)
      
      @scala.inline
      def setSmallerUndefined: Self = StObject.set(x, "smaller", js.undefined)
      
      @scala.inline
      def setSort(
        value: (/* x */ Matrix | MathArray, /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural) => Matrix | MathArray
      ): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sortDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDependenciesUndefined: Self = StObject.set(x, "sortDependencies", js.undefined)
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSpaDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SpaDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaDependenciesUndefined: Self = StObject.set(x, "SpaDependencies", js.undefined)
      
      @scala.inline
      def setSparse(value: (/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String]) => Matrix): Self = StObject.set(x, "sparse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSparseDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sparseDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseDependenciesUndefined: Self = StObject.set(x, "sparseDependencies", js.undefined)
      
      @scala.inline
      def setSparseMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SparseMatrixDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseMatrixDependenciesUndefined: Self = StObject.set(x, "SparseMatrixDependencies", js.undefined)
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
      
      @scala.inline
      def setSpeedOfLightDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "speedOfLightDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedOfLightDependenciesUndefined: Self = StObject.set(x, "speedOfLightDependencies", js.undefined)
      
      @scala.inline
      def setSplitUnit(value: (/* unit */ Unit, /* parts */ js.Array[Unit]) => js.Array[Unit]): Self = StObject.set(x, "splitUnit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSplitUnitDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "splitUnitDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUnitDependenciesUndefined: Self = StObject.set(x, "splitUnitDependencies", js.undefined)
      
      @scala.inline
      def setSplitUnitUndefined: Self = StObject.set(x, "splitUnit", js.undefined)
      
      @scala.inline
      def setSqrt(value: /* x */ Double => Double): Self = StObject.set(x, "sqrt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSqrtDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sqrtDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqrtDependenciesUndefined: Self = StObject.set(x, "sqrtDependencies", js.undefined)
      
      @scala.inline
      def setSqrtUndefined: Self = StObject.set(x, "sqrt", js.undefined)
      
      @scala.inline
      def setSqrtm(value: /* A */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "sqrtm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSqrtmDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sqrtmDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqrtmDependenciesUndefined: Self = StObject.set(x, "sqrtmDependencies", js.undefined)
      
      @scala.inline
      def setSqrtmUndefined: Self = StObject.set(x, "sqrtm", js.undefined)
      
      @scala.inline
      def setSquare(value: /* x */ Double => Double): Self = StObject.set(x, "square", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSquareDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "squareDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareDependenciesUndefined: Self = StObject.set(x, "squareDependencies", js.undefined)
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      @scala.inline
      def setSqueeze(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "squeeze", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSqueezeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "squeezeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqueezeDependenciesUndefined: Self = StObject.set(x, "squeezeDependencies", js.undefined)
      
      @scala.inline
      def setSqueezeUndefined: Self = StObject.set(x, "squeeze", js.undefined)
      
      @scala.inline
      def setStd(
        value: (/* array */ MathArray | Matrix, /* normalization */ js.UndefOr[unbiased | uncorrected | biased]) => Double
      ): Self = StObject.set(x, "std", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stdDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdDependenciesUndefined: Self = StObject.set(x, "stdDependencies", js.undefined)
      
      @scala.inline
      def setStdTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stdTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdTransformDependenciesUndefined: Self = StObject.set(x, "stdTransformDependencies", js.undefined)
      
      @scala.inline
      def setStdUndefined: Self = StObject.set(x, "std", js.undefined)
      
      @scala.inline
      def setStefanBoltzmannDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stefanBoltzmannDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStefanBoltzmannDependenciesUndefined: Self = StObject.set(x, "stefanBoltzmannDependencies", js.undefined)
      
      @scala.inline
      def setStirlingS2(
        value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "stirlingS2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStirlingS2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stirlingS2Dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStirlingS2DependenciesUndefined: Self = StObject.set(x, "stirlingS2Dependencies", js.undefined)
      
      @scala.inline
      def setStirlingS2Undefined: Self = StObject.set(x, "stirlingS2", js.undefined)
      
      @scala.inline
      def setString(value: /* value */ MathType | Null => String | MathArray | Matrix): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stringDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringDependenciesUndefined: Self = StObject.set(x, "stringDependencies", js.undefined)
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setSubset(
        value: (/* value */ MathArray | Matrix | String, /* index */ Index, /* replacement */ js.UndefOr[js.Any], /* defaultValue */ js.UndefOr[js.Any]) => MathArray | Matrix | String
      ): Self = StObject.set(x, "subset", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSubsetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "subsetDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubsetDependenciesUndefined: Self = StObject.set(x, "subsetDependencies", js.undefined)
      
      @scala.inline
      def setSubsetTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "subsetTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubsetTransformDependenciesUndefined: Self = StObject.set(x, "subsetTransformDependencies", js.undefined)
      
      @scala.inline
      def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
      
      @scala.inline
      def setSubtract(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubtractDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "subtractDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtractDependenciesUndefined: Self = StObject.set(x, "subtractDependencies", js.undefined)
      
      @scala.inline
      def setSubtractUndefined: Self = StObject.set(x, "subtract", js.undefined)
      
      @scala.inline
      def setSum(value: /* repeated */ Double | BigNumber | Fraction => _): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sumDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSumDependenciesUndefined: Self = StObject.set(x, "sumDependencies", js.undefined)
      
      @scala.inline
      def setSumTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sumTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSumTransformDependenciesUndefined: Self = StObject.set(x, "sumTransformDependencies", js.undefined)
      
      @scala.inline
      def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
      
      @scala.inline
      def setSymbolNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SymbolNodeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolNodeDependenciesUndefined: Self = StObject.set(x, "SymbolNodeDependencies", js.undefined)
      
      @scala.inline
      def setTan(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "tan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "tanDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTanDependenciesUndefined: Self = StObject.set(x, "tanDependencies", js.undefined)
      
      @scala.inline
      def setTanUndefined: Self = StObject.set(x, "tan", js.undefined)
      
      @scala.inline
      def setTanh(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "tanh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTanhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "tanhDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTanhDependenciesUndefined: Self = StObject.set(x, "tanhDependencies", js.undefined)
      
      @scala.inline
      def setTanhUndefined: Self = StObject.set(x, "tanh", js.undefined)
      
      @scala.inline
      def setTau(value: Double): Self = StObject.set(x, "tau", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTauDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "tauDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTauDependenciesUndefined: Self = StObject.set(x, "tauDependencies", js.undefined)
      
      @scala.inline
      def setTauUndefined: Self = StObject.set(x, "tau", js.undefined)
      
      @scala.inline
      def setThomsonCrossSectionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "thomsonCrossSectionDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThomsonCrossSectionDependenciesUndefined: Self = StObject.set(x, "thomsonCrossSectionDependencies", js.undefined)
      
      @scala.inline
      def setTo(value: (/* x */ Unit | MathArray | Matrix, /* unit */ Unit | String) => Unit | MathArray | Matrix): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "toDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDependenciesUndefined: Self = StObject.set(x, "toDependencies", js.undefined)
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTrace(value: /* x */ MathArray | Matrix => Double): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "traceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceDependenciesUndefined: Self = StObject.set(x, "traceDependencies", js.undefined)
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setTranspose(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransposeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "transposeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransposeDependenciesUndefined: Self = StObject.set(x, "transposeDependencies", js.undefined)
      
      @scala.inline
      def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
      
      @scala.inline
      def setTrueDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "trueDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrueDependenciesUndefined: Self = StObject.set(x, "trueDependencies", js.undefined)
      
      @scala.inline
      def setTypeOf(value: /* x */ js.Any => String): Self = StObject.set(x, "typeOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeOfDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "typeOfDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeOfDependenciesUndefined: Self = StObject.set(x, "typeOfDependencies", js.undefined)
      
      @scala.inline
      def setTypeOfUndefined: Self = StObject.set(x, "typeOf", js.undefined)
      
      @scala.inline
      def setTyped(
        value: (/* name */ String, /* signatures */ Record[String, js.Function1[/* repeated */ _, _]]) => js.Function1[/* repeated */ _, _]
      ): Self = StObject.set(x, "typed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypedDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "typedDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypedDependenciesUndefined: Self = StObject.set(x, "typedDependencies", js.undefined)
      
      @scala.inline
      def setTypedUndefined: Self = StObject.set(x, "typed", js.undefined)
      
      @scala.inline
      def setUnaryMinus(value: /* x */ Double => Double): Self = StObject.set(x, "unaryMinus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnaryMinusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "unaryMinusDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnaryMinusDependenciesUndefined: Self = StObject.set(x, "unaryMinusDependencies", js.undefined)
      
      @scala.inline
      def setUnaryMinusUndefined: Self = StObject.set(x, "unaryMinus", js.undefined)
      
      @scala.inline
      def setUnaryPlus(value: /* x */ Double => Double): Self = StObject.set(x, "unaryPlus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnaryPlusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "unaryPlusDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnaryPlusDependenciesUndefined: Self = StObject.set(x, "unaryPlusDependencies", js.undefined)
      
      @scala.inline
      def setUnaryPlusUndefined: Self = StObject.set(x, "unaryPlus", js.undefined)
      
      @scala.inline
      def setUnequal(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "unequal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnequalDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "unequalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnequalDependenciesUndefined: Self = StObject.set(x, "unequalDependencies", js.undefined)
      
      @scala.inline
      def setUnequalUndefined: Self = StObject.set(x, "unequal", js.undefined)
      
      @scala.inline
      def setUninitialized(value: js.Any): Self = StObject.set(x, "uninitialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninitializedUndefined: Self = StObject.set(x, "uninitialized", js.undefined)
      
      @scala.inline
      def setUnit(value: /* unit */ String => Unit): Self = StObject.set(x, "unit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnitDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "UnitDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitDependenciesUndefined: Self = StObject.set(x, "UnitDependencies", js.undefined)
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setUsolve(value: (/* U */ Matrix | MathArray, /* b */ Matrix | MathArray) => Matrix | MathArray): Self = StObject.set(x, "usolve", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUsolveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "usolveDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsolveDependenciesUndefined: Self = StObject.set(x, "usolveDependencies", js.undefined)
      
      @scala.inline
      def setUsolveUndefined: Self = StObject.set(x, "usolve", js.undefined)
      
      @scala.inline
      def setVacuumImpedanceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "vacuumImpedanceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVacuumImpedanceDependenciesUndefined: Self = StObject.set(x, "vacuumImpedanceDependencies", js.undefined)
      
      @scala.inline
      def setVarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "varDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarDependenciesUndefined: Self = StObject.set(x, "varDependencies", js.undefined)
      
      @scala.inline
      def setVariance(value: /* repeated */ Double | BigNumber | Fraction => _): Self = StObject.set(x, "variance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVarianceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "varianceDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarianceDependenciesUndefined: Self = StObject.set(x, "varianceDependencies", js.undefined)
      
      @scala.inline
      def setVarianceTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "varianceTransformDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarianceTransformDependenciesUndefined: Self = StObject.set(x, "varianceTransformDependencies", js.undefined)
      
      @scala.inline
      def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "versionDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionDependenciesUndefined: Self = StObject.set(x, "versionDependencies", js.undefined)
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWeakMixingAngleDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "weakMixingAngleDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakMixingAngleDependenciesUndefined: Self = StObject.set(x, "weakMixingAngleDependencies", js.undefined)
      
      @scala.inline
      def setWienDisplacementDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "wienDisplacementDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWienDisplacementDependenciesUndefined: Self = StObject.set(x, "wienDisplacementDependencies", js.undefined)
      
      @scala.inline
      def setXgcd(value: (/* a */ Double | BigNumber, /* b */ Double | BigNumber) => MathArray): Self = StObject.set(x, "xgcd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setXgcdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "xgcdDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXgcdDependenciesUndefined: Self = StObject.set(x, "xgcdDependencies", js.undefined)
      
      @scala.inline
      def setXgcdUndefined: Self = StObject.set(x, "xgcd", js.undefined)
      
      @scala.inline
      def setXor(
        value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "xor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setXorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "xorDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXorDependenciesUndefined: Self = StObject.set(x, "xorDependencies", js.undefined)
      
      @scala.inline
      def setXorUndefined: Self = StObject.set(x, "xor", js.undefined)
      
      @scala.inline
      def setZeros(
        value: (/* size */ Double | js.Array[Double], /* format */ js.UndefOr[String]) => MathArray | Matrix
      ): Self = StObject.set(x, "zeros", js.Any.fromFunction2(value))
      
      @scala.inline
      def setZerosDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "zerosDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZerosDependenciesUndefined: Self = StObject.set(x, "zerosDependencies", js.undefined)
      
      @scala.inline
      def setZerosUndefined: Self = StObject.set(x, "zeros", js.undefined)
    }
  }
  
  @js.native
  trait Q extends StObject {
    
    var Q: MathArray | Matrix = js.native
    
    var R: MathArray | Matrix = js.native
  }
  object Q {
    
    @scala.inline
    def apply(Q: MathArray | Matrix, R: MathArray | Matrix): Q = {
      val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
      __obj.asInstanceOf[Q]
    }
    
    @scala.inline
    implicit class QMutableBuilder[Self <: Q] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQ(value: MathArray | Matrix): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "Q", js.Array(value :_*))
      
      @scala.inline
      def setR(value: MathArray | Matrix): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "R", js.Array(value :_*))
    }
  }
  
  @js.native
  trait R extends StObject {
    
    var l: String = js.native
    
    var r: String = js.native
  }
  object R {
    
    @scala.inline
    def apply(l: String, r: String): R = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Simplify extends StObject {
    
    var simplify: Boolean = js.native
  }
  object Simplify {
    
    @scala.inline
    def apply(simplify: Boolean): Simplify = {
      val __obj = js.Dynamic.literal(simplify = simplify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Simplify]
    }
    
    @scala.inline
    implicit class SimplifyMutableBuilder[Self <: Simplify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    }
  }
}
