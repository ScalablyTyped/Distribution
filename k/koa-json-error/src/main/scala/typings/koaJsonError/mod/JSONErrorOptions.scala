package typings.koaJsonError.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONErrorOptions extends js.Object {
  
  /**
    * Runs inmediatly after `options.preFormat`. It receives two arguments: the original `err` and the output of     `options.preFormat`. It should `return` a newly formatted error.
    */
  var format: js.UndefOr[js.Function2[/* err */ Error, /* obj */ js.Any, _]] = js.native
  
  /**
    * Runs inmediatly after `options.format`. It receives two arguments: the original `err` and the output of   `options.format`.   It should `return` a newly formatted error.
    */
  var postFormat: js.UndefOr[js.Function2[/* err */ Error, /* obj */ js.Any, _]] = js.native
  
  /**
    * Perform some task before calling `options.format`. Must be a function with the original err as its only argument.
    */
  var preFormat: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
}
object JSONErrorOptions {
  
  @scala.inline
  def apply(): JSONErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONErrorOptions]
  }
  
  @scala.inline
  implicit class JSONErrorOptionsOps[Self <: JSONErrorOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: (/* err */ Error, /* obj */ js.Any) => _): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setPostFormat(value: (/* err */ Error, /* obj */ js.Any) => _): Self = this.set("postFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostFormat: Self = this.set("postFormat", js.undefined)
    
    @scala.inline
    def setPreFormat(value: /* err */ Error => _): Self = this.set("preFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreFormat: Self = this.set("preFormat", js.undefined)
  }
}
