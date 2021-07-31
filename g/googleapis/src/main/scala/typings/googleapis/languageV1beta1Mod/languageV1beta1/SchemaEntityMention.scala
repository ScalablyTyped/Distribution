package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a mention for an entity in the text. Currently, proper noun
  * mentions are supported.
  */
trait SchemaEntityMention extends StObject {
  
  /**
    * The mention text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.undefined
  
  /**
    * The type of the entity mention.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaEntityMention {
  
  @scala.inline
  def apply(): SchemaEntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityMention]
  }
  
  @scala.inline
  implicit class SchemaEntityMentionMutableBuilder[Self <: SchemaEntityMention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: SchemaTextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
