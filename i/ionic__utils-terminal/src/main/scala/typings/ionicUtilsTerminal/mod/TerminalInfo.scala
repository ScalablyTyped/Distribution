package typings.ionicUtilsTerminal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalInfo extends js.Object {
  
  /**
    * Whether this is in CI or not.
    */
  val ci: Boolean = js.native
  
  /**
    * Path to the user's shell program.
    */
  val shell: String = js.native
  
  /**
    * Whether the terminal is an interactive TTY or not.
    */
  val tty: Boolean = js.native
  
  /**
    * Whether this is a Windows shell or not.
    */
  val windows: Boolean = js.native
}
object TerminalInfo {
  
  @scala.inline
  def apply(ci: Boolean, shell: String, tty: Boolean, windows: Boolean): TerminalInfo = {
    val __obj = js.Dynamic.literal(ci = ci.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalInfo]
  }
  
  @scala.inline
  implicit class TerminalInfoOps[Self <: TerminalInfo] (val x: Self) extends AnyVal {
    
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
    def setCi(value: Boolean): Self = this.set("ci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: Boolean): Self = this.set("tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("windows", value.asInstanceOf[js.Any])
  }
}
