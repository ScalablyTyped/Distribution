package typings.hyphen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<hyphen.hyphen.HyphenationOptions> */
@js.native
trait ReadonlyHyphenationOption extends js.Object {
  
  val debug: js.UndefOr[Boolean] = js.native
  
  val hyphenChar: js.UndefOr[String] = js.native
  
  val minWordLength: js.UndefOr[Double] = js.native
}
object ReadonlyHyphenationOption {
  
  @scala.inline
  def apply(): ReadonlyHyphenationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyHyphenationOption]
  }
  
  @scala.inline
  implicit class ReadonlyHyphenationOptionOps[Self <: ReadonlyHyphenationOption] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHyphenChar(value: String): Self = this.set("hyphenChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyphenChar: Self = this.set("hyphenChar", js.undefined)
    
    @scala.inline
    def setMinWordLength(value: Double): Self = this.set("minWordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWordLength: Self = this.set("minWordLength", js.undefined)
  }
}
