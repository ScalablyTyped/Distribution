package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies the location of a custom souce.
  */
trait SchemaCustomSourceLocation extends StObject {
  
  /**
    * Whether this source is stateful.
    */
  var stateful: js.UndefOr[Boolean] = js.undefined
}
object SchemaCustomSourceLocation {
  
  @scala.inline
  def apply(): SchemaCustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomSourceLocation]
  }
  
  @scala.inline
  implicit class SchemaCustomSourceLocationMutableBuilder[Self <: SchemaCustomSourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
  }
}
