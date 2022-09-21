package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to convert this file to the corresponding Docs Editors format.
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated. Creating files in multiple folders is no longer supported.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    */
  var includeLabels: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    */
  var includePermissionsForView: js.UndefOr[String] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    */
  var ocr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If ocr is true, hints at the language to use. Valid values are BCP 47 codes.
    */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to pin the head revision of the uploaded file. A file can have a maximum of 200 pinned revisions.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * Whether the requesting application supports both My Drives and shared drives.
    */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use supportsAllDrives instead.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language of the timed text.
    */
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The timed text track name.
    */
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to use the content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The visibility of the new file. This parameter is only relevant when convert=false.
    */
  var visibility: js.UndefOr[String] = js.undefined
}
object ParamsResourceFilesInsert {
  
  inline def apply(): ParamsResourceFilesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesInsert]
  }
  
  extension [Self <: ParamsResourceFilesInsert](x: Self) {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setEnforceSingleParent(value: Boolean): Self = StObject.set(x, "enforceSingleParent", value.asInstanceOf[js.Any])
    
    inline def setEnforceSingleParentUndefined: Self = StObject.set(x, "enforceSingleParent", js.undefined)
    
    inline def setIncludeLabels(value: String): Self = StObject.set(x, "includeLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeLabelsUndefined: Self = StObject.set(x, "includeLabels", js.undefined)
    
    inline def setIncludePermissionsForView(value: String): Self = StObject.set(x, "includePermissionsForView", value.asInstanceOf[js.Any])
    
    inline def setIncludePermissionsForViewUndefined: Self = StObject.set(x, "includePermissionsForView", js.undefined)
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setOcr(value: Boolean): Self = StObject.set(x, "ocr", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    inline def setOcrUndefined: Self = StObject.set(x, "ocr", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setRequestBody(value: SchemaFile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTimedTextLanguage(value: String): Self = StObject.set(x, "timedTextLanguage", value.asInstanceOf[js.Any])
    
    inline def setTimedTextLanguageUndefined: Self = StObject.set(x, "timedTextLanguage", js.undefined)
    
    inline def setTimedTextTrackName(value: String): Self = StObject.set(x, "timedTextTrackName", value.asInstanceOf[js.Any])
    
    inline def setTimedTextTrackNameUndefined: Self = StObject.set(x, "timedTextTrackName", js.undefined)
    
    inline def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    inline def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
