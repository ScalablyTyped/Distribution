package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDiagMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def cmds(): js.Promise[js.Array[CmdsResult]] = js.native
    def cmds(options: AbortOptions & OptionExtension): js.Promise[js.Array[CmdsResult]] = js.native
    
    def net(): js.Promise[Any] = js.native
    def net(options: AbortOptions & OptionExtension): js.Promise[Any] = js.native
    
    def sys(): js.Promise[Any] = js.native
    def sys(options: AbortOptions & OptionExtension): js.Promise[Any] = js.native
  }
  
  trait CmdsResult extends StObject {
    
    var active: Boolean
    
    var args: js.Array[String]
    
    var endTime: js.Date
    
    var id: String
    
    var options: Record[String, Any]
    
    var startTime: js.Date
  }
  object CmdsResult {
    
    inline def apply(
      active: Boolean,
      args: js.Array[String],
      endTime: js.Date,
      id: String,
      options: Record[String, Any],
      startTime: js.Date
    ): CmdsResult = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CmdsResult]
    }
    
    extension [Self <: CmdsResult](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
}
