package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerAppResult extends StObject {
  
  /** The result of an attempt to clear the data of a single app. */
  var clearingResult: js.UndefOr[String] = js.undefined
}
object PerAppResult {
  
  inline def apply(): PerAppResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerAppResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerAppResult] (val x: Self) extends AnyVal {
    
    inline def setClearingResult(value: String): Self = StObject.set(x, "clearingResult", value.asInstanceOf[js.Any])
    
    inline def setClearingResultUndefined: Self = StObject.set(x, "clearingResult", js.undefined)
  }
}
