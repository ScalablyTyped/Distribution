package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.created
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.modified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sortby extends StObject {
  
  var sortby: js.UndefOr[created | modified] = js.undefined
}
object Sortby {
  
  inline def apply(): Sortby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sortby]
  }
  
  extension [Self <: Sortby](x: Self) {
    
    inline def setSortby(value: created | modified): Self = StObject.set(x, "sortby", value.asInstanceOf[js.Any])
    
    inline def setSortbyUndefined: Self = StObject.set(x, "sortby", js.undefined)
  }
}
