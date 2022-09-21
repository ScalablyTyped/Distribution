package typings.mangopay2NodejsSdk.enumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATION_DO_NOT_MATCH_UBO_INFORMATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENTS_NEEDED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MISSING_UBO
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION_CHART_NEEDED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDERS_DECLARATION_NEEDED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_IDENTITY_NEEDED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WRONG_UBO_INFORMATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUboDeclarationRefusedReasonType extends StObject {
  
  var DeclarationDontMatchUboInfo: DECLARATION_DO_NOT_MATCH_UBO_INFORMATION
  
  var DocumentsNeeded: DOCUMENTS_NEEDED
  
  /**
    * When at least one natural user is missing on the declaration
    */
  var MissingUbo: MISSING_UBO
  
  var OrganizationChartNeeded: ORGANIZATION_CHART_NEEDED
  
  var ShareholdersDeclarationNeeded: SHAREHOLDERS_DECLARATION_NEEDED
  
  var SpecificCase: SPECIFIC_CASE
  
  var UboIdentityNeeded: UBO_IDENTITY_NEEDED
  
  var WrongUboInformation: WRONG_UBO_INFORMATION
}
object IUboDeclarationRefusedReasonType {
  
  inline def apply(): IUboDeclarationRefusedReasonType = {
    val __obj = js.Dynamic.literal(DeclarationDontMatchUboInfo = "DECLARATION_DO_NOT_MATCH_UBO_INFORMATION", DocumentsNeeded = "DOCUMENTS_NEEDED", MissingUbo = "MISSING_UBO", OrganizationChartNeeded = "ORGANIZATION_CHART_NEEDED", ShareholdersDeclarationNeeded = "SHAREHOLDERS_DECLARATION_NEEDED", SpecificCase = "SPECIFIC_CASE", UboIdentityNeeded = "UBO_IDENTITY_NEEDED", WrongUboInformation = "WRONG_UBO_INFORMATION")
    __obj.asInstanceOf[IUboDeclarationRefusedReasonType]
  }
  
  extension [Self <: IUboDeclarationRefusedReasonType](x: Self) {
    
    inline def setDeclarationDontMatchUboInfo(value: DECLARATION_DO_NOT_MATCH_UBO_INFORMATION): Self = StObject.set(x, "DeclarationDontMatchUboInfo", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNeeded(value: DOCUMENTS_NEEDED): Self = StObject.set(x, "DocumentsNeeded", value.asInstanceOf[js.Any])
    
    inline def setMissingUbo(value: MISSING_UBO): Self = StObject.set(x, "MissingUbo", value.asInstanceOf[js.Any])
    
    inline def setOrganizationChartNeeded(value: ORGANIZATION_CHART_NEEDED): Self = StObject.set(x, "OrganizationChartNeeded", value.asInstanceOf[js.Any])
    
    inline def setShareholdersDeclarationNeeded(value: SHAREHOLDERS_DECLARATION_NEEDED): Self = StObject.set(x, "ShareholdersDeclarationNeeded", value.asInstanceOf[js.Any])
    
    inline def setSpecificCase(value: SPECIFIC_CASE): Self = StObject.set(x, "SpecificCase", value.asInstanceOf[js.Any])
    
    inline def setUboIdentityNeeded(value: UBO_IDENTITY_NEEDED): Self = StObject.set(x, "UboIdentityNeeded", value.asInstanceOf[js.Any])
    
    inline def setWrongUboInformation(value: WRONG_UBO_INFORMATION): Self = StObject.set(x, "WrongUboInformation", value.asInstanceOf[js.Any])
  }
}
