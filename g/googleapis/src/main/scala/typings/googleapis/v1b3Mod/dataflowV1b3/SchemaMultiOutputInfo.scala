package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an output of a multi-output DoFn.
  */
trait SchemaMultiOutputInfo extends StObject {
  
  /**
    * The id of the tag the user code will emit to this output by; this should
    * correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaMultiOutputInfo {
  
  @scala.inline
  def apply(): SchemaMultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiOutputInfo]
  }
  
  @scala.inline
  implicit class SchemaMultiOutputInfoMutableBuilder[Self <: SchemaMultiOutputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
