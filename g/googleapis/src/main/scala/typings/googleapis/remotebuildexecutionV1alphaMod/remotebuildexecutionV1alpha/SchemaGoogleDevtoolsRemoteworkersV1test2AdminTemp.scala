package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AdminTemp is a prelimiary set of administration tasks. It&#39;s called
  * &quot;Temp&quot; because we do not yet know the best way to represent admin
  * tasks; it&#39;s possible that this will be entirely replaced in later
  * versions of this API. If this message proves to be sufficient, it will be
  * renamed in the alpha or beta release of this API.  This message (suitably
  * marshalled into a protobuf.Any) can be used as the inline_assignment field
  * in a lease; the lease assignment field should simply be `&quot;admin&quot;`
  * in these cases.  This message is heavily based on Swarming administration
  * tasks from the LUCI project
  * (http://github.com/luci/luci-py/appengine/swarming).
  */
trait SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp extends StObject {
  
  /**
    * The argument to the admin action; see `Command` for semantics.
    */
  var arg: js.UndefOr[String] = js.undefined
  
  /**
    * The admin action; see `Command` for legal values.
    */
  var command: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp](x: Self) {
    
    inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
  }
}
