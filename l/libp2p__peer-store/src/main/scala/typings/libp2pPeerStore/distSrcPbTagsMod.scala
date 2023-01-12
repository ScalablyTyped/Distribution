package typings.libp2pPeerStore

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPbTagsMod {
  
  trait Tag extends StObject {
    
    var expiry: js.UndefOr[js.BigInt] = js.undefined
    
    var name: String
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object Tag {
    
    inline def apply(name: String): Tag = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/tags", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Tag]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Tag]
    inline def decode(buf: Uint8ArrayList): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    inline def encode(obj: Tag): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      inline def setExpiry(value: js.BigInt): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Tags extends StObject {
    
    var tags: js.Array[Tag]
  }
  object Tags {
    
    inline def apply(tags: js.Array[Tag]): Tags = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tags]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/tags", "Tags")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Tags] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Tags]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Tags = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Tags]
    inline def decode(buf: Uint8ArrayList): Tags = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Tags]
    
    inline def encode(obj: Tags): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
