package typings.hyphen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<hyphen.hyphen.FactoryOptions> */
@js.native
trait ReadonlyFactoryOptions extends js.Object {
  
  val async: js.UndefOr[Boolean] = js.native
  
  val debug: js.UndefOr[Boolean] = js.native
  
  val html: js.UndefOr[Boolean] = js.native
  
  val hyphenChar: js.UndefOr[String] = js.native
  
  val minWordLength: js.UndefOr[Double] = js.native
}
object ReadonlyFactoryOptions {
  
  @scala.inline
  def apply(): ReadonlyFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyFactoryOptions]
  }
  
  @scala.inline
  implicit class ReadonlyFactoryOptionsOps[Self <: ReadonlyFactoryOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
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
