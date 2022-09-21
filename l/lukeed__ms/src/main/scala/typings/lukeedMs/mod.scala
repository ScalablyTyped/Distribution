package typings.lukeedMs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lukeed/ms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(millis: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(millis.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(millis: Double, long: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(millis.asInstanceOf[js.Any], long.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parse(input: String): Double | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Double | Unit]
}
