package typings.logkitty.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParser extends js.Object {
  
  def parseMessages(messages: js.Array[String]): js.Array[Entry] = js.native
  
  def splitMessages(data: String): js.Array[String] = js.native
}
object IParser {
  
  @scala.inline
  def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): IParser = {
    val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
    __obj.asInstanceOf[IParser]
  }
  
  @scala.inline
  implicit class IParserOps[Self <: IParser] (val x: Self) extends AnyVal {
    
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
    def setParseMessages(value: js.Array[String] => js.Array[Entry]): Self = this.set("parseMessages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitMessages(value: String => js.Array[String]): Self = this.set("splitMessages", js.Any.fromFunction1(value))
  }
}
