package typings.ionicCore.componentsMod.Components

import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRefresherContent extends StObject {
  
  /**
    * A static icon or a spinner to display when you begin to pull down. A spinner name can be provided to gradually show tick marks when pulling down on iOS devices.
    */
  var pullingIcon: js.UndefOr[SpinnerTypes | String | Null] = js.undefined
  
  /**
    * The text you want to display when you begin to pull down. `pullingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var pullingText: js.UndefOr[String | IonicSafeString] = js.undefined
  
  /**
    * An animated SVG spinner that shows when refreshing begins
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  
  /**
    * The text you want to display when performing a refresh. `refreshingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var refreshingText: js.UndefOr[String | IonicSafeString] = js.undefined
}
object IonRefresherContent {
  
  inline def apply(): IonRefresherContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRefresherContent]
  }
  
  extension [Self <: IonRefresherContent](x: Self) {
    
    inline def setPullingIcon(value: SpinnerTypes | String): Self = StObject.set(x, "pullingIcon", value.asInstanceOf[js.Any])
    
    inline def setPullingIconNull: Self = StObject.set(x, "pullingIcon", null)
    
    inline def setPullingIconUndefined: Self = StObject.set(x, "pullingIcon", js.undefined)
    
    inline def setPullingText(value: String | IonicSafeString): Self = StObject.set(x, "pullingText", value.asInstanceOf[js.Any])
    
    inline def setPullingTextUndefined: Self = StObject.set(x, "pullingText", js.undefined)
    
    inline def setRefreshingSpinner(value: SpinnerTypes): Self = StObject.set(x, "refreshingSpinner", value.asInstanceOf[js.Any])
    
    inline def setRefreshingSpinnerNull: Self = StObject.set(x, "refreshingSpinner", null)
    
    inline def setRefreshingSpinnerUndefined: Self = StObject.set(x, "refreshingSpinner", js.undefined)
    
    inline def setRefreshingText(value: String | IonicSafeString): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
    
    inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
  }
}
