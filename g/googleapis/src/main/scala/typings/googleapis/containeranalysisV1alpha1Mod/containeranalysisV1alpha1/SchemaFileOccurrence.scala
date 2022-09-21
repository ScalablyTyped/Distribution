package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileOccurrence extends StObject {
  
  /**
    * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
    */
  var attributions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This field provides a place for the SPDX file creator to record any general comments about the file
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field provides a place for the SPDX file creator to record file contributors
    */
  var contributors: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Identify the copyright holder of the file, as well as any dates present
    */
  var copyright: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field contains the license information actually found in the file, if any
    */
  var filesLicenseInfo: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Uniquely identify any element in an SPDX document which may be referenced by other elements
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
    */
  var licenseConcluded: js.UndefOr[SchemaLicense] = js.undefined
  
  /**
    * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
    */
  var notice: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileOccurrence {
  
  inline def apply(): SchemaFileOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileOccurrence]
  }
  
  extension [Self <: SchemaFileOccurrence](x: Self) {
    
    inline def setAttributions(value: js.Array[String]): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsNull: Self = StObject.set(x, "attributions", null)
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContributors(value: js.Array[String]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsNull: Self = StObject.set(x, "contributors", null)
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setContributorsVarargs(value: String*): Self = StObject.set(x, "contributors", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setFilesLicenseInfo(value: js.Array[String]): Self = StObject.set(x, "filesLicenseInfo", value.asInstanceOf[js.Any])
    
    inline def setFilesLicenseInfoNull: Self = StObject.set(x, "filesLicenseInfo", null)
    
    inline def setFilesLicenseInfoUndefined: Self = StObject.set(x, "filesLicenseInfo", js.undefined)
    
    inline def setFilesLicenseInfoVarargs(value: String*): Self = StObject.set(x, "filesLicenseInfo", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLicenseConcluded(value: SchemaLicense): Self = StObject.set(x, "licenseConcluded", value.asInstanceOf[js.Any])
    
    inline def setLicenseConcludedUndefined: Self = StObject.set(x, "licenseConcluded", js.undefined)
    
    inline def setNotice(value: String): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
    
    inline def setNoticeNull: Self = StObject.set(x, "notice", null)
    
    inline def setNoticeUndefined: Self = StObject.set(x, "notice", js.undefined)
  }
}
