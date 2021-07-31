package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a Datastore kind.
  */
trait SchemaGooglePrivacyDlpV2KindExpression extends StObject {
  
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2KindExpression {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KindExpression]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KindExpressionMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KindExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
