package typings.guacamoleClient.mod

import typings.guacamoleClient.guacamoleClientInts.`0x1`
import typings.guacamoleClient.guacamoleClientInts.`0x2`
import typings.guacamoleClient.guacamoleClientInts.`0x4`
import typings.guacamoleClient.guacamoleClientInts.`0x6`
import typings.guacamoleClient.guacamoleClientInts.`0x8`
import typings.guacamoleClient.guacamoleClientInts.`0x9`
import typings.guacamoleClient.guacamoleClientInts.`0xa`
import typings.guacamoleClient.guacamoleClientInts.`0xb`
import typings.guacamoleClient.guacamoleClientInts.`0xc`
import typings.guacamoleClient.guacamoleClientInts.`0xe`
import typings.guacamoleClient.guacamoleClientInts.`0xf`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Layer")
@js.native
open class Layer protected ()
  extends typings.guacamoleClient.layerMod.Layer {
  /**
    * @param width The width of the Layer, in pixels. The canvas element
    * backing this Layer will be given this width.
    * @param height The height of the Layer, in pixels. The canvas element
    * backing this Layer will be given this height.
    */
  def this(width: Double, height: Double) = this()
}
/* static members */
object Layer {
  
  /**
    * Channel mask for the composite operation "atop".
    */
  @JSImport("guacamole-client", "Layer.ATOP")
  @js.native
  val ATOP: `0x6` = js.native
  
  /**
    * Channel mask for the composite operation "in".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  @JSImport("guacamole-client", "Layer.IN")
  @js.native
  val IN: `0x4` = js.native
  
  /**
    * Channel mask for the composite operation "out".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  @JSImport("guacamole-client", "Layer.OUT")
  @js.native
  val OUT: `0x8` = js.native
  
  /**
    * Channel mask for the composite operation "over".
    */
  @JSImport("guacamole-client", "Layer.OVER")
  @js.native
  val OVER: `0xe` = js.native
  
  /**
    * Channel mask for the composite operation "plus".
    */
  @JSImport("guacamole-client", "Layer.PLUS")
  @js.native
  val PLUS: `0xf` = js.native
  
  @JSImport("guacamole-client", "Layer.Pixel")
  @js.native
  open class Pixel protected ()
    extends typings.guacamoleClient.layerMod.Layer.Pixel {
    /**
      * @param r The red component of this pixel.
      * @param g The green component of this pixel.
      * @param b The blue component of this pixel.
      * @param a The alpha component of this pixel.
      */
    def this(r: Double, g: Double, b: Double, a: Double) = this()
  }
  
  /**
    * Channel mask for the composite operation "ratop".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  @JSImport("guacamole-client", "Layer.RATOP")
  @js.native
  val RATOP: `0x9` = js.native
  
  /**
    * Channel mask for the composite operation "rin".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  @JSImport("guacamole-client", "Layer.RIN")
  @js.native
  val RIN: `0x1` = js.native
  
  /**
    * Channel mask for the composite operation "rout".
    */
  @JSImport("guacamole-client", "Layer.ROUT")
  @js.native
  val ROUT: `0x2` = js.native
  
  /**
    * Channel mask for the composite operation "rover".
    */
  @JSImport("guacamole-client", "Layer.ROVER")
  @js.native
  val ROVER: `0xb` = js.native
  
  /**
    * Channel mask for the composite operation "src".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  @JSImport("guacamole-client", "Layer.SRC")
  @js.native
  val SRC: `0xc` = js.native
  
  /**
    * Channel mask for the composite operation "xor".
    */
  @JSImport("guacamole-client", "Layer.XOR")
  @js.native
  val XOR: `0xa` = js.native
}
