package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An environment variable required by this task.
  */
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable extends StObject {
  
  /**
    * The envvar name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The envvar value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
