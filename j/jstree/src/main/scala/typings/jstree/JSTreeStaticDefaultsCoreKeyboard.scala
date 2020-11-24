package typings.jstree

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaultsCoreKeyboard extends js.Object {
  
  @JSName("*")
  def Asterisk(e: Event): Unit = js.native
  
  def `ctrl-space`(e: Event): Unit = js.native
  
  def down(e: Event): Unit = js.native
  
  def end(e: Event): Unit = js.native
  
  def enter(e: Event): Unit = js.native
  
  def f2(e: Event): Unit = js.native
  
  def home(e: Event): Unit = js.native
  
  def left(e: Event): Unit = js.native
  
  def right(e: Event): Unit = js.native
  
  def up(e: Event): Unit = js.native
}
object JSTreeStaticDefaultsCoreKeyboard {
  
  @scala.inline
  def apply(
    Asterisk: Event => Unit,
    `ctrl-space`: Event => Unit,
    down: Event => Unit,
    end: Event => Unit,
    enter: Event => Unit,
    f2: Event => Unit,
    home: Event => Unit,
    left: Event => Unit,
    right: Event => Unit,
    up: Event => Unit
  ): JSTreeStaticDefaultsCoreKeyboard = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), end = js.Any.fromFunction1(end), enter = js.Any.fromFunction1(enter), f2 = js.Any.fromFunction1(f2), home = js.Any.fromFunction1(home), left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right), up = js.Any.fromFunction1(up))
    __obj.updateDynamic("*")(js.Any.fromFunction1(Asterisk))
    __obj.updateDynamic("ctrl-space")(js.Any.fromFunction1(`ctrl-space`))
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreKeyboard]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreKeyboardOps[Self <: JSTreeStaticDefaultsCoreKeyboard] (val x: Self) extends AnyVal {
    
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
    def setAsterisk(value: Event => Unit): Self = this.set("*", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setCtrl-space`(value: Event => Unit): Self = this.set("ctrl-space", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDown(value: Event => Unit): Self = this.set("down", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: Event => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnter(value: Event => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setF2(value: Event => Unit): Self = this.set("f2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHome(value: Event => Unit): Self = this.set("home", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeft(value: Event => Unit): Self = this.set("left", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRight(value: Event => Unit): Self = this.set("right", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: Event => Unit): Self = this.set("up", js.Any.fromFunction1(value))
  }
}
