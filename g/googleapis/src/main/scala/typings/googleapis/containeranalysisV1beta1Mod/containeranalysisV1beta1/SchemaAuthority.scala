package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note kind that represents a logical attestation &quot;role&quot; or
  * &quot;authority&quot;. For example, an organization might have one
  * `Authority` for &quot;QA&quot; and one for &quot;build&quot;. This note is
  * intended to act strictly as a grouping mechanism for the attached
  * occurrences (Attestations). This grouping mechanism also provides a
  * security boundary, since IAM ACLs gate the ability for a principle to
  * attach an occurrence to a given note. It also provides a single point of
  * lookup to find all attached attestation occurrences, even if they don&#39;t
  * all live in the same project.
  */
trait SchemaAuthority extends StObject {
  
  /**
    * Hint hints at the purpose of the attestation authority.
    */
  var hint: js.UndefOr[SchemaHint] = js.undefined
}
object SchemaAuthority {
  
  inline def apply(): SchemaAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthority]
  }
  
  extension [Self <: SchemaAuthority](x: Self) {
    
    inline def setHint(value: SchemaHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
