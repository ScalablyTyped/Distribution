package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonInfiniteScrollContent extends StObject {
  
  /**
    * An animated SVG spinner that shows while loading.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  
  /**
    * Optional text to display while loading. `loadingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var loadingText: js.UndefOr[String | IonicSafeString] = js.undefined
}
object IonInfiniteScrollContent {
  
  inline def apply(): IonInfiniteScrollContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonInfiniteScrollContent]
  }
  
  extension [Self <: IonInfiniteScrollContent](x: Self) {
    
    inline def setLoadingSpinner(value: SpinnerTypes): Self = StObject.set(x, "loadingSpinner", value.asInstanceOf[js.Any])
    
    inline def setLoadingSpinnerNull: Self = StObject.set(x, "loadingSpinner", null)
    
    inline def setLoadingSpinnerUndefined: Self = StObject.set(x, "loadingSpinner", js.undefined)
    
    inline def setLoadingText(value: String | IonicSafeString): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
  }
}
