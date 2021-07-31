package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of Page that are only relevant for pages with page_type
  * NOTES.
  */
trait SchemaNotesProperties extends StObject {
  
  /**
    * The object ID of the shape on this notes page that contains the speaker
    * notes for the corresponding slide. The actual shape may not always exist
    * on the notes page. Inserting text using this object ID will automatically
    * create the shape. In this case, the actual shape may have different
    * object ID. The `GetPresentation` or `GetPage` action will always return
    * the latest object ID.
    */
  var speakerNotesObjectId: js.UndefOr[String] = js.undefined
}
object SchemaNotesProperties {
  
  @scala.inline
  def apply(): SchemaNotesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotesProperties]
  }
  
  @scala.inline
  implicit class SchemaNotesPropertiesMutableBuilder[Self <: SchemaNotesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpeakerNotesObjectId(value: String): Self = StObject.set(x, "speakerNotesObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerNotesObjectIdUndefined: Self = StObject.set(x, "speakerNotesObjectId", js.undefined)
  }
}
