package typings.ionRangeslider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery extends js.Object {
    
    def destroy(): Unit = js.native
    
    def ionRangeSlider(): JQuery = js.native
    def ionRangeSlider(options: IonRangeSliderOptions): JQuery = js.native
    
    def reset(): Unit = js.native
    
    def update(option: IonRangeSliderOptions): Unit = js.native
  }
}
