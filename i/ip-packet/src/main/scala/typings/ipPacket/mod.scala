package typings.ipPacket

import typings.ipPacket.anon.Decode
import typings.ipPacket.ipPacketInts.`4`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip-packet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(options: Options): Decode = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Decode]
  
  object decode {
    
    inline def apply(buffer: Buffer): DecodedPacket = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[DecodedPacket]
    inline def apply(buffer: Buffer, start: Double): DecodedPacket = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[DecodedPacket]
    
    @JSImport("ip-packet", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ip-packet", "decode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  object encode {
    
    inline def apply(packet: Packet): Buffer = ^.asInstanceOf[js.Dynamic].apply(packet.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(packet: Packet, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(packet.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(packet: Packet, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(packet.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(packet: Packet, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(packet.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("ip-packet", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The amount of bytes used to encode the `Packet`. This property is set after each call to `encode()`.
      */
    @JSImport("ip-packet", "encode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  inline def encodingLength(packet: Packet): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(packet.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* Inlined parent std.Required<ip-packet.ip-packet.Packet> */
  trait DecodedPacket extends StObject {
    
    var checksum: Double
    
    var data: Buffer
    
    var destinationIp: String
    
    var dscp: Double
    
    var ecn: Double
    
    var flags: Double
    
    var fragmentOffset: Double
    
    var identification: Double
    
    var ihl: Double
    
    var length: Double
    
    var protocol: Double
    
    var sourceIp: String
    
    var ttl: Double
    
    var version: `4`
  }
  object DecodedPacket {
    
    inline def apply(
      checksum: Double,
      data: Buffer,
      destinationIp: String,
      dscp: Double,
      ecn: Double,
      flags: Double,
      fragmentOffset: Double,
      identification: Double,
      ihl: Double,
      length: Double,
      protocol: Double,
      sourceIp: String,
      ttl: Double
    ): DecodedPacket = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destinationIp = destinationIp.asInstanceOf[js.Any], dscp = dscp.asInstanceOf[js.Any], ecn = ecn.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fragmentOffset = fragmentOffset.asInstanceOf[js.Any], identification = identification.asInstanceOf[js.Any], ihl = ihl.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], version = 4)
      __obj.asInstanceOf[DecodedPacket]
    }
    
    extension [Self <: DecodedPacket](x: Self) {
      
      inline def setChecksum(value: Double): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDestinationIp(value: String): Self = StObject.set(x, "destinationIp", value.asInstanceOf[js.Any])
      
      inline def setDscp(value: Double): Self = StObject.set(x, "dscp", value.asInstanceOf[js.Any])
      
      inline def setEcn(value: Double): Self = StObject.set(x, "ecn", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFragmentOffset(value: Double): Self = StObject.set(x, "fragmentOffset", value.asInstanceOf[js.Any])
      
      inline def setIdentification(value: Double): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setIhl(value: Double): Self = StObject.set(x, "ihl", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Double): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `4`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * When decoding, ignore checksums set to `0x0000`.
      * @default false
      */
    var allowNullChecksum: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowNullChecksum(value: Boolean): Self = StObject.set(x, "allowNullChecksum", value.asInstanceOf[js.Any])
      
      inline def setAllowNullChecksumUndefined: Self = StObject.set(x, "allowNullChecksum", js.undefined)
    }
  }
  
  trait Packet extends StObject {
    
    var data: Buffer
    
    var destinationIp: String
    
    /** @default 0 */
    var dscp: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var ecn: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var flags: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var fragmentOffset: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var identification: js.UndefOr[Double] = js.undefined
    
    /** @default 5 */
    var ihl: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var protocol: js.UndefOr[Double] = js.undefined
    
    var sourceIp: String
    
    /** @default 0 */
    var ttl: js.UndefOr[Double] = js.undefined
    
    var version: `4`
  }
  object Packet {
    
    inline def apply(data: Buffer, destinationIp: String, sourceIp: String): Packet = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationIp = destinationIp.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], version = 4)
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDestinationIp(value: String): Self = StObject.set(x, "destinationIp", value.asInstanceOf[js.Any])
      
      inline def setDscp(value: Double): Self = StObject.set(x, "dscp", value.asInstanceOf[js.Any])
      
      inline def setDscpUndefined: Self = StObject.set(x, "dscp", js.undefined)
      
      inline def setEcn(value: Double): Self = StObject.set(x, "ecn", value.asInstanceOf[js.Any])
      
      inline def setEcnUndefined: Self = StObject.set(x, "ecn", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFragmentOffset(value: Double): Self = StObject.set(x, "fragmentOffset", value.asInstanceOf[js.Any])
      
      inline def setFragmentOffsetUndefined: Self = StObject.set(x, "fragmentOffset", js.undefined)
      
      inline def setIdentification(value: Double): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
      
      inline def setIhl(value: Double): Self = StObject.set(x, "ihl", value.asInstanceOf[js.Any])
      
      inline def setIhlUndefined: Self = StObject.set(x, "ihl", js.undefined)
      
      inline def setProtocol(value: Double): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setVersion(value: `4`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
