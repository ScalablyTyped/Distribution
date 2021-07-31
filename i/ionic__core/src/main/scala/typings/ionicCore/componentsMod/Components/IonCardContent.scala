package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonCardContent extends StObject {
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
}
object IonCardContent {
  
  @scala.inline
  def apply(): IonCardContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonCardContent]
  }
  
  @scala.inline
  implicit class IonCardContentMutableBuilder[Self <: IonCardContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
