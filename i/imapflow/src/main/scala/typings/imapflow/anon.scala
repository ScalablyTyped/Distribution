package typings.imapflow

import typings.imapflow.mod.StatusQuery
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangedSince] (val x: Self) extends AnyVal {
      
      inline def setChangedSince(value: js.BigInt): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait Charset extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var contentType: String
    
    var disposition: js.UndefOr[String] = js.undefined
    
    var expectedSize: Double
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Charset {
    
    inline def apply(contentType: String, expectedSize: Double): Charset = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], expectedSize = expectedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Charset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Charset] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      inline def setExpectedSize(value: Double): Self = StObject.set(x, "expectedSize", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkSize] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait HighestModseq extends StObject {
    
    var highestModseq: js.UndefOr[Boolean] = js.undefined
    
    var messages: js.UndefOr[Boolean] = js.undefined
    
    var recent: js.UndefOr[Boolean] = js.undefined
    
    var uidNext: js.UndefOr[Boolean] = js.undefined
    
    var uidValidity: js.UndefOr[Boolean] = js.undefined
    
    var unseen: js.UndefOr[Boolean] = js.undefined
  }
  object HighestModseq {
    
    inline def apply(): HighestModseq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighestModseq]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighestModseq] (val x: Self) extends AnyVal {
      
      inline def setHighestModseq(value: Boolean): Self = StObject.set(x, "highestModseq", value.asInstanceOf[js.Any])
      
      inline def setHighestModseqUndefined: Self = StObject.set(x, "highestModseq", js.undefined)
      
      inline def setMessages(value: Boolean): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setRecent(value: Boolean): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
      
      inline def setUidNext(value: Boolean): Self = StObject.set(x, "uidNext", value.asInstanceOf[js.Any])
      
      inline def setUidNextUndefined: Self = StObject.set(x, "uidNext", js.undefined)
      
      inline def setUidValidity(value: Boolean): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
      
      inline def setUidValidityUndefined: Self = StObject.set(x, "uidValidity", js.undefined)
      
      inline def setUnseen(value: Boolean): Self = StObject.set(x, "unseen", value.asInstanceOf[js.Any])
      
      inline def setUnseenUndefined: Self = StObject.set(x, "unseen", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOnly_] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Readonly] (val x: Self) extends AnyVal {
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    }
  }
  
  trait SpecialUseHints extends StObject {
    
    var specialUseHints: js.UndefOr[typings.imapflow.mod.SpecialUseHints] = js.undefined
    
    var statusQuery: js.UndefOr[StatusQuery] = js.undefined
  }
  object SpecialUseHints {
    
    inline def apply(): SpecialUseHints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecialUseHints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpecialUseHints] (val x: Self) extends AnyVal {
      
      inline def setSpecialUseHints(value: typings.imapflow.mod.SpecialUseHints): Self = StObject.set(x, "specialUseHints", value.asInstanceOf[js.Any])
      
      inline def setSpecialUseHintsUndefined: Self = StObject.set(x, "specialUseHints", js.undefined)
      
      inline def setStatusQuery(value: StatusQuery): Self = StObject.set(x, "statusQuery", value.asInstanceOf[js.Any])
      
      inline def setStatusQueryUndefined: Self = StObject.set(x, "statusQuery", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Uid] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnchangedSince] (val x: Self) extends AnyVal {
      
      inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUnchangedSince(value: js.BigInt): Self = StObject.set(x, "unchangedSince", value.asInstanceOf[js.Any])
      
      inline def setUnchangedSinceUndefined: Self = StObject.set(x, "unchangedSince", js.undefined)
      
      inline def setUseLabels(value: Boolean): Self = StObject.set(x, "useLabels", value.asInstanceOf[js.Any])
      
      inline def setUseLabelsUndefined: Self = StObject.set(x, "useLabels", js.undefined)
    }
  }
}
