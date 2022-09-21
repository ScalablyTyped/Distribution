package typings.jsSdsl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkParamsMod {
  
  @JSImport("js-sdsl/dist/cjs/utils/checkParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkWithinAccessParams(pos: Double, lower: Double, upper: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkWithinAccessParams")(pos.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
