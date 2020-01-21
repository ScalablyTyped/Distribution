package typings.jsqubits.mod.jsqubits

import typings.jsqubits.jsqubitsBooleans.`false`
import typings.jsqubits.mod.SingleQubitOperatorTargetQubits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QState extends js.Object {
  @JSName("R")
  var R_Original: js.Function2[/* targetBits */ SingleQubitOperatorTargetQubits, /* angle */ Double, QState] = js.native
  @JSName("S")
  var S_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("T")
  var T_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("X")
  var X_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("Y")
  var Y_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("Z")
  var Z_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("cnot")
  var cnot_Original: js.Function2[
    /* controlBits */ js.UndefOr[SingleQubitOperatorTargetQubits], 
    /* targetBits */ SingleQubitOperatorTargetQubits, 
    QState
  ] = js.native
  @JSName("kron")
  var kron_Original: js.Function1[/* qState */ QState, QState] = js.native
  @JSName("not")
  var not_Original: js.Function1[/* targetBits */ SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("random")
  var random_Original: js.Function0[Double] = js.native
  def R(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
  def S(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
  def T(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
  def X(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
  def Y(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
  def Z(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
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
  def measure(bits: SingleQubitOperatorTargetQubits): Measurement = js.native
  def multiply(amount: Double): QState = js.native
  def multiply(amount: Complex): QState = js.native
  def normalize(): QState = js.native
  def not(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
  def numBits(): Double = js.native
  def qft(targetBits: SingleQubitOperatorTargetQubits): QState = js.native
  def r(targetBits: SingleQubitOperatorTargetQubits, angle: Double): QState = js.native
  def random(): Double = js.native
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

