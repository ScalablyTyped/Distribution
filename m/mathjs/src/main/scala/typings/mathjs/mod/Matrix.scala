package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
  @JSName("apply")
  def apply(dim: Double, callback: js.Function1[/* array */ MathCollection, Double]): MathCollection = js.native
  
  def create(data: MathArray): scala.Unit = js.native
  def create(data: MathArray, datatype: String): scala.Unit = js.native
  
  def datatype(): String = js.native
  
  def density(): Double = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def diagonal(): js.Array[Any] = js.native
  def diagonal(k: Double): js.Array[Any] = js.native
  def diagonal(k: BigNumber): js.Array[Any] = js.native
  
  def forEach(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* a */ Any, /* b */ js.Array[Double], /* c */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* a */ Any, /* b */ js.Array[Double], /* c */ this.type, scala.Unit],
    skipZeros: Boolean
  ): scala.Unit = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def format(): String = js.native
  def format(options: js.Function1[/* value */ Any, String]): String = js.native
  def format(options: Double): String = js.native
  def format(options: FormatOptions): String = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def get(index: js.Array[Double]): Any = js.native
  
  def map(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* a */ Any, /* b */ js.Array[Double], /* c */ this.type, Any]
  ): Matrix = js.native
  def map(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* a */ Any, /* b */ js.Array[Double], /* c */ this.type, Any],
    skipZeros: Boolean
  ): Matrix = js.native
  
  def resize(size: MathCollection): Matrix = js.native
  def resize(size: MathCollection, defaultValue: String): Matrix = js.native
  def resize(size: MathCollection, defaultValue: Double): Matrix = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def set(index: js.Array[Double], value: Any): Matrix = js.native
  def set(index: js.Array[Double], value: Any, defaultValue: String): Matrix = js.native
  def set(index: js.Array[Double], value: Any, defaultValue: Double): Matrix = js.native
  
  def size(): js.Array[Double] = js.native
  
  def storage(): String = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def subset(index: Index): Matrix = js.native
  def subset(index: Index, replacement: Any): Matrix = js.native
  def subset(index: Index, replacement: Any, defaultValue: Any): Matrix = js.native
  def subset(index: Index, replacement: scala.Unit, defaultValue: Any): Matrix = js.native
  
  def swapRows(i: Double, j: Double): Matrix = js.native
  
  def toArray(): MathArray = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def toJSON(): Any = js.native
  
  var `type`: String = js.native
}
