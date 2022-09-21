package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strptimeMod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(dateStr: Any): Any = ^.asInstanceOf[js.Dynamic].apply(dateStr.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(dateStr: Any, format: Any): Any = (^.asInstanceOf[js.Dynamic].apply(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(dateStr: Unit, format: Any): Any = (^.asInstanceOf[js.Dynamic].apply(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("locutus/php/datetime/strptime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
