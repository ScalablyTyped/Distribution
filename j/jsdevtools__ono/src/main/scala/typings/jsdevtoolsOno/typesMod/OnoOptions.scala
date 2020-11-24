package typings.jsdevtoolsOno.typesMod

import typings.jsdevtoolsOno.jsdevtoolsOnoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnoOptions extends js.Object {
  
  /**
    * When `Ono` is used to wrap an error, this setting determines whether the inner error's message
    * is appended to the new error message.
    *
    * Defaults to `true`.
    */
  var concatMessages: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that replaces placeholders like "%s" or "%d" in error messages with values.
    * If set to `false`, then error messages will be treated as literals and no placeholder replacement will occur.
    *
    * Defaults to `utils.inspect()` in Node.js.  Defaults to `Array.join()` in browsers.
    */
  var format: js.UndefOr[MessageFormatter | `false`] = js.native
}
object OnoOptions {
  
  @scala.inline
  def apply(): OnoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnoOptions]
  }
  
  @scala.inline
  implicit class OnoOptionsOps[Self <: OnoOptions] (val x: Self) extends AnyVal {
    
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
    def setConcatMessages(value: Boolean): Self = this.set("concatMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcatMessages: Self = this.set("concatMessages", js.undefined)
    
    @scala.inline
    def setFormatFunction2(value: (/* message */ String, /* repeated */ js.Any) => String): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormat(value: MessageFormatter | `false`): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
