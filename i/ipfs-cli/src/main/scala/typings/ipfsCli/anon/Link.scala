package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Print
  
  var link: js.Any
  
  var root: js.Any
  
  var timeout: js.Any
}
object Link {
  
  @scala.inline
  def apply(cidBase: js.Any, ctx: Print, link: js.Any, root: js.Any, timeout: js.Any): Link = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: js.Any): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
