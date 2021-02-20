package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonInfiniteScrollContent extends StObject {
  
  /**
    * An animated SVG spinner that shows while loading.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  
  /**
    * Optional text to display while loading. `loadingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var loadingText: js.UndefOr[String | IonicSafeString] = js.native
}
object IonInfiniteScrollContent {
  
  @scala.inline
  def apply(): IonInfiniteScrollContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonInfiniteScrollContent]
  }
  
  @scala.inline
  implicit class IonInfiniteScrollContentMutableBuilder[Self <: IonInfiniteScrollContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadingSpinner(value: SpinnerTypes): Self = StObject.set(x, "loadingSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingSpinnerNull: Self = StObject.set(x, "loadingSpinner", null)
    
    @scala.inline
    def setLoadingSpinnerUndefined: Self = StObject.set(x, "loadingSpinner", js.undefined)
    
    @scala.inline
    def setLoadingText(value: String | IonicSafeString): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
  }
}
