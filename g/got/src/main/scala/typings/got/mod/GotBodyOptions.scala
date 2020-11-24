package typings.got.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotBodyOptions[E /* <: String | Null */] extends GotOptions[E] {
  
  var body: js.UndefOr[String | Buffer | Readable] = js.native
  
  var hooks: js.UndefOr[Hooks[GotBodyOptions[E], String | Buffer | Readable]] = js.native
}
object GotBodyOptions {
  
  @scala.inline
  def apply[E /* <: String | Null */](): GotBodyOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotBodyOptions[E]]
  }
  
  @scala.inline
  implicit class GotBodyOptionsOps[Self <: GotBodyOptions[_], E /* <: String | Null */] (val x: Self with GotBodyOptions[E]) extends AnyVal {
    
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
    def setBody(value: String | Buffer | Readable): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHooks(value: Hooks[GotBodyOptions[E], String | Buffer | Readable]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
  }
}
