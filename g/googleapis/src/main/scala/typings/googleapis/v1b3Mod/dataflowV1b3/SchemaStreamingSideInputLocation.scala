package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies the location of a streaming side input.
  */
@js.native
trait SchemaStreamingSideInputLocation extends StObject {
  
  /**
    * Identifies the state family where this side input is stored.
    */
  var stateFamily: js.UndefOr[String] = js.native
  
  /**
    * Identifies the particular side input within the streaming Dataflow job.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaStreamingSideInputLocation {
  
  @scala.inline
  def apply(): SchemaStreamingSideInputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSideInputLocation]
  }
  
  @scala.inline
  implicit class SchemaStreamingSideInputLocationMutableBuilder[Self <: SchemaStreamingSideInputLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateFamily(value: String): Self = StObject.set(x, "stateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFamilyUndefined: Self = StObject.set(x, "stateFamily", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
