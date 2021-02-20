package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uboDeclaration {
  
  @js.native
  trait CreateUboDeclaration extends StObject {
    
    var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.native
  }
  object CreateUboDeclaration {
    
    @scala.inline
    def apply(): CreateUboDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUboDeclaration]
    }
    
    @scala.inline
    implicit class CreateUboDeclarationMutableBuilder[Self <: CreateUboDeclaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredUBOsUndefined: Self = StObject.set(x, "DeclaredUBOs", js.undefined)
      
      @scala.inline
      def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UboDeclarationData extends EntityBaseData {
    
    /**
      * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
      */
    var DeclaredUBOs: js.Array[String] = js.native
    
    /**
      * Refused Reason Message for a UBO Declaration
      */
    var RefusedReasonMessage: String = js.native
    
    /**
      * Reason types for a UBO Declaration
      */
    var RefusedReasonTypes: js.Array[String] = js.native
    
    /**
      * Status of a UBO Declaration
      */
    var Status: DocumentStatus = js.native
    
    /**
      * The object owner's UserId
      */
    var UserId: String = js.native
  }
  object UboDeclarationData {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class UboDeclarationDataMutableBuilder[Self <: UboDeclarationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
      
      @scala.inline
      def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefusedReasonTypes(value: js.Array[String]): Self = StObject.set(x, "RefusedReasonTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefusedReasonTypesVarargs(value: String*): Self = StObject.set(x, "RefusedReasonTypes", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateUboDeclaration extends StObject {
    
    /**
      * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
      */
    var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.native
    
    var Id: String = js.native
    
    var Status: js.UndefOr[VALIDATION_ASKED] = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object UpdateUboDeclaration {
    
    @scala.inline
    def apply(Id: String): UpdateUboDeclaration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateUboDeclaration]
    }
    
    @scala.inline
    implicit class UpdateUboDeclarationMutableBuilder[Self <: UpdateUboDeclaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredUBOsUndefined: Self = StObject.set(x, "DeclaredUBOs", js.undefined)
      
      @scala.inline
      def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
