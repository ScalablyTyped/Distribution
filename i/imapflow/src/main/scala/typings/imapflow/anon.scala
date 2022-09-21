package typings.imapflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object AccessToken {
    
    inline def apply(user: String): AccessToken = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    extension [Self <: AccessToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangedSince extends StObject {
    
    var changedSince: js.BigInt
    
    var uid: js.UndefOr[Boolean] = js.undefined
  }
  object ChangedSince {
    
    inline def apply(changedSince: js.BigInt): ChangedSince = {
      val __obj = js.Dynamic.literal(changedSince = changedSince.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedSince]
    }
    
    extension [Self <: ChangedSince](x: Self) {
      
      inline def setChangedSince(value: js.BigInt): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait Charset extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var contentType: String
    
    var disposition: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Charset {
    
    inline def apply(contentType: String): Charset = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Charset]
    }
    
    extension [Self <: Charset](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait ChunkSize extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Boolean] = js.undefined
  }
  object ChunkSize {
    
    inline def apply(): ChunkSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChunkSize]
    }
    
    extension [Self <: ChunkSize](x: Self) {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait HighestModseq extends StObject {
    
    var highestModseq: Boolean
    
    var messages: Boolean
    
    var recent: Boolean
    
    var uidNext: Boolean
    
    var uidValidity: Boolean
    
    var unseen: Boolean
  }
  object HighestModseq {
    
    inline def apply(
      highestModseq: Boolean,
      messages: Boolean,
      recent: Boolean,
      uidNext: Boolean,
      uidValidity: Boolean,
      unseen: Boolean
    ): HighestModseq = {
      val __obj = js.Dynamic.literal(highestModseq = highestModseq.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], uidNext = uidNext.asInstanceOf[js.Any], uidValidity = uidValidity.asInstanceOf[js.Any], unseen = unseen.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighestModseq]
    }
    
    extension [Self <: HighestModseq](x: Self) {
      
      inline def setHighestModseq(value: Boolean): Self = StObject.set(x, "highestModseq", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: Boolean): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setRecent(value: Boolean): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      inline def setUidNext(value: Boolean): Self = StObject.set(x, "uidNext", value.asInstanceOf[js.Any])
      
      inline def setUidValidity(value: Boolean): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
      
      inline def setUnseen(value: Boolean): Self = StObject.set(x, "unseen", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadOnly_ extends StObject {
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ReadOnly_ {
    
    inline def apply(): ReadOnly_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOnly_]
    }
    
    extension [Self <: ReadOnly_](x: Self) {
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  trait Readonly extends StObject {
    
    var readonly: js.UndefOr[Boolean] = js.undefined
  }
  object Readonly {
    
    inline def apply(): Readonly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Readonly]
    }
    
    extension [Self <: Readonly](x: Self) {
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    }
  }
  
  trait Uid extends StObject {
    
    var uid: js.UndefOr[Boolean] = js.undefined
  }
  object Uid {
    
    inline def apply(): Uid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Uid]
    }
    
    extension [Self <: Uid](x: Self) {
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait UnchangedSince extends StObject {
    
    var uid: js.UndefOr[Boolean] = js.undefined
    
    var unchangedSince: js.UndefOr[js.BigInt] = js.undefined
    
    var useLabels: js.UndefOr[Boolean] = js.undefined
  }
  object UnchangedSince {
    
    inline def apply(): UnchangedSince = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnchangedSince]
    }
    
    extension [Self <: UnchangedSince](x: Self) {
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUnchangedSince(value: js.BigInt): Self = StObject.set(x, "unchangedSince", value.asInstanceOf[js.Any])
      
      inline def setUnchangedSinceUndefined: Self = StObject.set(x, "unchangedSince", js.undefined)
      
      inline def setUseLabels(value: Boolean): Self = StObject.set(x, "useLabels", value.asInstanceOf[js.Any])
      
      inline def setUseLabelsUndefined: Self = StObject.set(x, "useLabels", js.undefined)
    }
  }
}
