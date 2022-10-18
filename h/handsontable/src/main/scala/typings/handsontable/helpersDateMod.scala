package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersDateMod {
  
  @JSImport("handsontable/helpers/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNormalizedDate(dateString: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedDate")(dateString.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
