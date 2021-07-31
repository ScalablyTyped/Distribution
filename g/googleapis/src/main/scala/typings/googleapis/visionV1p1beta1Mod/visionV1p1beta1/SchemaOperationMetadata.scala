package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains metadata for the BatchAnnotateImages operation.
  */
trait SchemaOperationMetadata extends StObject {
  
  /**
    * The time when the batch request was received.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the operation result was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaOperationMetadata {
  
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataMutableBuilder[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
