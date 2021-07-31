package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media resource.
  */
trait SchemaMedia extends StObject {
  
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object SchemaMedia {
  
  @scala.inline
  def apply(): SchemaMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMedia]
  }
  
  @scala.inline
  implicit class SchemaMediaMutableBuilder[Self <: SchemaMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
