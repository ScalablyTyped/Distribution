package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type provider that describes a service-backed Type.
  */
trait SchemaTypeProvider extends StObject {
  
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.undefined
  
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.undefined
  
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptor Url for the this type provider.
    */
  var descriptorUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Unique identifier for the resource defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /**
    * Map of labels; provided by the client when the resource is created or
    * updated. Specifically: Label keys must be between 1 and 63 characters
    * long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[SchemaTypeProviderLabelEntry]] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type provider.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
  
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
  
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaTypeProvider {
  
  @scala.inline
  def apply(): SchemaTypeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvider]
  }
  
  @scala.inline
  implicit class SchemaTypeProviderMutableBuilder[Self <: SchemaTypeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionOverrides(value: js.Array[SchemaCollectionOverride]): Self = StObject.set(x, "collectionOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionOverridesUndefined: Self = StObject.set(x, "collectionOverrides", js.undefined)
    
    @scala.inline
    def setCollectionOverridesVarargs(value: SchemaCollectionOverride*): Self = StObject.set(x, "collectionOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCredential(value: SchemaCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDescriptorUrl(value: String): Self = StObject.set(x, "descriptorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUrlUndefined: Self = StObject.set(x, "descriptorUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaTypeProviderLabelEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaTypeProviderLabelEntry*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
