package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of Page that are only relevant for pages with page_type
  * SLIDE.
  */
trait SchemaSlideProperties extends StObject {
  
  /**
    * The object ID of the layout that this slide is based on. This property is
    * read-only.
    */
  var layoutObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The object ID of the master that this slide is based on. This property is
    * read-only.
    */
  var masterObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The notes page that this slide is associated with. It defines the visual
    * appearance of a notes page when printing or exporting slides with speaker
    * notes. A notes page inherits properties from the notes master. The
    * placeholder shape with type BODY on the notes page contains the speaker
    * notes for this slide. The ID of this shape is identified by the
    * speakerNotesObjectId field. The notes page is read-only except for the
    * text content and styles of the speaker notes shape. This property is
    * read-only.
    */
  var notesPage: js.UndefOr[SchemaPage] = js.undefined
}
object SchemaSlideProperties {
  
  inline def apply(): SchemaSlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlideProperties]
  }
  
  extension [Self <: SchemaSlideProperties](x: Self) {
    
    inline def setLayoutObjectId(value: String): Self = StObject.set(x, "layoutObjectId", value.asInstanceOf[js.Any])
    
    inline def setLayoutObjectIdUndefined: Self = StObject.set(x, "layoutObjectId", js.undefined)
    
    inline def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
    
    inline def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
    
    inline def setNotesPage(value: SchemaPage): Self = StObject.set(x, "notesPage", value.asInstanceOf[js.Any])
    
    inline def setNotesPageUndefined: Self = StObject.set(x, "notesPage", js.undefined)
  }
}
