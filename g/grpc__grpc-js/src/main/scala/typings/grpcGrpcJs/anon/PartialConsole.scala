package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Console> */
trait PartialConsole extends StObject {
  
  var assert: js.UndefOr[js.Function2[/* condition */ Boolean, /* repeated */ scala.Any, Unit]] = js.undefined
  
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var count: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var countReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var debug: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var dir: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var dirxml: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var group: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var groupCollapsed: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var groupEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var info: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var log: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var table: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var time: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var timeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var timeLog: js.UndefOr[js.Function2[/* label */ String, /* repeated */ scala.Any, Unit]] = js.undefined
  
  var timeStamp: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var warn: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
}
object PartialConsole {
  
  inline def apply(): PartialConsole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialConsole] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: (/* condition */ Boolean, /* repeated */ scala.Any) => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction2(value))
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setCount(value: () => Unit): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setCountReset(value: () => Unit): Self = StObject.set(x, "countReset", js.Any.fromFunction0(value))
    
    inline def setCountResetUndefined: Self = StObject.set(x, "countReset", js.undefined)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDebug(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDir(value: () => Unit): Self = StObject.set(x, "dir", js.Any.fromFunction0(value))
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDirxml(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "dirxml", js.Any.fromFunction1(value))
    
    inline def setDirxmlUndefined: Self = StObject.set(x, "dirxml", js.undefined)
    
    inline def setError(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGroup(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setGroupCollapsed(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "groupCollapsed", js.Any.fromFunction1(value))
    
    inline def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
    
    inline def setGroupEnd(value: () => Unit): Self = StObject.set(x, "groupEnd", js.Any.fromFunction0(value))
    
    inline def setGroupEndUndefined: Self = StObject.set(x, "groupEnd", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setInfo(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLog(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTable(value: () => Unit): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTime(value: () => Unit): Self = StObject.set(x, "time", js.Any.fromFunction0(value))
    
    inline def setTimeEnd(value: () => Unit): Self = StObject.set(x, "timeEnd", js.Any.fromFunction0(value))
    
    inline def setTimeEndUndefined: Self = StObject.set(x, "timeEnd", js.undefined)
    
    inline def setTimeLog(value: (/* label */ String, /* repeated */ scala.Any) => Unit): Self = StObject.set(x, "timeLog", js.Any.fromFunction2(value))
    
    inline def setTimeLogUndefined: Self = StObject.set(x, "timeLog", js.undefined)
    
    inline def setTimeStamp(value: () => Unit): Self = StObject.set(x, "timeStamp", js.Any.fromFunction0(value))
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTrace(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setWarn(value: /* repeated */ scala.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
