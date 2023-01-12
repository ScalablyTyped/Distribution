package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logger * / any */ trait ILogger extends StObject {
  
  def ok(msg: String): Unit
  @JSName("ok")
  var ok_Original: LogFn
  
  def rawmsg(msg: String): Unit
  @JSName("rawmsg")
  var rawmsg_Original: LogFn
}
object ILogger {
  
  inline def apply(ok: /* msg */ String => Unit, rawmsg: /* msg */ String => Unit): ILogger = {
    val __obj = js.Dynamic.literal(ok = js.Any.fromFunction1(ok), rawmsg = js.Any.fromFunction1(rawmsg))
    __obj.asInstanceOf[ILogger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
    
    inline def setOk(value: /* msg */ String => Unit): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
    
    inline def setRawmsg(value: /* msg */ String => Unit): Self = StObject.set(x, "rawmsg", js.Any.fromFunction1(value))
  }
}
