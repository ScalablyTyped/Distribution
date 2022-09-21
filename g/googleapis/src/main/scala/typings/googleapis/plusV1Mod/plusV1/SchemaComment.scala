package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.anon.IdUrl
import typings.googleapis.anon.ObjectType
import typings.googleapis.anon.Verification
import typings.googleapis.anon.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComment extends StObject {
  
  /**
    * The person who posted this comment.
    */
  var actor: js.UndefOr[Verification | Null] = js.undefined
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of this comment.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The activity this comment replied to.
    */
  var inReplyTo: js.UndefOr[js.Array[IdUrl] | Null] = js.undefined
  
  /**
    * Identifies this resource as a comment. Value: &quot;plus#comment&quot;.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object of this comment.
    */
  var `object`: js.UndefOr[ObjectType | Null] = js.undefined
  
  /**
    * People who +1&#39;d this comment.
    */
  var plusoners: js.UndefOr[`12` | Null] = js.undefined
  
  /**
    * The time at which this comment was initially published. Formatted as an RFC 3339 timestamp.
    */
  var published: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to this comment resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which this comment was last updated. Formatted as an RFC 3339 timestamp.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This comment&#39;s verb, indicating what action was performed. Possible values are:   - &quot;post&quot; - Publish content to the stream.
    */
  var verb: js.UndefOr[String | Null] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setActor(value: Verification): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInReplyTo(value: js.Array[IdUrl]): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setInReplyToNull: Self = StObject.set(x, "inReplyTo", null)
    
    inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    inline def setInReplyToVarargs(value: IdUrl*): Self = StObject.set(x, "inReplyTo", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObject(value: ObjectType): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectNull: Self = StObject.set(x, "object", null)
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setPlusoners(value: `12`): Self = StObject.set(x, "plusoners", value.asInstanceOf[js.Any])
    
    inline def setPlusonersNull: Self = StObject.set(x, "plusoners", null)
    
    inline def setPlusonersUndefined: Self = StObject.set(x, "plusoners", js.undefined)
    
    inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedNull: Self = StObject.set(x, "published", null)
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbNull: Self = StObject.set(x, "verb", null)
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
