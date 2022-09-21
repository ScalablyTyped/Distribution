package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPendingGoogleUpdateInsight extends StObject {
  
  /**
    * The name of the Google-provided library with the non-SDK API dependency.
    */
  var nameOfGoogleLibrary: js.UndefOr[String | Null] = js.undefined
}
object SchemaPendingGoogleUpdateInsight {
  
  inline def apply(): SchemaPendingGoogleUpdateInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPendingGoogleUpdateInsight]
  }
  
  extension [Self <: SchemaPendingGoogleUpdateInsight](x: Self) {
    
    inline def setNameOfGoogleLibrary(value: String): Self = StObject.set(x, "nameOfGoogleLibrary", value.asInstanceOf[js.Any])
    
    inline def setNameOfGoogleLibraryNull: Self = StObject.set(x, "nameOfGoogleLibrary", null)
    
    inline def setNameOfGoogleLibraryUndefined: Self = StObject.set(x, "nameOfGoogleLibrary", js.undefined)
  }
}
