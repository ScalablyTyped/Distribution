package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An artifact that can be deployed in some runtime.
  */
@js.native
trait SchemaDeployable extends StObject {
  
  /**
    * Resource URI for the artifact being deployed.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDeployable {
  
  @scala.inline
  def apply(): SchemaDeployable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployable]
  }
  
  @scala.inline
  implicit class SchemaDeployableMutableBuilder[Self <: SchemaDeployable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    @scala.inline
    def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value :_*))
  }
}
