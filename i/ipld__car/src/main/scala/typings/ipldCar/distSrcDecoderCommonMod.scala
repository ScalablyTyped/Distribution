package typings.ipldCar

import typings.ipldCar.distSrcCodingMod.CarV2FixedHeader
import typings.ipldCar.distSrcCodingMod.Seekable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecoderCommonMod {
  
  @JSImport("@ipld/car/dist/src/decoder-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CIDV0_BYTES {
    
    @JSImport("@ipld/car/dist/src/decoder-common", "CIDV0_BYTES.DAG_PB")
    @js.native
    val DAG_PB: Double = js.native
    
    @JSImport("@ipld/car/dist/src/decoder-common", "CIDV0_BYTES.LENGTH")
    @js.native
    val LENGTH: Double = js.native
    
    @JSImport("@ipld/car/dist/src/decoder-common", "CIDV0_BYTES.SHA2_256")
    @js.native
    val SHA2_256: Double = js.native
  }
  
  @JSImport("@ipld/car/dist/src/decoder-common", "V2_HEADER_LENGTH")
  @js.native
  val V2_HEADER_LENGTH: Double = js.native
  
  inline def decodeV2Header(bytes: js.typedarray.Uint8Array): CarV2FixedHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeV2Header")(bytes.asInstanceOf[js.Any]).asInstanceOf[CarV2FixedHeader]
  
  inline def decodeVarint(bytes: js.typedarray.Uint8Array, seeker: Seekable): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeVarint")(bytes.asInstanceOf[js.Any], seeker.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getMultihashLength(bytes: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultihashLength")(bytes.asInstanceOf[js.Any]).asInstanceOf[Double]
}
