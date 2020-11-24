package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonInfiniteScrollContent extends js.Object {
  
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
  implicit class IonInfiniteScrollContentOps[Self <: IonInfiniteScrollContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadingSpinner(value: SpinnerTypes): Self = this.set("loadingSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingSpinner: Self = this.set("loadingSpinner", js.undefined)
    
    @scala.inline
    def setLoadingSpinnerNull: Self = this.set("loadingSpinner", null)
    
    @scala.inline
    def setLoadingText(value: String | IonicSafeString): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
  }
}
