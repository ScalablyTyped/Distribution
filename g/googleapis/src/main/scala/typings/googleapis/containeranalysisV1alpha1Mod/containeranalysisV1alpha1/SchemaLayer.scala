package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layer holds metadata specific to a layer of a Docker image.
  */
trait SchemaLayer extends StObject {
  
  /**
    * The recovered arguments to the Dockerfile directive.
    */
  var arguments: js.UndefOr[String] = js.undefined
  
  /**
    * The recovered Dockerfile directive used to construct this layer.
    */
  var directive: js.UndefOr[String] = js.undefined
}
object SchemaLayer {
  
  @scala.inline
  def apply(): SchemaLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayer]
  }
  
  @scala.inline
  implicit class SchemaLayerMutableBuilder[Self <: SchemaLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setDirective(value: String): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
  }
}
