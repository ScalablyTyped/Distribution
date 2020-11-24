package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Data] extends js.Object {
  
  /**
    * Constructor reference used to crop the exception call stack output
    */
  var ctor: js.UndefOr[js.Function] = js.native
  
  /**
    * Additional error information
    */
  var data: js.UndefOr[Data] = js.native
  
  /**
    * Error message string
    *
    * @default none
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * If false, the err provided is a Boom object, and a statusCode or message are provided, the values are ignored
    *
    * @default true
    */
  var `override`: js.UndefOr[Boolean] = js.native
  
  /**
    * The HTTP status code
    *
    * @default 500
    */
  var statusCode: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply[Data](): Options[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Data]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], Data] (val x: Self with Options[Data]) extends AnyVal {
    
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
    def setCtor(value: js.Function): Self = this.set("ctor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtor: Self = this.set("ctor", js.undefined)
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
