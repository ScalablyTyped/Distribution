package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeystrokeSequence extends js.Object {
  
  var keystrokeSequence: String = js.native
  
  var windows: String = js.native
}
object KeystrokeSequence {
  
  @scala.inline
  def apply(keystrokeSequence: String, windows: String): KeystrokeSequence = {
    val __obj = js.Dynamic.literal(keystrokeSequence = keystrokeSequence.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystrokeSequence]
  }
  
  @scala.inline
  implicit class KeystrokeSequenceOps[Self <: KeystrokeSequence] (val x: Self) extends AnyVal {
    
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
    def setKeystrokeSequence(value: String): Self = this.set("keystrokeSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindows(value: String): Self = this.set("windows", value.asInstanceOf[js.Any])
  }
}
