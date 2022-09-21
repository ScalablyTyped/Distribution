package typings.imapflow.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchObject extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var answered: js.UndefOr[Boolean] = js.undefined
  
  var bcc: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[js.Date | String] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var cc: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var emailId: js.UndefOr[String] = js.undefined
  
  var flagged: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[StringDictionary[Boolean | String]] = js.undefined
  
  var keyword: js.UndefOr[String] = js.undefined
  
  var larger: js.UndefOr[Double] = js.undefined
  
  var modseq: js.UndefOr[js.BigInt] = js.undefined
  
  var `new`: js.UndefOr[Boolean] = js.undefined
  
  var old: js.UndefOr[Boolean] = js.undefined
  
  var on: js.UndefOr[js.Date | String] = js.undefined
  
  var or: js.UndefOr[js.Array[SearchObject]] = js.undefined
  
  var recent: js.UndefOr[Boolean] = js.undefined
  
  var seen: js.UndefOr[Boolean] = js.undefined
  
  var sentBefore: js.UndefOr[js.Date | String] = js.undefined
  
  var sentOn: js.UndefOr[js.Date | String] = js.undefined
  
  var sentSince: js.UndefOr[js.Date | String] = js.undefined
  
  var seq: js.UndefOr[SequenceString] = js.undefined
  
  var since: js.UndefOr[js.Date | String] = js.undefined
  
  var smaller: js.UndefOr[Double] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var threadId: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var uid: js.UndefOr[SequenceString] = js.undefined
  
  var unKeyword: js.UndefOr[String] = js.undefined
}
object SearchObject {
  
  inline def apply(): SearchObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchObject]
  }
  
  extension [Self <: SearchObject](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAnswered(value: Boolean): Self = StObject.set(x, "answered", value.asInstanceOf[js.Any])
    
    inline def setAnsweredUndefined: Self = StObject.set(x, "answered", js.undefined)
    
    inline def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    inline def setBefore(value: js.Date | String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setEmailId(value: String): Self = StObject.set(x, "emailId", value.asInstanceOf[js.Any])
    
    inline def setEmailIdUndefined: Self = StObject.set(x, "emailId", js.undefined)
    
    inline def setFlagged(value: Boolean): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
    
    inline def setFlaggedUndefined: Self = StObject.set(x, "flagged", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHeader(value: StringDictionary[Boolean | String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setLarger(value: Double): Self = StObject.set(x, "larger", value.asInstanceOf[js.Any])
    
    inline def setLargerUndefined: Self = StObject.set(x, "larger", js.undefined)
    
    inline def setModseq(value: js.BigInt): Self = StObject.set(x, "modseq", value.asInstanceOf[js.Any])
    
    inline def setModseqUndefined: Self = StObject.set(x, "modseq", js.undefined)
    
    inline def setNew(value: Boolean): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setOld(value: Boolean): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
    
    inline def setOn(value: js.Date | String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOr(value: js.Array[SearchObject]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    inline def setOrVarargs(value: SearchObject*): Self = StObject.set(x, "or", js.Array(value*))
    
    inline def setRecent(value: Boolean): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
    
    inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
    
    inline def setSeen(value: Boolean): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    
    inline def setSeenUndefined: Self = StObject.set(x, "seen", js.undefined)
    
    inline def setSentBefore(value: js.Date | String): Self = StObject.set(x, "sentBefore", value.asInstanceOf[js.Any])
    
    inline def setSentBeforeUndefined: Self = StObject.set(x, "sentBefore", js.undefined)
    
    inline def setSentOn(value: js.Date | String): Self = StObject.set(x, "sentOn", value.asInstanceOf[js.Any])
    
    inline def setSentOnUndefined: Self = StObject.set(x, "sentOn", js.undefined)
    
    inline def setSentSince(value: js.Date | String): Self = StObject.set(x, "sentSince", value.asInstanceOf[js.Any])
    
    inline def setSentSinceUndefined: Self = StObject.set(x, "sentSince", js.undefined)
    
    inline def setSeq(value: SequenceString): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSeqUndefined: Self = StObject.set(x, "seq", js.undefined)
    
    inline def setSince(value: js.Date | String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setSmaller(value: Double): Self = StObject.set(x, "smaller", value.asInstanceOf[js.Any])
    
    inline def setSmallerUndefined: Self = StObject.set(x, "smaller", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setUid(value: SequenceString): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUnKeyword(value: String): Self = StObject.set(x, "unKeyword", value.asInstanceOf[js.Any])
    
    inline def setUnKeywordUndefined: Self = StObject.set(x, "unKeyword", js.undefined)
  }
}
