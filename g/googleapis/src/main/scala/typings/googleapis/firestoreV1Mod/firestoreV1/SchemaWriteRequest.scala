package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Firestore.Write.  The first request creates a stream, or
  * resumes an existing one from a token.  When creating a new stream, the
  * server replies with a response containing only an ID and a token, to use in
  * the next request.  When resuming a stream, the server first streams any
  * responses later than the given token, then a response containing only an
  * up-to-date token, to use in the next request.
  */
trait SchemaWriteRequest extends StObject {
  
  /**
    * Labels associated with this write request.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The ID of the write stream to resume. This may only be set in the first
    * message. When left empty, a new write stream will be created.
    */
  var streamId: js.UndefOr[String] = js.undefined
  
  /**
    * A stream token that was previously sent by the server.  The client should
    * set this field to the token from the most recent WriteResponse it has
    * received. This acknowledges that the client has received responses up to
    * this token. After sending this token, earlier tokens may not be used
    * anymore.  The server may close the stream if there are too many
    * unacknowledged responses.  Leave this field unset when creating a new
    * stream. To resume a stream at a specific point, set this field and the
    * `stream_id` field.  Leave this field unset when creating a new stream.
    */
  var streamToken: js.UndefOr[String] = js.undefined
  
  /**
    * The writes to apply.  Always executed atomically and in order. This must
    * be empty on the first request. This may be empty on the last request.
    * This must not be empty on all other requests.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.undefined
}
object SchemaWriteRequest {
  
  inline def apply(): SchemaWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteRequest]
  }
  
  extension [Self <: SchemaWriteRequest](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamToken(value: String): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    inline def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    inline def setWrites(value: js.Array[SchemaWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: SchemaWrite*): Self = StObject.set(x, "writes", js.Array(value :_*))
  }
}
