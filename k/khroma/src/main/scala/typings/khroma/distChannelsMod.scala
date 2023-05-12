package typings.khroma

import typings.khroma.distTypesMod.CHANNELS_
import typings.khroma.distTypesMod.HSLA
import typings.khroma.distTypesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChannelsMod {
  
  @JSImport("khroma/dist/channels", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Channels {
    def this(data: CHANNELS_) = this()
    def this(data: HSLA) = this()
    def this(data: RGBA) = this()
    def this(data: CHANNELS_, color: String) = this()
    def this(data: HSLA, color: String) = this()
    def this(data: RGBA, color: String) = this()
  }
  
  @js.native
  trait Channels extends StObject {
    
    def _ensureHSL(): Unit = js.native
    
    def _ensureRGB(): Unit = js.native
    
    def a: Double = js.native
    def a_=(a: Double): Unit = js.native
    
    def b: Double = js.native
    def b_=(b: Double): Unit = js.native
    
    var changed: Boolean = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var data: CHANNELS_ = js.native
    
    def g: Double = js.native
    def g_=(g: Double): Unit = js.native
    
    def h: Double = js.native
    def h_=(h: Double): Unit = js.native
    
    def l: Double = js.native
    def l_=(l: Double): Unit = js.native
    
    def r: Double = js.native
    def r_=(r: Double): Unit = js.native
    
    def s: Double = js.native
    def s_=(s: Double): Unit = js.native
    
    def set(data: CHANNELS_): this.type = js.native
    def set(data: CHANNELS_, color: String): this.type = js.native
    def set(data: HSLA): this.type = js.native
    def set(data: HSLA, color: String): this.type = js.native
    def set(data: RGBA): this.type = js.native
    def set(data: RGBA, color: String): this.type = js.native
    
    var `type`: typings.khroma.distChannelsTypeMod.default = js.native
  }
}
