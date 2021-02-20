package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductDestination extends StObject {
  
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[String] = js.native
  
  /**
    * Whether the destination is required, excluded or should be validated.
    */
  var intention: js.UndefOr[String] = js.native
}
object SchemaProductDestination {
  
  @scala.inline
  def apply(): SchemaProductDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDestination]
  }
  
  @scala.inline
  implicit class SchemaProductDestinationMutableBuilder[Self <: SchemaProductDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setIntention(value: String): Self = StObject.set(x, "intention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentionUndefined: Self = StObject.set(x, "intention", js.undefined)
  }
}
