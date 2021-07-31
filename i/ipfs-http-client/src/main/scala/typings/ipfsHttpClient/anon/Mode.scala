package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: js.Any
  
  var mtime: js.Any
  
  var mtimeNsecs: js.Any
}
object Mode {
  
  @scala.inline
  def apply(mode: js.Any, mtime: js.Any, mtimeNsecs: js.Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: js.Any): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeNsecs(value: js.Any): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
  }
}
