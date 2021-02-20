package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an output of a SeqMapTask.
  */
@js.native
trait SchemaSeqMapTaskOutputInfo extends StObject {
  
  /**
    * The sink to write the output value to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
  
  /**
    * The id of the TupleTag the user code will tag the output value by.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaSeqMapTaskOutputInfo {
  
  @scala.inline
  def apply(): SchemaSeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTaskOutputInfo]
  }
  
  @scala.inline
  implicit class SchemaSeqMapTaskOutputInfoMutableBuilder[Self <: SchemaSeqMapTaskOutputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSink(value: SchemaSink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
