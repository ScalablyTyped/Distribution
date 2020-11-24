package typings.helmet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<helmet.helmet/dist/middlewares/expect-ct.ExpectCtOptions> */
@js.native
trait ReadonlyExpectCtOptions extends js.Object {
  
  val enforce: js.UndefOr[Boolean] = js.native
  
  val maxAge: js.UndefOr[Double] = js.native
  
  val reportUri: js.UndefOr[String] = js.native
}
object ReadonlyExpectCtOptions {
  
  @scala.inline
  def apply(): ReadonlyExpectCtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyExpectCtOptions]
  }
  
  @scala.inline
  implicit class ReadonlyExpectCtOptionsOps[Self <: ReadonlyExpectCtOptions] (val x: Self) extends AnyVal {
    
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
    def setEnforce(value: Boolean): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setReportUri(value: String): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
  }
}
