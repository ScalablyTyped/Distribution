package typings.howler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HowlListeners extends js.Object {
  
  /**
    * Fires when the sound finishes playing (if it is looping, it'll fire at the end of each loop).
    * The first parameter is the ID of the sound.
    */
  var onend: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the current sound finishes fading in/out. The first parameter is the ID of the sound.
    */
  var onfade: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound is loaded.
    */
  var onload: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound is unable to load. The first parameter is the ID of the sound (if it exists) and the second is the error message/code.
    */
  var onloaderror: js.UndefOr[HowlErrorCallback] = js.native
  
  /**
    * Fires when the sound has been muted/unmuted. The first parameter is the ID of the sound.
    */
  var onmute: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound has been paused. The first parameter is the ID of the sound.
    */
  var onpause: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound begins playing. The first parameter is the ID of the sound.
    */
  var onplay: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound is unable to play. The first parameter is the ID of the sound and the second is the error message/code.
    */
  var onplayerror: js.UndefOr[HowlErrorCallback] = js.native
  
  /**
    * Fires when the sound's playback rate has changed. The first parameter is the ID of the sound.
    */
  var onrate: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound has been seeked. The first parameter is the ID of the sound.
    */
  var onseek: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound has been stopped. The first parameter is the ID of the sound.
    */
  var onstop: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when audio has been automatically unlocked through a touch/click event.
    */
  var onunlock: js.UndefOr[HowlCallback] = js.native
  
  /**
    * Fires when the sound's volume has changed. The first parameter is the ID of the sound.
    */
  var onvolume: js.UndefOr[HowlCallback] = js.native
}
object HowlListeners {
  
  @scala.inline
  def apply(): HowlListeners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HowlListeners]
  }
  
  @scala.inline
  implicit class HowlListenersOps[Self <: HowlListeners] (val x: Self) extends AnyVal {
    
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
    def setOnend(value: /* soundId */ Double => Unit): Self = this.set("onend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnend: Self = this.set("onend", js.undefined)
    
    @scala.inline
    def setOnfade(value: /* soundId */ Double => Unit): Self = this.set("onfade", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnfade: Self = this.set("onfade", js.undefined)
    
    @scala.inline
    def setOnload(value: /* soundId */ Double => Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setOnloaderror(value: (/* soundId */ Double, /* error */ js.Any) => Unit): Self = this.set("onloaderror", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnloaderror: Self = this.set("onloaderror", js.undefined)
    
    @scala.inline
    def setOnmute(value: /* soundId */ Double => Unit): Self = this.set("onmute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmute: Self = this.set("onmute", js.undefined)
    
    @scala.inline
    def setOnpause(value: /* soundId */ Double => Unit): Self = this.set("onpause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    
    @scala.inline
    def setOnplay(value: /* soundId */ Double => Unit): Self = this.set("onplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    
    @scala.inline
    def setOnplayerror(value: (/* soundId */ Double, /* error */ js.Any) => Unit): Self = this.set("onplayerror", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnplayerror: Self = this.set("onplayerror", js.undefined)
    
    @scala.inline
    def setOnrate(value: /* soundId */ Double => Unit): Self = this.set("onrate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnrate: Self = this.set("onrate", js.undefined)
    
    @scala.inline
    def setOnseek(value: /* soundId */ Double => Unit): Self = this.set("onseek", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnseek: Self = this.set("onseek", js.undefined)
    
    @scala.inline
    def setOnstop(value: /* soundId */ Double => Unit): Self = this.set("onstop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnstop: Self = this.set("onstop", js.undefined)
    
    @scala.inline
    def setOnunlock(value: /* soundId */ Double => Unit): Self = this.set("onunlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnunlock: Self = this.set("onunlock", js.undefined)
    
    @scala.inline
    def setOnvolume(value: /* soundId */ Double => Unit): Self = this.set("onvolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnvolume: Self = this.set("onvolume", js.undefined)
  }
}
