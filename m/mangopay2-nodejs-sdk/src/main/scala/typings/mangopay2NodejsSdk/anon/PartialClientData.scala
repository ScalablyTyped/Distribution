package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.client.PlatformCategorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.client.ClientData> */
@js.native
trait PartialClientData extends StObject {
  
  var AdminEmails: js.UndefOr[js.Array[String]] = js.native
  
  var BillingEmails: js.UndefOr[js.Array[String]] = js.native
  
  var ClientId: js.UndefOr[String] = js.native
  
  var CompanyReference: js.UndefOr[String] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var FraudEmails: js.UndefOr[js.Array[String]] = js.native
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var Logo: js.UndefOr[String] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var PlatformCategorization: js.UndefOr[typings.mangopay2NodejsSdk.mod.client.PlatformCategorization] = js.native
  
  var PlatformDescription: js.UndefOr[String] = js.native
  
  var PlatformURL: js.UndefOr[String] = js.native
  
  var PrimaryButtonColour: js.UndefOr[String] = js.native
  
  var PrimaryThemeColour: js.UndefOr[String] = js.native
  
  var RegisteredName: js.UndefOr[String] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var TaxNumber: js.UndefOr[String] = js.native
  
  var TechEmails: js.UndefOr[js.Array[String]] = js.native
}
object PartialClientData {
  
  @scala.inline
  def apply(): PartialClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientData]
  }
  
  @scala.inline
  implicit class PartialClientDataMutableBuilder[Self <: PartialClientData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "AdminEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminEmailsUndefined: Self = StObject.set(x, "AdminEmails", js.undefined)
    
    @scala.inline
    def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "AdminEmails", js.Array(value :_*))
    
    @scala.inline
    def setBillingEmails(value: js.Array[String]): Self = StObject.set(x, "BillingEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingEmailsUndefined: Self = StObject.set(x, "BillingEmails", js.undefined)
    
    @scala.inline
    def setBillingEmailsVarargs(value: String*): Self = StObject.set(x, "BillingEmails", js.Array(value :_*))
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    @scala.inline
    def setCompanyReference(value: String): Self = StObject.set(x, "CompanyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyReferenceUndefined: Self = StObject.set(x, "CompanyReference", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setFraudEmails(value: js.Array[String]): Self = StObject.set(x, "FraudEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraudEmailsUndefined: Self = StObject.set(x, "FraudEmails", js.undefined)
    
    @scala.inline
    def setFraudEmailsVarargs(value: String*): Self = StObject.set(x, "FraudEmails", js.Array(value :_*))
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "Logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "Logo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPlatformCategorization(value: PlatformCategorization): Self = StObject.set(x, "PlatformCategorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformCategorizationUndefined: Self = StObject.set(x, "PlatformCategorization", js.undefined)
    
    @scala.inline
    def setPlatformDescription(value: String): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformDescriptionUndefined: Self = StObject.set(x, "PlatformDescription", js.undefined)
    
    @scala.inline
    def setPlatformURL(value: String): Self = StObject.set(x, "PlatformURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformURLUndefined: Self = StObject.set(x, "PlatformURL", js.undefined)
    
    @scala.inline
    def setPrimaryButtonColour(value: String): Self = StObject.set(x, "PrimaryButtonColour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryButtonColourUndefined: Self = StObject.set(x, "PrimaryButtonColour", js.undefined)
    
    @scala.inline
    def setPrimaryThemeColour(value: String): Self = StObject.set(x, "PrimaryThemeColour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryThemeColourUndefined: Self = StObject.set(x, "PrimaryThemeColour", js.undefined)
    
    @scala.inline
    def setRegisteredName(value: String): Self = StObject.set(x, "RegisteredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredNameUndefined: Self = StObject.set(x, "RegisteredName", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setTaxNumber(value: String): Self = StObject.set(x, "TaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNumberUndefined: Self = StObject.set(x, "TaxNumber", js.undefined)
    
    @scala.inline
    def setTechEmails(value: js.Array[String]): Self = StObject.set(x, "TechEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechEmailsUndefined: Self = StObject.set(x, "TechEmails", js.undefined)
    
    @scala.inline
    def setTechEmailsVarargs(value: String*): Self = StObject.set(x, "TechEmails", js.Array(value :_*))
  }
}
