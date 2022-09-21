package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idMod {
  
  @JSImport("inversify/lib/utils/id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def id(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Double]
}
