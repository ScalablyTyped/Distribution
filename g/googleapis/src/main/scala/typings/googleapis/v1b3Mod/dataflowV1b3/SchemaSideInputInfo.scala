package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a side input of a DoFn or an input of a SeqDoFn.
  */
@js.native
trait SchemaSideInputInfo extends StObject {
  
  /**
    * How to interpret the source element(s) as a side input value.
    */
  var kind: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The source(s) to read element(s) from to get the value of this side
    * input. If more than one source, then the elements are taken from the
    * sources, in the specified order if order matters. At least one source is
    * required.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
  
  /**
    * The id of the tag the user code will access this side input by; this
    * should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaSideInputInfo {
  
  @scala.inline
  def apply(): SchemaSideInputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSideInputInfo]
  }
  
  @scala.inline
  implicit class SchemaSideInputInfoMutableBuilder[Self <: SchemaSideInputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: StringDictionary[js.Any]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
