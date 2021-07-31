package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.large
import typings.ionicCore.ionicCoreStrings.small
import typings.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTitle extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * The size of the toolbar title.
    */
  var size: js.UndefOr[large | small] = js.undefined
}
object IonTitle {
  
  @scala.inline
  def apply(): IonTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTitle]
  }
  
  @scala.inline
  implicit class IonTitleMutableBuilder[Self <: IonTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
