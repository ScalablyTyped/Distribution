package typings.grpc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOptions
  extends StObject
     with /* field */ StringDictionary[js.Any] {
  
  /**
    * The credentials that should be used to make this particular call.
    */
  var credentials: js.UndefOr[CallCredentials] = js.undefined
  
  /**
    * The deadline for the entire call to complete.
    */
  var deadline: js.UndefOr[Deadline] = js.undefined
  
  /**
    * Server hostname to set on the call. Only meaningful if different from
    * the server address used to construct the client.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Parent call. Used in servers when making a call as part of the process
    * of handling a call. Used to propagate some information automatically,
    * as specified by propagate_flags.
    */
  var parent: js.UndefOr[Call] = js.undefined
  
  /**
    * Indicates which properties of a parent call should propagate to this
    * call. Bitwise combination of flags in `grpc.propagate`.
    */
  var propagate_flags: js.UndefOr[Double] = js.undefined
}
object CallOptions {
  
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit class CallOptionsMutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: CallCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setParent(value: Call): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPropagate_flags(value: Double): Self = StObject.set(x, "propagate_flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagate_flagsUndefined: Self = StObject.set(x, "propagate_flags", js.undefined)
  }
}
