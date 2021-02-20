package typings.imageSize

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readUIntMod {
  
  @JSImport("image-size/dist/readUInt", "readUInt")
  @js.native
  def readUInt(buffer: Buffer, bits: Bits, offset: Double, isBigEndian: Boolean): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageSize.imageSizeNumbers.`16`
    - typings.imageSize.imageSizeNumbers.`32`
  */
  trait Bits extends StObject
  object Bits {
    
    @scala.inline
    def `16`: typings.imageSize.imageSizeNumbers.`16` = 16.asInstanceOf[typings.imageSize.imageSizeNumbers.`16`]
    
    @scala.inline
    def `32`: typings.imageSize.imageSizeNumbers.`32` = 32.asInstanceOf[typings.imageSize.imageSizeNumbers.`32`]
  }
}
