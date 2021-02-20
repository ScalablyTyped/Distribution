package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tensorflow version that a Node can be configured with.
  */
@js.native
trait SchemaTensorFlowVersion extends StObject {
  
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * the tensorflow version.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaTensorFlowVersion {
  
  @scala.inline
  def apply(): SchemaTensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTensorFlowVersion]
  }
  
  @scala.inline
  implicit class SchemaTensorFlowVersionMutableBuilder[Self <: SchemaTensorFlowVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
