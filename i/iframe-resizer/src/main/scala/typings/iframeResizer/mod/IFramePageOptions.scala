package typings.iframeResizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IFramePageOptions extends js.Object {
  
  /**
    * These option can be used to override the option set in the parent page
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod | js.Function0[Double]] = js.native
  
  /**
    * Receive message posted from the parent page with the iframe.iFrameResizer.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  
  /**
    * This function is called once iFrame-Resizer has been initialized after receiving a call from the parent page.
    */
  var readyCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * This option allows you to restrict the domain of the parent page,
    * to prevent other sites mimicking your parent page.
    */
  var targetOrigin: js.UndefOr[String] = js.native
  
  /**
    * These option can be used to override the option set in the parent page
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod | js.Function0[Double]] = js.native
}
object IFramePageOptions {
  
  @scala.inline
  def apply(): IFramePageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFramePageOptions]
  }
  
  @scala.inline
  implicit class IFramePageOptionsOps[Self <: IFramePageOptions] (val x: Self) extends AnyVal {
    
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
    def setHeightCalculationMethodFunction0(value: () => Double): Self = this.set("heightCalculationMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeightCalculationMethod(value: HeightCalculationMethod | js.Function0[Double]): Self = this.set("heightCalculationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightCalculationMethod: Self = this.set("heightCalculationMethod", js.undefined)
    
    @scala.inline
    def setMessageCallback(value: /* message */ js.Any => Unit): Self = this.set("messageCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMessageCallback: Self = this.set("messageCallback", js.undefined)
    
    @scala.inline
    def setReadyCallback(value: () => Unit): Self = this.set("readyCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReadyCallback: Self = this.set("readyCallback", js.undefined)
    
    @scala.inline
    def setTargetOrigin(value: String): Self = this.set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOrigin: Self = this.set("targetOrigin", js.undefined)
    
    @scala.inline
    def setWidthCalculationMethodFunction0(value: () => Double): Self = this.set("widthCalculationMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidthCalculationMethod(value: WidthCalculationMethod | js.Function0[Double]): Self = this.set("widthCalculationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthCalculationMethod: Self = this.set("widthCalculationMethod", js.undefined)
  }
}
