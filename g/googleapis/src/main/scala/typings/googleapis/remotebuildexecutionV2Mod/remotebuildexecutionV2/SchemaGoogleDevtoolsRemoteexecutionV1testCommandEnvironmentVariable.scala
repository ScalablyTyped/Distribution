package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `EnvironmentVariable` is one variable to set in the running
  * program&#39;s environment.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable extends StObject {
  
  /**
    * The variable name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The variable value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariableMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
