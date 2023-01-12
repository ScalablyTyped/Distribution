package typings.libraCore

import typings.grpc.mod.Call
import typings.grpc.mod.CallCredentials
import typings.grpc.mod.Deadline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<grpc.grpc.CallOptions> */
  trait PartialCallOptions extends StObject {
    
    var credentials: js.UndefOr[CallCredentials] = js.undefined
    
    var deadline: js.UndefOr[Deadline] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[Call] = js.undefined
    
    var propagate_flags: js.UndefOr[Double] = js.undefined
  }
  object PartialCallOptions {
    
    inline def apply(): PartialCallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCallOptions] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: CallCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setParent(value: Call): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPropagate_flags(value: Double): Self = StObject.set(x, "propagate_flags", value.asInstanceOf[js.Any])
      
      inline def setPropagate_flagsUndefined: Self = StObject.set(x, "propagate_flags", js.undefined)
    }
  }
}
