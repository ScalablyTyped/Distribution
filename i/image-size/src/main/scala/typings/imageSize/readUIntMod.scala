package typings.imageSize

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readUIntMod {
  
  @JSImport("image-size/dist/readUInt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readUInt(buffer: Buffer, bits: Bits, offset: Double, isBigEndian: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], isBigEndian.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageSize.imageSizeInts.`16`
    - typings.imageSize.imageSizeInts.`32`
  */
  trait Bits extends StObject
  object Bits {
    
    inline def `16`: typings.imageSize.imageSizeInts.`16` = 16.asInstanceOf[typings.imageSize.imageSizeInts.`16`]
    
    inline def `32`: typings.imageSize.imageSizeInts.`32` = 32.asInstanceOf[typings.imageSize.imageSizeInts.`32`]
  }
}
