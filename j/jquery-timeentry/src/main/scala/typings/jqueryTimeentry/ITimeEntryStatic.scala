package typings.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeEntryStatic extends js.Object {
  
  var regionalOptions: ITimeEntryLocales = js.native
  
  def setDefaults(settings: ITimeEntryOptions): Unit = js.native
}
object ITimeEntryStatic {
  
  @scala.inline
  def apply(regionalOptions: ITimeEntryLocales, setDefaults: ITimeEntryOptions => Unit): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions.asInstanceOf[js.Any], setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[ITimeEntryStatic]
  }
  
  @scala.inline
  implicit class ITimeEntryStaticOps[Self <: ITimeEntryStatic] (val x: Self) extends AnyVal {
    
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
    def setRegionalOptions(value: ITimeEntryLocales): Self = this.set("regionalOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaults(value: ITimeEntryOptions => Unit): Self = this.set("setDefaults", js.Any.fromFunction1(value))
  }
}
