package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uboDeclaration {
  
  trait CreateUboDeclaration extends StObject {
    
    var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CreateUboDeclaration {
    
    inline def apply(): CreateUboDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUboDeclaration]
    }
    
    extension [Self <: CreateUboDeclaration](x: Self) {
      
      inline def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
      
      inline def setDeclaredUBOsUndefined: Self = StObject.set(x, "DeclaredUBOs", js.undefined)
      
      inline def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
    }
  }
  
  trait UboDeclarationData
    extends StObject
       with EntityBaseData {
    
    /**
      * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
      */
    var DeclaredUBOs: js.Array[String]
    
    /**
      * Refused Reason Message for a UBO Declaration
      */
    var RefusedReasonMessage: String
    
    /**
      * Reason types for a UBO Declaration
      */
    var RefusedReasonTypes: js.Array[String]
    
    /**
      * Status of a UBO Declaration
      */
    var Status: DocumentStatus
    
    /**
      * The object owner's UserId
      */
    var UserId: String
  }
  object UboDeclarationData {
    
    inline def apply(
      CreationDate: Double,
      DeclaredUBOs: js.Array[String],
      Id: String,
      RefusedReasonMessage: String,
      RefusedReasonTypes: js.Array[String],
      Status: DocumentStatus,
      Tag: String,
      UserId: String
    ): UboDeclarationData = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DeclaredUBOs = DeclaredUBOs.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonTypes = RefusedReasonTypes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UboDeclarationData]
    }
    
    extension [Self <: UboDeclarationData](x: Self) {
      
      inline def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
      
      inline def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
      
      inline def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
      
      inline def setRefusedReasonTypes(value: js.Array[String]): Self = StObject.set(x, "RefusedReasonTypes", value.asInstanceOf[js.Any])
      
      inline def setRefusedReasonTypesVarargs(value: String*): Self = StObject.set(x, "RefusedReasonTypes", js.Array(value :_*))
      
      inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateUboDeclaration extends StObject {
    
    /**
      * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
      */
    var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.undefined
    
    var Id: String
    
    var Status: js.UndefOr[VALIDATION_ASKED] = js.undefined
    
    var Tag: js.UndefOr[String] = js.undefined
  }
  object UpdateUboDeclaration {
    
    inline def apply(Id: String): UpdateUboDeclaration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateUboDeclaration]
    }
    
    extension [Self <: UpdateUboDeclaration](x: Self) {
      
      inline def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
      
      inline def setDeclaredUBOsUndefined: Self = StObject.set(x, "DeclaredUBOs", js.undefined)
      
      inline def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
