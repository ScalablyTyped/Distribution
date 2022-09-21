package typings.jsqubits

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.jsqubits.anon.DecimalPlaces
import typings.jsqubits.jsqubitsBooleans.`false`
import typings.jsqubits.jsqubitsNumbers.`0.0000001`
import typings.jsqubits.mod.jsqubits.Complex
import typings.jsqubits.mod.jsqubits.Measurement
import typings.jsqubits.mod.jsqubits.QState
import typings.jsqubits.mod.jsqubits.StateWithAmplitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsqubits", JSImport.Namespace)
  @js.native
  val ^ : ExternalJSQubitsStatic = js.native
  
  trait BitsRange
    extends StObject
       with _SingleQubitOperatorTargetQubits {
    
    var from: Double
    
    var to: Double
  }
  object BitsRange {
    
    inline def apply(from: Double, to: Double): BitsRange = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitsRange]
    }
    
    extension [Self <: BitsRange](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComplexStatic
    extends StObject
       with Instantiable2[/* real */ Double, /* imaginary */ Double, Complex] {
    
    var ONE: Complex = js.native
    
    var SQRT1_2: Complex = js.native
    
    var SQRT2: Complex = js.native
    
    var ZERO: Complex = js.native
  }
  
  trait ContinuedFractionResult extends StObject {
    
    var denominator: Double
    
    var numerator: Double
    
    var quotients: js.Array[Double]
  }
  object ContinuedFractionResult {
    
    inline def apply(denominator: Double, numerator: Double, quotients: js.Array[Double]): ContinuedFractionResult = {
      val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any], quotients = quotients.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuedFractionResult]
    }
    
    extension [Self <: ContinuedFractionResult](x: Self) {
      
      inline def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
      
      inline def setNumerator(value: Double): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
      
      inline def setQuotients(value: js.Array[Double]): Self = StObject.set(x, "quotients", value.asInstanceOf[js.Any])
      
      inline def setQuotientsVarargs(value: Double*): Self = StObject.set(x, "quotients", js.Array(value*))
    }
  }
  
  trait ExternalJSQubitsStatic extends StObject {
    
    def jsqubits(bitString: String): QState
    @JSName("jsqubits")
    var jsqubits_Original: JSQubitsStatic
  }
  object ExternalJSQubitsStatic {
    
    inline def apply(jsqubits: JSQubitsStatic): ExternalJSQubitsStatic = {
      val __obj = js.Dynamic.literal(jsqubits = jsqubits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalJSQubitsStatic]
    }
    
    extension [Self <: ExternalJSQubitsStatic](x: Self) {
      
      inline def setJsqubits(value: JSQubitsStatic): Self = StObject.set(x, "jsqubits", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSQubitsStatic extends StObject {
    
    def apply(bitString: String): QState = js.native
    
    var ALL: typings.jsqubits.jsqubitsStrings.ALL = js.native
    
    var Complex: ComplexStatic = js.native
    
    var Measurement: MeasurementStatic = js.native
    
    var ONE: Complex = js.native
    
    var QMath: JsqubitsmathStatic = js.native
    
    var QState: QStateStatic = js.native
    
    var StateWithAmplitude: StateWithAmplitudeStatic = js.native
    
    var ZERO: Complex = js.native
    
    def complex(real: Double, imaginary: Double): Complex = js.native
    
    def real(real: Double): Complex = js.native
    
    var roundToZero: `0.0000001` = js.native
  }
  
  trait JsqubitsmathStatic extends StObject {
    
    def continuedFraction(targetValue: Double, precision: Double): ContinuedFractionResult
    
    def findNullSpaceMod2(a: js.Array[js.Array[Double]], width: js.Array[Double]): js.Array[Double]
    
    def gcd(a: Double, b: Double): Double
    
    def lcm(a: Double, b: Double): Double
    
    def powerFactor(n: Double): Double
    
    def powerMod(x: Double, y: Double, m: Double): Double
  }
  object JsqubitsmathStatic {
    
    inline def apply(
      continuedFraction: (Double, Double) => ContinuedFractionResult,
      findNullSpaceMod2: (js.Array[js.Array[Double]], js.Array[Double]) => js.Array[Double],
      gcd: (Double, Double) => Double,
      lcm: (Double, Double) => Double,
      powerFactor: Double => Double,
      powerMod: (Double, Double, Double) => Double
    ): JsqubitsmathStatic = {
      val __obj = js.Dynamic.literal(continuedFraction = js.Any.fromFunction2(continuedFraction), findNullSpaceMod2 = js.Any.fromFunction2(findNullSpaceMod2), gcd = js.Any.fromFunction2(gcd), lcm = js.Any.fromFunction2(lcm), powerFactor = js.Any.fromFunction1(powerFactor), powerMod = js.Any.fromFunction3(powerMod))
      __obj.asInstanceOf[JsqubitsmathStatic]
    }
    
    extension [Self <: JsqubitsmathStatic](x: Self) {
      
      inline def setContinuedFraction(value: (Double, Double) => ContinuedFractionResult): Self = StObject.set(x, "continuedFraction", js.Any.fromFunction2(value))
      
      inline def setFindNullSpaceMod2(value: (js.Array[js.Array[Double]], js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "findNullSpaceMod2", js.Any.fromFunction2(value))
      
      inline def setGcd(value: (Double, Double) => Double): Self = StObject.set(x, "gcd", js.Any.fromFunction2(value))
      
      inline def setLcm(value: (Double, Double) => Double): Self = StObject.set(x, "lcm", js.Any.fromFunction2(value))
      
      inline def setPowerFactor(value: Double => Double): Self = StObject.set(x, "powerFactor", js.Any.fromFunction1(value))
      
      inline def setPowerMod(value: (Double, Double, Double) => Double): Self = StObject.set(x, "powerMod", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait MeasurementStatic
    extends StObject
       with Instantiable3[/* numBits */ Double, /* result */ Double, /* newState */ QState, Measurement]
  
  @js.native
  trait QStateStatic
    extends StObject
       with Instantiable1[/* numBits */ Double, QState]
       with Instantiable2[/* numBits */ Double, /* amplitudes */ js.Array[Complex], QState] {
    
    def applyOperatorMatrix(matrix: js.Array[js.Array[Complex]], bitValue: Double, amplitude: Complex): js.Array[Complex] = js.native
    
    def applyToOneBit(
      controlBits: js.Array[Double],
      targetBit: Double,
      operatorMatrix: js.Array[js.Array[Complex]],
      qState: QState
    ): QState = js.native
    
    def fromBits(bitString: String): QState = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - js.Array[scala.Double]
    - typings.jsqubits.jsqubitsStrings.ALL
    - typings.jsqubits.mod.BitsRange
  */
  type SingleQubitOperatorTargetQubits = _SingleQubitOperatorTargetQubits | js.Array[Double] | Double
  
  @js.native
  trait StateWithAmplitudeStatic
    extends StObject
       with Instantiable3[/* numBits */ Double, /* index */ Double, /* amplitude */ Complex, StateWithAmplitude]
  
  type ToffoliArgs = /* import warning: importer.ImportType#apply c repeated non-array type: [jsqubits.jsqubits.SingleQubitOperatorTargetQubits, ...std.Array<jsqubits.jsqubits.SingleQubitOperatorTargetQubits>] */ /* controlBits */ js.Array[Array[SingleQubitOperatorTargetQubits]]
  
  // At least one control bit must be supplied to toffoli()
  type ToffoliControlQubits = Array[SingleQubitOperatorTargetQubits]
  
  trait _SingleQubitOperatorTargetQubits extends StObject
  
  type _To = ExternalJSQubitsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ExternalJSQubitsStatic = ^
  
  object jsqubits {
    
    @js.native
    trait Complex extends StObject {
      
      def add(other: Double): Complex = js.native
      def add(other: Complex): Complex = js.native
      
      def closeTo(other: Complex): Double = js.native
      
      def conjugate(): Complex = js.native
      
      def eql(other: Double): Boolean = js.native
      def eql(other: Complex): Boolean = js.native
      
      def format(): String = js.native
      def format(options: DecimalPlaces): String = js.native
      
      var imaginary: Double = js.native
      
      def inspect(): String = js.native
      
      def magnitude(): Double = js.native
      
      def multiply(other: Double): Complex = js.native
      def multiply(other: Complex): Complex = js.native
      
      def negate(): Complex = js.native
      
      def phase(): Double = js.native
      
      var real: Double = js.native
      
      def subtract(other: Double): Complex = js.native
      def subtract(other: Complex): Complex = js.native
    }
    
    trait Measurement extends StObject {
      
      def asBitString(): String
      
      var newState: QState
      
      var numBits: Double
      
      var result: Double
    }
    object Measurement {
      
      inline def apply(asBitString: () => String, newState: QState, numBits: Double, result: Double): Measurement = {
        val __obj = js.Dynamic.literal(asBitString = js.Any.fromFunction0(asBitString), newState = newState.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[Measurement]
      }
      
      extension [Self <: Measurement](x: Self) {
        
        inline def setAsBitString(value: () => String): Self = StObject.set(x, "asBitString", js.Any.fromFunction0(value))
        
        inline def setNewState(value: QState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
        
        inline def setNumBits(value: Double): Self = StObject.set(x, "numBits", value.asInstanceOf[js.Any])
        
        inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait QState extends StObject {
      
      def R(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      @JSName("R")
      var R_Original: js.Function2[/* targetBits */ SingleQubitOperatorTargetQubits, /* angle */ Double, QState] = js.native
      
      def S(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("S")
      var S_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
      
      def T(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("T")
      var T_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
      
      def X(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("X")
      var X_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
      
      def Y(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("Y")
      var Y_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
      
      def Z(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("Z")
      var Z_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
      
      def add(qState: QState): QState = js.native
      
      def amplitude(basisState: String): Complex = js.native
      def amplitude(basisState: Double): Complex = js.native
      
      def applyFunction(
        inputBits: SingleQubitOperatorTargetQubits,
        targetBits: SingleQubitOperatorTargetQubits,
        functionToApply: js.Function1[/* input */ Double, Double]
      ): QState = js.native
      
      def cnot(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def cnot(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("cnot")
      var cnot_Original: js.Function2[
            /* controlBits */ js.UndefOr[SingleQubitOperatorTargetQubits], 
            /* targetBits */ SingleQubitOperatorTargetQubits, 
            QState
          ] = js.native
      
      def controlledApplicationOfqBitOperator(
        controlBits: Unit,
        targetBits: SingleQubitOperatorTargetQubits,
        operatorMatrix: js.Array[js.Array[Complex]]
      ): QState = js.native
      def controlledApplicationOfqBitOperator(
        controlBits: SingleQubitOperatorTargetQubits,
        targetBits: SingleQubitOperatorTargetQubits,
        operatorMatrix: js.Array[js.Array[Complex]]
      ): QState = js.native
      
      def controlledHadamard(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def controlledHadamard(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def controlledR(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      def controlledR(
        controlBits: SingleQubitOperatorTargetQubits,
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      def controlledS(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def controlledS(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def controlledSwap(controlBits: Unit, targetBit1: Double, targetBit2: Double): QState = js.native
      def controlledSwap(controlBits: SingleQubitOperatorTargetQubits, targetBit1: Double, targetBit2: Double): QState = js.native
      
      def controlledT(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def controlledT(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def controlledX(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def controlledX(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def controlledXRotation(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      def controlledXRotation(
        controlBits: SingleQubitOperatorTargetQubits,
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      def controlledY(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def controlledY(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def controlledYRotation(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      def controlledYRotation(
        controlBits: SingleQubitOperatorTargetQubits,
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      def controlledZ(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      def controlledZ(controlBits: SingleQubitOperatorTargetQubits, targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def controlledZRotation(controlBits: Unit, targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      def controlledZRotation(
        controlBits: SingleQubitOperatorTargetQubits,
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      @JSName("each")
      def each_false(callBack: js.Function1[/* stateWithAmplitude */ StateWithAmplitude, `false` | Unit]): Unit = js.native
      
      def eql(): Boolean = js.native
      def eql(other: QState): Boolean = js.native
      
      def hadamard(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def kron(qState: QState): QState = js.native
      @JSName("kron")
      var kron_Original: js.Function1[/* qState */ QState, QState] = js.native
      
      def measure(bits: SingleQubitOperatorTargetQubits): Measurement = js.native
      
      def multiply(amount: Double): QState = js.native
      def multiply(amount: Complex): QState = js.native
      
      def normalize(): QState = js.native
      
      def not(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      @JSName("not")
      var not_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
      
      def numBits(): Double = js.native
      
      def qft(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def r(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      
      def random(): Double = js.native
      @JSName("random")
      var random_Original: js.Function0[Double] = js.native
      
      def rotateX(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      
      def rotateY(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      
      def rotateZ(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
      
      def s(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def subtract(qState: QState): QState = js.native
      
      def swap(targetBit1: Double, targetBit2: Double): QState = js.native
      
      def t(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def tensorProduct(qState: QState): QState = js.native
      
      def toffoli(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ToffoliArgs is not an array type */ args: ToffoliArgs
      ): QState = js.native
      
      def x(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def y(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def z(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
    }
    
    trait StateWithAmplitude extends StObject {
      
      var amplitude: Complex
      
      def asBitString(): String
      
      def asNumber(): Double
      
      var index: Double
      
      var numBits: Double
    }
    object StateWithAmplitude {
      
      inline def apply(
        amplitude: Complex,
        asBitString: () => String,
        asNumber: () => Double,
        index: Double,
        numBits: Double
      ): StateWithAmplitude = {
        val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], asBitString = js.Any.fromFunction0(asBitString), asNumber = js.Any.fromFunction0(asNumber), index = index.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any])
        __obj.asInstanceOf[StateWithAmplitude]
      }
      
      extension [Self <: StateWithAmplitude](x: Self) {
        
        inline def setAmplitude(value: Complex): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
        
        inline def setAsBitString(value: () => String): Self = StObject.set(x, "asBitString", js.Any.fromFunction0(value))
        
        inline def setAsNumber(value: () => Double): Self = StObject.set(x, "asNumber", js.Any.fromFunction0(value))
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setNumBits(value: Double): Self = StObject.set(x, "numBits", value.asInstanceOf[js.Any])
      }
    }
  }
}
