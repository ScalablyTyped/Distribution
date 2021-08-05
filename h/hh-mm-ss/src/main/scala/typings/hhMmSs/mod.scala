package typings.hhMmSs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hh-mm-ss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMs(ms: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMs")(ms.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromMs(ms: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMs")(ms.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromS(s: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromS")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromS(s: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromS")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toMs(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMs")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMs(time: String, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMs")(time.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toS(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toS")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toS(time: String, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toS")(time.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
}
