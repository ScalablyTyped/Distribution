package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp extends StObject {
  
  /**
    * The argument to the admin action; see `Command` for semantics.
    */
  var arg: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The admin action; see `Command` for legal values.
    */
  var command: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp](x: Self) {
    
    inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgNull: Self = StObject.set(x, "arg", null)
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandNull: Self = StObject.set(x, "command", null)
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
  }
}
