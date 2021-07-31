package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basis describes the base image portion (Note) of the DockerImage
  * relationship.  Linked occurrences are derived from this or an equivalent
  * image via:   FROM &lt;Basis.resource_url&gt; Or an equivalent reference,
  * e.g. a tag of the resource_url.
  */
trait SchemaBasis extends StObject {
  
  /**
    * The fingerprint of the base image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.undefined
  
  /**
    * The resource_url for the resource representing the basis of associated
    * occurrence images.
    */
  var resourceUrl: js.UndefOr[String] = js.undefined
}
object SchemaBasis {
  
  @scala.inline
  def apply(): SchemaBasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasis]
  }
  
  @scala.inline
  implicit class SchemaBasisMutableBuilder[Self <: SchemaBasis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: SchemaFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
