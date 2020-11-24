package typings.jsonSchemaCompare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Ignores certain keywords, useful to exclude meta keywords like title,
    * description etc or custom keywords. If all you want to know if they are
    * the same in terms of validation keywords.
    *
    * @default []
    */
  var ignore: js.UndefOr[js.Array[JSONSchemaKeys]] = js.native
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
    def setIgnoreVarargs(value: JSONSchemaKeys*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[JSONSchemaKeys]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
  }
}
