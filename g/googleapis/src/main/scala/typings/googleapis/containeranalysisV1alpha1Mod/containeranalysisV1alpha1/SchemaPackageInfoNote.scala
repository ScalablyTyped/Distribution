package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackageInfoNote extends StObject {
  
  /**
    * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
    */
  var analyzed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
    */
  var attribution: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
    */
  var checksum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify the copyright holders of the package, as well as any dates present
    */
  var copyright: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A more detailed description of the package
    */
  var detailedDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
    */
  var downloadLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ExternalRef
    */
  var externalRefs: js.UndefOr[js.Array[SchemaExternalRef]] = js.undefined
  
  /**
    * Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
    */
  var filesLicenseInfo: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Provide a place for the SPDX file creator to record a web site that serves as the package's home page
    */
  var homePage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List the licenses that have been declared by the authors of the package
    */
  var licenseDeclared: js.UndefOr[SchemaLicense] = js.undefined
  
  /**
    * If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
    */
  var originator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short description of the package
    */
  var summaryDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify the actual distribution source for the package/directory identified in the SPDX file
    */
  var supplier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify the full name of the package as given by the Package Originator
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
    */
  var verificationCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify the version of the package
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaPackageInfoNote {
  
  inline def apply(): SchemaPackageInfoNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageInfoNote]
  }
  
  extension [Self <: SchemaPackageInfoNote](x: Self) {
    
    inline def setAnalyzed(value: Boolean): Self = StObject.set(x, "analyzed", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedNull: Self = StObject.set(x, "analyzed", null)
    
    inline def setAnalyzedUndefined: Self = StObject.set(x, "analyzed", js.undefined)
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionNull: Self = StObject.set(x, "attribution", null)
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumNull: Self = StObject.set(x, "checksum", null)
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDetailedDescription(value: String): Self = StObject.set(x, "detailedDescription", value.asInstanceOf[js.Any])
    
    inline def setDetailedDescriptionNull: Self = StObject.set(x, "detailedDescription", null)
    
    inline def setDetailedDescriptionUndefined: Self = StObject.set(x, "detailedDescription", js.undefined)
    
    inline def setDownloadLocation(value: String): Self = StObject.set(x, "downloadLocation", value.asInstanceOf[js.Any])
    
    inline def setDownloadLocationNull: Self = StObject.set(x, "downloadLocation", null)
    
    inline def setDownloadLocationUndefined: Self = StObject.set(x, "downloadLocation", js.undefined)
    
    inline def setExternalRefs(value: js.Array[SchemaExternalRef]): Self = StObject.set(x, "externalRefs", value.asInstanceOf[js.Any])
    
    inline def setExternalRefsUndefined: Self = StObject.set(x, "externalRefs", js.undefined)
    
    inline def setExternalRefsVarargs(value: SchemaExternalRef*): Self = StObject.set(x, "externalRefs", js.Array(value*))
    
    inline def setFilesLicenseInfo(value: js.Array[String]): Self = StObject.set(x, "filesLicenseInfo", value.asInstanceOf[js.Any])
    
    inline def setFilesLicenseInfoNull: Self = StObject.set(x, "filesLicenseInfo", null)
    
    inline def setFilesLicenseInfoUndefined: Self = StObject.set(x, "filesLicenseInfo", js.undefined)
    
    inline def setFilesLicenseInfoVarargs(value: String*): Self = StObject.set(x, "filesLicenseInfo", js.Array(value*))
    
    inline def setHomePage(value: String): Self = StObject.set(x, "homePage", value.asInstanceOf[js.Any])
    
    inline def setHomePageNull: Self = StObject.set(x, "homePage", null)
    
    inline def setHomePageUndefined: Self = StObject.set(x, "homePage", js.undefined)
    
    inline def setLicenseDeclared(value: SchemaLicense): Self = StObject.set(x, "licenseDeclared", value.asInstanceOf[js.Any])
    
    inline def setLicenseDeclaredUndefined: Self = StObject.set(x, "licenseDeclared", js.undefined)
    
    inline def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setOriginatorNull: Self = StObject.set(x, "originator", null)
    
    inline def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setSummaryDescription(value: String): Self = StObject.set(x, "summaryDescription", value.asInstanceOf[js.Any])
    
    inline def setSummaryDescriptionNull: Self = StObject.set(x, "summaryDescription", null)
    
    inline def setSummaryDescriptionUndefined: Self = StObject.set(x, "summaryDescription", js.undefined)
    
    inline def setSupplier(value: String): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierNull: Self = StObject.set(x, "supplier", null)
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    
    inline def setVerificationCodeNull: Self = StObject.set(x, "verificationCode", null)
    
    inline def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
