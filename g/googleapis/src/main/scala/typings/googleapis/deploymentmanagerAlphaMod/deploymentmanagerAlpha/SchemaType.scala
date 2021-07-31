package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource type supported by Deployment Manager.
  */
trait SchemaType extends StObject {
  
  /**
    * Base Type (configurable service) that backs this Type.
    */
  var configurableService: js.UndefOr[SchemaConfigurableService] = js.undefined
  
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.undefined
  
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
  var labels: js.UndefOr[js.Array[SchemaTypeLabelEntry]] = js.undefined
  
  /**
    * Name of the type.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
  
  /**
    * Output only. Server defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaType {
  
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  
  @scala.inline
  implicit class SchemaTypeMutableBuilder[Self <: SchemaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurableService(value: SchemaConfigurableService): Self = StObject.set(x, "configurableService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurableServiceUndefined: Self = StObject.set(x, "configurableService", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaTypeLabelEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaTypeLabelEntry*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
