package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearAppsDataStatus extends StObject {
  
  /** The per-app results, a mapping from package names to the respective clearing result. */
  var results: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.androidmanagement.gapi.client.androidmanagement.PerAppResult} */ js.Any
  ] = js.undefined
}
object ClearAppsDataStatus {
  
  inline def apply(): ClearAppsDataStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearAppsDataStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearAppsDataStatus] (val x: Self) extends AnyVal {
    
    inline def setResults(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.androidmanagement.gapi.client.androidmanagement.PerAppResult} */ js.Any
    ): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
