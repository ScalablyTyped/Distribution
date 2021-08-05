package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.IdUrl
import typings.googleapis.anon.ObjectType
import typings.googleapis.anon.Verification
import typings.googleapis.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComment extends StObject {
  
  /**
    * The person who posted this comment.
    */
  var actor: js.UndefOr[Verification] = js.undefined
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this comment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The activity this comment replied to.
    */
  var inReplyTo: js.UndefOr[js.Array[IdUrl]] = js.undefined
  
  /**
    * Identifies this resource as a comment. Value: &quot;plus#comment&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The object of this comment.
    */
  var `object`: js.UndefOr[ObjectType] = js.undefined
  
  /**
    * People who +1&#39;d this comment.
    */
  var plusoners: js.UndefOr[`7`] = js.undefined
  
  /**
    * The time at which this comment was initially published. Formatted as an
    * RFC 3339 timestamp.
    */
  var published: js.UndefOr[String] = js.undefined
  
  /**
    * Link to this comment resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this comment was last updated. Formatted as an RFC 3339
    * timestamp.
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * This comment&#39;s verb, indicating what action was performed. Possible
    * values are:   - &quot;post&quot; - Publish content to the stream.
    */
  var verb: js.UndefOr[String] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setActor(value: Verification): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInReplyTo(value: js.Array[IdUrl]): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    inline def setInReplyToVarargs(value: IdUrl*): Self = StObject.set(x, "inReplyTo", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObject(value: ObjectType): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setPlusoners(value: `7`): Self = StObject.set(x, "plusoners", value.asInstanceOf[js.Any])
    
    inline def setPlusonersUndefined: Self = StObject.set(x, "plusoners", js.undefined)
    
    inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
