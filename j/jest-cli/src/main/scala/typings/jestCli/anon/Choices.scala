package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Select between Babel and V8 to collect coverage`
import typings.jestCli.jestCliStrings.babel
import typings.jestCli.jestCliStrings.v8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Choices extends js.Object {
  
  val choices: js.Tuple2[babel, v8] = js.native
  
  val description: `Select between Babel and V8 to collect coverage` = js.native
}
object Choices {
  
  @scala.inline
  def apply(choices: js.Tuple2[babel, v8], description: `Select between Babel and V8 to collect coverage`): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  
  @scala.inline
  implicit class ChoicesOps[Self <: Choices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChoices(value: js.Tuple2[babel, v8]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: `Select between Babel and V8 to collect coverage`): Self = this.set("description", value.asInstanceOf[js.Any])
  }
}
