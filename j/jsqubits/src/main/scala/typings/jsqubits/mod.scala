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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsqubits", JSImport.Namespace)
  @js.native
  val ^ : ExternalJSQubitsStatic = js.native
  
  @js.native
  trait BitsRange extends _SingleQubitOperatorTargetQubits {
    
    var from: Double = js.native
    
    var to: Double = js.native
  }
  object BitsRange {
    
    @scala.inline
    def apply(from: Double, to: Double): BitsRange = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitsRange]
    }
    
    @scala.inline
    implicit class BitsRangeMutableBuilder[Self <: BitsRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComplexStatic extends Instantiable2[/* real */ Double, /* imaginary */ Double, Complex] {
    
    var ONE: Complex = js.native
    
    var SQRT1_2: Complex = js.native
    
    var SQRT2: Complex = js.native
    
    var ZERO: Complex = js.native
  }
  
  @js.native
  trait ContinuedFractionResult extends StObject {
    
    var denominator: Double = js.native
    
    var numerator: Double = js.native
    
    var quotients: js.Array[Double] = js.native
  }
  object ContinuedFractionResult {
    
    @scala.inline
    def apply(denominator: Double, numerator: Double, quotients: js.Array[Double]): ContinuedFractionResult = {
      val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any], quotients = quotients.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuedFractionResult]
    }
    
    @scala.inline
    implicit class ContinuedFractionResultMutableBuilder[Self <: ContinuedFractionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumerator(value: Double): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotients(value: js.Array[Double]): Self = StObject.set(x, "quotients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotientsVarargs(value: Double*): Self = StObject.set(x, "quotients", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ExternalJSQubitsStatic extends StObject {
    
    def jsqubits(bitString: String): QState = js.native
    @JSName("jsqubits")
    var jsqubits_Original: JSQubitsStatic = js.native
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
  
  @js.native
  trait JsqubitsmathStatic extends StObject {
    
    def continuedFraction(targetValue: Double, precision: Double): ContinuedFractionResult = js.native
    
    def findNullSpaceMod2(a: js.Array[js.Array[Double]], width: js.Array[Double]): js.Array[Double] = js.native
    
    def gcd(a: Double, b: Double): Double = js.native
    
    def lcm(a: Double, b: Double): Double = js.native
    
    def powerFactor(n: Double): Double = js.native
    
    def powerMod(x: Double, y: Double, m: Double): Double = js.native
  }
  object JsqubitsmathStatic {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class JsqubitsmathStaticMutableBuilder[Self <: JsqubitsmathStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuedFraction(value: (Double, Double) => ContinuedFractionResult): Self = StObject.set(x, "continuedFraction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindNullSpaceMod2(value: (js.Array[js.Array[Double]], js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "findNullSpaceMod2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGcd(value: (Double, Double) => Double): Self = StObject.set(x, "gcd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLcm(value: (Double, Double) => Double): Self = StObject.set(x, "lcm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPowerFactor(value: Double => Double): Self = StObject.set(x, "powerFactor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPowerMod(value: (Double, Double, Double) => Double): Self = StObject.set(x, "powerMod", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait MeasurementStatic extends Instantiable3[/* numBits */ Double, /* result */ Double, /* newState */ QState, Measurement]
  
  @js.native
  trait QStateStatic
    extends Instantiable1[/* numBits */ Double, QState]
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
  trait StateWithAmplitudeStatic extends Instantiable3[/* numBits */ Double, /* index */ Double, /* amplitude */ Complex, StateWithAmplitude]
  
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
    
    @js.native
    trait Measurement extends StObject {
      
      def asBitString(): String = js.native
      
      var newState: QState = js.native
      
      var numBits: Double = js.native
      
      var result: Double = js.native
    }
    object Measurement {
      
      @scala.inline
      def apply(asBitString: () => String, newState: QState, numBits: Double, result: Double): Measurement = {
        val __obj = js.Dynamic.literal(asBitString = js.Any.fromFunction0(asBitString), newState = newState.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[Measurement]
      }
      
      @scala.inline
      implicit class MeasurementMutableBuilder[Self <: Measurement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsBitString(value: () => String): Self = StObject.set(x, "asBitString", js.Any.fromFunction0(value))
        
        @scala.inline
        def setNewState(value: QState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumBits(value: Double): Self = StObject.set(x, "numBits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
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
      
      def cnot(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      @JSName("cnot")
      var cnot_Original: js.Function2[
            /* controlBits */ js.UndefOr[SingleQubitOperatorTargetQubits], 
            /* targetBits */ SingleQubitOperatorTargetQubits, 
            QState
          ] = js.native
      
      def controlledApplicationOfqBitOperator(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits,
        operatorMatrix: js.Array[js.Array[Complex]]
      ): QState = js.native
      
      def controlledHadamard(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      
      def controlledR(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      def controlledS(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      
      def controlledSwap(controlBits: js.UndefOr[SingleQubitOperatorTargetQubits], targetBit1: Double, targetBit2: Double): QState = js.native
      
      def controlledT(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      
      def controlledX(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      
      def controlledXRotation(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      def controlledY(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      
      def controlledYRotation(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits,
        angle: Double
      ): QState = js.native
      
      def controlledZ(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
        targetBits: SingleQubitOperatorTargetQubits
      ): QState = js.native
      
      def controlledZRotation(
        controlBits: js.UndefOr[SingleQubitOperatorTargetQubits],
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
      
      /**
        * toffoli args is
        * (...controlBit: SingleQubitOperatorTargetQubits[], targetBit: SingleQubitOperatorTargetQubits)
        * but TypeScript3.4 cannot define this args.
        * welcome Pull Request.
        */
      def toffoli(args: SingleQubitOperatorTargetQubits*): QState = js.native
      
      def x(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def y(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
      
      def z(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
    }
    
    @js.native
    trait StateWithAmplitude extends StObject {
      
      var amplitude: Complex = js.native
      
      def asBitString(): String = js.native
      
      def asNumber(): Double = js.native
      
      var index: Double = js.native
      
      var numBits: Double = js.native
    }
    object StateWithAmplitude {
      
      @scala.inline
      def apply(
        amplitude: Complex,
        asBitString: () => String,
        asNumber: () => Double,
        index: Double,
        numBits: Double
      ): StateWithAmplitude = {
        val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], asBitString = js.Any.fromFunction0(asBitString), asNumber = js.Any.fromFunction0(asNumber), index = index.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any])
        __obj.asInstanceOf[StateWithAmplitude]
      }
      
      @scala.inline
      implicit class StateWithAmplitudeMutableBuilder[Self <: StateWithAmplitude] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmplitude(value: Complex): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsBitString(value: () => String): Self = StObject.set(x, "asBitString", js.Any.fromFunction0(value))
        
        @scala.inline
        def setAsNumber(value: () => Double): Self = StObject.set(x, "asNumber", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumBits(value: Double): Self = StObject.set(x, "numBits", value.asInstanceOf[js.Any])
      }
    }
  }
}
