package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackageInfoOccurrence extends StObject {
  
  /**
    * A place for the SPDX file creator to record any general comments about the package being described
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provide the actual file name of the package, or path of the directory being treated as a package
    */
  var filename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provide a place for the SPDX file creator to record a web site that serves as the package's home page
    */
  var homePage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identify any element in an SPDX document which may be referenced by other elements
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * package or alternative values, if the governing license cannot be determined
    */
  var licenseConcluded: js.UndefOr[SchemaLicense] = js.undefined
  
  /**
    * Output only. The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
    */
  var sourceInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A short description of the package
    */
  var summaryDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identify the full name of the package as given by the Package Originator
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identify the version of the package
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaPackageInfoOccurrence {
  
  inline def apply(): SchemaPackageInfoOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageInfoOccurrence]
  }
  
  extension [Self <: SchemaPackageInfoOccurrence](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHomePage(value: String): Self = StObject.set(x, "homePage", value.asInstanceOf[js.Any])
    
    inline def setHomePageNull: Self = StObject.set(x, "homePage", null)
    
    inline def setHomePageUndefined: Self = StObject.set(x, "homePage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLicenseConcluded(value: SchemaLicense): Self = StObject.set(x, "licenseConcluded", value.asInstanceOf[js.Any])
    
    inline def setLicenseConcludedUndefined: Self = StObject.set(x, "licenseConcluded", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setSourceInfo(value: String): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceInfoNull: Self = StObject.set(x, "sourceInfo", null)
    
    inline def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    inline def setSummaryDescription(value: String): Self = StObject.set(x, "summaryDescription", value.asInstanceOf[js.Any])
    
    inline def setSummaryDescriptionNull: Self = StObject.set(x, "summaryDescription", null)
    
    inline def setSummaryDescriptionUndefined: Self = StObject.set(x, "summaryDescription", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
