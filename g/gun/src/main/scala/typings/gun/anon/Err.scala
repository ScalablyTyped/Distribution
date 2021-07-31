package typings.gun.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Err extends StObject {
  
  var err: Error
  
  var ok: js.Any
}
object Err {
  
  @scala.inline
  def apply(err: Error, ok: js.Any): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  
  @scala.inline
  implicit class ErrMutableBuilder[Self <: Err] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: js.Any): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
