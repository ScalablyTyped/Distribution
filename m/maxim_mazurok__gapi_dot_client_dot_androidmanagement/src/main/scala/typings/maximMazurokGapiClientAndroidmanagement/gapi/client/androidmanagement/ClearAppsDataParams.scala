package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearAppsDataParams extends StObject {
  
  /** The package names of the apps whose data will be cleared when the command is executed. */
  var packageNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ClearAppsDataParams {
  
  inline def apply(): ClearAppsDataParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearAppsDataParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearAppsDataParams] (val x: Self) extends AnyVal {
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
  }
}
