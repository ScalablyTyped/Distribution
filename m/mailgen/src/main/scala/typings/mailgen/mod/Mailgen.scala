package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Created by kiettv on 7/24/16.
  */
@js.native
trait Mailgen extends js.Object {
  
  def cacheThemes(): Unit = js.native
  
  def generate(params: Content): js.Any = js.native
  
  def generatePlaintext(params: Content): js.Any = js.native
  
  def parseParams(params: js.Any): js.Any = js.native
}
object Mailgen {
  
  @scala.inline
  def apply(
    cacheThemes: () => Unit,
    generate: Content => js.Any,
    generatePlaintext: Content => js.Any,
    parseParams: js.Any => js.Any
  ): Mailgen = {
    val __obj = js.Dynamic.literal(cacheThemes = js.Any.fromFunction0(cacheThemes), generate = js.Any.fromFunction1(generate), generatePlaintext = js.Any.fromFunction1(generatePlaintext), parseParams = js.Any.fromFunction1(parseParams))
    __obj.asInstanceOf[Mailgen]
  }
  
  @scala.inline
  implicit class MailgenOps[Self <: Mailgen] (val x: Self) extends AnyVal {
    
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
    def setCacheThemes(value: () => Unit): Self = this.set("cacheThemes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerate(value: Content => js.Any): Self = this.set("generate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeneratePlaintext(value: Content => js.Any): Self = this.set("generatePlaintext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseParams(value: js.Any => js.Any): Self = this.set("parseParams", js.Any.fromFunction1(value))
  }
}
