package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import typings.mangopay2NodejsSdk.birthplaceMod.birthplace.Birthplace
import typings.mangopay2NodejsSdk.entityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.enumsMod.enums.IUboDeclarationRefusedReasonType
import typings.mangopay2NodejsSdk.enumsMod.enums.IUboDeclarationStatus
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import typings.mangopay2NodejsSdk.typesMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uboDeclarationMod {
  
  object uboDeclaration {
    
    trait CreateUbo extends StObject {
      
      var Address: AddressType
      
      var Birthday: Timestamp
      
      var Birthplace: typings.mangopay2NodejsSdk.birthplaceMod.birthplace.Birthplace
      
      var FirstName: String
      
      var LastName: String
      
      var Nationality: String
    }
    object CreateUbo {
      
      inline def apply(
        Address: AddressType,
        Birthday: Timestamp,
        Birthplace: Birthplace,
        FirstName: String,
        LastName: String,
        Nationality: String
      ): CreateUbo = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Birthday = Birthday.asInstanceOf[js.Any], Birthplace = Birthplace.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateUbo]
      }
      
      extension [Self <: CreateUbo](x: Self) {
        
        inline def setAddress(value: AddressType): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
        
        inline def setBirthplace(value: Birthplace): Self = StObject.set(x, "Birthplace", value.asInstanceOf[js.Any])
        
        inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
        
        inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
        
        inline def setNationality(value: String): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
      }
    }
    
    trait CreateUboDeclaration extends StObject {
      
      var Ubos: js.UndefOr[js.Array[String]] = js.undefined
    }
    object CreateUboDeclaration {
      
      inline def apply(): CreateUboDeclaration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateUboDeclaration]
      }
      
      extension [Self <: CreateUboDeclaration](x: Self) {
        
        inline def setUbos(value: js.Array[String]): Self = StObject.set(x, "Ubos", value.asInstanceOf[js.Any])
        
        inline def setUbosUndefined: Self = StObject.set(x, "Ubos", js.undefined)
        
        inline def setUbosVarargs(value: String*): Self = StObject.set(x, "Ubos", js.Array(value*))
      }
    }
    
    trait UboData
      extends StObject
         with EntityBaseData {
      
      var Address: AddressType
      
      var Birthday: Timestamp
      
      var Birthplace: typings.mangopay2NodejsSdk.birthplaceMod.birthplace.Birthplace
      
      var FirstName: String
      
      var LastName: String
      
      var Nationality: String
      
      var isActive: Boolean
    }
    object UboData {
      
      inline def apply(
        Address: AddressType,
        Birthday: Timestamp,
        Birthplace: Birthplace,
        CreationDate: Double,
        FirstName: String,
        Id: String,
        LastName: String,
        Nationality: String,
        Tag: String,
        isActive: Boolean
      ): UboData = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Birthday = Birthday.asInstanceOf[js.Any], Birthplace = Birthplace.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
        __obj.asInstanceOf[UboData]
      }
      
      extension [Self <: UboData](x: Self) {
        
        inline def setAddress(value: AddressType): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
        
        inline def setBirthplace(value: Birthplace): Self = StObject.set(x, "Birthplace", value.asInstanceOf[js.Any])
        
        inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
        
        inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
        
        inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
        
        inline def setNationality(value: String): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
      }
    }
    
    trait UboDeclarationData
      extends StObject
         with EntityBaseData {
      
      /**
        * Explanation of why the declaration was refused.
        */
      var Message: String
      
      /**
        * cannot be modified by clients
        */
      var ProcessedDate: Timestamp
      
      /**
        * Array of reasons why the declaration was refused
        * Values as declared in UboDeclarationRefusedReasonType.
        */
      var Reason: ValueOf[IUboDeclarationRefusedReasonType]
      
      /**
        * Declaration status (one of UboDeclarationStatus)
        */
      var Status: ValueOf[IUboDeclarationStatus]
      
      /**
        * Table of ubos (declared in Ubo)
        */
      var Ubos: js.Array[Any]
    }
    object UboDeclarationData {
      
      inline def apply(
        CreationDate: Double,
        Id: String,
        Message: String,
        ProcessedDate: Timestamp,
        Reason: ValueOf[IUboDeclarationRefusedReasonType],
        Status: ValueOf[IUboDeclarationStatus],
        Tag: String,
        Ubos: js.Array[Any]
      ): UboDeclarationData = {
        val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Ubos = Ubos.asInstanceOf[js.Any])
        __obj.asInstanceOf[UboDeclarationData]
      }
      
      extension [Self <: UboDeclarationData](x: Self) {
        
        inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
        
        inline def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
        
        inline def setReason(value: ValueOf[IUboDeclarationRefusedReasonType]): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: ValueOf[IUboDeclarationStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setUbos(value: js.Array[Any]): Self = StObject.set(x, "Ubos", value.asInstanceOf[js.Any])
        
        inline def setUbosVarargs(value: Any*): Self = StObject.set(x, "Ubos", js.Array(value*))
      }
    }
    
    trait UpdateUbo extends StObject {
      
      var Address: js.UndefOr[AddressType] = js.undefined
      
      var Birthday: js.UndefOr[Timestamp] = js.undefined
      
      var Birthplace: js.UndefOr[typings.mangopay2NodejsSdk.birthplaceMod.birthplace.Birthplace] = js.undefined
      
      var FirstName: js.UndefOr[String] = js.undefined
      
      var Id: String
      
      var LastName: js.UndefOr[String] = js.undefined
      
      var Nationality: js.UndefOr[String] = js.undefined
      
      var isActive: js.UndefOr[Boolean] = js.undefined
    }
    object UpdateUbo {
      
      inline def apply(Id: String): UpdateUbo = {
        val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateUbo]
      }
      
      extension [Self <: UpdateUbo](x: Self) {
        
        inline def setAddress(value: AddressType): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
        
        inline def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
        
        inline def setBirthdayUndefined: Self = StObject.set(x, "Birthday", js.undefined)
        
        inline def setBirthplace(value: Birthplace): Self = StObject.set(x, "Birthplace", value.asInstanceOf[js.Any])
        
        inline def setBirthplaceUndefined: Self = StObject.set(x, "Birthplace", js.undefined)
        
        inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
        
        inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
        
        inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
        
        inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
        
        inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
        
        inline def setNationality(value: String): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
        
        inline def setNationalityUndefined: Self = StObject.set(x, "Nationality", js.undefined)
      }
    }
    
    trait UpdateUboDeclaration extends StObject {
      
      var Id: String
      
      var Status: js.UndefOr[VALIDATION_ASKED] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
      
      /**
        * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
        */
      var Ubos: js.UndefOr[js.Array[String]] = js.undefined
    }
    object UpdateUboDeclaration {
      
      inline def apply(Id: String): UpdateUboDeclaration = {
        val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateUboDeclaration]
      }
      
      extension [Self <: UpdateUboDeclaration](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
        
        inline def setUbos(value: js.Array[String]): Self = StObject.set(x, "Ubos", value.asInstanceOf[js.Any])
        
        inline def setUbosUndefined: Self = StObject.set(x, "Ubos", js.undefined)
        
        inline def setUbosVarargs(value: String*): Self = StObject.set(x, "Ubos", js.Array(value*))
      }
    }
  }
}
