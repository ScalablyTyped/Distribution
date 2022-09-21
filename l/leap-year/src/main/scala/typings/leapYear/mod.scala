package typings.leapYear

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leap-year", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(year: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
