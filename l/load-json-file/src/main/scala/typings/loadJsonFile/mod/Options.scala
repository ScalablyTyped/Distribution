package typings.loadJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Applies a function to the JSON string before parsing.
  		*/
  val beforeParse: js.UndefOr[BeforeParse] = js.native
  
  /**
  		Prescribes how the value originally produced by parsing is transformed, before being returned.
  		See the [`JSON.parse` docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Using_the_reviver_parameter) for more.
  		*/
  val reviver: js.UndefOr[Reviver] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBeforeParse(value: /* data */ String => String): Self = this.set("beforeParse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeParse: Self = this.set("beforeParse", js.undefined)
    
    @scala.inline
    def setReviver(value: Reviver): Self = this.set("reviver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
  }
}
