package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source information used to create a Service Config
  */
@js.native
trait SchemaSourceInfo extends StObject {
  
  /**
    * All files used during config generation.
    */
  var sourceFiles: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}
object SchemaSourceInfo {
  
  @scala.inline
  def apply(): SchemaSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceInfo]
  }
  
  @scala.inline
  implicit class SchemaSourceInfoMutableBuilder[Self <: SchemaSourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceFiles(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFilesUndefined: Self = StObject.set(x, "sourceFiles", js.undefined)
    
    @scala.inline
    def setSourceFilesVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "sourceFiles", js.Array(value :_*))
  }
}
