package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group snippet.
  */
trait SchemaGroupSnippet extends StObject {
  
  /**
    * The date and time that the group was created. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The group name. The value must be a non-empty string.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGroupSnippet {
  
  @scala.inline
  def apply(): SchemaGroupSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupSnippet]
  }
  
  @scala.inline
  implicit class SchemaGroupSnippetMutableBuilder[Self <: SchemaGroupSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
