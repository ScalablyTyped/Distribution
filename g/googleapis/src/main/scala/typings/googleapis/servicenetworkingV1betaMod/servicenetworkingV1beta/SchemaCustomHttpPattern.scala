package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom pattern is used for defining custom HTTP verb.
  */
trait SchemaCustomHttpPattern extends StObject {
  
  /**
    * The name of this custom HTTP verb.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The path matched by this custom verb.
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaCustomHttpPattern {
  
  @scala.inline
  def apply(): SchemaCustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomHttpPattern]
  }
  
  @scala.inline
  implicit class SchemaCustomHttpPatternMutableBuilder[Self <: SchemaCustomHttpPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
