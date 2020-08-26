package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends _MathType {
  var `type`: String = js.native
  def create(data: MathArray): scala.Unit = js.native
  def create(data: MathArray, datatype: String): scala.Unit = js.native
  def datatype(): String = js.native
  def density(): Double = js.native
  def diagonal(): js.Array[_] = js.native
  def diagonal(k: Double): js.Array[_] = js.native
  def diagonal(k: BigNumber): js.Array[_] = js.native
  def forEach(callback: js.Function3[/* a */ js.Any, /* b */ Double, /* c */ this.type, scala.Unit]): scala.Unit = js.native
  def forEach(
    callback: js.Function3[/* a */ js.Any, /* b */ Double, /* c */ this.type, scala.Unit],
    skipZeros: Boolean
  ): scala.Unit = js.native
  def format(): String = js.native
  def format(options: js.Function1[/* value */ js.Any, String]): String = js.native
  def format(options: Double): String = js.native
  def format(options: FormatOptions): String = js.native
  def get(index: js.Array[Double]): js.Any = js.native
  def map(callback: js.Function3[/* a */ js.Any, /* b */ Double, /* c */ this.type, _]): Matrix = js.native
  def map(callback: js.Function3[/* a */ js.Any, /* b */ Double, /* c */ this.type, _], skipZeros: Boolean): Matrix = js.native
  def resize(size: MathArray): Matrix = js.native
  def resize(size: MathArray, defaultValue: String): Matrix = js.native
  def resize(size: MathArray, defaultValue: Double): Matrix = js.native
  def resize(size: Matrix): Matrix = js.native
  def resize(size: Matrix, defaultValue: String): Matrix = js.native
  def resize(size: Matrix, defaultValue: Double): Matrix = js.native
  def set(index: js.Array[Double], value: js.Any): Matrix = js.native
  def set(index: js.Array[Double], value: js.Any, defaultValue: String): Matrix = js.native
  def set(index: js.Array[Double], value: js.Any, defaultValue: Double): Matrix = js.native
  def size(): js.Array[Double] = js.native
  def storage(): String = js.native
  def subset(index: Index): Matrix = js.native
  def subset(index: Index, replacement: js.UndefOr[scala.Nothing], defaultValue: js.Any): Matrix = js.native
  def subset(index: Index, replacement: js.Any): Matrix = js.native
  def subset(index: Index, replacement: js.Any, defaultValue: js.Any): Matrix = js.native
  def swapRows(i: Double, j: Double): Matrix = js.native
  def toArray(): MathArray | Matrix = js.native
  def toJSON(): js.Any = js.native
  def valueOff(): MathArray | Matrix = js.native
}

