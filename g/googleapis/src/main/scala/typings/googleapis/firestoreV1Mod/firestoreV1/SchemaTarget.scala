package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTarget extends StObject {
  
  /**
    * A target specified by a set of document names.
    */
  var documents: js.UndefOr[SchemaDocumentsTarget] = js.undefined
  
  /**
    * If the target should be removed once it is current and consistent.
    */
  var once: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A target specified by a query.
    */
  var query: js.UndefOr[SchemaQueryTarget] = js.undefined
  
  /**
    * Start listening after a specific `read_time`. The client must know the state of matching documents at this time.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A resume token from a prior TargetChange for an identical target. Using a resume token with a different target is unsupported and may fail.
    */
  var resumeToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target ID that identifies the target on the stream. Must be a positive number and non-zero.
    */
  var targetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTarget {
  
  inline def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  extension [Self <: SchemaTarget](x: Self) {
    
    inline def setDocuments(value: SchemaDocumentsTarget): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceNull: Self = StObject.set(x, "once", null)
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setQuery(value: SchemaQueryTarget): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
