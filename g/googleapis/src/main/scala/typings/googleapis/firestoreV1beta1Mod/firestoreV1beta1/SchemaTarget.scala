package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specification of a set of documents to listen to.
  */
@js.native
trait SchemaTarget extends StObject {
  
  /**
    * A target specified by a set of document names.
    */
  var documents: js.UndefOr[SchemaDocumentsTarget] = js.native
  
  /**
    * If the target should be removed once it is current and consistent.
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * A target specified by a query.
    */
  var query: js.UndefOr[SchemaQueryTarget] = js.native
  
  /**
    * Start listening after a specific `read_time`.  The client must know the
    * state of matching documents at this time.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /**
    * A resume token from a prior TargetChange for an identical target.  Using
    * a resume token with a different target is unsupported and may fail.
    */
  var resumeToken: js.UndefOr[String] = js.native
  
  /**
    * A client provided target ID.  If not set, the server will assign an ID
    * for the target.  Used for resuming a target without changing IDs. The IDs
    * can either be client-assigned or be server-assigned in a previous stream.
    * All targets with client provided IDs must be added before adding a target
    * that needs a server-assigned id.
    */
  var targetId: js.UndefOr[Double] = js.native
}
object SchemaTarget {
  
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  @scala.inline
  implicit class SchemaTargetMutableBuilder[Self <: SchemaTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: SchemaDocumentsTarget): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaQueryTarget): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    @scala.inline
    def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
