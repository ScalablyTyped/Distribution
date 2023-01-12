package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typings.mangopay2NodejsSdk.typingsModelsClientMod.client.PlatformCategorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/client.client.ClientData> */
trait PartialClientData extends StObject {
  
  var AdminEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  var BillingEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  var ClientId: js.UndefOr[String] = js.undefined
  
  var CompanyReference: js.UndefOr[String] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var FraudEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  
  var HeadquartersPhoneNumber: js.UndefOr[String] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Logo: js.UndefOr[String] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var PlatformCategorization: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsClientMod.client.PlatformCategorization] = js.undefined
  
  var PlatformDescription: js.UndefOr[String] = js.undefined
  
  var PlatformURL: js.UndefOr[String] = js.undefined
  
  var PrimaryButtonColour: js.UndefOr[String] = js.undefined
  
  var PrimaryThemeColour: js.UndefOr[String] = js.undefined
  
  var RegisteredName: js.UndefOr[String] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var TaxNumber: js.UndefOr[String] = js.undefined
  
  var TechEmails: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialClientData {
  
  inline def apply(): PartialClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClientData] (val x: Self) extends AnyVal {
    
    inline def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "AdminEmails", value.asInstanceOf[js.Any])
    
    inline def setAdminEmailsUndefined: Self = StObject.set(x, "AdminEmails", js.undefined)
    
    inline def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "AdminEmails", js.Array(value*))
    
    inline def setBillingEmails(value: js.Array[String]): Self = StObject.set(x, "BillingEmails", value.asInstanceOf[js.Any])
    
    inline def setBillingEmailsUndefined: Self = StObject.set(x, "BillingEmails", js.undefined)
    
    inline def setBillingEmailsVarargs(value: String*): Self = StObject.set(x, "BillingEmails", js.Array(value*))
    
    inline def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setCompanyReference(value: String): Self = StObject.set(x, "CompanyReference", value.asInstanceOf[js.Any])
    
    inline def setCompanyReferenceUndefined: Self = StObject.set(x, "CompanyReference", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setFraudEmails(value: js.Array[String]): Self = StObject.set(x, "FraudEmails", value.asInstanceOf[js.Any])
    
    inline def setFraudEmailsUndefined: Self = StObject.set(x, "FraudEmails", js.undefined)
    
    inline def setFraudEmailsVarargs(value: String*): Self = StObject.set(x, "FraudEmails", js.Array(value*))
    
    inline def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    inline def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
    inline def setHeadquartersPhoneNumber(value: String): Self = StObject.set(x, "HeadquartersPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setHeadquartersPhoneNumberUndefined: Self = StObject.set(x, "HeadquartersPhoneNumber", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "Logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "Logo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPlatformCategorization(value: PlatformCategorization): Self = StObject.set(x, "PlatformCategorization", value.asInstanceOf[js.Any])
    
    inline def setPlatformCategorizationUndefined: Self = StObject.set(x, "PlatformCategorization", js.undefined)
    
    inline def setPlatformDescription(value: String): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
    
    inline def setPlatformDescriptionUndefined: Self = StObject.set(x, "PlatformDescription", js.undefined)
    
    inline def setPlatformURL(value: String): Self = StObject.set(x, "PlatformURL", value.asInstanceOf[js.Any])
    
    inline def setPlatformURLUndefined: Self = StObject.set(x, "PlatformURL", js.undefined)
    
    inline def setPrimaryButtonColour(value: String): Self = StObject.set(x, "PrimaryButtonColour", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonColourUndefined: Self = StObject.set(x, "PrimaryButtonColour", js.undefined)
    
    inline def setPrimaryThemeColour(value: String): Self = StObject.set(x, "PrimaryThemeColour", value.asInstanceOf[js.Any])
    
    inline def setPrimaryThemeColourUndefined: Self = StObject.set(x, "PrimaryThemeColour", js.undefined)
    
    inline def setRegisteredName(value: String): Self = StObject.set(x, "RegisteredName", value.asInstanceOf[js.Any])
    
    inline def setRegisteredNameUndefined: Self = StObject.set(x, "RegisteredName", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setTaxNumber(value: String): Self = StObject.set(x, "TaxNumber", value.asInstanceOf[js.Any])
    
    inline def setTaxNumberUndefined: Self = StObject.set(x, "TaxNumber", js.undefined)
    
    inline def setTechEmails(value: js.Array[String]): Self = StObject.set(x, "TechEmails", value.asInstanceOf[js.Any])
    
    inline def setTechEmailsUndefined: Self = StObject.set(x, "TechEmails", js.undefined)
    
    inline def setTechEmailsVarargs(value: String*): Self = StObject.set(x, "TechEmails", js.Array(value*))
  }
}
