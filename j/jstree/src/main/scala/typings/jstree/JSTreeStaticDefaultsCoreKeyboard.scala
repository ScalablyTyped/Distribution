package typings.jstree

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSTreeStaticDefaultsCoreKeyboard extends StObject {
  
  @JSName("*")
  def Asterisk(e: Event): Unit
  
  def `ctrl-space`(e: Event): Unit
  
  def down(e: Event): Unit
  
  def end(e: Event): Unit
  
  def enter(e: Event): Unit
  
  def f2(e: Event): Unit
  
  def home(e: Event): Unit
  
  def left(e: Event): Unit
  
  def right(e: Event): Unit
  
  def up(e: Event): Unit
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
  implicit class JSTreeStaticDefaultsCoreKeyboardMutableBuilder[Self <: JSTreeStaticDefaultsCoreKeyboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsterisk(value: Event => Unit): Self = StObject.set(x, "*", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setCtrl-space`(value: Event => Unit): Self = StObject.set(x, "ctrl-space", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDown(value: Event => Unit): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: Event => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnter(value: Event => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setF2(value: Event => Unit): Self = StObject.set(x, "f2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHome(value: Event => Unit): Self = StObject.set(x, "home", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeft(value: Event => Unit): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRight(value: Event => Unit): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: Event => Unit): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
  }
}
