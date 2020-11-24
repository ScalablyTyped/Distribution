package typings.jupyterlabInspector.tokensMod

import typings.jupyterlabInspector.tokensMod.IInspector.IInspectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspector_ extends js.Object {
  
  /**
    * The source of events the inspector listens for.
    */
  var source: IInspectable | Null = js.native
}
object IInspector_ {
  
  @scala.inline
  def apply(): IInspector_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspector_]
  }
  
  @scala.inline
  implicit class IInspector_Ops[Self <: IInspector_] (val x: Self) extends AnyVal {
    
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
    def setSource(value: IInspectable): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
}
