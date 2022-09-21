package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentOccurrence extends StObject {
  
  /**
    * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
    */
  var creatorComment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person's name
    */
  var creators: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
    */
  var documentComment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify any external SPDX documents referenced within this SPDX document
    */
  var externalDocumentRefs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Identify the current SPDX document which may be referenced in relationships by other files, packages internally and documents externally
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
    */
  var licenseListVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
    */
  var namespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify name of this document as designated by creator
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaDocumentOccurrence {
  
  inline def apply(): SchemaDocumentOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentOccurrence]
  }
  
  extension [Self <: SchemaDocumentOccurrence](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatorComment(value: String): Self = StObject.set(x, "creatorComment", value.asInstanceOf[js.Any])
    
    inline def setCreatorCommentNull: Self = StObject.set(x, "creatorComment", null)
    
    inline def setCreatorCommentUndefined: Self = StObject.set(x, "creatorComment", js.undefined)
    
    inline def setCreators(value: js.Array[String]): Self = StObject.set(x, "creators", value.asInstanceOf[js.Any])
    
    inline def setCreatorsNull: Self = StObject.set(x, "creators", null)
    
    inline def setCreatorsUndefined: Self = StObject.set(x, "creators", js.undefined)
    
    inline def setCreatorsVarargs(value: String*): Self = StObject.set(x, "creators", js.Array(value*))
    
    inline def setDocumentComment(value: String): Self = StObject.set(x, "documentComment", value.asInstanceOf[js.Any])
    
    inline def setDocumentCommentNull: Self = StObject.set(x, "documentComment", null)
    
    inline def setDocumentCommentUndefined: Self = StObject.set(x, "documentComment", js.undefined)
    
    inline def setExternalDocumentRefs(value: js.Array[String]): Self = StObject.set(x, "externalDocumentRefs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocumentRefsNull: Self = StObject.set(x, "externalDocumentRefs", null)
    
    inline def setExternalDocumentRefsUndefined: Self = StObject.set(x, "externalDocumentRefs", js.undefined)
    
    inline def setExternalDocumentRefsVarargs(value: String*): Self = StObject.set(x, "externalDocumentRefs", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLicenseListVersion(value: String): Self = StObject.set(x, "licenseListVersion", value.asInstanceOf[js.Any])
    
    inline def setLicenseListVersionNull: Self = StObject.set(x, "licenseListVersion", null)
    
    inline def setLicenseListVersionUndefined: Self = StObject.set(x, "licenseListVersion", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
