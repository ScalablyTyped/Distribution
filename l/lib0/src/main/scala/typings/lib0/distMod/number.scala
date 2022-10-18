package typings.lib0.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object number {
  
  @JSImport("lib0/dist", "number")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/dist", "number.HIGHEST_INT32")
  @js.native
  val HIGHEST_INT32: Double = js.native
  
  @JSImport("lib0/dist", "number.LOWEST_INT32")
  @js.native
  val LOWEST_INT32: Double = js.native
  
  @JSImport("lib0/dist", "number.MAX_SAFE_INTEGER")
  @js.native
  val MAX_SAFE_INTEGER: Double = js.native
  
  @JSImport("lib0/dist", "number.MIN_SAFE_INTEGER")
  @js.native
  val MIN_SAFE_INTEGER: Double = js.native
  
  inline def isInteger(number: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNaN(number: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseInt(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseInt(string: String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
}
