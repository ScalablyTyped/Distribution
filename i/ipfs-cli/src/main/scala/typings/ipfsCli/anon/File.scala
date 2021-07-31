package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var ctx: IsDaemon
  
  var file: js.Any
  
  var timeout: js.Any
}
object File {
  
  @scala.inline
  def apply(ctx: IsDaemon, file: js.Any, timeout: js.Any): File = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: IsDaemon): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
