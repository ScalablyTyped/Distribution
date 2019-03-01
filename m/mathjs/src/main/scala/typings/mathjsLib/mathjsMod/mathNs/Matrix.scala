package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends _MathType {
  var `type`: java.lang.String = js.native
  def create(data: MathArray): scala.Unit = js.native
  def create(data: MathArray, datatype: java.lang.String): scala.Unit = js.native
  def datatype(): java.lang.String = js.native
  def density(): scala.Double = js.native
  def diagonal(): js.Array[_] = js.native
  def diagonal(k: BigNumber): js.Array[_] = js.native
  def diagonal(k: scala.Double): js.Array[_] = js.native
  def forEach(callback: js.Function3[/* a */ js.Any, /* b */ scala.Double, /* c */ this.type, scala.Unit]): scala.Unit = js.native
  def forEach(
    callback: js.Function3[/* a */ js.Any, /* b */ scala.Double, /* c */ this.type, scala.Unit],
    skipZeros: scala.Boolean
  ): scala.Unit = js.native
  def format(): java.lang.String = js.native
  def format(options: js.Function1[/* value */ js.Any, java.lang.String]): java.lang.String = js.native
  def format(options: FormatOptions): java.lang.String = js.native
  def format(options: scala.Double): java.lang.String = js.native
  def get(index: js.Array[scala.Double]): js.Any = js.native
  def map(callback: js.Function3[/* a */ js.Any, /* b */ scala.Double, /* c */ this.type, _]): Matrix = js.native
  def map(
    callback: js.Function3[/* a */ js.Any, /* b */ scala.Double, /* c */ this.type, _],
    skipZeros: scala.Boolean
  ): Matrix = js.native
  def resize(size: MathArray): Matrix = js.native
  def resize(size: MathArray, defaultValue: java.lang.String): Matrix = js.native
  def resize(size: MathArray, defaultValue: scala.Double): Matrix = js.native
  def resize(size: Matrix): Matrix = js.native
  def resize(size: Matrix, defaultValue: java.lang.String): Matrix = js.native
  def resize(size: Matrix, defaultValue: scala.Double): Matrix = js.native
  def set(index: js.Array[scala.Double], value: js.Any): Matrix = js.native
  def set(index: js.Array[scala.Double], value: js.Any, defaultValue: java.lang.String): Matrix = js.native
  def set(index: js.Array[scala.Double], value: js.Any, defaultValue: scala.Double): Matrix = js.native
  def size(): js.Array[scala.Double] = js.native
  def storage(): java.lang.String = js.native
  def subset(index: Index): Matrix = js.native
  def subset(index: Index, replacement: js.Any): Matrix = js.native
  def subset(index: Index, replacement: js.Any, defaultValue: js.Any): Matrix = js.native
  def swapRows(i: scala.Double, j: scala.Double): Matrix = js.native
  def toArray(): MathArray | Matrix = js.native
  def toJSON(): js.Any = js.native
  def valueOff(): MathArray | Matrix = js.native
}

