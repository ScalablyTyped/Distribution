package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This submessage provides human-readable hints about the purpose of the
  * authority. Because the name of a note acts as its resource reference, it is
  * important to disambiguate the canonical name of the Note (which might be a
  * UUID for security purposes) from &quot;readable&quot; names more suitable
  * for debug output. Note that these hints should not be used to look up
  * authorities in security sensitive contexts, such as when looking up
  * attestations to verify.
  */
trait SchemaHint extends StObject {
  
  /**
    * Required. The human readable name of this attestation authority, for
    * example &quot;qa&quot;.
    */
  var humanReadableName: js.UndefOr[String] = js.undefined
}
object SchemaHint {
  
  inline def apply(): SchemaHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHint]
  }
  
  extension [Self <: SchemaHint](x: Self) {
    
    inline def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    inline def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
