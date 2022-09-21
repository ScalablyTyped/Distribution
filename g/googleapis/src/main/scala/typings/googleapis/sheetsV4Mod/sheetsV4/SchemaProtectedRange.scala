package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProtectedRange extends StObject {
  
  /**
    * The description of this protected range.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The users and groups with edit access to the protected range. This field is only visible to users with edit access to the protected range and the document. Editors are not supported with warning_only protection.
    */
  var editors: js.UndefOr[SchemaEditors] = js.undefined
  
  /**
    * The named range this protected range is backed by, if any. When writing, only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the protected range. This field is read-only.
    */
  var protectedRangeId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The range that is being protected. The range may be fully unbounded, in which case this is considered a protected sheet. When writing, only one of range or named_range_id may be set.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * True if the user who requested this protected range can edit the protected area. This field is read-only.
    */
  var requestingUserCanEdit: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of unprotected ranges within a protected sheet. Unprotected ranges are only supported on protected sheets.
    */
  var unprotectedRanges: js.UndefOr[js.Array[SchemaGridRange]] = js.undefined
  
  /**
    * True if this protected range will show a warning when editing. Warning-based protection means that every user can edit data in the protected range, except editing will prompt a warning asking the user to confirm the edit. When writing: if this field is true, then editors is ignored. Additionally, if this field is changed from true to false and the `editors` field is not set (nor included in the field mask), then the editors will be set to all the editors in the document.
    */
  var warningOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaProtectedRange {
  
  inline def apply(): SchemaProtectedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProtectedRange]
  }
  
  extension [Self <: SchemaProtectedRange](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEditors(value: SchemaEditors): Self = StObject.set(x, "editors", value.asInstanceOf[js.Any])
    
    inline def setEditorsUndefined: Self = StObject.set(x, "editors", js.undefined)
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdNull: Self = StObject.set(x, "namedRangeId", null)
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    inline def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
    
    inline def setProtectedRangeIdNull: Self = StObject.set(x, "protectedRangeId", null)
    
    inline def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRequestingUserCanEdit(value: Boolean): Self = StObject.set(x, "requestingUserCanEdit", value.asInstanceOf[js.Any])
    
    inline def setRequestingUserCanEditNull: Self = StObject.set(x, "requestingUserCanEdit", null)
    
    inline def setRequestingUserCanEditUndefined: Self = StObject.set(x, "requestingUserCanEdit", js.undefined)
    
    inline def setUnprotectedRanges(value: js.Array[SchemaGridRange]): Self = StObject.set(x, "unprotectedRanges", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedRangesUndefined: Self = StObject.set(x, "unprotectedRanges", js.undefined)
    
    inline def setUnprotectedRangesVarargs(value: SchemaGridRange*): Self = StObject.set(x, "unprotectedRanges", js.Array(value*))
    
    inline def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    inline def setWarningOnlyNull: Self = StObject.set(x, "warningOnly", null)
    
    inline def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
  }
}
