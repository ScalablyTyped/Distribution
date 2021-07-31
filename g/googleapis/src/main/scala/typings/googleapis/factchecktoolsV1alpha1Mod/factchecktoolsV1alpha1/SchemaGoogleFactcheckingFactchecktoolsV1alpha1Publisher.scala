package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the publisher.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher extends StObject {
  
  /**
    * The name of this publisher. For instance, &quot;Awesome Fact
    * Checks&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Host-level site name, without the protocol or &quot;www&quot; prefix. For
    * instance, &quot;awesomefactchecks.com&quot;. This value of this field is
    * based purely on the claim review URL.
    */
  var site: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1PublisherMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
  }
}
