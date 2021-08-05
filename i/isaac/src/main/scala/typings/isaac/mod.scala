package typings.isaac

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isaac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def internals(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("internals")().asInstanceOf[js.Any]
  
  inline def prng(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prng")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def rand(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand")().asInstanceOf[Double]
  
  inline def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def seed(s: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def seed(s: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def seed(s: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
