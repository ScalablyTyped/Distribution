package typings.libp2pNoise

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payloadMod {
  
  object pb {
    
    /** Represents a NoiseHandshakePayload. */
    @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload")
    @js.native
    /**
      * Constructs a new NoiseHandshakePayload.
      * @param [properties] Properties to set
      */
    class NoiseHandshakePayload ()
      extends StObject
         with INoiseHandshakePayload {
      def this(properties: INoiseHandshakePayload) = this()
      
      /** NoiseHandshakePayload data. */
      @JSName("data")
      var data_NoiseHandshakePayload: Uint8Array = js.native
      
      /** NoiseHandshakePayload identityKey. */
      @JSName("identityKey")
      var identityKey_NoiseHandshakePayload: Uint8Array = js.native
      
      /** NoiseHandshakePayload identitySig. */
      @JSName("identitySig")
      var identitySig_NoiseHandshakePayload: Uint8Array = js.native
      
      /**
        * Converts this NoiseHandshakePayload to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object NoiseHandshakePayload {
      
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NoiseHandshakePayload instance using the specified properties.
        * @param [properties] Properties to set
        * @returns NoiseHandshakePayload instance
        */
      /* static member */
      inline def create(): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[NoiseHandshakePayload]
      inline def create(properties: INoiseHandshakePayload): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      
      /**
        * Decodes a NoiseHandshakePayload message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns NoiseHandshakePayload
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      inline def decode(reader: Reader, length: Double): NoiseHandshakePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[NoiseHandshakePayload]
      inline def decode(reader: Uint8Array): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      inline def decode(reader: Uint8Array, length: Double): NoiseHandshakePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[NoiseHandshakePayload]
      
      /**
        * Decodes a NoiseHandshakePayload message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns NoiseHandshakePayload
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      inline def decodeDelimited(reader: Uint8Array): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      
      /**
        * Encodes the specified NoiseHandshakePayload message. Does not implicitly {@link pb.NoiseHandshakePayload.verify|verify} messages.
        * @param message NoiseHandshakePayload message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: INoiseHandshakePayload): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: INoiseHandshakePayload, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified NoiseHandshakePayload message, length delimited. Does not implicitly {@link pb.NoiseHandshakePayload.verify|verify} messages.
        * @param message NoiseHandshakePayload message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: INoiseHandshakePayload): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: INoiseHandshakePayload, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a NoiseHandshakePayload message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns NoiseHandshakePayload
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      
      /**
        * Creates a plain object from a NoiseHandshakePayload message. Also converts values to other types if specified.
        * @param message NoiseHandshakePayload
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: NoiseHandshakePayload): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(message: NoiseHandshakePayload, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a NoiseHandshakePayload message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Properties of a NoiseHandshakePayload. */
    trait INoiseHandshakePayload extends StObject {
      
      /** NoiseHandshakePayload data */
      var data: js.UndefOr[Uint8Array | Null] = js.undefined
      
      /** NoiseHandshakePayload identityKey */
      var identityKey: js.UndefOr[Uint8Array | Null] = js.undefined
      
      /** NoiseHandshakePayload identitySig */
      var identitySig: js.UndefOr[Uint8Array | Null] = js.undefined
    }
    object INoiseHandshakePayload {
      
      inline def apply(): INoiseHandshakePayload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[INoiseHandshakePayload]
      }
      
      extension [Self <: INoiseHandshakePayload](x: Self) {
        
        inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataNull: Self = StObject.set(x, "data", null)
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setIdentityKey(value: Uint8Array): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
        
        inline def setIdentityKeyNull: Self = StObject.set(x, "identityKey", null)
        
        inline def setIdentityKeyUndefined: Self = StObject.set(x, "identityKey", js.undefined)
        
        inline def setIdentitySig(value: Uint8Array): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
        
        inline def setIdentitySigNull: Self = StObject.set(x, "identitySig", null)
        
        inline def setIdentitySigUndefined: Self = StObject.set(x, "identitySig", js.undefined)
      }
    }
  }
}
