package typings.isaac

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isaac", "internals")
  @js.native
  def internals(): js.Any = js.native
  
  @JSImport("isaac", "prng")
  @js.native
  def prng(n: Double): Unit = js.native
  
  @JSImport("isaac", "rand")
  @js.native
  def rand(): Double = js.native
  
  @JSImport("isaac", "random")
  @js.native
  def random(): Double = js.native
  
  @JSImport("isaac", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("isaac", "seed")
  @js.native
  def seed(s: String): Unit = js.native
  @JSImport("isaac", "seed")
  @js.native
  def seed(s: js.Array[Double]): Unit = js.native
  @JSImport("isaac", "seed")
  @js.native
  def seed(s: Double): Unit = js.native
}
