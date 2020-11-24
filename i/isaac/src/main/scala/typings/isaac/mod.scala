package typings.isaac

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("isaac", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def internals(): js.Any = js.native
  
  def prng(n: Double): Unit = js.native
  
  def rand(): Double = js.native
  
  def random(): Double = js.native
  
  def reset(): Unit = js.native
  
  def seed(s: String): Unit = js.native
  def seed(s: js.Array[Double]): Unit = js.native
  def seed(s: Double): Unit = js.native
}
