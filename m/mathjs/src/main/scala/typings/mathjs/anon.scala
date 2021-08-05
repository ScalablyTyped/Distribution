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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coefficients extends StObject {
    
    var coefficients: js.Array[MathType]
    
    var expression: MathNode | String
    
    var variables: js.Array[String]
  }
  object Coefficients {
    
    inline def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): Coefficients = {
      val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coefficients]
    }
    
    extension [Self <: Coefficients](x: Self) {
      
      inline def setCoefficients(value: js.Array[MathType]): Self = StObject.set(x, "coefficients", value.asInstanceOf[js.Any])
      
      inline def setCoefficientsVarargs(value: MathType*): Self = StObject.set(x, "coefficients", js.Array(value :_*))
      
      inline def setExpression(value: MathNode | String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: js.Array[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
  
  trait L extends StObject {
    
    var L: MathArray | Matrix
    
    var P: js.Array[Double]
    
    var U: MathArray | Matrix
  }
  object L {
    
    inline def apply(L: MathArray | Matrix, P: js.Array[Double], U: MathArray | Matrix): L = {
      val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
      __obj.asInstanceOf[L]
    }
    
    extension [Self <: L](x: Self) {
      
      inline def setL(value: MathArray | Matrix): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "L", js.Array(value :_*))
      
      inline def setP(value: js.Array[Double]): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: Double*): Self = StObject.set(x, "P", js.Array(value :_*))
      
      inline def setU(value: MathArray | Matrix): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
      
      inline def setUVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "U", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<mathjs.mathjs.MathJsStatic> */
  trait PartialMathJsStatic extends StObject {
    
    var AccessorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ArrayNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var AssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var BigNumberDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var BlockNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ChainDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ComplexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ConditionalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ConstantNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var DenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var EDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var FibonacciHeapDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var FractionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var FunctionAssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var FunctionNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var HelpDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ImmutableDenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var IndexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var IndexNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var Infinity: js.UndefOr[Double] = js.undefined
    
    var InfinityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var LN10: js.UndefOr[Double] = js.undefined
    
    var LN10Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var LN2: js.UndefOr[Double] = js.undefined
    
    var LN2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var LOG10E: js.UndefOr[Double] = js.undefined
    
    var LOG10EDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var LOG2E: js.UndefOr[Double] = js.undefined
    
    var LOG2EDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var MatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var NaN: js.UndefOr[Double] = js.undefined
    
    var NaNDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var NodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ObjectNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var OperatorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var PIDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ParenthesisNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ParserDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var RangeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var RangeNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var RelationalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ResultSetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var SQRT1_2: js.UndefOr[Double] = js.undefined
    
    var SQRT1_2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var SQRT2: js.UndefOr[Double] = js.undefined
    
    var SQRT2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var SpaDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var SparseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var SymbolNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var UnitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var abs: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var absDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var acos: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var acosDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var acosh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var acoshDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var acot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var acotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var acoth: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var acothDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var acsc: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var acscDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var acsch: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var acschDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var add: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
    
    var addDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var addScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var all: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var and: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.undefined
    
    var andDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var applyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var applyTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var arg: js.UndefOr[js.Function1[/* x */ Double | Complex, Double]] = js.undefined
    
    var argDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var asec: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var asecDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var asech: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var asechDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var asin: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var asinDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var asinh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var asinhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var atan: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var atan2: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Double]] = js.undefined
    
    var atan2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var atanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var atanh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var atanhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var atomicMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var avogadroDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bellNumbers: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.undefined
    
    var bellNumbersDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bignumber: js.UndefOr[
        js.Function1[
          /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null], 
          BigNumber
        ]
      ] = js.undefined
    
    var bignumberDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bitAnd: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var bitAndDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bitNot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var bitNotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bitOr: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Double]] = js.undefined
    
    var bitOrDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bitXor: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var bitXorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bohrMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var bohrRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var boltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var boolean: js.UndefOr[
        js.Function1[
          /* x */ String | Double | Boolean | MathArray | Matrix | Null, 
          Boolean | MathArray | Matrix
        ]
      ] = js.undefined
    
    var booleanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var catalan: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.undefined
    
    var catalanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cbrt: js.UndefOr[js.Function2[/* x */ Double, /* allRoots */ js.UndefOr[Boolean], Double]] = js.undefined
    
    var cbrtDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ceil: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var ceilDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var chain: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], MathJsChain]] = js.undefined
    
    var chainDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var classicalElectronRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cloneDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    @JSName("clone")
    var clone_FPartialMathJsStatic: js.UndefOr[js.Function1[/* x */ js.Any, js.Any]] = js.undefined
    
    var columnDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var columnTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var combinations: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.undefined
    
    var combinationsDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var compare: js.UndefOr[
        js.Function2[
          /* x */ MathType | String, 
          /* y */ MathType | String, 
          Double | BigNumber | Fraction | MathArray | Matrix
        ]
      ] = js.undefined
    
    var compareDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var compareNatural: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.undefined
    
    var compareNaturalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var compareText: js.UndefOr[
        js.Function2[
          /* x */ String | MathArray | Matrix, 
          /* y */ String | MathArray | Matrix, 
          Double | MathArray | Matrix
        ]
      ] = js.undefined
    
    var compareTextDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var compile: js.UndefOr[js.Function1[/* expr */ MathExpression, EvalFunction]] = js.undefined
    
    var compileDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var complex: js.UndefOr[js.Function1[/* arg */ js.UndefOr[Complex | String | PolarCoordinates], Complex]] = js.undefined
    
    var complexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var composition: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.undefined
    
    var compositionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var concat: js.UndefOr[js.Function1[/* repeated */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var concatDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var concatTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var conductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var config: js.UndefOr[js.Function1[/* options */ ConfigOptions, ConfigOptions]] = js.undefined
    
    var conj: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var conjDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cos: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var cosDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cosh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var coshDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cot: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var cotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var coth: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var cothDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var coulombDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var create: js.UndefOr[
        js.Function2[
          /* factories */ FactoryFunctionMap, 
          /* config */ ConfigOptions, 
          Partial[MathJsStatic]
        ]
      ] = js.undefined
    
    var createUnit: js.UndefOr[
        js.Function3[
          /* name */ String, 
          /* definition */ js.UndefOr[String | UnitDefinition], 
          /* options */ js.UndefOr[CreateUnitOptions], 
          Unit
        ]
      ] = js.undefined
    
    var createUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cross: js.UndefOr[
        js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Matrix | MathArray]
      ] = js.undefined
    
    var crossDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var csc: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var cscDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var csch: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var cschDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ctransposeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var cube: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var cubeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var deepEqual: js.UndefOr[
        js.Function2[
          /* x */ MathType, 
          /* y */ MathType, 
          Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
        ]
      ] = js.undefined
    
    var deepEqualDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var derivative: js.UndefOr[
        js.Function3[
          /* expr */ MathNode | String, 
          /* variable */ MathNode | String, 
          /* options */ js.UndefOr[Simplify], 
          MathNode
        ]
      ] = js.undefined
    
    var derivativeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var det: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.undefined
    
    var detDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var deuteronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var diag: js.UndefOr[
        js.Function2[/* X */ MathArray | Matrix, /* format */ js.UndefOr[String], Matrix]
      ] = js.undefined
    
    var diagDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var distance: js.UndefOr[
        js.Function2[
          /* x */ MathArray | Matrix | js.Object, 
          /* y */ MathArray | Matrix | js.Object, 
          Double | BigNumber
        ]
      ] = js.undefined
    
    var distanceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var divide: js.UndefOr[js.Function2[/* x */ Unit, /* y */ Unit, Unit]] = js.undefined
    
    var divideDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var divideScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var dot: js.UndefOr[js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Double]] = js.undefined
    
    var dotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var dotDivide: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
    
    var dotDivideDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var dotMultiply: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
    
    var dotMultiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var dotPow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
    
    var dotPowDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var e: js.UndefOr[Double] = js.undefined
    
    var eDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var efimovFactorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var electricConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var electronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var elementaryChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var equal: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.undefined
    
    var equalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var equalScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var equalText: js.UndefOr[
        js.Function2[
          /* x */ String | MathArray | Matrix, 
          /* y */ String | MathArray | Matrix, 
          Double | MathArray | Matrix
        ]
      ] = js.undefined
    
    var equalTextDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var erf: js.UndefOr[
        js.Function1[/* x */ Double | MathArray | Matrix, NoLiteralType[Double | MathArray | Matrix]]
      ] = js.undefined
    
    var erfDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var evalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var evaluate: js.UndefOr[
        js.Function2[
          /* expr */ MathExpression | js.Array[MathExpression] | Matrix, 
          /* scope */ js.UndefOr[js.Object], 
          js.Any
        ]
      ] = js.undefined
    
    var evaluateDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var exp: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var expDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var expm: js.UndefOr[js.Function1[/* x */ Matrix, Matrix]] = js.undefined
    
    var expm1: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var expm1Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var expmDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var expression: js.UndefOr[MathNode] = js.undefined
    
    var eyeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var factorial: js.UndefOr[
        js.Function1[
          /* n */ Double | BigNumber | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var factorialDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var factory: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* dependencies */ js.Array[MathJsFunctionName], 
          /* create */ js.Function1[/* injected */ Partial[MathJsStatic], js.Any], 
          /* meta */ js.UndefOr[js.Any], 
          FactoryFunction[js.Any]
        ]
      ] = js.undefined
    
    var falseDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var faradayDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var fermiCouplingDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
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
      ] = js.undefined
    
    var filterDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var filterTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var fineStructureDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var firstRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var fix: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var fixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var flatten: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var flattenDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var floor: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var floorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var forEach: js.UndefOr[
        js.Function2[
          /* x */ Matrix | MathArray, 
          /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit], 
          scala.Unit
        ]
      ] = js.undefined
    
    var forEachDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var forEachTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var format: js.UndefOr[
        js.Function3[
          /* value */ js.Any, 
          /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], 
          /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]], 
          String
        ]
      ] = js.undefined
    
    var formatDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var fraction: js.UndefOr[
        js.Function1[/* args */ Fraction | MathArray | Matrix, Fraction | MathArray | Matrix]
      ] = js.undefined
    
    var fractionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var gamma: js.UndefOr[js.Function1[/* n */ Double | MathArray | Matrix, Double | MathArray | Matrix]] = js.undefined
    
    var gammaDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var gasConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var gcd: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.undefined
    
    var gcdDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var getMatrixDataTypeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var gravitationConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var gravityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var hartreeEnergyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var hasNumericValueDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var help: js.UndefOr[js.Function1[/* search */ js.Function0[js.Any], Help]] = js.undefined
    
    var helpDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var hypot: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.undefined
    
    var hypotDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var i: js.UndefOr[Double] = js.undefined
    
    var iDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var identity: js.UndefOr[
        js.Function2[
          /* size */ Double | js.Array[Double] | Matrix | MathArray, 
          /* format */ js.UndefOr[String], 
          Matrix | MathArray | Double
        ]
      ] = js.undefined
    
    var identityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var im: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          Double | BigNumber | MathArray | Matrix
        ]
      ] = js.undefined
    
    var imDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var `import`: js.UndefOr[
        js.Function2[
          /* object */ ImportObject | js.Array[ImportObject], 
          /* options */ ImportOptions, 
          scala.Unit
        ]
      ] = js.undefined
    
    var index: js.UndefOr[js.Function1[/* repeated */ js.Any, Index]] = js.undefined
    
    var indexDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var indexTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var intersect: js.UndefOr[
        js.Function4[
          /* w */ MathArray | Matrix, 
          /* x */ MathArray | Matrix, 
          /* y */ MathArray | Matrix, 
          /* z */ MathArray | Matrix, 
          MathArray
        ]
      ] = js.undefined
    
    var intersectDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var inv: js.UndefOr[
        js.Function1[
          /* x */ Double | Complex | MathArray | Matrix, 
          NoLiteralType[Double | Complex | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var invDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var inverseConductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isInteger: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix, Boolean]
      ] = js.undefined
    
    var isIntegerDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isNaN: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
      ] = js.undefined
    
    var isNaNDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isNegative: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
      ] = js.undefined
    
    var isNegativeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isNumeric: js.UndefOr[js.Function1[/* x */ js.Any, Boolean]] = js.undefined
    
    var isNumericDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isPositive: js.UndefOr[
        js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
      ] = js.undefined
    
    var isPositiveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isPrime: js.UndefOr[js.Function1[/* x */ Double | BigNumber | MathArray | Matrix, Boolean]] = js.undefined
    
    var isPrimeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var isZero: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex, 
          Boolean
        ]
      ] = js.undefined
    
    var isZeroDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var json: js.UndefOr[MathJsJson] = js.undefined
    
    var kldivergence: js.UndefOr[js.Function2[/* q */ MathArray | Matrix, /* p */ MathArray | Matrix, Double]] = js.undefined
    
    var kldivergenceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var klitzingDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var kron: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ Matrix | MathArray, Matrix]] = js.undefined
    
    var kronDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var larger: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.undefined
    
    var largerDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var largerEq: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.undefined
    
    var largerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var lcm: js.UndefOr[js.Function2[/* a */ Double, /* b */ Double, Double]] = js.undefined
    
    var lcmDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var leftShift: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var leftShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var log: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          /* base */ js.UndefOr[Double | BigNumber | Complex], 
          NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var log10: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var log10Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var log1p: js.UndefOr[
        js.Function2[/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex], Double]
      ] = js.undefined
    
    var log1pDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var log2: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var log2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var logDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var loschmidtDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var lsolve: js.UndefOr[
        js.Function2[/* L */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
      ] = js.undefined
    
    var lsolveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var lup: js.UndefOr[js.Function1[/* A */ js.UndefOr[Matrix | MathArray], L]] = js.undefined
    
    var lupDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var lusolve: js.UndefOr[
        js.Function4[
          /* A */ Matrix | MathArray | Double, 
          /* b */ Matrix | MathArray, 
          /* order */ js.UndefOr[Double], 
          /* threshold */ js.UndefOr[Double], 
          Matrix | MathArray
        ]
      ] = js.undefined
    
    var lusolveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var mad: js.UndefOr[js.Function1[/* array */ MathArray | Matrix, js.Any]] = js.undefined
    
    var madDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var magneticConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var magneticFluxQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
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
      ] = js.undefined
    
    var mapDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var mapTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var matrix: js.UndefOr[js.Function1[/* format */ js.UndefOr[sparse | dense], Matrix]] = js.undefined
    
    var matrixDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var max: js.UndefOr[js.Function1[/* repeated */ MathType, js.Any]] = js.undefined
    
    var maxDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var maxTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var mean: js.UndefOr[js.Function1[/* repeated */ MathType, js.Any]] = js.undefined
    
    var meanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var meanTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var median: js.UndefOr[js.Function1[/* repeated */ MathType, js.Any]] = js.undefined
    
    var medianDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var min: js.UndefOr[js.Function1[/* repeated */ MathType, js.Any]] = js.undefined
    
    var minDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var minTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var mod: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Fraction | MathArray | Matrix, 
          /* y */ Double | BigNumber | Fraction | MathArray | Matrix, 
          NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var modDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var mode: js.UndefOr[js.Function1[/* repeated */ MathType, js.Any]] = js.undefined
    
    var modeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var molarMassC12Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var molarMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var molarPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var molarVolumeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var multinomial: js.UndefOr[
        js.Function1[/* a */ js.Array[Double | BigNumber], NoLiteralType[Double | BigNumber]]
      ] = js.undefined
    
    var multinomialDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var multiply: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ MathType, Matrix | MathArray]] = js.undefined
    
    var multiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var multiplyScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var neutronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var norm: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          /* p */ js.UndefOr[Double | BigNumber | String], 
          Double | BigNumber
        ]
      ] = js.undefined
    
    var normDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var not: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.undefined
    
    var notDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var nthRoot: js.UndefOr[
        js.Function2[
          /* a */ Double | BigNumber | MathArray | Matrix | Complex, 
          /* root */ js.UndefOr[Double | BigNumber], 
          Double | Complex | MathArray | Matrix
        ]
      ] = js.undefined
    
    var nthRootDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var nthRootsDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var nuclearMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var `null`: js.UndefOr[Double] = js.undefined
    
    var nullDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var number: js.UndefOr[
        js.Function1[
          /* value */ js.UndefOr[
            String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
          ], 
          Double | MathArray | Matrix
        ]
      ] = js.undefined
    
    var numberDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var numericDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var ones: js.UndefOr[
        js.Function2[
          /* size */ Double | js.Array[Double], 
          /* format */ js.UndefOr[String], 
          MathArray | Matrix
        ]
      ] = js.undefined
    
    var onesDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var or: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.undefined
    
    var orDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var parse: js.UndefOr[
        js.Function2[/* expr */ MathExpression, /* options */ js.UndefOr[js.Any], MathNode]
      ] = js.undefined
    
    var parseDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var parser: js.UndefOr[js.Function0[Parser]] = js.undefined
    
    var parserDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var partitionSelect: js.UndefOr[
        js.Function3[
          /* x */ MathArray | Matrix, 
          /* k */ Double, 
          /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])], 
          js.Any
        ]
      ] = js.undefined
    
    var partitionSelectDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var permutations: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ js.UndefOr[Double | BigNumber], 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.undefined
    
    var permutationsDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var phi: js.UndefOr[Double] = js.undefined
    
    var phiDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var pi: js.UndefOr[Double] = js.undefined
    
    var piDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var pickRandom: js.UndefOr[
        js.Function3[
          /* array */ js.Array[Double], 
          /* number */ js.UndefOr[Double], 
          /* weights */ js.UndefOr[js.Array[Double]], 
          Double | js.Array[Double]
        ]
      ] = js.undefined
    
    var pickRandomDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var planckChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var planckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var planckLengthDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var planckMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var planckTemperatureDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var planckTimeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var pow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ Double | BigNumber | Complex, MathType]] = js.undefined
    
    var powDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var print: js.UndefOr[
        js.Function4[
          /* template */ String, 
          /* values */ js.Any, 
          /* precision */ js.UndefOr[Double], 
          /* options */ js.UndefOr[Double | js.Object], 
          scala.Unit
        ]
      ] = js.undefined
    
    var printDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var prod: js.UndefOr[js.Function1[/* repeated */ MathType, js.Any]] = js.undefined
    
    var prodDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var protonMassDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var qr: js.UndefOr[js.Function1[/* A */ Matrix | MathArray, Q]] = js.undefined
    
    var qrDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var quantileSeq: js.UndefOr[
        js.Function3[
          /* A */ MathArray | Matrix, 
          /* prob */ Double | BigNumber | MathArray, 
          /* sorted */ js.UndefOr[Boolean], 
          Double | BigNumber | Unit | MathArray
        ]
      ] = js.undefined
    
    var quantileSeqDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var quantumOfCirculationDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var random: js.UndefOr[js.Function2[/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], Double]] = js.undefined
    
    var randomDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var randomInt: js.UndefOr[js.Function2[/* min */ Double, /* max */ js.UndefOr[Double], Double]] = js.undefined
    
    var randomIntDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var range: js.UndefOr[js.Function2[/* str */ String, /* includeEnd */ js.UndefOr[Boolean], Matrix]] = js.undefined
    
    var rangeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rangeTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rationalize: js.UndefOr[
        js.Function3[
          /* expr */ MathNode | String, 
          /* optional */ js.UndefOr[js.Object | Boolean], 
          /* detailed */ js.UndefOr[`true`], 
          Coefficients
        ]
      ] = js.undefined
    
    var rationalizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var re: js.UndefOr[
        js.Function1[
          /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
          Double | BigNumber | MathArray | Matrix
        ]
      ] = js.undefined
    
    var reDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var reducedPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var reshape: js.UndefOr[
        js.Function2[/* x */ MathArray | Matrix, /* sizes */ js.Array[Double], MathArray | Matrix]
      ] = js.undefined
    
    var reshapeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var resize: js.UndefOr[
        js.Function3[
          /* x */ MathArray | Matrix, 
          /* size */ MathArray | Matrix, 
          /* defaultValue */ js.UndefOr[Double | String], 
          MathArray | Matrix
        ]
      ] = js.undefined
    
    var resizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var reviverDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rightArithShift: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | MathArray | Matrix, 
          /* y */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var rightArithShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rightLogShift: js.UndefOr[
        js.Function2[
          /* x */ Double | MathArray | Matrix, 
          /* y */ Double, 
          NoLiteralType[Double | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var rightLogShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var round: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, 
          /* n */ js.UndefOr[Double | BigNumber | MathArray], 
          NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
        ]
      ] = js.undefined
    
    var roundDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rowDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rowTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var rydbergDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sackurTetrodeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sec: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var secDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sech: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var sechDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var secondRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setCartesian: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.undefined
    
    var setCartesianDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setDifference: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.undefined
    
    var setDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setDistinct: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var setDistinctDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setIntersect: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.undefined
    
    var setIntersectDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setIsSubset: js.UndefOr[js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, Boolean]] = js.undefined
    
    var setIsSubsetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setMultiplicity: js.UndefOr[
        js.Function2[/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix, Double]
      ] = js.undefined
    
    var setMultiplicityDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setPowerset: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var setPowersetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setSize: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, Double]] = js.undefined
    
    var setSizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setSymDifference: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.undefined
    
    var setSymDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var setUnion: js.UndefOr[
        js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
      ] = js.undefined
    
    var setUnionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sign: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var signDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var simplify: js.UndefOr[
        js.Function3[
          /* expr */ MathNode | String, 
          /* rules */ js.UndefOr[js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]], 
          /* scope */ js.UndefOr[js.Object], 
          MathNode
        ]
      ] = js.undefined
    
    var simplifyDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sin: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var sinDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sinh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var sinhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var size: js.UndefOr[
        js.Function1[
          /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix, 
          MathArray | Matrix
        ]
      ] = js.undefined
    
    var sizeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var slu: js.UndefOr[
        js.Function3[/* A */ Matrix, /* order */ Double, /* threshold */ Double, js.Object]
      ] = js.undefined
    
    var sluDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var smaller: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.undefined
    
    var smallerDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var smallerEq: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.undefined
    
    var smallerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sort: js.UndefOr[
        js.Function2[
          /* x */ Matrix | MathArray, 
          /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural, 
          Matrix | MathArray
        ]
      ] = js.undefined
    
    var sortDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sparse: js.UndefOr[
        js.Function2[/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String], Matrix]
      ] = js.undefined
    
    var sparseDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var speedOfLightDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var splitUnit: js.UndefOr[js.Function2[/* unit */ Unit, /* parts */ js.Array[Unit], js.Array[Unit]]] = js.undefined
    
    var splitUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sqrt: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var sqrtDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sqrtm: js.UndefOr[js.Function1[/* A */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var sqrtmDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var square: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var squareDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var squeeze: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var squeezeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var std: js.UndefOr[
        js.Function2[
          /* array */ MathArray | Matrix, 
          /* normalization */ js.UndefOr[unbiased | uncorrected | biased], 
          Double
        ]
      ] = js.undefined
    
    var stdDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var stdTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var stefanBoltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var stirlingS2: js.UndefOr[
        js.Function2[
          /* n */ Double | BigNumber, 
          /* k */ Double | BigNumber, 
          NoLiteralType[Double | BigNumber]
        ]
      ] = js.undefined
    
    var stirlingS2Dependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var string: js.UndefOr[js.Function1[/* value */ MathType | Null, String | MathArray | Matrix]] = js.undefined
    
    var stringDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var subset: js.UndefOr[
        js.Function4[
          /* value */ MathArray | Matrix | String, 
          /* index */ Index, 
          /* replacement */ js.UndefOr[js.Any], 
          /* defaultValue */ js.UndefOr[js.Any], 
          MathArray | Matrix | String
        ]
      ] = js.undefined
    
    var subsetDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var subsetTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var subtract: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.undefined
    
    var subtractDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sum: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, js.Any]] = js.undefined
    
    var sumDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var sumTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var tan: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var tanDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var tanh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.undefined
    
    var tanhDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var tau: js.UndefOr[Double] = js.undefined
    
    var tauDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var thomsonCrossSectionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var to: js.UndefOr[
        js.Function2[
          /* x */ Unit | MathArray | Matrix, 
          /* unit */ Unit | String, 
          Unit | MathArray | Matrix
        ]
      ] = js.undefined
    
    var toDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var trace: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.undefined
    
    var traceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var transpose: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.undefined
    
    var transposeDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var trueDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var typeOf: js.UndefOr[js.Function1[/* x */ js.Any, String]] = js.undefined
    
    var typeOfDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var typed: js.UndefOr[
        js.Function2[
          /* name */ String, 
          /* signatures */ Record[String, js.Function1[/* repeated */ js.Any, js.Any]], 
          js.Function1[/* repeated */ js.Any, js.Any]
        ]
      ] = js.undefined
    
    var typedDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var typeofDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var unaryMinus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var unaryMinusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var unaryPlus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var unaryPlusDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var unequal: js.UndefOr[
        js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
      ] = js.undefined
    
    var unequalDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var uninitialized: js.UndefOr[js.Any] = js.undefined
    
    var unit: js.UndefOr[js.Function1[/* unit */ String, Unit]] = js.undefined
    
    var unitDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var usolve: js.UndefOr[
        js.Function2[/* U */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
      ] = js.undefined
    
    var usolveDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var vacuumImpedanceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var varDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var variance: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, js.Any]] = js.undefined
    
    var varianceDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var varianceTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var versionDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var weakMixingAngleDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var wienDisplacementDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var xgcd: js.UndefOr[js.Function2[/* a */ Double | BigNumber, /* b */ Double | BigNumber, MathArray]] = js.undefined
    
    var xgcdDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var xor: js.UndefOr[
        js.Function2[
          /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
          Boolean | MathArray | Matrix
        ]
      ] = js.undefined
    
    var xorDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
    
    var zeros: js.UndefOr[
        js.Function2[
          /* size */ Double | js.Array[Double], 
          /* format */ js.UndefOr[String], 
          MathArray | Matrix
        ]
      ] = js.undefined
    
    var zerosDependencies: js.UndefOr[FactoryFunctionMap] = js.undefined
  }
  object PartialMathJsStatic {
    
    inline def apply(): PartialMathJsStatic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMathJsStatic]
    }
    
    extension [Self <: PartialMathJsStatic](x: Self) {
      
      inline def setAbs(value: /* x */ Double => Double): Self = StObject.set(x, "abs", js.Any.fromFunction1(value))
      
      inline def setAbsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "absDependencies", value.asInstanceOf[js.Any])
      
      inline def setAbsDependenciesUndefined: Self = StObject.set(x, "absDependencies", js.undefined)
      
      inline def setAbsUndefined: Self = StObject.set(x, "abs", js.undefined)
      
      inline def setAccessorNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "AccessorNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setAccessorNodeDependenciesUndefined: Self = StObject.set(x, "AccessorNodeDependencies", js.undefined)
      
      inline def setAcos(value: /* x */ Double => Double): Self = StObject.set(x, "acos", js.Any.fromFunction1(value))
      
      inline def setAcosDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acosDependencies", value.asInstanceOf[js.Any])
      
      inline def setAcosDependenciesUndefined: Self = StObject.set(x, "acosDependencies", js.undefined)
      
      inline def setAcosUndefined: Self = StObject.set(x, "acos", js.undefined)
      
      inline def setAcosh(value: /* x */ Double => Double): Self = StObject.set(x, "acosh", js.Any.fromFunction1(value))
      
      inline def setAcoshDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acoshDependencies", value.asInstanceOf[js.Any])
      
      inline def setAcoshDependenciesUndefined: Self = StObject.set(x, "acoshDependencies", js.undefined)
      
      inline def setAcoshUndefined: Self = StObject.set(x, "acosh", js.undefined)
      
      inline def setAcot(value: /* x */ Double => Double): Self = StObject.set(x, "acot", js.Any.fromFunction1(value))
      
      inline def setAcotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acotDependencies", value.asInstanceOf[js.Any])
      
      inline def setAcotDependenciesUndefined: Self = StObject.set(x, "acotDependencies", js.undefined)
      
      inline def setAcotUndefined: Self = StObject.set(x, "acot", js.undefined)
      
      inline def setAcoth(value: /* x */ Double => Double): Self = StObject.set(x, "acoth", js.Any.fromFunction1(value))
      
      inline def setAcothDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acothDependencies", value.asInstanceOf[js.Any])
      
      inline def setAcothDependenciesUndefined: Self = StObject.set(x, "acothDependencies", js.undefined)
      
      inline def setAcothUndefined: Self = StObject.set(x, "acoth", js.undefined)
      
      inline def setAcsc(value: /* x */ Double => Double): Self = StObject.set(x, "acsc", js.Any.fromFunction1(value))
      
      inline def setAcscDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acscDependencies", value.asInstanceOf[js.Any])
      
      inline def setAcscDependenciesUndefined: Self = StObject.set(x, "acscDependencies", js.undefined)
      
      inline def setAcscUndefined: Self = StObject.set(x, "acsc", js.undefined)
      
      inline def setAcsch(value: /* x */ Double => Double): Self = StObject.set(x, "acsch", js.Any.fromFunction1(value))
      
      inline def setAcschDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "acschDependencies", value.asInstanceOf[js.Any])
      
      inline def setAcschDependenciesUndefined: Self = StObject.set(x, "acschDependencies", js.undefined)
      
      inline def setAcschUndefined: Self = StObject.set(x, "acsch", js.undefined)
      
      inline def setAdd(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "addDependencies", value.asInstanceOf[js.Any])
      
      inline def setAddDependenciesUndefined: Self = StObject.set(x, "addDependencies", js.undefined)
      
      inline def setAddScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "addScalarDependencies", value.asInstanceOf[js.Any])
      
      inline def setAddScalarDependenciesUndefined: Self = StObject.set(x, "addScalarDependencies", js.undefined)
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAll(value: FactoryFunctionMap): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAnd(
        value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "and", js.Any.fromFunction2(value))
      
      inline def setAndDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "andDependencies", value.asInstanceOf[js.Any])
      
      inline def setAndDependenciesUndefined: Self = StObject.set(x, "andDependencies", js.undefined)
      
      inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
      
      inline def setApplyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "applyDependencies", value.asInstanceOf[js.Any])
      
      inline def setApplyDependenciesUndefined: Self = StObject.set(x, "applyDependencies", js.undefined)
      
      inline def setApplyTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "applyTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setApplyTransformDependenciesUndefined: Self = StObject.set(x, "applyTransformDependencies", js.undefined)
      
      inline def setArg(value: /* x */ Double | Complex => Double): Self = StObject.set(x, "arg", js.Any.fromFunction1(value))
      
      inline def setArgDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "argDependencies", value.asInstanceOf[js.Any])
      
      inline def setArgDependenciesUndefined: Self = StObject.set(x, "argDependencies", js.undefined)
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setArrayNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ArrayNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setArrayNodeDependenciesUndefined: Self = StObject.set(x, "ArrayNodeDependencies", js.undefined)
      
      inline def setAsec(value: /* x */ Double => Double): Self = StObject.set(x, "asec", js.Any.fromFunction1(value))
      
      inline def setAsecDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asecDependencies", value.asInstanceOf[js.Any])
      
      inline def setAsecDependenciesUndefined: Self = StObject.set(x, "asecDependencies", js.undefined)
      
      inline def setAsecUndefined: Self = StObject.set(x, "asec", js.undefined)
      
      inline def setAsech(value: /* x */ Double => Double): Self = StObject.set(x, "asech", js.Any.fromFunction1(value))
      
      inline def setAsechDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asechDependencies", value.asInstanceOf[js.Any])
      
      inline def setAsechDependenciesUndefined: Self = StObject.set(x, "asechDependencies", js.undefined)
      
      inline def setAsechUndefined: Self = StObject.set(x, "asech", js.undefined)
      
      inline def setAsin(value: /* x */ Double => Double): Self = StObject.set(x, "asin", js.Any.fromFunction1(value))
      
      inline def setAsinDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asinDependencies", value.asInstanceOf[js.Any])
      
      inline def setAsinDependenciesUndefined: Self = StObject.set(x, "asinDependencies", js.undefined)
      
      inline def setAsinUndefined: Self = StObject.set(x, "asin", js.undefined)
      
      inline def setAsinh(value: /* x */ Double => Double): Self = StObject.set(x, "asinh", js.Any.fromFunction1(value))
      
      inline def setAsinhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "asinhDependencies", value.asInstanceOf[js.Any])
      
      inline def setAsinhDependenciesUndefined: Self = StObject.set(x, "asinhDependencies", js.undefined)
      
      inline def setAsinhUndefined: Self = StObject.set(x, "asinh", js.undefined)
      
      inline def setAssignmentNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "AssignmentNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setAssignmentNodeDependenciesUndefined: Self = StObject.set(x, "AssignmentNodeDependencies", js.undefined)
      
      inline def setAtan(value: /* x */ Double => Double): Self = StObject.set(x, "atan", js.Any.fromFunction1(value))
      
      inline def setAtan2(value: (/* y */ Double, /* x */ Double) => Double): Self = StObject.set(x, "atan2", js.Any.fromFunction2(value))
      
      inline def setAtan2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atan2Dependencies", value.asInstanceOf[js.Any])
      
      inline def setAtan2DependenciesUndefined: Self = StObject.set(x, "atan2Dependencies", js.undefined)
      
      inline def setAtan2Undefined: Self = StObject.set(x, "atan2", js.undefined)
      
      inline def setAtanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atanDependencies", value.asInstanceOf[js.Any])
      
      inline def setAtanDependenciesUndefined: Self = StObject.set(x, "atanDependencies", js.undefined)
      
      inline def setAtanUndefined: Self = StObject.set(x, "atan", js.undefined)
      
      inline def setAtanh(value: /* x */ Double => Double): Self = StObject.set(x, "atanh", js.Any.fromFunction1(value))
      
      inline def setAtanhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atanhDependencies", value.asInstanceOf[js.Any])
      
      inline def setAtanhDependenciesUndefined: Self = StObject.set(x, "atanhDependencies", js.undefined)
      
      inline def setAtanhUndefined: Self = StObject.set(x, "atanh", js.undefined)
      
      inline def setAtomicMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "atomicMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setAtomicMassDependenciesUndefined: Self = StObject.set(x, "atomicMassDependencies", js.undefined)
      
      inline def setAvogadroDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "avogadroDependencies", value.asInstanceOf[js.Any])
      
      inline def setAvogadroDependenciesUndefined: Self = StObject.set(x, "avogadroDependencies", js.undefined)
      
      inline def setBellNumbers(value: /* n */ Double => Double): Self = StObject.set(x, "bellNumbers", js.Any.fromFunction1(value))
      
      inline def setBellNumbersDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bellNumbersDependencies", value.asInstanceOf[js.Any])
      
      inline def setBellNumbersDependenciesUndefined: Self = StObject.set(x, "bellNumbersDependencies", js.undefined)
      
      inline def setBellNumbersUndefined: Self = StObject.set(x, "bellNumbers", js.undefined)
      
      inline def setBigNumberDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "BigNumberDependencies", value.asInstanceOf[js.Any])
      
      inline def setBigNumberDependenciesUndefined: Self = StObject.set(x, "BigNumberDependencies", js.undefined)
      
      inline def setBignumber(
        value: /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null] => BigNumber
      ): Self = StObject.set(x, "bignumber", js.Any.fromFunction1(value))
      
      inline def setBignumberUndefined: Self = StObject.set(x, "bignumber", js.undefined)
      
      inline def setBitAnd(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "bitAnd", js.Any.fromFunction2(value))
      
      inline def setBitAndDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitAndDependencies", value.asInstanceOf[js.Any])
      
      inline def setBitAndDependenciesUndefined: Self = StObject.set(x, "bitAndDependencies", js.undefined)
      
      inline def setBitAndUndefined: Self = StObject.set(x, "bitAnd", js.undefined)
      
      inline def setBitNot(value: /* x */ Double => Double): Self = StObject.set(x, "bitNot", js.Any.fromFunction1(value))
      
      inline def setBitNotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitNotDependencies", value.asInstanceOf[js.Any])
      
      inline def setBitNotDependenciesUndefined: Self = StObject.set(x, "bitNotDependencies", js.undefined)
      
      inline def setBitNotUndefined: Self = StObject.set(x, "bitNot", js.undefined)
      
      inline def setBitOr(value: (/* x */ Double, /* y */ Double) => Double): Self = StObject.set(x, "bitOr", js.Any.fromFunction2(value))
      
      inline def setBitOrDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitOrDependencies", value.asInstanceOf[js.Any])
      
      inline def setBitOrDependenciesUndefined: Self = StObject.set(x, "bitOrDependencies", js.undefined)
      
      inline def setBitOrUndefined: Self = StObject.set(x, "bitOr", js.undefined)
      
      inline def setBitXor(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "bitXor", js.Any.fromFunction2(value))
      
      inline def setBitXorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bitXorDependencies", value.asInstanceOf[js.Any])
      
      inline def setBitXorDependenciesUndefined: Self = StObject.set(x, "bitXorDependencies", js.undefined)
      
      inline def setBitXorUndefined: Self = StObject.set(x, "bitXor", js.undefined)
      
      inline def setBlockNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "BlockNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setBlockNodeDependenciesUndefined: Self = StObject.set(x, "BlockNodeDependencies", js.undefined)
      
      inline def setBohrMagnetonDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bohrMagnetonDependencies", value.asInstanceOf[js.Any])
      
      inline def setBohrMagnetonDependenciesUndefined: Self = StObject.set(x, "bohrMagnetonDependencies", js.undefined)
      
      inline def setBohrRadiusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "bohrRadiusDependencies", value.asInstanceOf[js.Any])
      
      inline def setBohrRadiusDependenciesUndefined: Self = StObject.set(x, "bohrRadiusDependencies", js.undefined)
      
      inline def setBoltzmannDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "boltzmannDependencies", value.asInstanceOf[js.Any])
      
      inline def setBoltzmannDependenciesUndefined: Self = StObject.set(x, "boltzmannDependencies", js.undefined)
      
      inline def setBoolean(
        value: /* x */ String | Double | Boolean | MathArray | Matrix | Null => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setBooleanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "booleanDependencies", value.asInstanceOf[js.Any])
      
      inline def setBooleanDependenciesUndefined: Self = StObject.set(x, "booleanDependencies", js.undefined)
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setCatalan(value: /* n */ Double => Double): Self = StObject.set(x, "catalan", js.Any.fromFunction1(value))
      
      inline def setCatalanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "catalanDependencies", value.asInstanceOf[js.Any])
      
      inline def setCatalanDependenciesUndefined: Self = StObject.set(x, "catalanDependencies", js.undefined)
      
      inline def setCatalanUndefined: Self = StObject.set(x, "catalan", js.undefined)
      
      inline def setCbrt(value: (/* x */ Double, /* allRoots */ js.UndefOr[Boolean]) => Double): Self = StObject.set(x, "cbrt", js.Any.fromFunction2(value))
      
      inline def setCbrtDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cbrtDependencies", value.asInstanceOf[js.Any])
      
      inline def setCbrtDependenciesUndefined: Self = StObject.set(x, "cbrtDependencies", js.undefined)
      
      inline def setCbrtUndefined: Self = StObject.set(x, "cbrt", js.undefined)
      
      inline def setCeil(value: /* x */ Double => Double): Self = StObject.set(x, "ceil", js.Any.fromFunction1(value))
      
      inline def setCeilDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ceilDependencies", value.asInstanceOf[js.Any])
      
      inline def setCeilDependenciesUndefined: Self = StObject.set(x, "ceilDependencies", js.undefined)
      
      inline def setCeilUndefined: Self = StObject.set(x, "ceil", js.undefined)
      
      inline def setChain(value: /* value */ js.UndefOr[js.Any] => MathJsChain): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setChainDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ChainDependencies", value.asInstanceOf[js.Any])
      
      inline def setChainDependenciesUndefined: Self = StObject.set(x, "ChainDependencies", js.undefined)
      
      inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      inline def setClassicalElectronRadiusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "classicalElectronRadiusDependencies", value.asInstanceOf[js.Any])
      
      inline def setClassicalElectronRadiusDependenciesUndefined: Self = StObject.set(x, "classicalElectronRadiusDependencies", js.undefined)
      
      inline def setCloneDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cloneDependencies", value.asInstanceOf[js.Any])
      
      inline def setCloneDependenciesUndefined: Self = StObject.set(x, "cloneDependencies", js.undefined)
      
      inline def setClone_(value: /* x */ js.Any => js.Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setColumnDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "columnDependencies", value.asInstanceOf[js.Any])
      
      inline def setColumnDependenciesUndefined: Self = StObject.set(x, "columnDependencies", js.undefined)
      
      inline def setColumnTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "columnTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setColumnTransformDependenciesUndefined: Self = StObject.set(x, "columnTransformDependencies", js.undefined)
      
      inline def setCombinations(
        value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "combinations", js.Any.fromFunction2(value))
      
      inline def setCombinationsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "combinationsDependencies", value.asInstanceOf[js.Any])
      
      inline def setCombinationsDependenciesUndefined: Self = StObject.set(x, "combinationsDependencies", js.undefined)
      
      inline def setCombinationsUndefined: Self = StObject.set(x, "combinations", js.undefined)
      
      inline def setCompare(
        value: (/* x */ MathType | String, /* y */ MathType | String) => Double | BigNumber | Fraction | MathArray | Matrix
      ): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setCompareDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compareDependencies", value.asInstanceOf[js.Any])
      
      inline def setCompareDependenciesUndefined: Self = StObject.set(x, "compareDependencies", js.undefined)
      
      inline def setCompareNatural(value: (/* x */ js.Any, /* y */ js.Any) => Double): Self = StObject.set(x, "compareNatural", js.Any.fromFunction2(value))
      
      inline def setCompareNaturalDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compareNaturalDependencies", value.asInstanceOf[js.Any])
      
      inline def setCompareNaturalDependenciesUndefined: Self = StObject.set(x, "compareNaturalDependencies", js.undefined)
      
      inline def setCompareNaturalUndefined: Self = StObject.set(x, "compareNatural", js.undefined)
      
      inline def setCompareText(
        value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
      ): Self = StObject.set(x, "compareText", js.Any.fromFunction2(value))
      
      inline def setCompareTextDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compareTextDependencies", value.asInstanceOf[js.Any])
      
      inline def setCompareTextDependenciesUndefined: Self = StObject.set(x, "compareTextDependencies", js.undefined)
      
      inline def setCompareTextUndefined: Self = StObject.set(x, "compareText", js.undefined)
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setCompile(value: /* expr */ MathExpression => EvalFunction): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      inline def setCompileDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compileDependencies", value.asInstanceOf[js.Any])
      
      inline def setCompileDependenciesUndefined: Self = StObject.set(x, "compileDependencies", js.undefined)
      
      inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      inline def setComplex(value: /* arg */ js.UndefOr[Complex | String | PolarCoordinates] => Complex): Self = StObject.set(x, "complex", js.Any.fromFunction1(value))
      
      inline def setComplexDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ComplexDependencies", value.asInstanceOf[js.Any])
      
      inline def setComplexDependenciesUndefined: Self = StObject.set(x, "ComplexDependencies", js.undefined)
      
      inline def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
      
      inline def setComposition(
        value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "composition", js.Any.fromFunction2(value))
      
      inline def setCompositionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "compositionDependencies", value.asInstanceOf[js.Any])
      
      inline def setCompositionDependenciesUndefined: Self = StObject.set(x, "compositionDependencies", js.undefined)
      
      inline def setCompositionUndefined: Self = StObject.set(x, "composition", js.undefined)
      
      inline def setConcat(value: /* repeated */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setConcatDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "concatDependencies", value.asInstanceOf[js.Any])
      
      inline def setConcatDependenciesUndefined: Self = StObject.set(x, "concatDependencies", js.undefined)
      
      inline def setConcatTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "concatTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setConcatTransformDependenciesUndefined: Self = StObject.set(x, "concatTransformDependencies", js.undefined)
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setConditionalNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ConditionalNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setConditionalNodeDependenciesUndefined: Self = StObject.set(x, "ConditionalNodeDependencies", js.undefined)
      
      inline def setConductanceQuantumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "conductanceQuantumDependencies", value.asInstanceOf[js.Any])
      
      inline def setConductanceQuantumDependenciesUndefined: Self = StObject.set(x, "conductanceQuantumDependencies", js.undefined)
      
      inline def setConfig(value: /* options */ ConfigOptions => ConfigOptions): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConj(
        value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "conj", js.Any.fromFunction1(value))
      
      inline def setConjDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "conjDependencies", value.asInstanceOf[js.Any])
      
      inline def setConjDependenciesUndefined: Self = StObject.set(x, "conjDependencies", js.undefined)
      
      inline def setConjUndefined: Self = StObject.set(x, "conj", js.undefined)
      
      inline def setConstantNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ConstantNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setConstantNodeDependenciesUndefined: Self = StObject.set(x, "ConstantNodeDependencies", js.undefined)
      
      inline def setCos(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "cos", js.Any.fromFunction1(value))
      
      inline def setCosDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cosDependencies", value.asInstanceOf[js.Any])
      
      inline def setCosDependenciesUndefined: Self = StObject.set(x, "cosDependencies", js.undefined)
      
      inline def setCosUndefined: Self = StObject.set(x, "cos", js.undefined)
      
      inline def setCosh(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "cosh", js.Any.fromFunction1(value))
      
      inline def setCoshDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "coshDependencies", value.asInstanceOf[js.Any])
      
      inline def setCoshDependenciesUndefined: Self = StObject.set(x, "coshDependencies", js.undefined)
      
      inline def setCoshUndefined: Self = StObject.set(x, "cosh", js.undefined)
      
      inline def setCot(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "cot", js.Any.fromFunction1(value))
      
      inline def setCotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cotDependencies", value.asInstanceOf[js.Any])
      
      inline def setCotDependenciesUndefined: Self = StObject.set(x, "cotDependencies", js.undefined)
      
      inline def setCotUndefined: Self = StObject.set(x, "cot", js.undefined)
      
      inline def setCoth(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "coth", js.Any.fromFunction1(value))
      
      inline def setCothDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cothDependencies", value.asInstanceOf[js.Any])
      
      inline def setCothDependenciesUndefined: Self = StObject.set(x, "cothDependencies", js.undefined)
      
      inline def setCothUndefined: Self = StObject.set(x, "coth", js.undefined)
      
      inline def setCoulombDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "coulombDependencies", value.asInstanceOf[js.Any])
      
      inline def setCoulombDependenciesUndefined: Self = StObject.set(x, "coulombDependencies", js.undefined)
      
      inline def setCreate(value: (/* factories */ FactoryFunctionMap, /* config */ ConfigOptions) => Partial[MathJsStatic]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCreateUnit(
        value: (/* name */ String, /* definition */ js.UndefOr[String | UnitDefinition], /* options */ js.UndefOr[CreateUnitOptions]) => Unit
      ): Self = StObject.set(x, "createUnit", js.Any.fromFunction3(value))
      
      inline def setCreateUnitDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "createUnitDependencies", value.asInstanceOf[js.Any])
      
      inline def setCreateUnitDependenciesUndefined: Self = StObject.set(x, "createUnitDependencies", js.undefined)
      
      inline def setCreateUnitUndefined: Self = StObject.set(x, "createUnit", js.undefined)
      
      inline def setCross(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Matrix | MathArray): Self = StObject.set(x, "cross", js.Any.fromFunction2(value))
      
      inline def setCrossDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "crossDependencies", value.asInstanceOf[js.Any])
      
      inline def setCrossDependenciesUndefined: Self = StObject.set(x, "crossDependencies", js.undefined)
      
      inline def setCrossUndefined: Self = StObject.set(x, "cross", js.undefined)
      
      inline def setCsc(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "csc", js.Any.fromFunction1(value))
      
      inline def setCscDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cscDependencies", value.asInstanceOf[js.Any])
      
      inline def setCscDependenciesUndefined: Self = StObject.set(x, "cscDependencies", js.undefined)
      
      inline def setCscUndefined: Self = StObject.set(x, "csc", js.undefined)
      
      inline def setCsch(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "csch", js.Any.fromFunction1(value))
      
      inline def setCschDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cschDependencies", value.asInstanceOf[js.Any])
      
      inline def setCschDependenciesUndefined: Self = StObject.set(x, "cschDependencies", js.undefined)
      
      inline def setCschUndefined: Self = StObject.set(x, "csch", js.undefined)
      
      inline def setCtransposeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ctransposeDependencies", value.asInstanceOf[js.Any])
      
      inline def setCtransposeDependenciesUndefined: Self = StObject.set(x, "ctransposeDependencies", js.undefined)
      
      inline def setCube(value: /* x */ Double => Double): Self = StObject.set(x, "cube", js.Any.fromFunction1(value))
      
      inline def setCubeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "cubeDependencies", value.asInstanceOf[js.Any])
      
      inline def setCubeDependenciesUndefined: Self = StObject.set(x, "cubeDependencies", js.undefined)
      
      inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
      
      inline def setDeepEqual(
        value: (/* x */ MathType, /* y */ MathType) => Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
      ): Self = StObject.set(x, "deepEqual", js.Any.fromFunction2(value))
      
      inline def setDeepEqualDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "deepEqualDependencies", value.asInstanceOf[js.Any])
      
      inline def setDeepEqualDependenciesUndefined: Self = StObject.set(x, "deepEqualDependencies", js.undefined)
      
      inline def setDeepEqualUndefined: Self = StObject.set(x, "deepEqual", js.undefined)
      
      inline def setDenseMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "DenseMatrixDependencies", value.asInstanceOf[js.Any])
      
      inline def setDenseMatrixDependenciesUndefined: Self = StObject.set(x, "DenseMatrixDependencies", js.undefined)
      
      inline def setDerivative(
        value: (/* expr */ MathNode | String, /* variable */ MathNode | String, /* options */ js.UndefOr[Simplify]) => MathNode
      ): Self = StObject.set(x, "derivative", js.Any.fromFunction3(value))
      
      inline def setDerivativeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "derivativeDependencies", value.asInstanceOf[js.Any])
      
      inline def setDerivativeDependenciesUndefined: Self = StObject.set(x, "derivativeDependencies", js.undefined)
      
      inline def setDerivativeUndefined: Self = StObject.set(x, "derivative", js.undefined)
      
      inline def setDet(value: /* x */ MathArray | Matrix => Double): Self = StObject.set(x, "det", js.Any.fromFunction1(value))
      
      inline def setDetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "detDependencies", value.asInstanceOf[js.Any])
      
      inline def setDetDependenciesUndefined: Self = StObject.set(x, "detDependencies", js.undefined)
      
      inline def setDetUndefined: Self = StObject.set(x, "det", js.undefined)
      
      inline def setDeuteronMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "deuteronMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setDeuteronMassDependenciesUndefined: Self = StObject.set(x, "deuteronMassDependencies", js.undefined)
      
      inline def setDiag(value: (/* X */ MathArray | Matrix, /* format */ js.UndefOr[String]) => Matrix): Self = StObject.set(x, "diag", js.Any.fromFunction2(value))
      
      inline def setDiagDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "diagDependencies", value.asInstanceOf[js.Any])
      
      inline def setDiagDependenciesUndefined: Self = StObject.set(x, "diagDependencies", js.undefined)
      
      inline def setDiagUndefined: Self = StObject.set(x, "diag", js.undefined)
      
      inline def setDistance(
        value: (/* x */ MathArray | Matrix | js.Object, /* y */ MathArray | Matrix | js.Object) => Double | BigNumber
      ): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      inline def setDistanceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "distanceDependencies", value.asInstanceOf[js.Any])
      
      inline def setDistanceDependenciesUndefined: Self = StObject.set(x, "distanceDependencies", js.undefined)
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setDivide(value: (/* x */ Unit, /* y */ Unit) => Unit): Self = StObject.set(x, "divide", js.Any.fromFunction2(value))
      
      inline def setDivideDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "divideDependencies", value.asInstanceOf[js.Any])
      
      inline def setDivideDependenciesUndefined: Self = StObject.set(x, "divideDependencies", js.undefined)
      
      inline def setDivideScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "divideScalarDependencies", value.asInstanceOf[js.Any])
      
      inline def setDivideScalarDependenciesUndefined: Self = StObject.set(x, "divideScalarDependencies", js.undefined)
      
      inline def setDivideUndefined: Self = StObject.set(x, "divide", js.undefined)
      
      inline def setDot(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Double): Self = StObject.set(x, "dot", js.Any.fromFunction2(value))
      
      inline def setDotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotDependencies", value.asInstanceOf[js.Any])
      
      inline def setDotDependenciesUndefined: Self = StObject.set(x, "dotDependencies", js.undefined)
      
      inline def setDotDivide(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "dotDivide", js.Any.fromFunction2(value))
      
      inline def setDotDivideDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotDivideDependencies", value.asInstanceOf[js.Any])
      
      inline def setDotDivideDependenciesUndefined: Self = StObject.set(x, "dotDivideDependencies", js.undefined)
      
      inline def setDotDivideUndefined: Self = StObject.set(x, "dotDivide", js.undefined)
      
      inline def setDotMultiply(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "dotMultiply", js.Any.fromFunction2(value))
      
      inline def setDotMultiplyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotMultiplyDependencies", value.asInstanceOf[js.Any])
      
      inline def setDotMultiplyDependenciesUndefined: Self = StObject.set(x, "dotMultiplyDependencies", js.undefined)
      
      inline def setDotMultiplyUndefined: Self = StObject.set(x, "dotMultiply", js.undefined)
      
      inline def setDotPow(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "dotPow", js.Any.fromFunction2(value))
      
      inline def setDotPowDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "dotPowDependencies", value.asInstanceOf[js.Any])
      
      inline def setDotPowDependenciesUndefined: Self = StObject.set(x, "dotPowDependencies", js.undefined)
      
      inline def setDotPowUndefined: Self = StObject.set(x, "dotPow", js.undefined)
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "EDependencies", value.asInstanceOf[js.Any])
      
      inline def setEDependenciesUndefined: Self = StObject.set(x, "EDependencies", js.undefined)
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setEfimovFactorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "efimovFactorDependencies", value.asInstanceOf[js.Any])
      
      inline def setEfimovFactorDependenciesUndefined: Self = StObject.set(x, "efimovFactorDependencies", js.undefined)
      
      inline def setElectricConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "electricConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setElectricConstantDependenciesUndefined: Self = StObject.set(x, "electricConstantDependencies", js.undefined)
      
      inline def setElectronMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "electronMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setElectronMassDependenciesUndefined: Self = StObject.set(x, "electronMassDependencies", js.undefined)
      
      inline def setElementaryChargeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "elementaryChargeDependencies", value.asInstanceOf[js.Any])
      
      inline def setElementaryChargeDependenciesUndefined: Self = StObject.set(x, "elementaryChargeDependencies", js.undefined)
      
      inline def setEqual(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setEqualDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "equalDependencies", value.asInstanceOf[js.Any])
      
      inline def setEqualDependenciesUndefined: Self = StObject.set(x, "equalDependencies", js.undefined)
      
      inline def setEqualScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "equalScalarDependencies", value.asInstanceOf[js.Any])
      
      inline def setEqualScalarDependenciesUndefined: Self = StObject.set(x, "equalScalarDependencies", js.undefined)
      
      inline def setEqualText(
        value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
      ): Self = StObject.set(x, "equalText", js.Any.fromFunction2(value))
      
      inline def setEqualTextDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "equalTextDependencies", value.asInstanceOf[js.Any])
      
      inline def setEqualTextDependenciesUndefined: Self = StObject.set(x, "equalTextDependencies", js.undefined)
      
      inline def setEqualTextUndefined: Self = StObject.set(x, "equalText", js.undefined)
      
      inline def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
      
      inline def setErf(value: /* x */ Double | MathArray | Matrix => NoLiteralType[Double | MathArray | Matrix]): Self = StObject.set(x, "erf", js.Any.fromFunction1(value))
      
      inline def setErfDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "erfDependencies", value.asInstanceOf[js.Any])
      
      inline def setErfDependenciesUndefined: Self = StObject.set(x, "erfDependencies", js.undefined)
      
      inline def setErfUndefined: Self = StObject.set(x, "erf", js.undefined)
      
      inline def setEvalDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "evalDependencies", value.asInstanceOf[js.Any])
      
      inline def setEvalDependenciesUndefined: Self = StObject.set(x, "evalDependencies", js.undefined)
      
      inline def setEvaluate(
        value: (/* expr */ MathExpression | js.Array[MathExpression] | Matrix, /* scope */ js.UndefOr[js.Object]) => js.Any
      ): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
      
      inline def setEvaluateDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "evaluateDependencies", value.asInstanceOf[js.Any])
      
      inline def setEvaluateDependenciesUndefined: Self = StObject.set(x, "evaluateDependencies", js.undefined)
      
      inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      inline def setExp(value: /* x */ Double => Double): Self = StObject.set(x, "exp", js.Any.fromFunction1(value))
      
      inline def setExpDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "expDependencies", value.asInstanceOf[js.Any])
      
      inline def setExpDependenciesUndefined: Self = StObject.set(x, "expDependencies", js.undefined)
      
      inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      inline def setExpm(value: /* x */ Matrix => Matrix): Self = StObject.set(x, "expm", js.Any.fromFunction1(value))
      
      inline def setExpm1(value: /* x */ Double => Double): Self = StObject.set(x, "expm1", js.Any.fromFunction1(value))
      
      inline def setExpm1Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "expm1Dependencies", value.asInstanceOf[js.Any])
      
      inline def setExpm1DependenciesUndefined: Self = StObject.set(x, "expm1Dependencies", js.undefined)
      
      inline def setExpm1Undefined: Self = StObject.set(x, "expm1", js.undefined)
      
      inline def setExpmDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "expmDependencies", value.asInstanceOf[js.Any])
      
      inline def setExpmDependenciesUndefined: Self = StObject.set(x, "expmDependencies", js.undefined)
      
      inline def setExpmUndefined: Self = StObject.set(x, "expm", js.undefined)
      
      inline def setExpression(value: MathNode): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setEyeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "eyeDependencies", value.asInstanceOf[js.Any])
      
      inline def setEyeDependenciesUndefined: Self = StObject.set(x, "eyeDependencies", js.undefined)
      
      inline def setFactorial(
        value: /* n */ Double | BigNumber | MathArray | Matrix => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "factorial", js.Any.fromFunction1(value))
      
      inline def setFactorialDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "factorialDependencies", value.asInstanceOf[js.Any])
      
      inline def setFactorialDependenciesUndefined: Self = StObject.set(x, "factorialDependencies", js.undefined)
      
      inline def setFactorialUndefined: Self = StObject.set(x, "factorial", js.undefined)
      
      inline def setFactory(
        value: (/* name */ String, /* dependencies */ js.Array[MathJsFunctionName], /* create */ js.Function1[/* injected */ Partial[MathJsStatic], js.Any], /* meta */ js.UndefOr[js.Any]) => FactoryFunction[js.Any]
      ): Self = StObject.set(x, "factory", js.Any.fromFunction4(value))
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setFalseDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "falseDependencies", value.asInstanceOf[js.Any])
      
      inline def setFalseDependenciesUndefined: Self = StObject.set(x, "falseDependencies", js.undefined)
      
      inline def setFaradayDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "faradayDependencies", value.asInstanceOf[js.Any])
      
      inline def setFaradayDependenciesUndefined: Self = StObject.set(x, "faradayDependencies", js.undefined)
      
      inline def setFermiCouplingDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "fermiCouplingDependencies", value.asInstanceOf[js.Any])
      
      inline def setFermiCouplingDependenciesUndefined: Self = StObject.set(x, "fermiCouplingDependencies", js.undefined)
      
      inline def setFibonacciHeapDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FibonacciHeapDependencies", value.asInstanceOf[js.Any])
      
      inline def setFibonacciHeapDependenciesUndefined: Self = StObject.set(x, "FibonacciHeapDependencies", js.undefined)
      
      inline def setFilter(
        value: (/* x */ Matrix | MathArray | js.Array[String], /* test */ (js.Function3[
              /* value */ js.Any, 
              /* index */ js.Any, 
              /* matrix */ Matrix | MathArray | js.Array[String], 
              Boolean
            ]) | RegExp) => Matrix | MathArray
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "filterDependencies", value.asInstanceOf[js.Any])
      
      inline def setFilterDependenciesUndefined: Self = StObject.set(x, "filterDependencies", js.undefined)
      
      inline def setFilterTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "filterTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setFilterTransformDependenciesUndefined: Self = StObject.set(x, "filterTransformDependencies", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFineStructureDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "fineStructureDependencies", value.asInstanceOf[js.Any])
      
      inline def setFineStructureDependenciesUndefined: Self = StObject.set(x, "fineStructureDependencies", js.undefined)
      
      inline def setFirstRadiationDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "firstRadiationDependencies", value.asInstanceOf[js.Any])
      
      inline def setFirstRadiationDependenciesUndefined: Self = StObject.set(x, "firstRadiationDependencies", js.undefined)
      
      inline def setFix(value: /* x */ Double => Double): Self = StObject.set(x, "fix", js.Any.fromFunction1(value))
      
      inline def setFixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "fixDependencies", value.asInstanceOf[js.Any])
      
      inline def setFixDependenciesUndefined: Self = StObject.set(x, "fixDependencies", js.undefined)
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setFlatten(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "flatten", js.Any.fromFunction1(value))
      
      inline def setFlattenDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "flattenDependencies", value.asInstanceOf[js.Any])
      
      inline def setFlattenDependenciesUndefined: Self = StObject.set(x, "flattenDependencies", js.undefined)
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setFloor(value: /* x */ Double => Double): Self = StObject.set(x, "floor", js.Any.fromFunction1(value))
      
      inline def setFloorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "floorDependencies", value.asInstanceOf[js.Any])
      
      inline def setFloorDependenciesUndefined: Self = StObject.set(x, "floorDependencies", js.undefined)
      
      inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
      
      inline def setForEach(
        value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit]) => scala.Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction2(value))
      
      inline def setForEachDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "forEachDependencies", value.asInstanceOf[js.Any])
      
      inline def setForEachDependenciesUndefined: Self = StObject.set(x, "forEachDependencies", js.undefined)
      
      inline def setForEachTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "forEachTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setForEachTransformDependenciesUndefined: Self = StObject.set(x, "forEachTransformDependencies", js.undefined)
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setFormat(
        value: (/* value */ js.Any, /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]]) => String
      ): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      inline def setFormatDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "formatDependencies", value.asInstanceOf[js.Any])
      
      inline def setFormatDependenciesUndefined: Self = StObject.set(x, "formatDependencies", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFraction(value: /* args */ Fraction | MathArray | Matrix => Fraction | MathArray | Matrix): Self = StObject.set(x, "fraction", js.Any.fromFunction1(value))
      
      inline def setFractionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FractionDependencies", value.asInstanceOf[js.Any])
      
      inline def setFractionDependenciesUndefined: Self = StObject.set(x, "FractionDependencies", js.undefined)
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setFunctionAssignmentNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FunctionAssignmentNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setFunctionAssignmentNodeDependenciesUndefined: Self = StObject.set(x, "FunctionAssignmentNodeDependencies", js.undefined)
      
      inline def setFunctionNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "FunctionNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setFunctionNodeDependenciesUndefined: Self = StObject.set(x, "FunctionNodeDependencies", js.undefined)
      
      inline def setGamma(value: /* n */ Double | MathArray | Matrix => Double | MathArray | Matrix): Self = StObject.set(x, "gamma", js.Any.fromFunction1(value))
      
      inline def setGammaDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gammaDependencies", value.asInstanceOf[js.Any])
      
      inline def setGammaDependenciesUndefined: Self = StObject.set(x, "gammaDependencies", js.undefined)
      
      inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
      
      inline def setGasConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gasConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setGasConstantDependenciesUndefined: Self = StObject.set(x, "gasConstantDependencies", js.undefined)
      
      inline def setGcd(value: /* repeated */ Double => Double): Self = StObject.set(x, "gcd", js.Any.fromFunction1(value))
      
      inline def setGcdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gcdDependencies", value.asInstanceOf[js.Any])
      
      inline def setGcdDependenciesUndefined: Self = StObject.set(x, "gcdDependencies", js.undefined)
      
      inline def setGcdUndefined: Self = StObject.set(x, "gcd", js.undefined)
      
      inline def setGetMatrixDataTypeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "getMatrixDataTypeDependencies", value.asInstanceOf[js.Any])
      
      inline def setGetMatrixDataTypeDependenciesUndefined: Self = StObject.set(x, "getMatrixDataTypeDependencies", js.undefined)
      
      inline def setGravitationConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gravitationConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setGravitationConstantDependenciesUndefined: Self = StObject.set(x, "gravitationConstantDependencies", js.undefined)
      
      inline def setGravityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "gravityDependencies", value.asInstanceOf[js.Any])
      
      inline def setGravityDependenciesUndefined: Self = StObject.set(x, "gravityDependencies", js.undefined)
      
      inline def setHartreeEnergyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "hartreeEnergyDependencies", value.asInstanceOf[js.Any])
      
      inline def setHartreeEnergyDependenciesUndefined: Self = StObject.set(x, "hartreeEnergyDependencies", js.undefined)
      
      inline def setHasNumericValueDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "hasNumericValueDependencies", value.asInstanceOf[js.Any])
      
      inline def setHasNumericValueDependenciesUndefined: Self = StObject.set(x, "hasNumericValueDependencies", js.undefined)
      
      inline def setHelp(value: /* search */ js.Function0[js.Any] => Help): Self = StObject.set(x, "help", js.Any.fromFunction1(value))
      
      inline def setHelpDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "HelpDependencies", value.asInstanceOf[js.Any])
      
      inline def setHelpDependenciesUndefined: Self = StObject.set(x, "HelpDependencies", js.undefined)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHypot(value: /* repeated */ Double => Double): Self = StObject.set(x, "hypot", js.Any.fromFunction1(value))
      
      inline def setHypotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "hypotDependencies", value.asInstanceOf[js.Any])
      
      inline def setHypotDependenciesUndefined: Self = StObject.set(x, "hypotDependencies", js.undefined)
      
      inline def setHypotUndefined: Self = StObject.set(x, "hypot", js.undefined)
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "iDependencies", value.asInstanceOf[js.Any])
      
      inline def setIDependenciesUndefined: Self = StObject.set(x, "iDependencies", js.undefined)
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIdentity(
        value: (/* size */ Double | js.Array[Double] | Matrix | MathArray, /* format */ js.UndefOr[String]) => Matrix | MathArray | Double
      ): Self = StObject.set(x, "identity", js.Any.fromFunction2(value))
      
      inline def setIdentityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "identityDependencies", value.asInstanceOf[js.Any])
      
      inline def setIdentityDependenciesUndefined: Self = StObject.set(x, "identityDependencies", js.undefined)
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIm(
        value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
      ): Self = StObject.set(x, "im", js.Any.fromFunction1(value))
      
      inline def setImDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "imDependencies", value.asInstanceOf[js.Any])
      
      inline def setImDependenciesUndefined: Self = StObject.set(x, "imDependencies", js.undefined)
      
      inline def setImUndefined: Self = StObject.set(x, "im", js.undefined)
      
      inline def setImmutableDenseMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ImmutableDenseMatrixDependencies", value.asInstanceOf[js.Any])
      
      inline def setImmutableDenseMatrixDependenciesUndefined: Self = StObject.set(x, "ImmutableDenseMatrixDependencies", js.undefined)
      
      inline def setImport(
        value: (/* object */ ImportObject | js.Array[ImportObject], /* options */ ImportOptions) => scala.Unit
      ): Self = StObject.set(x, "import", js.Any.fromFunction2(value))
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      inline def setIndex(value: /* repeated */ js.Any => Index): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      inline def setIndexDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "IndexDependencies", value.asInstanceOf[js.Any])
      
      inline def setIndexDependenciesUndefined: Self = StObject.set(x, "IndexDependencies", js.undefined)
      
      inline def setIndexNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "IndexNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setIndexNodeDependenciesUndefined: Self = StObject.set(x, "IndexNodeDependencies", js.undefined)
      
      inline def setIndexTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "indexTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setIndexTransformDependenciesUndefined: Self = StObject.set(x, "indexTransformDependencies", js.undefined)
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInfinity(value: Double): Self = StObject.set(x, "Infinity", value.asInstanceOf[js.Any])
      
      inline def setInfinityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "InfinityDependencies", value.asInstanceOf[js.Any])
      
      inline def setInfinityDependenciesUndefined: Self = StObject.set(x, "InfinityDependencies", js.undefined)
      
      inline def setInfinityUndefined: Self = StObject.set(x, "Infinity", js.undefined)
      
      inline def setIntersect(
        value: (/* w */ MathArray | Matrix, /* x */ MathArray | Matrix, /* y */ MathArray | Matrix, /* z */ MathArray | Matrix) => MathArray
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction4(value))
      
      inline def setIntersectDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "intersectDependencies", value.asInstanceOf[js.Any])
      
      inline def setIntersectDependenciesUndefined: Self = StObject.set(x, "intersectDependencies", js.undefined)
      
      inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
      
      inline def setInv(
        value: /* x */ Double | Complex | MathArray | Matrix => NoLiteralType[Double | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "inv", js.Any.fromFunction1(value))
      
      inline def setInvDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "invDependencies", value.asInstanceOf[js.Any])
      
      inline def setInvDependenciesUndefined: Self = StObject.set(x, "invDependencies", js.undefined)
      
      inline def setInvUndefined: Self = StObject.set(x, "inv", js.undefined)
      
      inline def setInverseConductanceQuantumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "inverseConductanceQuantumDependencies", value.asInstanceOf[js.Any])
      
      inline def setInverseConductanceQuantumDependenciesUndefined: Self = StObject.set(x, "inverseConductanceQuantumDependencies", js.undefined)
      
      inline def setIsInteger(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix => Boolean): Self = StObject.set(x, "isInteger", js.Any.fromFunction1(value))
      
      inline def setIsIntegerDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isIntegerDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsIntegerDependenciesUndefined: Self = StObject.set(x, "isIntegerDependencies", js.undefined)
      
      inline def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
      
      inline def setIsNaN(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = StObject.set(x, "isNaN", js.Any.fromFunction1(value))
      
      inline def setIsNaNDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isNaNDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsNaNDependenciesUndefined: Self = StObject.set(x, "isNaNDependencies", js.undefined)
      
      inline def setIsNaNUndefined: Self = StObject.set(x, "isNaN", js.undefined)
      
      inline def setIsNegative(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = StObject.set(x, "isNegative", js.Any.fromFunction1(value))
      
      inline def setIsNegativeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isNegativeDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsNegativeDependenciesUndefined: Self = StObject.set(x, "isNegativeDependencies", js.undefined)
      
      inline def setIsNegativeUndefined: Self = StObject.set(x, "isNegative", js.undefined)
      
      inline def setIsNumeric(value: /* x */ js.Any => Boolean): Self = StObject.set(x, "isNumeric", js.Any.fromFunction1(value))
      
      inline def setIsNumericDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isNumericDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsNumericDependenciesUndefined: Self = StObject.set(x, "isNumericDependencies", js.undefined)
      
      inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      inline def setIsPositive(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit => Boolean): Self = StObject.set(x, "isPositive", js.Any.fromFunction1(value))
      
      inline def setIsPositiveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isPositiveDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsPositiveDependenciesUndefined: Self = StObject.set(x, "isPositiveDependencies", js.undefined)
      
      inline def setIsPositiveUndefined: Self = StObject.set(x, "isPositive", js.undefined)
      
      inline def setIsPrime(value: /* x */ Double | BigNumber | MathArray | Matrix => Boolean): Self = StObject.set(x, "isPrime", js.Any.fromFunction1(value))
      
      inline def setIsPrimeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isPrimeDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsPrimeDependenciesUndefined: Self = StObject.set(x, "isPrimeDependencies", js.undefined)
      
      inline def setIsPrimeUndefined: Self = StObject.set(x, "isPrime", js.undefined)
      
      inline def setIsZero(value: /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex => Boolean): Self = StObject.set(x, "isZero", js.Any.fromFunction1(value))
      
      inline def setIsZeroDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "isZeroDependencies", value.asInstanceOf[js.Any])
      
      inline def setIsZeroDependenciesUndefined: Self = StObject.set(x, "isZeroDependencies", js.undefined)
      
      inline def setIsZeroUndefined: Self = StObject.set(x, "isZero", js.undefined)
      
      inline def setJson(value: MathJsJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKldivergence(value: (/* q */ MathArray | Matrix, /* p */ MathArray | Matrix) => Double): Self = StObject.set(x, "kldivergence", js.Any.fromFunction2(value))
      
      inline def setKldivergenceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "kldivergenceDependencies", value.asInstanceOf[js.Any])
      
      inline def setKldivergenceDependenciesUndefined: Self = StObject.set(x, "kldivergenceDependencies", js.undefined)
      
      inline def setKldivergenceUndefined: Self = StObject.set(x, "kldivergence", js.undefined)
      
      inline def setKlitzingDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "klitzingDependencies", value.asInstanceOf[js.Any])
      
      inline def setKlitzingDependenciesUndefined: Self = StObject.set(x, "klitzingDependencies", js.undefined)
      
      inline def setKron(value: (/* x */ Matrix | MathArray, /* y */ Matrix | MathArray) => Matrix): Self = StObject.set(x, "kron", js.Any.fromFunction2(value))
      
      inline def setKronDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "kronDependencies", value.asInstanceOf[js.Any])
      
      inline def setKronDependenciesUndefined: Self = StObject.set(x, "kronDependencies", js.undefined)
      
      inline def setKronUndefined: Self = StObject.set(x, "kron", js.undefined)
      
      inline def setLN10(value: Double): Self = StObject.set(x, "LN10", value.asInstanceOf[js.Any])
      
      inline def setLN10Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LN10Dependencies", value.asInstanceOf[js.Any])
      
      inline def setLN10DependenciesUndefined: Self = StObject.set(x, "LN10Dependencies", js.undefined)
      
      inline def setLN10Undefined: Self = StObject.set(x, "LN10", js.undefined)
      
      inline def setLN2(value: Double): Self = StObject.set(x, "LN2", value.asInstanceOf[js.Any])
      
      inline def setLN2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LN2Dependencies", value.asInstanceOf[js.Any])
      
      inline def setLN2DependenciesUndefined: Self = StObject.set(x, "LN2Dependencies", js.undefined)
      
      inline def setLN2Undefined: Self = StObject.set(x, "LN2", js.undefined)
      
      inline def setLOG10E(value: Double): Self = StObject.set(x, "LOG10E", value.asInstanceOf[js.Any])
      
      inline def setLOG10EDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LOG10EDependencies", value.asInstanceOf[js.Any])
      
      inline def setLOG10EDependenciesUndefined: Self = StObject.set(x, "LOG10EDependencies", js.undefined)
      
      inline def setLOG10EUndefined: Self = StObject.set(x, "LOG10E", js.undefined)
      
      inline def setLOG2E(value: Double): Self = StObject.set(x, "LOG2E", value.asInstanceOf[js.Any])
      
      inline def setLOG2EDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "LOG2EDependencies", value.asInstanceOf[js.Any])
      
      inline def setLOG2EDependenciesUndefined: Self = StObject.set(x, "LOG2EDependencies", js.undefined)
      
      inline def setLOG2EUndefined: Self = StObject.set(x, "LOG2E", js.undefined)
      
      inline def setLarger(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "larger", js.Any.fromFunction2(value))
      
      inline def setLargerDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "largerDependencies", value.asInstanceOf[js.Any])
      
      inline def setLargerDependenciesUndefined: Self = StObject.set(x, "largerDependencies", js.undefined)
      
      inline def setLargerEq(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "largerEq", js.Any.fromFunction2(value))
      
      inline def setLargerEqDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "largerEqDependencies", value.asInstanceOf[js.Any])
      
      inline def setLargerEqDependenciesUndefined: Self = StObject.set(x, "largerEqDependencies", js.undefined)
      
      inline def setLargerEqUndefined: Self = StObject.set(x, "largerEq", js.undefined)
      
      inline def setLargerUndefined: Self = StObject.set(x, "larger", js.undefined)
      
      inline def setLcm(value: (/* a */ Double, /* b */ Double) => Double): Self = StObject.set(x, "lcm", js.Any.fromFunction2(value))
      
      inline def setLcmDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lcmDependencies", value.asInstanceOf[js.Any])
      
      inline def setLcmDependenciesUndefined: Self = StObject.set(x, "lcmDependencies", js.undefined)
      
      inline def setLcmUndefined: Self = StObject.set(x, "lcm", js.undefined)
      
      inline def setLeftShift(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "leftShift", js.Any.fromFunction2(value))
      
      inline def setLeftShiftDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "leftShiftDependencies", value.asInstanceOf[js.Any])
      
      inline def setLeftShiftDependenciesUndefined: Self = StObject.set(x, "leftShiftDependencies", js.undefined)
      
      inline def setLeftShiftUndefined: Self = StObject.set(x, "leftShift", js.undefined)
      
      inline def setLog(
        value: (/* x */ Double | BigNumber | Complex | MathArray | Matrix, /* base */ js.UndefOr[Double | BigNumber | Complex]) => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setLog10(value: /* x */ Double => Double): Self = StObject.set(x, "log10", js.Any.fromFunction1(value))
      
      inline def setLog10Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "log10Dependencies", value.asInstanceOf[js.Any])
      
      inline def setLog10DependenciesUndefined: Self = StObject.set(x, "log10Dependencies", js.undefined)
      
      inline def setLog10Undefined: Self = StObject.set(x, "log10", js.undefined)
      
      inline def setLog1p(value: (/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex]) => Double): Self = StObject.set(x, "log1p", js.Any.fromFunction2(value))
      
      inline def setLog1pDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "log1pDependencies", value.asInstanceOf[js.Any])
      
      inline def setLog1pDependenciesUndefined: Self = StObject.set(x, "log1pDependencies", js.undefined)
      
      inline def setLog1pUndefined: Self = StObject.set(x, "log1p", js.undefined)
      
      inline def setLog2(value: /* x */ Double => Double): Self = StObject.set(x, "log2", js.Any.fromFunction1(value))
      
      inline def setLog2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "log2Dependencies", value.asInstanceOf[js.Any])
      
      inline def setLog2DependenciesUndefined: Self = StObject.set(x, "log2Dependencies", js.undefined)
      
      inline def setLog2Undefined: Self = StObject.set(x, "log2", js.undefined)
      
      inline def setLogDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "logDependencies", value.asInstanceOf[js.Any])
      
      inline def setLogDependenciesUndefined: Self = StObject.set(x, "logDependencies", js.undefined)
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLoschmidtDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "loschmidtDependencies", value.asInstanceOf[js.Any])
      
      inline def setLoschmidtDependenciesUndefined: Self = StObject.set(x, "loschmidtDependencies", js.undefined)
      
      inline def setLsolve(value: (/* L */ Matrix | MathArray, /* b */ Matrix | MathArray) => Matrix | MathArray): Self = StObject.set(x, "lsolve", js.Any.fromFunction2(value))
      
      inline def setLsolveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lsolveDependencies", value.asInstanceOf[js.Any])
      
      inline def setLsolveDependenciesUndefined: Self = StObject.set(x, "lsolveDependencies", js.undefined)
      
      inline def setLsolveUndefined: Self = StObject.set(x, "lsolve", js.undefined)
      
      inline def setLup(value: /* A */ js.UndefOr[Matrix | MathArray] => L): Self = StObject.set(x, "lup", js.Any.fromFunction1(value))
      
      inline def setLupDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lupDependencies", value.asInstanceOf[js.Any])
      
      inline def setLupDependenciesUndefined: Self = StObject.set(x, "lupDependencies", js.undefined)
      
      inline def setLupUndefined: Self = StObject.set(x, "lup", js.undefined)
      
      inline def setLusolve(
        value: (/* A */ Matrix | MathArray | Double, /* b */ Matrix | MathArray, /* order */ js.UndefOr[Double], /* threshold */ js.UndefOr[Double]) => Matrix | MathArray
      ): Self = StObject.set(x, "lusolve", js.Any.fromFunction4(value))
      
      inline def setLusolveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "lusolveDependencies", value.asInstanceOf[js.Any])
      
      inline def setLusolveDependenciesUndefined: Self = StObject.set(x, "lusolveDependencies", js.undefined)
      
      inline def setLusolveUndefined: Self = StObject.set(x, "lusolve", js.undefined)
      
      inline def setMad(value: /* array */ MathArray | Matrix => js.Any): Self = StObject.set(x, "mad", js.Any.fromFunction1(value))
      
      inline def setMadDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "madDependencies", value.asInstanceOf[js.Any])
      
      inline def setMadDependenciesUndefined: Self = StObject.set(x, "madDependencies", js.undefined)
      
      inline def setMadUndefined: Self = StObject.set(x, "mad", js.undefined)
      
      inline def setMagneticConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "magneticConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setMagneticConstantDependenciesUndefined: Self = StObject.set(x, "magneticConstantDependencies", js.undefined)
      
      inline def setMagneticFluxQuantumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "magneticFluxQuantumDependencies", value.asInstanceOf[js.Any])
      
      inline def setMagneticFluxQuantumDependenciesUndefined: Self = StObject.set(x, "magneticFluxQuantumDependencies", js.undefined)
      
      inline def setMap(
        value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[
              /* value */ js.Any, 
              /* index */ js.Any, 
              /* matrix */ Matrix | MathArray, 
              MathType | String
            ]) => Matrix | MathArray
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "mapDependencies", value.asInstanceOf[js.Any])
      
      inline def setMapDependenciesUndefined: Self = StObject.set(x, "mapDependencies", js.undefined)
      
      inline def setMapTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "mapTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setMapTransformDependenciesUndefined: Self = StObject.set(x, "mapTransformDependencies", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMatrix(value: /* format */ js.UndefOr[sparse | dense] => Matrix): Self = StObject.set(x, "matrix", js.Any.fromFunction1(value))
      
      inline def setMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "MatrixDependencies", value.asInstanceOf[js.Any])
      
      inline def setMatrixDependenciesUndefined: Self = StObject.set(x, "MatrixDependencies", js.undefined)
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMax(value: /* repeated */ MathType => js.Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMaxDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "maxDependencies", value.asInstanceOf[js.Any])
      
      inline def setMaxDependenciesUndefined: Self = StObject.set(x, "maxDependencies", js.undefined)
      
      inline def setMaxTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "maxTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setMaxTransformDependenciesUndefined: Self = StObject.set(x, "maxTransformDependencies", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMean(value: /* repeated */ MathType => js.Any): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
      
      inline def setMeanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "meanDependencies", value.asInstanceOf[js.Any])
      
      inline def setMeanDependenciesUndefined: Self = StObject.set(x, "meanDependencies", js.undefined)
      
      inline def setMeanTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "meanTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setMeanTransformDependenciesUndefined: Self = StObject.set(x, "meanTransformDependencies", js.undefined)
      
      inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      inline def setMedian(value: /* repeated */ MathType => js.Any): Self = StObject.set(x, "median", js.Any.fromFunction1(value))
      
      inline def setMedianDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "medianDependencies", value.asInstanceOf[js.Any])
      
      inline def setMedianDependenciesUndefined: Self = StObject.set(x, "medianDependencies", js.undefined)
      
      inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
      
      inline def setMin(value: /* repeated */ MathType => js.Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setMinDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "minDependencies", value.asInstanceOf[js.Any])
      
      inline def setMinDependenciesUndefined: Self = StObject.set(x, "minDependencies", js.undefined)
      
      inline def setMinTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "minTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setMinTransformDependenciesUndefined: Self = StObject.set(x, "minTransformDependencies", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMod(
        value: (/* x */ Double | BigNumber | Fraction | MathArray | Matrix, /* y */ Double | BigNumber | Fraction | MathArray | Matrix) => NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
      ): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
      
      inline def setModDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "modDependencies", value.asInstanceOf[js.Any])
      
      inline def setModDependenciesUndefined: Self = StObject.set(x, "modDependencies", js.undefined)
      
      inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
      
      inline def setMode(value: /* repeated */ MathType => js.Any): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      inline def setModeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "modeDependencies", value.asInstanceOf[js.Any])
      
      inline def setModeDependenciesUndefined: Self = StObject.set(x, "modeDependencies", js.undefined)
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMolarMassC12Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarMassC12Dependencies", value.asInstanceOf[js.Any])
      
      inline def setMolarMassC12DependenciesUndefined: Self = StObject.set(x, "molarMassC12Dependencies", js.undefined)
      
      inline def setMolarMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setMolarMassDependenciesUndefined: Self = StObject.set(x, "molarMassDependencies", js.undefined)
      
      inline def setMolarPlanckConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarPlanckConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setMolarPlanckConstantDependenciesUndefined: Self = StObject.set(x, "molarPlanckConstantDependencies", js.undefined)
      
      inline def setMolarVolumeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "molarVolumeDependencies", value.asInstanceOf[js.Any])
      
      inline def setMolarVolumeDependenciesUndefined: Self = StObject.set(x, "molarVolumeDependencies", js.undefined)
      
      inline def setMultinomial(value: /* a */ js.Array[Double | BigNumber] => NoLiteralType[Double | BigNumber]): Self = StObject.set(x, "multinomial", js.Any.fromFunction1(value))
      
      inline def setMultinomialDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "multinomialDependencies", value.asInstanceOf[js.Any])
      
      inline def setMultinomialDependenciesUndefined: Self = StObject.set(x, "multinomialDependencies", js.undefined)
      
      inline def setMultinomialUndefined: Self = StObject.set(x, "multinomial", js.undefined)
      
      inline def setMultiply(value: (/* x */ Matrix | MathArray, /* y */ MathType) => Matrix | MathArray): Self = StObject.set(x, "multiply", js.Any.fromFunction2(value))
      
      inline def setMultiplyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "multiplyDependencies", value.asInstanceOf[js.Any])
      
      inline def setMultiplyDependenciesUndefined: Self = StObject.set(x, "multiplyDependencies", js.undefined)
      
      inline def setMultiplyScalarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "multiplyScalarDependencies", value.asInstanceOf[js.Any])
      
      inline def setMultiplyScalarDependenciesUndefined: Self = StObject.set(x, "multiplyScalarDependencies", js.undefined)
      
      inline def setMultiplyUndefined: Self = StObject.set(x, "multiply", js.undefined)
      
      inline def setNaN(value: Double): Self = StObject.set(x, "NaN", value.asInstanceOf[js.Any])
      
      inline def setNaNDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "NaNDependencies", value.asInstanceOf[js.Any])
      
      inline def setNaNDependenciesUndefined: Self = StObject.set(x, "NaNDependencies", js.undefined)
      
      inline def setNaNUndefined: Self = StObject.set(x, "NaN", js.undefined)
      
      inline def setNeutronMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "neutronMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setNeutronMassDependenciesUndefined: Self = StObject.set(x, "neutronMassDependencies", js.undefined)
      
      inline def setNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "NodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setNodeDependenciesUndefined: Self = StObject.set(x, "NodeDependencies", js.undefined)
      
      inline def setNorm(
        value: (/* x */ Double | BigNumber | Complex | MathArray | Matrix, /* p */ js.UndefOr[Double | BigNumber | String]) => Double | BigNumber
      ): Self = StObject.set(x, "norm", js.Any.fromFunction2(value))
      
      inline def setNormDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "normDependencies", value.asInstanceOf[js.Any])
      
      inline def setNormDependenciesUndefined: Self = StObject.set(x, "normDependencies", js.undefined)
      
      inline def setNormUndefined: Self = StObject.set(x, "norm", js.undefined)
      
      inline def setNot(
        value: /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
      
      inline def setNotDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "notDependencies", value.asInstanceOf[js.Any])
      
      inline def setNotDependenciesUndefined: Self = StObject.set(x, "notDependencies", js.undefined)
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setNthRoot(
        value: (/* a */ Double | BigNumber | MathArray | Matrix | Complex, /* root */ js.UndefOr[Double | BigNumber]) => Double | Complex | MathArray | Matrix
      ): Self = StObject.set(x, "nthRoot", js.Any.fromFunction2(value))
      
      inline def setNthRootDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nthRootDependencies", value.asInstanceOf[js.Any])
      
      inline def setNthRootDependenciesUndefined: Self = StObject.set(x, "nthRootDependencies", js.undefined)
      
      inline def setNthRootUndefined: Self = StObject.set(x, "nthRoot", js.undefined)
      
      inline def setNthRootsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nthRootsDependencies", value.asInstanceOf[js.Any])
      
      inline def setNthRootsDependenciesUndefined: Self = StObject.set(x, "nthRootsDependencies", js.undefined)
      
      inline def setNuclearMagnetonDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nuclearMagnetonDependencies", value.asInstanceOf[js.Any])
      
      inline def setNuclearMagnetonDependenciesUndefined: Self = StObject.set(x, "nuclearMagnetonDependencies", js.undefined)
      
      inline def setNull(value: Double): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "nullDependencies", value.asInstanceOf[js.Any])
      
      inline def setNullDependenciesUndefined: Self = StObject.set(x, "nullDependencies", js.undefined)
      
      inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      inline def setNumber(
        value: /* value */ js.UndefOr[
              String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
            ] => Double | MathArray | Matrix
      ): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setNumberDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "numberDependencies", value.asInstanceOf[js.Any])
      
      inline def setNumberDependenciesUndefined: Self = StObject.set(x, "numberDependencies", js.undefined)
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setNumericDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "numericDependencies", value.asInstanceOf[js.Any])
      
      inline def setNumericDependenciesUndefined: Self = StObject.set(x, "numericDependencies", js.undefined)
      
      inline def setObjectNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ObjectNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setObjectNodeDependenciesUndefined: Self = StObject.set(x, "ObjectNodeDependencies", js.undefined)
      
      inline def setOnes(
        value: (/* size */ Double | js.Array[Double], /* format */ js.UndefOr[String]) => MathArray | Matrix
      ): Self = StObject.set(x, "ones", js.Any.fromFunction2(value))
      
      inline def setOnesDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "onesDependencies", value.asInstanceOf[js.Any])
      
      inline def setOnesDependenciesUndefined: Self = StObject.set(x, "onesDependencies", js.undefined)
      
      inline def setOnesUndefined: Self = StObject.set(x, "ones", js.undefined)
      
      inline def setOperatorNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "OperatorNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setOperatorNodeDependenciesUndefined: Self = StObject.set(x, "OperatorNodeDependencies", js.undefined)
      
      inline def setOr(
        value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "or", js.Any.fromFunction2(value))
      
      inline def setOrDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "orDependencies", value.asInstanceOf[js.Any])
      
      inline def setOrDependenciesUndefined: Self = StObject.set(x, "orDependencies", js.undefined)
      
      inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
      
      inline def setPIDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "PIDependencies", value.asInstanceOf[js.Any])
      
      inline def setPIDependenciesUndefined: Self = StObject.set(x, "PIDependencies", js.undefined)
      
      inline def setParenthesisNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ParenthesisNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setParenthesisNodeDependenciesUndefined: Self = StObject.set(x, "ParenthesisNodeDependencies", js.undefined)
      
      inline def setParse(value: (/* expr */ MathExpression, /* options */ js.UndefOr[js.Any]) => MathNode): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "parseDependencies", value.asInstanceOf[js.Any])
      
      inline def setParseDependenciesUndefined: Self = StObject.set(x, "parseDependencies", js.undefined)
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setParser(value: () => Parser): Self = StObject.set(x, "parser", js.Any.fromFunction0(value))
      
      inline def setParserDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ParserDependencies", value.asInstanceOf[js.Any])
      
      inline def setParserDependenciesUndefined: Self = StObject.set(x, "ParserDependencies", js.undefined)
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPartitionSelect(
        value: (/* x */ MathArray | Matrix, /* k */ Double, /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])]) => js.Any
      ): Self = StObject.set(x, "partitionSelect", js.Any.fromFunction3(value))
      
      inline def setPartitionSelectDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "partitionSelectDependencies", value.asInstanceOf[js.Any])
      
      inline def setPartitionSelectDependenciesUndefined: Self = StObject.set(x, "partitionSelectDependencies", js.undefined)
      
      inline def setPartitionSelectUndefined: Self = StObject.set(x, "partitionSelect", js.undefined)
      
      inline def setPermutations(
        value: (/* n */ Double | BigNumber, /* k */ js.UndefOr[Double | BigNumber]) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "permutations", js.Any.fromFunction2(value))
      
      inline def setPermutationsDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "permutationsDependencies", value.asInstanceOf[js.Any])
      
      inline def setPermutationsDependenciesUndefined: Self = StObject.set(x, "permutationsDependencies", js.undefined)
      
      inline def setPermutationsUndefined: Self = StObject.set(x, "permutations", js.undefined)
      
      inline def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
      
      inline def setPhiDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "phiDependencies", value.asInstanceOf[js.Any])
      
      inline def setPhiDependenciesUndefined: Self = StObject.set(x, "phiDependencies", js.undefined)
      
      inline def setPhiUndefined: Self = StObject.set(x, "phi", js.undefined)
      
      inline def setPi(value: Double): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
      
      inline def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
      
      inline def setPickRandom(
        value: (/* array */ js.Array[Double], /* number */ js.UndefOr[Double], /* weights */ js.UndefOr[js.Array[Double]]) => Double | js.Array[Double]
      ): Self = StObject.set(x, "pickRandom", js.Any.fromFunction3(value))
      
      inline def setPickRandomDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "pickRandomDependencies", value.asInstanceOf[js.Any])
      
      inline def setPickRandomDependenciesUndefined: Self = StObject.set(x, "pickRandomDependencies", js.undefined)
      
      inline def setPickRandomUndefined: Self = StObject.set(x, "pickRandom", js.undefined)
      
      inline def setPlanckChargeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckChargeDependencies", value.asInstanceOf[js.Any])
      
      inline def setPlanckChargeDependenciesUndefined: Self = StObject.set(x, "planckChargeDependencies", js.undefined)
      
      inline def setPlanckConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setPlanckConstantDependenciesUndefined: Self = StObject.set(x, "planckConstantDependencies", js.undefined)
      
      inline def setPlanckLengthDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckLengthDependencies", value.asInstanceOf[js.Any])
      
      inline def setPlanckLengthDependenciesUndefined: Self = StObject.set(x, "planckLengthDependencies", js.undefined)
      
      inline def setPlanckMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setPlanckMassDependenciesUndefined: Self = StObject.set(x, "planckMassDependencies", js.undefined)
      
      inline def setPlanckTemperatureDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckTemperatureDependencies", value.asInstanceOf[js.Any])
      
      inline def setPlanckTemperatureDependenciesUndefined: Self = StObject.set(x, "planckTemperatureDependencies", js.undefined)
      
      inline def setPlanckTimeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "planckTimeDependencies", value.asInstanceOf[js.Any])
      
      inline def setPlanckTimeDependenciesUndefined: Self = StObject.set(x, "planckTimeDependencies", js.undefined)
      
      inline def setPow(value: (/* x */ MathType, /* y */ Double | BigNumber | Complex) => MathType): Self = StObject.set(x, "pow", js.Any.fromFunction2(value))
      
      inline def setPowDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "powDependencies", value.asInstanceOf[js.Any])
      
      inline def setPowDependenciesUndefined: Self = StObject.set(x, "powDependencies", js.undefined)
      
      inline def setPowUndefined: Self = StObject.set(x, "pow", js.undefined)
      
      inline def setPrint(
        value: (/* template */ String, /* values */ js.Any, /* precision */ js.UndefOr[Double], /* options */ js.UndefOr[Double | js.Object]) => scala.Unit
      ): Self = StObject.set(x, "print", js.Any.fromFunction4(value))
      
      inline def setPrintDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "printDependencies", value.asInstanceOf[js.Any])
      
      inline def setPrintDependenciesUndefined: Self = StObject.set(x, "printDependencies", js.undefined)
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setProd(value: /* repeated */ MathType => js.Any): Self = StObject.set(x, "prod", js.Any.fromFunction1(value))
      
      inline def setProdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "prodDependencies", value.asInstanceOf[js.Any])
      
      inline def setProdDependenciesUndefined: Self = StObject.set(x, "prodDependencies", js.undefined)
      
      inline def setProdUndefined: Self = StObject.set(x, "prod", js.undefined)
      
      inline def setProtonMassDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "protonMassDependencies", value.asInstanceOf[js.Any])
      
      inline def setProtonMassDependenciesUndefined: Self = StObject.set(x, "protonMassDependencies", js.undefined)
      
      inline def setQr(value: /* A */ Matrix | MathArray => Q): Self = StObject.set(x, "qr", js.Any.fromFunction1(value))
      
      inline def setQrDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "qrDependencies", value.asInstanceOf[js.Any])
      
      inline def setQrDependenciesUndefined: Self = StObject.set(x, "qrDependencies", js.undefined)
      
      inline def setQrUndefined: Self = StObject.set(x, "qr", js.undefined)
      
      inline def setQuantileSeq(
        value: (/* A */ MathArray | Matrix, /* prob */ Double | BigNumber | MathArray, /* sorted */ js.UndefOr[Boolean]) => Double | BigNumber | Unit | MathArray
      ): Self = StObject.set(x, "quantileSeq", js.Any.fromFunction3(value))
      
      inline def setQuantileSeqDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "quantileSeqDependencies", value.asInstanceOf[js.Any])
      
      inline def setQuantileSeqDependenciesUndefined: Self = StObject.set(x, "quantileSeqDependencies", js.undefined)
      
      inline def setQuantileSeqUndefined: Self = StObject.set(x, "quantileSeq", js.undefined)
      
      inline def setQuantumOfCirculationDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "quantumOfCirculationDependencies", value.asInstanceOf[js.Any])
      
      inline def setQuantumOfCirculationDependenciesUndefined: Self = StObject.set(x, "quantumOfCirculationDependencies", js.undefined)
      
      inline def setRandom(value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "random", js.Any.fromFunction2(value))
      
      inline def setRandomDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "randomDependencies", value.asInstanceOf[js.Any])
      
      inline def setRandomDependenciesUndefined: Self = StObject.set(x, "randomDependencies", js.undefined)
      
      inline def setRandomInt(value: (/* min */ Double, /* max */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "randomInt", js.Any.fromFunction2(value))
      
      inline def setRandomIntDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "randomIntDependencies", value.asInstanceOf[js.Any])
      
      inline def setRandomIntDependenciesUndefined: Self = StObject.set(x, "randomIntDependencies", js.undefined)
      
      inline def setRandomIntUndefined: Self = StObject.set(x, "randomInt", js.undefined)
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setRange(value: (/* str */ String, /* includeEnd */ js.UndefOr[Boolean]) => Matrix): Self = StObject.set(x, "range", js.Any.fromFunction2(value))
      
      inline def setRangeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "RangeDependencies", value.asInstanceOf[js.Any])
      
      inline def setRangeDependenciesUndefined: Self = StObject.set(x, "RangeDependencies", js.undefined)
      
      inline def setRangeNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "RangeNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setRangeNodeDependenciesUndefined: Self = StObject.set(x, "RangeNodeDependencies", js.undefined)
      
      inline def setRangeTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rangeTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setRangeTransformDependenciesUndefined: Self = StObject.set(x, "rangeTransformDependencies", js.undefined)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRationalize(
        value: (/* expr */ MathNode | String, /* optional */ js.UndefOr[js.Object | Boolean], /* detailed */ js.UndefOr[`true`]) => Coefficients
      ): Self = StObject.set(x, "rationalize", js.Any.fromFunction3(value))
      
      inline def setRationalizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rationalizeDependencies", value.asInstanceOf[js.Any])
      
      inline def setRationalizeDependenciesUndefined: Self = StObject.set(x, "rationalizeDependencies", js.undefined)
      
      inline def setRationalizeUndefined: Self = StObject.set(x, "rationalize", js.undefined)
      
      inline def setRe(
        value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
      ): Self = StObject.set(x, "re", js.Any.fromFunction1(value))
      
      inline def setReDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reDependencies", value.asInstanceOf[js.Any])
      
      inline def setReDependenciesUndefined: Self = StObject.set(x, "reDependencies", js.undefined)
      
      inline def setReUndefined: Self = StObject.set(x, "re", js.undefined)
      
      inline def setReducedPlanckConstantDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reducedPlanckConstantDependencies", value.asInstanceOf[js.Any])
      
      inline def setReducedPlanckConstantDependenciesUndefined: Self = StObject.set(x, "reducedPlanckConstantDependencies", js.undefined)
      
      inline def setRelationalNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "RelationalNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setRelationalNodeDependenciesUndefined: Self = StObject.set(x, "RelationalNodeDependencies", js.undefined)
      
      inline def setReshape(value: (/* x */ MathArray | Matrix, /* sizes */ js.Array[Double]) => MathArray | Matrix): Self = StObject.set(x, "reshape", js.Any.fromFunction2(value))
      
      inline def setReshapeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reshapeDependencies", value.asInstanceOf[js.Any])
      
      inline def setReshapeDependenciesUndefined: Self = StObject.set(x, "reshapeDependencies", js.undefined)
      
      inline def setReshapeUndefined: Self = StObject.set(x, "reshape", js.undefined)
      
      inline def setResize(
        value: (/* x */ MathArray | Matrix, /* size */ MathArray | Matrix, /* defaultValue */ js.UndefOr[Double | String]) => MathArray | Matrix
      ): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
      
      inline def setResizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "resizeDependencies", value.asInstanceOf[js.Any])
      
      inline def setResizeDependenciesUndefined: Self = StObject.set(x, "resizeDependencies", js.undefined)
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setResultSetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "ResultSetDependencies", value.asInstanceOf[js.Any])
      
      inline def setResultSetDependenciesUndefined: Self = StObject.set(x, "ResultSetDependencies", js.undefined)
      
      inline def setReviverDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "reviverDependencies", value.asInstanceOf[js.Any])
      
      inline def setReviverDependenciesUndefined: Self = StObject.set(x, "reviverDependencies", js.undefined)
      
      inline def setRightArithShift(
        value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
      ): Self = StObject.set(x, "rightArithShift", js.Any.fromFunction2(value))
      
      inline def setRightArithShiftDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rightArithShiftDependencies", value.asInstanceOf[js.Any])
      
      inline def setRightArithShiftDependenciesUndefined: Self = StObject.set(x, "rightArithShiftDependencies", js.undefined)
      
      inline def setRightArithShiftUndefined: Self = StObject.set(x, "rightArithShift", js.undefined)
      
      inline def setRightLogShift(
        value: (/* x */ Double | MathArray | Matrix, /* y */ Double) => NoLiteralType[Double | MathArray | Matrix]
      ): Self = StObject.set(x, "rightLogShift", js.Any.fromFunction2(value))
      
      inline def setRightLogShiftDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rightLogShiftDependencies", value.asInstanceOf[js.Any])
      
      inline def setRightLogShiftDependenciesUndefined: Self = StObject.set(x, "rightLogShiftDependencies", js.undefined)
      
      inline def setRightLogShiftUndefined: Self = StObject.set(x, "rightLogShift", js.undefined)
      
      inline def setRound(
        value: (/* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, /* n */ js.UndefOr[Double | BigNumber | MathArray]) => NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
      ): Self = StObject.set(x, "round", js.Any.fromFunction2(value))
      
      inline def setRoundDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "roundDependencies", value.asInstanceOf[js.Any])
      
      inline def setRoundDependenciesUndefined: Self = StObject.set(x, "roundDependencies", js.undefined)
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setRowDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rowDependencies", value.asInstanceOf[js.Any])
      
      inline def setRowDependenciesUndefined: Self = StObject.set(x, "rowDependencies", js.undefined)
      
      inline def setRowTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rowTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setRowTransformDependenciesUndefined: Self = StObject.set(x, "rowTransformDependencies", js.undefined)
      
      inline def setRydbergDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "rydbergDependencies", value.asInstanceOf[js.Any])
      
      inline def setRydbergDependenciesUndefined: Self = StObject.set(x, "rydbergDependencies", js.undefined)
      
      inline def setSQRT1_2(value: Double): Self = StObject.set(x, "SQRT1_2", value.asInstanceOf[js.Any])
      
      inline def setSQRT1_2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SQRT1_2Dependencies", value.asInstanceOf[js.Any])
      
      inline def setSQRT1_2DependenciesUndefined: Self = StObject.set(x, "SQRT1_2Dependencies", js.undefined)
      
      inline def setSQRT1_2Undefined: Self = StObject.set(x, "SQRT1_2", js.undefined)
      
      inline def setSQRT2(value: Double): Self = StObject.set(x, "SQRT2", value.asInstanceOf[js.Any])
      
      inline def setSQRT2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SQRT2Dependencies", value.asInstanceOf[js.Any])
      
      inline def setSQRT2DependenciesUndefined: Self = StObject.set(x, "SQRT2Dependencies", js.undefined)
      
      inline def setSQRT2Undefined: Self = StObject.set(x, "SQRT2", js.undefined)
      
      inline def setSackurTetrodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sackurTetrodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setSackurTetrodeDependenciesUndefined: Self = StObject.set(x, "sackurTetrodeDependencies", js.undefined)
      
      inline def setSec(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sec", js.Any.fromFunction1(value))
      
      inline def setSecDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "secDependencies", value.asInstanceOf[js.Any])
      
      inline def setSecDependenciesUndefined: Self = StObject.set(x, "secDependencies", js.undefined)
      
      inline def setSecUndefined: Self = StObject.set(x, "sec", js.undefined)
      
      inline def setSech(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sech", js.Any.fromFunction1(value))
      
      inline def setSechDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sechDependencies", value.asInstanceOf[js.Any])
      
      inline def setSechDependenciesUndefined: Self = StObject.set(x, "sechDependencies", js.undefined)
      
      inline def setSechUndefined: Self = StObject.set(x, "sech", js.undefined)
      
      inline def setSecondRadiationDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "secondRadiationDependencies", value.asInstanceOf[js.Any])
      
      inline def setSecondRadiationDependenciesUndefined: Self = StObject.set(x, "secondRadiationDependencies", js.undefined)
      
      inline def setSetCartesian(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setCartesian", js.Any.fromFunction2(value))
      
      inline def setSetCartesianDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setCartesianDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetCartesianDependenciesUndefined: Self = StObject.set(x, "setCartesianDependencies", js.undefined)
      
      inline def setSetCartesianUndefined: Self = StObject.set(x, "setCartesian", js.undefined)
      
      inline def setSetDifference(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setDifference", js.Any.fromFunction2(value))
      
      inline def setSetDifferenceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setDifferenceDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetDifferenceDependenciesUndefined: Self = StObject.set(x, "setDifferenceDependencies", js.undefined)
      
      inline def setSetDifferenceUndefined: Self = StObject.set(x, "setDifference", js.undefined)
      
      inline def setSetDistinct(value: /* a */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "setDistinct", js.Any.fromFunction1(value))
      
      inline def setSetDistinctDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setDistinctDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetDistinctDependenciesUndefined: Self = StObject.set(x, "setDistinctDependencies", js.undefined)
      
      inline def setSetDistinctUndefined: Self = StObject.set(x, "setDistinct", js.undefined)
      
      inline def setSetIntersect(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setIntersect", js.Any.fromFunction2(value))
      
      inline def setSetIntersectDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setIntersectDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetIntersectDependenciesUndefined: Self = StObject.set(x, "setIntersectDependencies", js.undefined)
      
      inline def setSetIntersectUndefined: Self = StObject.set(x, "setIntersect", js.undefined)
      
      inline def setSetIsSubset(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => Boolean): Self = StObject.set(x, "setIsSubset", js.Any.fromFunction2(value))
      
      inline def setSetIsSubsetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setIsSubsetDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetIsSubsetDependenciesUndefined: Self = StObject.set(x, "setIsSubsetDependencies", js.undefined)
      
      inline def setSetIsSubsetUndefined: Self = StObject.set(x, "setIsSubset", js.undefined)
      
      inline def setSetMultiplicity(value: (/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix) => Double): Self = StObject.set(x, "setMultiplicity", js.Any.fromFunction2(value))
      
      inline def setSetMultiplicityDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setMultiplicityDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetMultiplicityDependenciesUndefined: Self = StObject.set(x, "setMultiplicityDependencies", js.undefined)
      
      inline def setSetMultiplicityUndefined: Self = StObject.set(x, "setMultiplicity", js.undefined)
      
      inline def setSetPowerset(value: /* a */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "setPowerset", js.Any.fromFunction1(value))
      
      inline def setSetPowersetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setPowersetDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetPowersetDependenciesUndefined: Self = StObject.set(x, "setPowersetDependencies", js.undefined)
      
      inline def setSetPowersetUndefined: Self = StObject.set(x, "setPowerset", js.undefined)
      
      inline def setSetSize(value: /* a */ MathArray | Matrix => Double): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
      
      inline def setSetSizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setSizeDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetSizeDependenciesUndefined: Self = StObject.set(x, "setSizeDependencies", js.undefined)
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setSetSymDifference(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setSymDifference", js.Any.fromFunction2(value))
      
      inline def setSetSymDifferenceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setSymDifferenceDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetSymDifferenceDependenciesUndefined: Self = StObject.set(x, "setSymDifferenceDependencies", js.undefined)
      
      inline def setSetSymDifferenceUndefined: Self = StObject.set(x, "setSymDifference", js.undefined)
      
      inline def setSetUnion(value: (/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix) => MathArray | Matrix): Self = StObject.set(x, "setUnion", js.Any.fromFunction2(value))
      
      inline def setSetUnionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "setUnionDependencies", value.asInstanceOf[js.Any])
      
      inline def setSetUnionDependenciesUndefined: Self = StObject.set(x, "setUnionDependencies", js.undefined)
      
      inline def setSetUnionUndefined: Self = StObject.set(x, "setUnion", js.undefined)
      
      inline def setSign(value: /* x */ Double => Double): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setSignDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "signDependencies", value.asInstanceOf[js.Any])
      
      inline def setSignDependenciesUndefined: Self = StObject.set(x, "signDependencies", js.undefined)
      
      inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      inline def setSimplify(
        value: (/* expr */ MathNode | String, /* rules */ js.UndefOr[js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]], /* scope */ js.UndefOr[js.Object]) => MathNode
      ): Self = StObject.set(x, "simplify", js.Any.fromFunction3(value))
      
      inline def setSimplifyDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "simplifyDependencies", value.asInstanceOf[js.Any])
      
      inline def setSimplifyDependenciesUndefined: Self = StObject.set(x, "simplifyDependencies", js.undefined)
      
      inline def setSimplifyUndefined: Self = StObject.set(x, "simplify", js.undefined)
      
      inline def setSin(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sin", js.Any.fromFunction1(value))
      
      inline def setSinDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sinDependencies", value.asInstanceOf[js.Any])
      
      inline def setSinDependenciesUndefined: Self = StObject.set(x, "sinDependencies", js.undefined)
      
      inline def setSinUndefined: Self = StObject.set(x, "sin", js.undefined)
      
      inline def setSinh(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "sinh", js.Any.fromFunction1(value))
      
      inline def setSinhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sinhDependencies", value.asInstanceOf[js.Any])
      
      inline def setSinhDependenciesUndefined: Self = StObject.set(x, "sinhDependencies", js.undefined)
      
      inline def setSinhUndefined: Self = StObject.set(x, "sinh", js.undefined)
      
      inline def setSize(
        value: /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix => MathArray | Matrix
      ): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
      
      inline def setSizeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sizeDependencies", value.asInstanceOf[js.Any])
      
      inline def setSizeDependenciesUndefined: Self = StObject.set(x, "sizeDependencies", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlu(value: (/* A */ Matrix, /* order */ Double, /* threshold */ Double) => js.Object): Self = StObject.set(x, "slu", js.Any.fromFunction3(value))
      
      inline def setSluDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sluDependencies", value.asInstanceOf[js.Any])
      
      inline def setSluDependenciesUndefined: Self = StObject.set(x, "sluDependencies", js.undefined)
      
      inline def setSluUndefined: Self = StObject.set(x, "slu", js.undefined)
      
      inline def setSmaller(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "smaller", js.Any.fromFunction2(value))
      
      inline def setSmallerDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "smallerDependencies", value.asInstanceOf[js.Any])
      
      inline def setSmallerDependenciesUndefined: Self = StObject.set(x, "smallerDependencies", js.undefined)
      
      inline def setSmallerEq(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "smallerEq", js.Any.fromFunction2(value))
      
      inline def setSmallerEqDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "smallerEqDependencies", value.asInstanceOf[js.Any])
      
      inline def setSmallerEqDependenciesUndefined: Self = StObject.set(x, "smallerEqDependencies", js.undefined)
      
      inline def setSmallerEqUndefined: Self = StObject.set(x, "smallerEq", js.undefined)
      
      inline def setSmallerUndefined: Self = StObject.set(x, "smaller", js.undefined)
      
      inline def setSort(
        value: (/* x */ Matrix | MathArray, /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural) => Matrix | MathArray
      ): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sortDependencies", value.asInstanceOf[js.Any])
      
      inline def setSortDependenciesUndefined: Self = StObject.set(x, "sortDependencies", js.undefined)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSpaDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SpaDependencies", value.asInstanceOf[js.Any])
      
      inline def setSpaDependenciesUndefined: Self = StObject.set(x, "SpaDependencies", js.undefined)
      
      inline def setSparse(value: (/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String]) => Matrix): Self = StObject.set(x, "sparse", js.Any.fromFunction2(value))
      
      inline def setSparseDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sparseDependencies", value.asInstanceOf[js.Any])
      
      inline def setSparseDependenciesUndefined: Self = StObject.set(x, "sparseDependencies", js.undefined)
      
      inline def setSparseMatrixDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SparseMatrixDependencies", value.asInstanceOf[js.Any])
      
      inline def setSparseMatrixDependenciesUndefined: Self = StObject.set(x, "SparseMatrixDependencies", js.undefined)
      
      inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
      
      inline def setSpeedOfLightDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "speedOfLightDependencies", value.asInstanceOf[js.Any])
      
      inline def setSpeedOfLightDependenciesUndefined: Self = StObject.set(x, "speedOfLightDependencies", js.undefined)
      
      inline def setSplitUnit(value: (/* unit */ Unit, /* parts */ js.Array[Unit]) => js.Array[Unit]): Self = StObject.set(x, "splitUnit", js.Any.fromFunction2(value))
      
      inline def setSplitUnitDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "splitUnitDependencies", value.asInstanceOf[js.Any])
      
      inline def setSplitUnitDependenciesUndefined: Self = StObject.set(x, "splitUnitDependencies", js.undefined)
      
      inline def setSplitUnitUndefined: Self = StObject.set(x, "splitUnit", js.undefined)
      
      inline def setSqrt(value: /* x */ Double => Double): Self = StObject.set(x, "sqrt", js.Any.fromFunction1(value))
      
      inline def setSqrtDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sqrtDependencies", value.asInstanceOf[js.Any])
      
      inline def setSqrtDependenciesUndefined: Self = StObject.set(x, "sqrtDependencies", js.undefined)
      
      inline def setSqrtUndefined: Self = StObject.set(x, "sqrt", js.undefined)
      
      inline def setSqrtm(value: /* A */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "sqrtm", js.Any.fromFunction1(value))
      
      inline def setSqrtmDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sqrtmDependencies", value.asInstanceOf[js.Any])
      
      inline def setSqrtmDependenciesUndefined: Self = StObject.set(x, "sqrtmDependencies", js.undefined)
      
      inline def setSqrtmUndefined: Self = StObject.set(x, "sqrtm", js.undefined)
      
      inline def setSquare(value: /* x */ Double => Double): Self = StObject.set(x, "square", js.Any.fromFunction1(value))
      
      inline def setSquareDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "squareDependencies", value.asInstanceOf[js.Any])
      
      inline def setSquareDependenciesUndefined: Self = StObject.set(x, "squareDependencies", js.undefined)
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setSqueeze(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "squeeze", js.Any.fromFunction1(value))
      
      inline def setSqueezeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "squeezeDependencies", value.asInstanceOf[js.Any])
      
      inline def setSqueezeDependenciesUndefined: Self = StObject.set(x, "squeezeDependencies", js.undefined)
      
      inline def setSqueezeUndefined: Self = StObject.set(x, "squeeze", js.undefined)
      
      inline def setStd(
        value: (/* array */ MathArray | Matrix, /* normalization */ js.UndefOr[unbiased | uncorrected | biased]) => Double
      ): Self = StObject.set(x, "std", js.Any.fromFunction2(value))
      
      inline def setStdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stdDependencies", value.asInstanceOf[js.Any])
      
      inline def setStdDependenciesUndefined: Self = StObject.set(x, "stdDependencies", js.undefined)
      
      inline def setStdTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stdTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setStdTransformDependenciesUndefined: Self = StObject.set(x, "stdTransformDependencies", js.undefined)
      
      inline def setStdUndefined: Self = StObject.set(x, "std", js.undefined)
      
      inline def setStefanBoltzmannDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stefanBoltzmannDependencies", value.asInstanceOf[js.Any])
      
      inline def setStefanBoltzmannDependenciesUndefined: Self = StObject.set(x, "stefanBoltzmannDependencies", js.undefined)
      
      inline def setStirlingS2(
        value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
      ): Self = StObject.set(x, "stirlingS2", js.Any.fromFunction2(value))
      
      inline def setStirlingS2Dependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stirlingS2Dependencies", value.asInstanceOf[js.Any])
      
      inline def setStirlingS2DependenciesUndefined: Self = StObject.set(x, "stirlingS2Dependencies", js.undefined)
      
      inline def setStirlingS2Undefined: Self = StObject.set(x, "stirlingS2", js.undefined)
      
      inline def setString(value: /* value */ MathType | Null => String | MathArray | Matrix): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      inline def setStringDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "stringDependencies", value.asInstanceOf[js.Any])
      
      inline def setStringDependenciesUndefined: Self = StObject.set(x, "stringDependencies", js.undefined)
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setSubset(
        value: (/* value */ MathArray | Matrix | String, /* index */ Index, /* replacement */ js.UndefOr[js.Any], /* defaultValue */ js.UndefOr[js.Any]) => MathArray | Matrix | String
      ): Self = StObject.set(x, "subset", js.Any.fromFunction4(value))
      
      inline def setSubsetDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "subsetDependencies", value.asInstanceOf[js.Any])
      
      inline def setSubsetDependenciesUndefined: Self = StObject.set(x, "subsetDependencies", js.undefined)
      
      inline def setSubsetTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "subsetTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setSubsetTransformDependenciesUndefined: Self = StObject.set(x, "subsetTransformDependencies", js.undefined)
      
      inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
      
      inline def setSubtract(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
      
      inline def setSubtractDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "subtractDependencies", value.asInstanceOf[js.Any])
      
      inline def setSubtractDependenciesUndefined: Self = StObject.set(x, "subtractDependencies", js.undefined)
      
      inline def setSubtractUndefined: Self = StObject.set(x, "subtract", js.undefined)
      
      inline def setSum(value: /* repeated */ Double | BigNumber | Fraction => js.Any): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      inline def setSumDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sumDependencies", value.asInstanceOf[js.Any])
      
      inline def setSumDependenciesUndefined: Self = StObject.set(x, "sumDependencies", js.undefined)
      
      inline def setSumTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "sumTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setSumTransformDependenciesUndefined: Self = StObject.set(x, "sumTransformDependencies", js.undefined)
      
      inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
      
      inline def setSymbolNodeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "SymbolNodeDependencies", value.asInstanceOf[js.Any])
      
      inline def setSymbolNodeDependenciesUndefined: Self = StObject.set(x, "SymbolNodeDependencies", js.undefined)
      
      inline def setTan(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "tan", js.Any.fromFunction1(value))
      
      inline def setTanDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "tanDependencies", value.asInstanceOf[js.Any])
      
      inline def setTanDependenciesUndefined: Self = StObject.set(x, "tanDependencies", js.undefined)
      
      inline def setTanUndefined: Self = StObject.set(x, "tan", js.undefined)
      
      inline def setTanh(value: /* x */ Double | Unit => Double): Self = StObject.set(x, "tanh", js.Any.fromFunction1(value))
      
      inline def setTanhDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "tanhDependencies", value.asInstanceOf[js.Any])
      
      inline def setTanhDependenciesUndefined: Self = StObject.set(x, "tanhDependencies", js.undefined)
      
      inline def setTanhUndefined: Self = StObject.set(x, "tanh", js.undefined)
      
      inline def setTau(value: Double): Self = StObject.set(x, "tau", value.asInstanceOf[js.Any])
      
      inline def setTauDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "tauDependencies", value.asInstanceOf[js.Any])
      
      inline def setTauDependenciesUndefined: Self = StObject.set(x, "tauDependencies", js.undefined)
      
      inline def setTauUndefined: Self = StObject.set(x, "tau", js.undefined)
      
      inline def setThomsonCrossSectionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "thomsonCrossSectionDependencies", value.asInstanceOf[js.Any])
      
      inline def setThomsonCrossSectionDependenciesUndefined: Self = StObject.set(x, "thomsonCrossSectionDependencies", js.undefined)
      
      inline def setTo(value: (/* x */ Unit | MathArray | Matrix, /* unit */ Unit | String) => Unit | MathArray | Matrix): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
      
      inline def setToDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "toDependencies", value.asInstanceOf[js.Any])
      
      inline def setToDependenciesUndefined: Self = StObject.set(x, "toDependencies", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTrace(value: /* x */ MathArray | Matrix => Double): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "traceDependencies", value.asInstanceOf[js.Any])
      
      inline def setTraceDependenciesUndefined: Self = StObject.set(x, "traceDependencies", js.undefined)
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setTranspose(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
      
      inline def setTransposeDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "transposeDependencies", value.asInstanceOf[js.Any])
      
      inline def setTransposeDependenciesUndefined: Self = StObject.set(x, "transposeDependencies", js.undefined)
      
      inline def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
      
      inline def setTrueDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "trueDependencies", value.asInstanceOf[js.Any])
      
      inline def setTrueDependenciesUndefined: Self = StObject.set(x, "trueDependencies", js.undefined)
      
      inline def setTypeOf(value: /* x */ js.Any => String): Self = StObject.set(x, "typeOf", js.Any.fromFunction1(value))
      
      inline def setTypeOfDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "typeOfDependencies", value.asInstanceOf[js.Any])
      
      inline def setTypeOfDependenciesUndefined: Self = StObject.set(x, "typeOfDependencies", js.undefined)
      
      inline def setTypeOfUndefined: Self = StObject.set(x, "typeOf", js.undefined)
      
      inline def setTyped(
        value: (/* name */ String, /* signatures */ Record[String, js.Function1[/* repeated */ js.Any, js.Any]]) => js.Function1[/* repeated */ js.Any, js.Any]
      ): Self = StObject.set(x, "typed", js.Any.fromFunction2(value))
      
      inline def setTypedDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "typedDependencies", value.asInstanceOf[js.Any])
      
      inline def setTypedDependenciesUndefined: Self = StObject.set(x, "typedDependencies", js.undefined)
      
      inline def setTypedUndefined: Self = StObject.set(x, "typed", js.undefined)
      
      inline def setUnaryMinus(value: /* x */ Double => Double): Self = StObject.set(x, "unaryMinus", js.Any.fromFunction1(value))
      
      inline def setUnaryMinusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "unaryMinusDependencies", value.asInstanceOf[js.Any])
      
      inline def setUnaryMinusDependenciesUndefined: Self = StObject.set(x, "unaryMinusDependencies", js.undefined)
      
      inline def setUnaryMinusUndefined: Self = StObject.set(x, "unaryMinus", js.undefined)
      
      inline def setUnaryPlus(value: /* x */ Double => Double): Self = StObject.set(x, "unaryPlus", js.Any.fromFunction1(value))
      
      inline def setUnaryPlusDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "unaryPlusDependencies", value.asInstanceOf[js.Any])
      
      inline def setUnaryPlusDependenciesUndefined: Self = StObject.set(x, "unaryPlusDependencies", js.undefined)
      
      inline def setUnaryPlusUndefined: Self = StObject.set(x, "unaryPlus", js.undefined)
      
      inline def setUnequal(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = StObject.set(x, "unequal", js.Any.fromFunction2(value))
      
      inline def setUnequalDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "unequalDependencies", value.asInstanceOf[js.Any])
      
      inline def setUnequalDependenciesUndefined: Self = StObject.set(x, "unequalDependencies", js.undefined)
      
      inline def setUnequalUndefined: Self = StObject.set(x, "unequal", js.undefined)
      
      inline def setUninitialized(value: js.Any): Self = StObject.set(x, "uninitialized", value.asInstanceOf[js.Any])
      
      inline def setUninitializedUndefined: Self = StObject.set(x, "uninitialized", js.undefined)
      
      inline def setUnit(value: /* unit */ String => Unit): Self = StObject.set(x, "unit", js.Any.fromFunction1(value))
      
      inline def setUnitDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "UnitDependencies", value.asInstanceOf[js.Any])
      
      inline def setUnitDependenciesUndefined: Self = StObject.set(x, "UnitDependencies", js.undefined)
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setUsolve(value: (/* U */ Matrix | MathArray, /* b */ Matrix | MathArray) => Matrix | MathArray): Self = StObject.set(x, "usolve", js.Any.fromFunction2(value))
      
      inline def setUsolveDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "usolveDependencies", value.asInstanceOf[js.Any])
      
      inline def setUsolveDependenciesUndefined: Self = StObject.set(x, "usolveDependencies", js.undefined)
      
      inline def setUsolveUndefined: Self = StObject.set(x, "usolve", js.undefined)
      
      inline def setVacuumImpedanceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "vacuumImpedanceDependencies", value.asInstanceOf[js.Any])
      
      inline def setVacuumImpedanceDependenciesUndefined: Self = StObject.set(x, "vacuumImpedanceDependencies", js.undefined)
      
      inline def setVarDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "varDependencies", value.asInstanceOf[js.Any])
      
      inline def setVarDependenciesUndefined: Self = StObject.set(x, "varDependencies", js.undefined)
      
      inline def setVariance(value: /* repeated */ Double | BigNumber | Fraction => js.Any): Self = StObject.set(x, "variance", js.Any.fromFunction1(value))
      
      inline def setVarianceDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "varianceDependencies", value.asInstanceOf[js.Any])
      
      inline def setVarianceDependenciesUndefined: Self = StObject.set(x, "varianceDependencies", js.undefined)
      
      inline def setVarianceTransformDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "varianceTransformDependencies", value.asInstanceOf[js.Any])
      
      inline def setVarianceTransformDependenciesUndefined: Self = StObject.set(x, "varianceTransformDependencies", js.undefined)
      
      inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "versionDependencies", value.asInstanceOf[js.Any])
      
      inline def setVersionDependenciesUndefined: Self = StObject.set(x, "versionDependencies", js.undefined)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWeakMixingAngleDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "weakMixingAngleDependencies", value.asInstanceOf[js.Any])
      
      inline def setWeakMixingAngleDependenciesUndefined: Self = StObject.set(x, "weakMixingAngleDependencies", js.undefined)
      
      inline def setWienDisplacementDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "wienDisplacementDependencies", value.asInstanceOf[js.Any])
      
      inline def setWienDisplacementDependenciesUndefined: Self = StObject.set(x, "wienDisplacementDependencies", js.undefined)
      
      inline def setXgcd(value: (/* a */ Double | BigNumber, /* b */ Double | BigNumber) => MathArray): Self = StObject.set(x, "xgcd", js.Any.fromFunction2(value))
      
      inline def setXgcdDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "xgcdDependencies", value.asInstanceOf[js.Any])
      
      inline def setXgcdDependenciesUndefined: Self = StObject.set(x, "xgcdDependencies", js.undefined)
      
      inline def setXgcdUndefined: Self = StObject.set(x, "xgcd", js.undefined)
      
      inline def setXor(
        value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
      ): Self = StObject.set(x, "xor", js.Any.fromFunction2(value))
      
      inline def setXorDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "xorDependencies", value.asInstanceOf[js.Any])
      
      inline def setXorDependenciesUndefined: Self = StObject.set(x, "xorDependencies", js.undefined)
      
      inline def setXorUndefined: Self = StObject.set(x, "xor", js.undefined)
      
      inline def setZeros(
        value: (/* size */ Double | js.Array[Double], /* format */ js.UndefOr[String]) => MathArray | Matrix
      ): Self = StObject.set(x, "zeros", js.Any.fromFunction2(value))
      
      inline def setZerosDependencies(value: FactoryFunctionMap): Self = StObject.set(x, "zerosDependencies", value.asInstanceOf[js.Any])
      
      inline def setZerosDependenciesUndefined: Self = StObject.set(x, "zerosDependencies", js.undefined)
      
      inline def setZerosUndefined: Self = StObject.set(x, "zeros", js.undefined)
    }
  }
  
  trait Q extends StObject {
    
    var Q: MathArray | Matrix
    
    var R: MathArray | Matrix
  }
  object Q {
    
    inline def apply(Q: MathArray | Matrix, R: MathArray | Matrix): Q = {
      val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
      __obj.asInstanceOf[Q]
    }
    
    extension [Self <: Q](x: Self) {
      
      inline def setQ(value: MathArray | Matrix): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      inline def setQVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "Q", js.Array(value :_*))
      
      inline def setR(value: MathArray | Matrix): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setRVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "R", js.Array(value :_*))
    }
  }
  
  trait R extends StObject {
    
    var l: String
    
    var r: String
  }
  object R {
    
    inline def apply(l: String, r: String): R = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    extension [Self <: R](x: Self) {
      
      inline def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Simplify extends StObject {
    
    var simplify: Boolean
  }
  object Simplify {
    
    inline def apply(simplify: Boolean): Simplify = {
      val __obj = js.Dynamic.literal(simplify = simplify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Simplify]
    }
    
    extension [Self <: Simplify](x: Self) {
      
      inline def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    }
  }
}
