package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The operation metadata returned for the batchend services operation.
  */
@js.native
trait SchemaGoogleApiServiceusageV1OperationMetadata extends StObject {
  
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleApiServiceusageV1OperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleApiServiceusageV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1OperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleApiServiceusageV1OperationMetadataMutableBuilder[Self <: SchemaGoogleApiServiceusageV1OperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
  }
}
