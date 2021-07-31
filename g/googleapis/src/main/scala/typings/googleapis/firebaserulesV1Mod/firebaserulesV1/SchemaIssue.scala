package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Issues include warnings, errors, and deprecation notices.
  */
trait SchemaIssue extends StObject {
  
  /**
    * Short error description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The severity of the issue.
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * Position of the issue in the `Source`.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.undefined
}
object SchemaIssue {
  
  @scala.inline
  def apply(): SchemaIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssue]
  }
  
  @scala.inline
  implicit class SchemaIssueMutableBuilder[Self <: SchemaIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSourcePosition(value: SchemaSourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
  }
}
