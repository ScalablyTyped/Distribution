package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteV1ApiCompatV1Field extends StObject {
  
  /** Whether the field can be shown side-by-side with another field. */
  var short: js.UndefOr[Boolean] = js.undefined
  
  /** The heading text, shown in bold. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The text value of the field. */
  var value: js.UndefOr[String] = js.undefined
}
object AppsDynamiteV1ApiCompatV1Field {
  
  inline def apply(): AppsDynamiteV1ApiCompatV1Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteV1ApiCompatV1Field]
  }
  
  extension [Self <: AppsDynamiteV1ApiCompatV1Field](x: Self) {
    
    inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
