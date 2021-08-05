package typings.leapYear

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].apply(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(year: Date): Boolean = ^.asInstanceOf[js.Dynamic].apply(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("leap-year", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
