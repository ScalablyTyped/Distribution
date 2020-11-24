package typings.maquette.interfacesMod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectorOptions extends js.Object {
  
  /**
    * Can be used to log performance metrics
    */
  var performanceLogger: js.UndefOr[ProjectorPerformanceLogger] = js.native
  
  /**
    * May be used to add vendor prefixes when applying inline styles when needed.
    * This function is called when [[styles]] is used.
    * This function should execute `domNode.style[styleName] = value` or do something smarter.
    *
    * @param domNode   The DOM Node that needs to receive the style
    * @param styleName The name of the style that should be applied, for example `transform`.
    * @param value     The value of this style, for example `rotate(45deg)`.
    */
  var styleApplyer: js.UndefOr[
    js.Function3[/* domNode */ HTMLElement, /* styleName */ String, /* value */ String, Unit]
  ] = js.native
}
object ProjectorOptions {
  
  @scala.inline
  def apply(): ProjectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectorOptions]
  }
  
  @scala.inline
  implicit class ProjectorOptionsOps[Self <: ProjectorOptions] (val x: Self) extends AnyVal {
    
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
    def setPerformanceLogger(value: (/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event]) => Unit): Self = this.set("performanceLogger", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePerformanceLogger: Self = this.set("performanceLogger", js.undefined)
    
    @scala.inline
    def setStyleApplyer(value: (/* domNode */ HTMLElement, /* styleName */ String, /* value */ String) => Unit): Self = this.set("styleApplyer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStyleApplyer: Self = this.set("styleApplyer", js.undefined)
  }
}
