package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity whose actions triggered a Gmail phishing alert.
  */
trait SchemaMaliciousEntity extends StObject {
  
  /**
    * The sender email address.
    */
  var fromHeader: js.UndefOr[String] = js.undefined
}
object SchemaMaliciousEntity {
  
  @scala.inline
  def apply(): SchemaMaliciousEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaliciousEntity]
  }
  
  @scala.inline
  implicit class SchemaMaliciousEntityMutableBuilder[Self <: SchemaMaliciousEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromHeader(value: String): Self = StObject.set(x, "fromHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromHeaderUndefined: Self = StObject.set(x, "fromHeader", js.undefined)
  }
}
