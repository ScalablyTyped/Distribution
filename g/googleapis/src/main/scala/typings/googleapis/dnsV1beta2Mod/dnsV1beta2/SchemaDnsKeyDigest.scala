package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsKeyDigest extends StObject {
  
  var digest: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDnsKeyDigest {
  
  @scala.inline
  def apply(): SchemaDnsKeyDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeyDigest]
  }
  
  @scala.inline
  implicit class SchemaDnsKeyDigestMutableBuilder[Self <: SchemaDnsKeyDigest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
