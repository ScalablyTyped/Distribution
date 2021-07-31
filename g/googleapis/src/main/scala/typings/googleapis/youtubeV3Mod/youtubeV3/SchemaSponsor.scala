package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sponsor resource represents a sponsor for a YouTube channel. A sponsor
  * provides recurring monetary support to a creator and receives special
  * benefits.
  */
trait SchemaSponsor extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#sponsor&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the sponsor.
    */
  var snippet: js.UndefOr[SchemaSponsorSnippet] = js.undefined
}
object SchemaSponsor {
  
  @scala.inline
  def apply(): SchemaSponsor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSponsor]
  }
  
  @scala.inline
  implicit class SchemaSponsorMutableBuilder[Self <: SchemaSponsor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaSponsorSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
