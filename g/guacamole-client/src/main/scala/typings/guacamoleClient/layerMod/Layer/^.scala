package typings.guacamoleClient.layerMod.Layer

import typings.guacamoleClient.guacamoleClientNumbers.`0x1`
import typings.guacamoleClient.guacamoleClientNumbers.`0x2`
import typings.guacamoleClient.guacamoleClientNumbers.`0x4`
import typings.guacamoleClient.guacamoleClientNumbers.`0x6`
import typings.guacamoleClient.guacamoleClientNumbers.`0x8`
import typings.guacamoleClient.guacamoleClientNumbers.`0x9`
import typings.guacamoleClient.guacamoleClientNumbers.`0xa`
import typings.guacamoleClient.guacamoleClientNumbers.`0xb`
import typings.guacamoleClient.guacamoleClientNumbers.`0xc`
import typings.guacamoleClient.guacamoleClientNumbers.`0xe`
import typings.guacamoleClient.guacamoleClientNumbers.`0xf`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/Layer", "Layer")
@js.native
object ^ extends js.Object {
  
  /**
    * Channel mask for the composite operation "atop".
    */
  val ATOP: `0x6` = js.native
  
  /**
    * Channel mask for the composite operation "in".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  val IN: `0x4` = js.native
  
  /**
    * Channel mask for the composite operation "out".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  val OUT: `0x8` = js.native
  
  /**
    * Channel mask for the composite operation "over".
    */
  val OVER: `0xe` = js.native
  
  /**
    * Channel mask for the composite operation "plus".
    */
  val PLUS: `0xf` = js.native
  
  /**
    * Channel mask for the composite operation "ratop".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  val RATOP: `0x9` = js.native
  
  /**
    * Channel mask for the composite operation "rin".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  val RIN: `0x1` = js.native
  
  /**
    * Channel mask for the composite operation "rout".
    */
  val ROUT: `0x2` = js.native
  
  /**
    * Channel mask for the composite operation "rover".
    */
  val ROVER: `0xb` = js.native
  
  /**
    * Channel mask for the composite operation "src".
    * Beware that WebKit-based browsers may leave the contents of the destionation
    * layer where the source layer is transparent, despite the definition of this
    * operation.
    */
  val SRC: `0xc` = js.native
  
  /**
    * Channel mask for the composite operation "xor".
    */
  val XOR: `0xa` = js.native
}
