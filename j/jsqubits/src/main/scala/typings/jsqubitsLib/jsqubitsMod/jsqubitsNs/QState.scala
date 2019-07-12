package typings
package jsqubitsLib.jsqubitsMod.jsqubitsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QState extends js.Object {
  @JSName("R")
  var R_Original: js.Function2[
    /* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, 
    /* angle */ scala.Double, 
    QState
  ] = js.native
  @JSName("S")
  var S_Original: js.Function1[/* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("T")
  var T_Original: js.Function1[/* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("X")
  var X_Original: js.Function1[/* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("Y")
  var Y_Original: js.Function1[/* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("Z")
  var Z_Original: js.Function1[/* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("cnot")
  var cnot_Original: js.Function2[
    /* controlBits */ js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits], 
    /* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, 
    QState
  ] = js.native
  @JSName("kron")
  var kron_Original: js.Function1[/* qState */ QState, QState] = js.native
  @JSName("not")
  var not_Original: js.Function1[/* targetBits */ jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, QState] = js.native
  @JSName("random")
  var random_Original: js.Function0[scala.Double] = js.native
  def R(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, angle: scala.Double): QState = js.native
  def S(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def T(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def X(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def Y(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def Z(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def add(qState: QState): QState = js.native
  def amplitude(basisState: java.lang.String): Complex = js.native
  def amplitude(basisState: QState): Complex = js.native
  def applyFunction(
    inputBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    functionToApply: js.Function1[/* input */ scala.Double, scala.Double]
  ): QState = js.native
  def cnot(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledApplicationOfqBitOperator(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    operatorMatrix: js.Array[js.Array[Complex]]
  ): QState = js.native
  def controlledHadamard(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledR(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    angle: scala.Double
  ): QState = js.native
  def controlledS(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledSwap(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBit1: scala.Double,
    targetBit2: scala.Double
  ): QState = js.native
  def controlledT(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledX(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledXRotation(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    angle: scala.Double
  ): QState = js.native
  def controlledY(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledYRotation(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    angle: scala.Double
  ): QState = js.native
  def controlledZ(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits
  ): QState = js.native
  def controlledZRotation(
    controlBits: js.UndefOr[jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits],
    targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits,
    angle: scala.Double
  ): QState = js.native
  @JSName("each")
  def each_false(
    callBack: js.Function1[
      /* stateWithAmplitude */ StateWithAmplitude, 
      jsqubitsLib.jsqubitsLibNumbers.`false` | scala.Unit
    ]
  ): scala.Unit = js.native
  def eql(): scala.Boolean = js.native
  def eql(other: QState): scala.Boolean = js.native
  def hadamard(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def kron(qState: QState): QState = js.native
  def measure(bits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): Measurement = js.native
  def multiply(amount: Complex): QState = js.native
  def multiply(amount: scala.Double): QState = js.native
  def normalize(): QState = js.native
  def not(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def numBits(): scala.Double = js.native
  def qft(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def r(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, angle: scala.Double): QState = js.native
  def random(): scala.Double = js.native
  def rotateX(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, angle: scala.Double): QState = js.native
  def rotateY(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, angle: scala.Double): QState = js.native
  def rotateZ(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits, angle: scala.Double): QState = js.native
  def s(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def subtract(qState: QState): QState = js.native
  def swap(targetBit1: scala.Double, targetBit2: scala.Double): QState = js.native
  def t(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def tensorProduct(qState: QState): QState = js.native
  /**
    * toffoli args is
    * (...controlBit: SingleQubitOperatorTargetQubits[], targetBit: SingleQubitOperatorTargetQubits)
    * but TypeScript3.4 cannot define this args.
    * welcome Pull Request.
    */
  def toffoli(args: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits*): QState = js.native
  def x(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def y(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
  def z(targetBits: jsqubitsLib.jsqubitsMod.SingleQubitOperatorTargetQubits): QState = js.native
}

