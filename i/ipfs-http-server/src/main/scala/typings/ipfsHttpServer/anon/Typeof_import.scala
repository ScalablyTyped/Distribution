package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeof_import extends js.Object {
  
  val options_8: Typeofoptions8Validate4 = js.native
}
object Typeof_import {
  
  @scala.inline
  def apply(options_8: Typeofoptions8Validate4): Typeof_import = {
    val __obj = js.Dynamic.literal(options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeof_import]
  }
  
  @scala.inline
  implicit class Typeof_importOps[Self <: Typeof_import] (val x: Self) extends AnyVal {
    
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
    def setOptions_8(value: Typeofoptions8Validate4): Self = this.set("options_8", value.asInstanceOf[js.Any])
  }
}
